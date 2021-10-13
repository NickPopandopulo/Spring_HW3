package com.app.spring.spring_hw3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. Разобраться с примером проекта на Spring MVC;
 * 2. Создать класс Товар (Product), с полями id, title, cost;
 * 3. Товары необходимо хранить в репозитории (класс, в котором в виде List<Product> хранятся товары).
 * Репозиторий должен уметь выдавать список всех товаров и товар по id;
 * 4. Сделать форму для добавления товара в репозиторий и логику работы этой формы;
 * 5. Сделать страницу, на которой отображаются все товары из репозитория, подключив bootstrap 4/5
 */

@SpringBootApplication
public class SpringHw3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringHw3Application.class, args);
    }

}
