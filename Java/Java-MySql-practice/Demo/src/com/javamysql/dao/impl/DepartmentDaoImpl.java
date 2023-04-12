package com.javamysql.dao.impl;

import com.javamysql.dao.BaseDao;
import com.javamysql.dao.DepartmentDao;
import com.javamysql.entity.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDaoImpl extends BaseDao implements DepartmentDao {

    //查询科室表
    @Override
    public Department selectDepartment() throws Exception {
        Department department = null;
        Connection conn = getConn();

        List<Department> departmentList = new ArrayList<Department>();

        String sql = "SELECT * FROM Department";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        System.err.println("sql:"+sql);
        while (rs.next()) {
           departmentList.add(new Department( rs.getInt(1),
                                              rs.getString(2)));
        }

        closeAll(conn,ps,rs);

        for (Department department1 : departmentList) {
            System.out.println(department1);
        }
        return department;
    }


}
