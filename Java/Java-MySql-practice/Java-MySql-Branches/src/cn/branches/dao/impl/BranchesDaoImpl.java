package cn.branches.dao.impl;

import cn.branches.dao.BaseDao;
import cn.branches.dao.BranchesDao;
import cn.branches.entity.Branches;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BranchesDaoImpl extends BaseDao implements BranchesDao {

    //查询所有营业网点信息
    @Override
    public List<Branches> selectBranchesAll() {
        List<Branches> branchesList = new ArrayList<Branches>();

        try {
            Connection conn = getConn();

            String sql = "SELECT branches.* FROM branches ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                branchesList.add(new Branches(
                        rs.getInt("id"),
                        rs.getString("businessNo"),
                        rs.getString("name"),
                        rs.getString("cityArea"),
                        rs.getString("address"),
                        rs.getString("telephone"),
                        rs.getString("summary")
                ));
            }
            System.err.println("\u001B[36mmsql:" + ps + "\u001B[0m");
            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return branchesList;
    }

    //根据id查询指定网点信息
    @Override
    public Branches selectBranchesById(int id) {
        Branches branches = null;
        try {
            Connection conn = getConn();

            String sql = "SELECT branches.* FROM branches WHERE branches.id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                branches = new Branches(
                        rs.getInt("id"),
                        rs.getString("businessNo"),
                        rs.getString("name"),
                        rs.getString("cityArea"),
                        rs.getString("address"),
                        rs.getString("telephone"),
                        rs.getString("summary")
                );
            }

            System.err.println("\u001B[36mmsql:" + ps + "\u001B[0m");
            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return branches;
    }

    //根据营业执照号查询指定网点信息
    @Override
    public Branches selectBranchesByBusinessNo(String businessNo) {
        Branches branches = null;
        try {
            Connection conn = getConn();

            String sql = "SELECT branches.* FROM branches WHERE branches.businessNo = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,businessNo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                branches = new Branches(
                        rs.getInt("id"),
                        rs.getString("businessNo"),
                        rs.getString("name"),
                        rs.getString("cityArea"),
                        rs.getString("address"),
                        rs.getString("telephone"),
                        rs.getString("summary")
                );
            }

            System.err.println("\u001B[36mmsql:" + ps + "\u001B[0m");
            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return branches;
    }

    //添加营业网点信息
    @Override
    public int insertBranches(Branches branches) {
        String sql = "INSERT INTO branches (businessNo, name, cityArea, address, telephone, summary)\n" +
                        "VALUES (?,?,?,?,?,?)\n";
        Object[] objects = {branches.getBusinessNo(),branches.getName(),branches.getCityArea(),branches.getAddress(),branches.getTelephone(),branches.getSummary()};

        try {
            return updateBuffer(sql,objects);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



}
