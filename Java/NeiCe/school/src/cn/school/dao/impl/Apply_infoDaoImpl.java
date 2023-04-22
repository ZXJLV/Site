package cn.school.dao.impl;

import cn.school.dao.Apply_infoDao;
import cn.school.dao.BaseDao;
import cn.school.entity.Apply_info;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class Apply_infoDaoImpl extends BaseDao implements Apply_infoDao {

    //添加学生信息
    @Override
    public int insertApply_info(Apply_info applyInfo) {
        String sql = "INSERT INTO apply_info (name,age,class1,game)VALUES(?,?,?,?)";

        Object[] objects = {applyInfo.getName(), applyInfo.getAge(), applyInfo.getClass1(), applyInfo.getGame()};
        try {
            return updateBuffer(sql, objects);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //查询比赛项目
    @Override
    public List<Apply_info> selectApply_infoByGame(String game) {
        List<Apply_info> list = new ArrayList<Apply_info>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = getConn();

            String sql = "SELECT game,name,class1,age FROM apply_info WHERE game = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, game);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Apply_info(rs.getString(1),
                                        rs.getString(2),
                                        rs.getInt(3),
                                        rs.getInt(4)
                ));
            }
            System.err.println("\u001B[36mmsql:" + ps + "\u001B[0m");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        closeAll(conn,ps,rs);

        return list;
    }

    //按班号查询
    @Override
    public List<Apply_info> selectApply_infoByClass1(int class1) {
        List<Apply_info> list = new ArrayList<Apply_info>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = getConn();

            String sql = "SELECT game,name,class1,age FROM apply_info WHERE class1 = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, class1);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Apply_info(rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4)
                ));
            }
            System.err.println("\u001B[36mmsql:" + ps + "\u001B[0m");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        closeAll(conn,ps,rs);

        return list;



    }

    //根据名字删除信息
    @Override
    public int delecteApply_infoByName(String name) {
        String sql = "DELETE FROM apply_info WHERE name = ?";

        Object[] objects = {name};
        try {
            return updateBuffer(sql, objects);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
