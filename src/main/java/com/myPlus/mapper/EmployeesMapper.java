package com.myPlus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myPlus.pojo.Employees;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface EmployeesMapper extends BaseMapper<Employees> {

    Map<String,Object> selectMapById(@Param("id") Integer id);
}
