package com.javamysql.dao;

import com.javamysql.entity.Checkitem;
import com.javamysql.entity.Department;
import com.javamysql.entity.DepartmentCheckitem;

public interface Department_checkitemDao {

    //添加信息
    public int insertDepartmentCheckItem(int depID,int checkItemID) throws Exception;

    //根据checkItemID删除departmentCheckItem表内的信息
    public int deleteDepartmentCheckItemByCheckItemID(int checkItemID) throws Exception;
}
