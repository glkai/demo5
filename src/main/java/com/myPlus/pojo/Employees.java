package com.myPlus.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Date;

@AllArgsConstructor
@Data
//TableName标识类对应的数据库表名

public class Employees {

    @TableId(value = "employee_id",type = IdType.AUTO)
    private Integer employeeId;

    private String firstName;

    @TableField
    private String lastName;

    private String email;

    private String phoneNumber;
    private Date hireDate;
    private String jobId;
    private Double salary;
    private Double commissionPct;
    private Integer managerId;
    private Integer departmentId;

    @TableLogic
    private int isDeleted;

}
