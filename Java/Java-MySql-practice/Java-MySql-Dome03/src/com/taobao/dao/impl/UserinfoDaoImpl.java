package com.taobao.dao.impl;

import com.taobao.dao.BaseDao;
import com.taobao.dao.UserinfoDao;
import com.taobao.entity.Userinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserinfoDaoImpl extends BaseDao implements UserinfoDao {

    //根据用户姓名和密码查询用户信息
    @Override
    public Userinfo selectUserinfoByUserNickNameAndUserPassword(Userinfo userinfo) {
        Userinfo userinfo1;
        try {
            Connection conn = getConn();
            userinfo1 = null;

            String sql = "SELECT userinfo.* FROM userinfo WHERE userinfo.userinfoNickName=? AND userinfo.userinfoPassword=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, userinfo.getUserinfoNickName());
            ps.setString(2, userinfo.getUserinfoPassword());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                userinfo1 = new Userinfo(
                        rs.getInt("userinfoId"),
                        rs.getString("userinfoName"),
                        rs.getString("userinfoNickName"),
                        rs.getString("userinfoPassword"),
                        rs.getString("userinfoPhone"),
                        rs.getString("userinfoSex"),
                        rs.getString("userinfoAddress")
                );
            }

            if (userinfo1 != null) {
                System.out.println("登录成功");
            }else {
                System.out.println("登录失败");
            }

            closeAll(conn, ps, rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return userinfo1;
    }
}
