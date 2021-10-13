package com.app.spring.spring_hw3.service;

import com.app.spring.spring_hw3.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    void add(Product product);
}
