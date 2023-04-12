package com.mysql.dao.impl;

import com.mysql.dao.BaseDao;
import com.mysql.dao.ProjectTypeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProjectTypeDaoImpl extends BaseDao implements ProjectTypeDao {

    //根据项目类型名称和员工类型id查询项目类型id
    @Override
    public int selectProjectIdByProjectName(String ProjectName,int staffTypeId) throws Exception {
        Connection conn = getConn();

        String sql = "SELECT projecttype.projectTypeId FROM projecttype WHERE projecttype.projectTypeName=? AND staffTypeId = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, ProjectName);
        ps.setInt(2, staffTypeId);
        ResultSet rs = ps.executeQuery();

        int ProjectId = 0;

        while (rs.next()) {
            ProjectId = rs.getInt(1);
        }

        closeAll(conn,ps,rs);

        return ProjectId;
    }

    //根据项目类型名称查询项目类型金额
    @Override
    public double selectProjectPriceByProjectName(String ProjectName) throws Exception {
        Connection conn = getConn();

        String sql = "SELECT projecttype.projectTypePrice FROM projecttype WHERE projecttype.projectTypeName=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, ProjectName);
        ResultSet rs = ps.executeQuery();

        double projectTypePrice = 0;

        while (rs.next()) {
            projectTypePrice = rs.getInt(1);
        }

        closeAll(conn,ps,rs);

        return projectTypePrice;
    }

}
