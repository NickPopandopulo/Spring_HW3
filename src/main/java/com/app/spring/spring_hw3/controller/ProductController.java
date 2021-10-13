package com.app.spring.spring_hw3.controller;

import com.app.spring.spring_hw3.domain.Product;
import com.app.spring.spring_hw3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public String getProducts(Model model) {
        model.addAttribute("products", productService.getProducts());
        return "products/productsList";
    }

    @GetMapping("/addForm")
    public String showAddForm(Model model) {
        model.addAttribute("product",
                Product.builder()
                        .id(productService.getProducts().size() + 1)
                        .title("Title")
                        .cost(0)
                        .build());
        return "products/addForm";
    }

    @PostMapping("/addForm")
    public String addProduct(@ModelAttribute("product") Product product) {
        productService.add(product);
        return "redirect:/products";
    }

}
