package com.myPlus.services.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myPlus.mapper.EmployeesMapper;
import com.myPlus.pojo.Employees;
import com.myPlus.services.employeeService;
import org.springframework.stereotype.Service;

/**
 * 自定义services的实现类
 */
@Service
public class employeeServiceImpl extends ServiceImpl<EmployeesMapper, Employees> implements employeeService {

}
