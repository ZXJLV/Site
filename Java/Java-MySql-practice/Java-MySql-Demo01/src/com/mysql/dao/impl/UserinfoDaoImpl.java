package com.mysql.dao.impl;

import com.mysql.dao.BaseDao;
import com.mysql.dao.UserinfoDao;
import com.mysql.entity.Userinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserinfoDaoImpl extends BaseDao implements UserinfoDao {

    //添加用户信息
    @Override
    public int insertUserInfo(Userinfo userinfo) throws Exception {
        String sql = "INSERT INTO userinfo (userInfoName,phone,balance,staffId,calorieId,rechargeable)" +
                                    "VALUES(?,?,?,?,?,?)";
        Object[] objects = {userinfo.getUserInfoName(),userinfo.getPhone(),userinfo.getBalance(),userinfo.getStaffId(),userinfo.getCalorieId(),userinfo.getRechargeable()};

        return updateBuffer(sql, objects);
    }

    //删除用户信息
    @Override
    public int deleteUserInfo(int userInfoId) throws Exception {
        String sql = "DELETE FROM userinfo WHERE userInfoId = ?";
        Object[] objects = {userInfoId};

        return updateBuffer(sql,objects);
    }

    //查看用户所有信息
    @Override
    public ArrayList<Userinfo> selectUserInfo() throws Exception {
        Connection conn = getConn();

        ArrayList<Userinfo> userinfoArrayList = new ArrayList<Userinfo>();

        String sql = "SELECT * FROM userinfo";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        System.err.println("sql: " + sql);

        while (rs.next()) {
            userinfoArrayList.add(new Userinfo(
                    rs.getInt("userInfoId"),
                    rs.getString("userInfoName"),
                    rs.getString("phone"),
                    rs.getDouble("balance"),
                    rs.getInt("staffId"),
                    rs.getString("openBlock"),
                    rs.getInt("calorieId"),
                    rs.getDouble("rechargeable")
            ));
        }

        closeAll(conn,ps,rs);

        for (Userinfo userinfo : userinfoArrayList) {
            System.out.println(userinfo);
        }

        return userinfoArrayList;
    }

    //根据用户姓名和手机号后四位查用户id
    @Override
    public int selectUserInfoId(String userInfoName,String phone) throws Exception {
        Connection conn = getConn();

        String sql = "SELECT userinfo.userInfoId FROM userinfo WHERE userinfo.userInfoName = '"+userInfoName+"' AND userinfo.phone LIKE '%"+phone+"'";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        int userInfoId = 0;
        System.err.println("sql:" + sql);
        while (rs.next()){
            userInfoId = rs.getInt(1);
        }

        closeAll(conn,ps,rs);

        return userInfoId;
    }

    //根据姓名和手机号后四位更改用户姓名
    @Override
    public int updateUserInfoNameByUserNameAndUserPhone(String userInfoName, String phone,String newUserInfoName) throws Exception {

        String sql = "UPDATE userinfo SET userInfoName = ? WHERE userInfoName = ? AND phone = ?";
        Object[] object = {newUserInfoName,userInfoName,phone};

        return updateBuffer(sql,object);
    }

    //查看所有用户把staffId，calorieId替换为staffName，calorieType
    @Override
    public void selectUserInfoUpdateStaffNameAndCalorieType(String userInfoName,String phone) throws Exception {
        Connection conn = getConn();

        String sql = "SELECT userinfo.userInfoId,userinfo.userInfoName,userinfo.phone,userinfo.balance,staff.staffName,userinfo.openBlock,calorie.calorieType,userinfo.rechargeable\n" +
                "FROM userinfo\n" +
                "LEFT JOIN staff ON staff.staffId=userinfo.userInfoId\n" +
                "LEFT JOIN calorie ON calorie.calorieId=userinfo.calorieId\n" +
                "WHERE userinfo.userInfoName=? AND userinfo.phone=?;\n";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, userInfoName);
        ps.setString(2, phone);
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            System.out.println("用户id："+rs.getInt("userInfoId"));
            System.out.println("用户姓名："+rs.getString("userInfoName"));
            System.out.println("手机号："+rs.getString("phone"));
            System.out.println("余额："+rs.getDouble("balance"));
            System.out.println("员工姓名："+rs.getString("staffName"));
            System.out.println("开卡时间："+rs.getString("openBlock"));
            System.out.println("卡类型："+rs.getString("calorieType"));
            System.out.println("第一次充值金额："+rs.getDouble("rechargeable"));
        }

        closeAll(conn,ps,rs);

    }

}
