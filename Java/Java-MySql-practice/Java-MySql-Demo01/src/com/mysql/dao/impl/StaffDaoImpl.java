package com.mysql.dao.impl;

import com.mysql.dao.BaseDao;
import com.mysql.dao.StaffDao;
import com.mysql.entity.Staff;

import java.rmi.server.RemoteServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StaffDaoImpl extends BaseDao implements StaffDao {

    //查staff表所有信息
    @Override
    public ArrayList<Staff> selectStaff() throws Exception {
        Connection conn = getConn();

        ArrayList<Staff> staffArrayList = new ArrayList<Staff>();

        String sql = "SELECT s.staffId, s.staffName, t.staffTypeName\n" +
                "FROM staff s\n" +
                "JOIN staffType t ON s.staffTypeId = t.staffTypeId;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        System.err.println("sql: " + ps);

        while (rs.next()) {
            staffArrayList.add(new Staff(
                   rs.getInt("staffId"),
                   rs.getString("staffName"),
                   rs.getString("staffTypeName"))
            );
        }

        closeAll(conn,ps,rs);

        for (Staff staff : staffArrayList) {
            System.out.println(staff);
        }

        return staffArrayList;
    }
}
