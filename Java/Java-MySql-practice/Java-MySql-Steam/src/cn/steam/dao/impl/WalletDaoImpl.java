package cn.steam.dao.impl;

import cn.steam.dao.BaseDao;
import cn.steam.dao.WalletDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WalletDaoImpl extends BaseDao implements WalletDao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

    //根据库存id删除钱包
    @Override
    public int deleteWalletByInventoryId(int userInfoId) {
        sql = "DELETE FROM wallet WHERE userInfoId = ?";
        Object[] objects = {userInfoId};

        try {
            return updateBuffer(sql, objects);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //根据用户id判断钱包是否有钱
    @Override
    public boolean selectWalletByInventoryId(int userInfoId) {
        double walletBalance = -1;

        try {
            conn = getConn();

            sql = "SELECT walletBalance FROM wallet WHERE userInfoId = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, userInfoId);
            rs = ps.executeQuery();

            if (rs.next()) {
                walletBalance = rs.getDouble("walletBalance");
                if (walletBalance > 0){
                    return true;
                }
            }
            System.err.println("\u001B[36mmsql:" + ps + "\u001B[0m");
            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }

    //更改walletBalance根据用户id
    @Override
    public int updateWalletBalanceByUserInfoById(int userInfoId,double howManyMoney) {
        String sql = "UPDATE wallet SET walletBalance=walletBalance- ? WHERE userInfoId = ?";
        Object[] objects = {howManyMoney, userInfoId};

        try {
            return updateBuffer(sql, objects);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
