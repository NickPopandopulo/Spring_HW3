package com.app.spring.spring_hw3.repository;

import com.app.spring.spring_hw3.domain.Product;

import java.util.List;

public interface ProductRepository {

    Product get(int id);

    List<Product> getAll();

    void add(Product product);
}
