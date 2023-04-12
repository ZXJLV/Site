package cn.wantedjob.dao.impl;

import cn.wantedjob.dao.BaseDao;
import cn.wantedjob.dao.UserinfoDao;
import cn.wantedjob.entity.Jobinfo;
import cn.wantedjob.entity.Userinfo;
import cn.wantedjob.entity.Userinfotype;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserinfoDaoImpl extends BaseDao implements UserinfoDao {
    PreparedStatement ps = null;
    Connection conn = null;
    ResultSet rs = null;
    String sql = null;

    //查询用户类型
    @Override
    public List<Userinfotype> selectUserinfoType() {
        List<Userinfotype> userinfotypeList = new ArrayList<Userinfotype>();
        Userinfotype userinfotype = null;
        try {
            conn = getConn();

            sql = "SELECT userinfotype.* FROM userinfotype";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                userinfotypeList.add(userinfotype = new Userinfotype(
                        rs.getInt("userInfoTypeId"),
                        rs.getString("userInfoName")
                ));
            }

            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return userinfotypeList;
    }

    //添加用户信息
    @Override
    public int insertUserinfo(Userinfo userinfo) {
        sql = "INSERT INTO userinfo (userInfoLoginName, userInfoName, userInfoPwd, userInfoTypeId, userInfoCompanyId, userInfoPhone) VALUES\n" +
                "(?,?,?,?,?,?)";
        Object[] objects = {userinfo.getUserInfoLoginName(),userinfo.getUserInfoName(),userinfo.getUserInfoPwd(),userinfo.getUserInfoTypeId(),userinfo.getUserInfoCompanyId(),userinfo.getUserInfoPhone()};

        try {
            return updateBuffer(sql,objects);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //根据账号查询有没有这个账号
    @Override
    public boolean selectUserinfoByUserInfoName(String userInfoName) {
        try {
            conn = getConn();

            sql = "SELECT COUNT(*) FROM userinfo WHERE userInfoName=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,userInfoName);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
            closeAll(conn,ps,rs);
            return false;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //根据账号和密码查询是否正确
    @Override
    public boolean selectUserinfoByUserInfoNameAndUserInfoPwd(String userInfoName, String userInfoPwd) {
        try {
            conn = getConn();

            sql = "SELECT COUNT(*) FROM userinfo WHERE userInfoName=? AND userInfoPwd=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,userInfoName);
            ps.setString(2,userInfoPwd);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
            closeAll(conn,ps,rs);
            return false;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




}
