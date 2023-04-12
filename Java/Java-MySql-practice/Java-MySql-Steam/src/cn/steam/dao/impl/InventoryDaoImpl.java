package cn.steam.dao.impl;

import cn.steam.dao.BaseDao;
import cn.steam.dao.InventoryDao;
import cn.steam.entity.Inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InventoryDaoImpl extends BaseDao implements InventoryDao {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

    //根据用户姓名查看库存
    @Override
    public List<Inventory> selectInventoryByUserInfoNickName(String userInfoNickName) {
        List<Inventory> inventoryList = new ArrayList<Inventory>();
        Inventory inventory = null;
        try {
            conn = getConn();

            sql = "SELECT shop.gameName,inventory.gameTime,inventory.gameAchievementNum,inventory.gameNumGB FROM inventory\t\t\t\n" +
                    "INNER JOIN shop ON shop.shopId = inventory.shopId\n" +
                    "WHERE inventory.userInfoId = (\n" +
                    "\tSELECT userinfo.userInfoId FROM userinfo \n" +
                    "\tWHERE userinfo.userInfoNickName=?\t\t\t\n" +
                    ")";
            ps = conn.prepareStatement(sql);
            ps.setString(1, userInfoNickName);
            rs = ps.executeQuery();

            while (rs.next()){
                inventoryList.add(inventory = new Inventory(
                        rs.getString(1),
                        rs.getDouble(2),
                        rs.getInt(3),
                        rs.getDouble(4)
                ));
            }

            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return inventoryList;
    }

    //根据用户id删除库存
    @Override
    public int deleteInventoryByUserInfoId(int userInfoId) {
        String sql = "DELETE FROM inventory WHERE userInfoId = ?";
        Object[] objects = {userInfoId};

        try {
            return updateBuffer(sql,objects);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //根据用户id查询库存id
    @Override
    public int selectInventoryIdByUserInfoId(int userInfoId) {
        int inventoryId = -1;

        try {
            conn = getConn();

            String sql = "SELECT inventoryId FROM inventory WHERE userInfoId = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,userInfoId);
            rs = ps.executeQuery();

            if (rs.next()){
                inventoryId = rs.getInt("inventoryId");
            }
            System.err.println("\u001B[36mmsql:" + ps + "\u001B[0m");
            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return inventoryId;
    }


}
