package com.taobao.dao.impl;

import com.taobao.dao.BaseDao;
import com.taobao.dao.ShoppingcarDao;
import com.taobao.entity.Shoppingcar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShoppingcarDaoImpl extends BaseDao implements ShoppingcarDao {

    //查看购物车
    @Override
    public List<Shoppingcar> selectShoppingcarList(int userinfoId) {

        List<Shoppingcar> shoppingcarList = new ArrayList<>();
        try {
            Connection conn = getConn();

            String sql = "SELECT userinfo.userinfoId,userinfo.userinfoNickName,shoppingcar.shoppingcarId,product.productName,shoppingcar.productCount,product.productPrice,product.productDescription,shoppingcar.productId\n" +
                    "FROM shoppingcar \n" +
                    "INNER JOIN product ON shoppingcar.productId = product.productId\n" +
                    "INNER JOIN userinfo ON shoppingcar.userinfoId = userinfo.userinfoId\n" +
                    "WHERE shoppingcar.userinfoId=?\n";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userinfoId);
            ResultSet rs  = ps.executeQuery();

            while (rs.next()){
                shoppingcarList.add(
                        new Shoppingcar(
                                rs.getInt("shoppingcarId"),
                                rs.getInt("userinfoId"),
                                rs.getInt("productId"),
                                rs.getInt("productCount"),
                                rs.getString("productName"),
                                rs.getDouble("productPrice"),
                                rs.getString("productDescription"),
                                rs.getString("userinfoNickName")
                        ));
            }

            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return shoppingcarList;
    }
}
