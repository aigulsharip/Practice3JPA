package com.example.practice3jpa;

import com.example.practice3jpa.config.JpaConfig;
import com.example.practice3jpa.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class Practice3JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Practice3JpaApplication.class, args);
        System.out.println("hello");
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(JpaConfig.class);
        ProductService productService = ctx.getBean(ProductService.class);
        productService.findAll().forEach(System.out::println);

        ctx.close();



    }

}
