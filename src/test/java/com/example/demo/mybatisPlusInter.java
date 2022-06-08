package com.example.demo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.myPlus.mapper.EmployeesMapper;
import com.myPlus.pojo.Employees;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class mybatisPlusInter {

    @Autowired
    private EmployeesMapper employeesMapper;

    @Test
    public void test(){
        Page<Employees> page = new Page<>(1,5);
        employeesMapper.selectPage(page, null);
        System.out.println(page);
    }
}
