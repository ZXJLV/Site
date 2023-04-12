package com.javamysql.dao;

import com.javamysql.entity.Department;

public interface DepartmentDao {

    //查询科室表
    public Department selectDepartment() throws Exception;

}
