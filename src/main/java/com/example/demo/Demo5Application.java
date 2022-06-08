package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.myPlus.mapper")
public class Demo5Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo5Application.class, args);
        System.out.println(1);
        System.out.println(2);
        System.out.println(12121212);
    }

}
