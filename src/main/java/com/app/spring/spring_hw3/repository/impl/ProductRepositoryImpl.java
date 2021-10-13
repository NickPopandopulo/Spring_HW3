package com.app.spring.spring_hw3.repository.impl;

import com.app.spring.spring_hw3.domain.Product;
import com.app.spring.spring_hw3.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private final List<Product> catalog = new ArrayList<>();

    {
        catalog.add(Product.builder().id(1).title("T-shirt").cost(30.65f).build());
        catalog.add(Product.builder().id(2).title("Hat").cost(10.20f).build());
        catalog.add(Product.builder().id(3).title("Socks").cost(5.35f).build());
        catalog.add(Product.builder().id(4).title("Chain").cost(150.40f).build());
        catalog.add(Product.builder().id(5).title("Jeans").cost(40.00f).build());
    }

    @Override
    public Product get(int id) {
        for (Product product : catalog) {
            if (product.getId() == id) return product;
        }
        return null;
    }

    @Override
    public List<Product> getAll() {
        return catalog;
    }

    @Override
    public void add(Product product) {
        catalog.add(product);
    }
}
