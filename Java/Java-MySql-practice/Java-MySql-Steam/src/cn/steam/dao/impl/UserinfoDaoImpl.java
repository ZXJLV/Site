package cn.steam.dao.impl;

import cn.steam.dao.BaseDao;
import cn.steam.dao.UserinfoDao;
import cn.steam.entity.Userinfo;

import java.sql.*;

public class UserinfoDaoImpl extends BaseDao implements UserinfoDao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

    //判断是否有这个账号
    @Override
    public boolean selectUserInfoByUserInfoEmail(String userInfoEmail) {
        try {
            conn = getConn();

            sql = "SELECT COUNT(*) FROM userinfo WHERE userInfoEmail = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,userInfoEmail);
            rs = ps.executeQuery();

            if (rs.next()){
                if (rs.getInt(1)>0){
                    return false;
                }
            }
            System.err.println("\u001B[36mmsql:" + ps + "\u001B[0m");
            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return true;
    }

    //判断是否有这个昵称
    @Override
    public boolean selectUserInfoByUserInfoNickName(String userInfoNickName) {
        try {
            conn = getConn();

            sql = "SELECT COUNT(*) FROM userinfo WHERE userInfoNickName = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,userInfoNickName);
            rs = ps.executeQuery();

            if (rs.next()){
                if (rs.getInt(1)>0){
                    return false;
                }
            }
            System.err.println("\u001B[36mmsql:" + ps + "\u001B[0m");
            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return true;
    }

    //注册
    @Override
    public int insertUserInfo(Userinfo userinfo) {
        sql = "INSERT INTO userinfo (userInfoNickName,userInfoEmail,userInfoPwd,userInfoCountry)\n" +
                                   "VALUES(?,?,?,?)";
        Object[] objects = {userinfo.getUserInfoNickName(),userinfo.getUserInfoEmail(),userinfo.getUserInfoPwd(),userinfo.getUserInfoCountry()};

        try {
            return updateBuffer(sql,objects);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //登录
    @Override
    public String selectUserInfoByUserInfoEmailAndUserInfoPwd(String userInfoEmail, String userInfoPwd) {
        String userInfoNickName = "";
        try {
            conn = getConn();

            sql = "SELECT userInfoNickName FROM userinfo WHERE userInfoEmail=? AND userInfoPwd=?";

            ps = conn.prepareStatement(sql);
            ps.setString(1, userInfoEmail);
            ps.setString(2,userInfoPwd);
            rs = ps.executeQuery();

            if (rs.next()) {
                userInfoNickName = rs.getString(1);
            }
            System.err.println("\u001B[36mmsql:" + ps + "\u001B[0m");
            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return userInfoNickName;
    }

    //根据账号查找密码
    @Override
    public String selectUserInfoPwdByUserInfoEmail(String userInfoEmail) {
        String userInfoPwd = null;

        try {
            conn = getConn();

            String sql = "SELECT userInfoPwd FROM userinfo WHERE userInfoEmail=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,userInfoEmail);
            rs = ps.executeQuery();

            if (rs.next()){
                userInfoPwd = rs.getString("userInfoPwd");
            }
            System.err.println("\u001B[36mmsql:" + ps + "\u001B[0m");
            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return userInfoPwd;
    }

    //根据邮箱和密码查询userinfoId
    @Override
    public int selectUserInfoIdByUserInfoEmailAndUserInfoPwd(String userInfoEmail, String userInfoPwd) {
        int userInfoId = -1;

        try {
            conn = getConn();

            String sql = "SELECT userinfoId FROM userinfo WHERE userInfoEmail=? AND userInfoPwd=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, userInfoEmail);
            ps.setString(2, userInfoPwd);
            rs = ps.executeQuery();

            if (rs.next()){
                userInfoId = rs.getInt("userinfoId");
            }
            System.err.println("\u001B[36mmsql:" + ps + "\u001B[0m");
            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return userInfoId;
    }

    //根据邮箱和密码删除userinfo
    @Override
    public int deleteUserInfoByUserInfoEmailAndUserInfoPwd(String userInfoEmail, String userInfoPwd) {
        String sql = "DELETE FROM userinfo WHERE userInfoEmail=? AND userInfoPwd=?";
        Object[] objects = {userInfoEmail, userInfoPwd};

        try {
            return updateBuffer(sql,objects);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
