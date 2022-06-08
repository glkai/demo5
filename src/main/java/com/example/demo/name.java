package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

@Repository
@Data
@AllArgsConstructor
public class name {
    private String name;
    private Integer age;
}
