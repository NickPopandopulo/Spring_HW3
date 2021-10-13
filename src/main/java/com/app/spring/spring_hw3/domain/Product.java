package com.app.spring.spring_hw3.domain;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private int id;
    private String title;
    private float cost;

}
