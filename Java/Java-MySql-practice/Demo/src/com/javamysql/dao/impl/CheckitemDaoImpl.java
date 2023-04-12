package com.javamysql.dao.impl;

import com.javamysql.dao.BaseDao;
import com.javamysql.dao.CheckitemDao;
import com.javamysql.entity.Checkitem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CheckitemDaoImpl extends BaseDao implements CheckitemDao {

    //增加检查项目
    @Override
    public int insertCheckItem(Checkitem checkItem) throws Exception {

        String sql = "INSERT INTO checkitem (checkItemName,checkItemCost) VALUES (?,?)";

        Object[] objects = {checkItem.getCheckItemName(), checkItem.getCheckItemCost()};
        System.err.println("sql:"+sql);
        return updateBuffer(sql,objects);
    }

    //查检查项目id
    @Override
    public int selectCheckItemId(String checkItemName) throws Exception {
        Connection conn = getConn();

        String sql = "SELECT checkItemId FROM checkitem WHERE checkItemName LIKE ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,checkItemName);
        ResultSet rs = ps.executeQuery();
        System.err.println("sql:"+sql);
        int id = 0;

        while (rs.next()){
            id = rs.getInt("checkItemId");
        }

        closeAll(conn,ps,rs);

        return id;
    }

    //根据checkItemID删除checkItem表内的信息
    @Override
    public int deleteCheckItemByCheckItemID(int checkItemID) throws Exception {

        String sql = "DELETE FROM checkItem WHERE checkItemId =?";
        Object[] objects = {checkItemID};
        System.err.println("sql:"+sql);
        return updateBuffer(sql,objects);
    }

    //查询检查项目
    @Override
    public ArrayList<Checkitem> selectCheckItem() throws Exception {
        Connection conn = getConn();
        Checkitem checkitem = null;

        ArrayList<Checkitem> checkItemsList = new ArrayList<Checkitem>();

        String sql = "SELECT * FROM checkItem";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        System.err.println("sql:"+sql);
        while (rs.next()){
            checkItemsList.add(new Checkitem(
                    rs.getInt("checkItemId"),
                    rs.getString("checkItemName"),
                    rs.getDouble("checkItemCost")));
        }

        closeAll(conn,ps,rs);

        for (Checkitem checkitem1 : checkItemsList) {
            System.out.println(checkitem1);
        }

        return checkItemsList;
    }

    //更改检查项目名称和金额
    @Override
    public int updateCheckItemCost(int checkItemID,String checkItemName,double checkItemCost) throws Exception {
        String sql = "UPDATE checkItem SET checkItemName =?,checkItemCost=? WHERE checkItemId =?";
        Object[] objects = {checkItemName,checkItemCost,checkItemID};
        System.err.println("sql:"+sql);
        return updateBuffer(sql,objects);
    }

    //查询检查项目和科室名称
    @Override
    public ArrayList<Checkitem> selectCheckItemAndDepName() throws Exception {
        Connection conn = getConn();
        ArrayList<Checkitem> checkItemsList = new ArrayList<>();

        String sql = "SELECT checkitem.checkitemID, checkitem.checkitemName, checkitem.checkitemCost, department.depName\n" +
                "FROM checkitem\n" +
                "JOIN department_checkitem  ON checkitem.checkitemID = department_checkitem.checkitemID\n" +
                "JOIN department  ON department_checkitem.depID = department.depID;\n";
        System.err.println("sql:"+sql);
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        System.out.println("检查项目编号\t检查项目名称\t检查项目金额\t科室名称");
        while (rs.next()) {
            checkItemsList.add(new Checkitem(
            rs.getInt("checkItemID"),
            rs.getString("checkItemName"),
            rs.getDouble("checkItemCost"),
            rs.getString("depName")
            ));
        }

        closeAll(conn,ps,rs);
        return checkItemsList;
    }


}
