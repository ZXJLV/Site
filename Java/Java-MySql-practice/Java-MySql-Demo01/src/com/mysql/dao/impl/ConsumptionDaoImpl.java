package com.mysql.dao.impl;

import com.mysql.dao.BaseDao;
import com.mysql.dao.ConsumptionDao;
import com.mysql.entity.Consumption;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ConsumptionDaoImpl extends BaseDao implements ConsumptionDao {

    //删除消费记录
    @Override
    public int deleteConsumption(int userInfoId) throws Exception {
        String sql = "DELETE FROM consumption WHERE userInfoId = ?";
        Object[] objects = {userInfoId};

        return updateBuffer(sql, objects);
    }

    //添加消费记录
    @Override
    public int insertConsumption(int userInfoId,int staffTypeId,int projectTypeId,double projectTypePrice,double consumptionActual) throws Exception {

        String sql = "INSERT INTO consumption (userInfoId,staffTypeId,projectTypeId,projectTypePrice,consumptionActual)" +
                                       "VALUES(?,?,?,?,?)";
        Object[] objects = {userInfoId,staffTypeId,projectTypeId,projectTypePrice,consumptionActual};

        return updateBuffer(sql,objects);
    }

    //打印consumption表
    @Override
    public ArrayList<Consumption> selectConsumption(String userName) throws Exception {
        Connection conn = getConn();

        ArrayList<Consumption> consumptionArrayList = new ArrayList<Consumption>();

        String sql ="SELECT c.consumptionId, u.userInfoName, s.staffTypeName, p.projectTypeName, c.projectTypePrice, c.consumptionActual, c.recordTime \n" +
                "FROM consumption c \n" +
                "JOIN userinfo u ON c.userInfoId = u.userInfoId \n" +
                "JOIN stafftype s ON c.staffTypeId = s.staffTypeId \n" +
                "JOIN projecttype p ON c.projectTypeId = p.projectTypeId \n" +
                "WHERE u.userInfoName = ?;\n";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,userName);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            consumptionArrayList.add(new Consumption(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getDouble(5),
                    rs.getDouble(6),
                    rs.getString(7)
                    )
            );
        }

        closeAll(conn,ps,rs);

        for (Consumption consumption : consumptionArrayList) {
            System.out.println(consumption);
        }

        return consumptionArrayList;
    }

}
