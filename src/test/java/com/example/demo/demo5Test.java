package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.myPlus.mapper.EmployeesMapper;
import com.myPlus.pojo.Employees;
import com.myPlus.services.employeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class demo5Test {

    @Autowired
    private EmployeesMapper employeesMapper;

//    @Autowired
//    private employeeService employeeService;

    @Test
    public void test1(){
        List<Employees> employees = employeesMapper.selectList(null);
        employees.forEach(System.out::println);
    }

    @Test
    public void test2(){
        Map<String, Object> map = new HashMap<>();
        map.put("job_id","PU_CLERK");
        List<Employees> employees1 = employeesMapper.selectByMap(map);
        System.out.println(employees1);
    }

    @Test
    public void test6(){
        Map<String, Object> map = employeesMapper.selectMapById(500);
        System.out.println(map);
    }

    @Test
    public void test3(){
        List<Integer> list = new ArrayList<>();
        list.add(500);
        int i = employeesMapper.deleteBatchIds(list);
        System.out.println(i);
    }

    @Test
    public void test4(){
        Map<String, Object> map = new HashMap<>();
        map.put("is_deleted",0);
    }

//    @Test
//    public void test5(){
//        int count = employeeService.count();
//        System.out.println(count);
//    }

    @Test
    public void test7(){
        QueryWrapper<Employees> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("last_name","a")
                        .between("employee_id",120,200);
        List<Employees> employees = employeesMapper.selectList(queryWrapper);
        System.out.println(employees);
    }

    @Test
    public void test8(){
        QueryWrapper<Employees> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("employee_id").orderByDesc("salary");
        List<Employees> employees = employeesMapper.selectList(queryWrapper);
        System.out.println(employees);
    }

    @Test
    public void test9(){
        QueryWrapper<Employees> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNull("commission_pct");
        int i = employeesMapper.delete(queryWrapper);
        System.out.println(i);
    }

    @Test
    public void test10(){
        LambdaUpdateWrapper<Employees> wrapper = new LambdaUpdateWrapper<>();
        wrapper.like(Employees::getFirstName,"a")
                .and(i->i.gt(Employees::getSalary,3000).or().eq(Employees::getJobId,"SH_CLERK"));
        wrapper.set(Employees::getIsDeleted,1);
        int i = employeesMapper.update(null, wrapper);
        System.out.println(i);
    }

    @Test
    public void test11(){
        List<Employees> employees = employeesMapper.selectList(null);
        employees.forEach(System.out::println);
    }
}
