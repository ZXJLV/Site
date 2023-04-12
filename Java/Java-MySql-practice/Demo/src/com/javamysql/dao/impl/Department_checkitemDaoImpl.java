package com.javamysql.dao.impl;

import com.javamysql.dao.BaseDao;
import com.javamysql.dao.Department_checkitemDao;

public class Department_checkitemDaoImpl extends BaseDao implements Department_checkitemDao {

    //添加信息
    @Override
    public int insertDepartmentCheckItem(int depID,int checkItemID) throws Exception {

        String sql = "INSERT INTO department_checkitem(depID,checkItemID) VALUES(?,?)";
        Object[] objects = {depID,checkItemID};
        System.err.println("sql:"+sql);
        return updateBuffer(sql,objects);
    }

    @Override
    public int deleteDepartmentCheckItemByCheckItemID(int checkItemID) throws Exception {

        String sql = "DELETE FROM department_checkitem WHERE checkItemID=?";
        Object[] objects = {checkItemID};
        System.err.println("sql:"+sql);
        return updateBuffer(sql,objects);
    }

}
