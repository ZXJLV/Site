package com.mysql.dao.impl;

import com.mysql.dao.BaseDao;
import com.mysql.dao.StaffTypeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StaffTypeDaoImpl extends BaseDao implements StaffTypeDao {

    //根据员工类型名称查询员工类型id
    @Override
    public int selectStaffIdByStaffName(String StaffName) throws Exception {
        Connection conn = getConn();

        String sql = "SELECT stafftype.staffTypeId FROM stafftype WHERE stafftype.staffTypeName = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, StaffName);
        ResultSet rs = ps.executeQuery();

        int staffTypeId = 0;

        while (rs.next()) {
            staffTypeId = rs.getInt(1);
        }

        closeAll(conn,ps,rs);

        return staffTypeId;
    }
}
