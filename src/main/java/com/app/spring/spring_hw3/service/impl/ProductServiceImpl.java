package com.app.spring.spring_hw3.service.impl;

import com.app.spring.spring_hw3.domain.Product;
import com.app.spring.spring_hw3.repository.ProductRepository;
import com.app.spring.spring_hw3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.getAll();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }
}
