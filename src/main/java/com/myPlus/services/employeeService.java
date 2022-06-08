package com.myPlus.services;

import com.baomidou.mybatisplus.extension.service.IService;
import com.myPlus.pojo.Employees;
import org.springframework.stereotype.Repository;

/**
 * 自定义service，实现自定义的功能
 */
@Repository
public interface employeeService extends IService<Employees> {
}
