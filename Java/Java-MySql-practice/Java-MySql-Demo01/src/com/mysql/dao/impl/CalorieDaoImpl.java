package com.mysql.dao.impl;

import com.mysql.dao.BaseDao;
import com.mysql.dao.CalorieDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CalorieDaoImpl extends BaseDao implements CalorieDao {

    //查Calorie表所有字段
    @Override
    public int selectCalorieId(double rechargeable) throws Exception {
        Connection conn = getConn();

        String sql = "SELECT calorieId FROM calorie WHERE ? BETWEEN minRange AND maxRange";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setDouble(1,rechargeable);
        ResultSet rs = ps.executeQuery();
        System.err.println("sql: " + ps);

        int calorieId = 0;

        while (rs.next()) {
            calorieId = rs.getInt(1);
        }

        closeAll(conn,ps,rs);

        return calorieId;
    }

    //根据用户id查出卡类型
    @Override
    public String selectCalorieType(int userInfoId) throws Exception {
        Connection conn = getConn();

        String sql = "SELECT c.calorieType\n" +
                "FROM calorie c\n" +
                "JOIN userinfo u ON c.calorieId = u.calorieId\n" +
                "WHERE u.userInfoId = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,userInfoId);
        ResultSet rs = ps.executeQuery();
        System.err.println(ps);
        String projectTypeName = null;

        while (rs.next()){
            projectTypeName = rs.getString(1);
        }

        closeAll(conn,ps,rs);

        return projectTypeName;
    }

    //根据卡类型查出卡折扣
    @Override
    public double selectCalorieDiscount(String calorieType) throws Exception {
        Connection conn = getConn();

        String sql = "SELECT calorie.discount FROM calorie WHERE calorie.calorieType = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,calorieType);
        ResultSet rs = ps.executeQuery();
        System.err.println(ps);
        double discount = 0;

        while (rs.next()){
            discount = rs.getDouble(1);
        }

        closeAll(conn,ps,rs);

        return discount;
    }

}
