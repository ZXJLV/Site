package cn.wantedjob.dao.impl;

import cn.wantedjob.dao.BaseDao;
import cn.wantedjob.dao.CompanyDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CompanyDaoImpl extends BaseDao implements CompanyDao {
    PreparedStatement ps = null;
    Connection conn = null;
    ResultSet rs = null;
    String sql = null;

    //根据公司名称查询是否有这个公司
    @Override
    public boolean selectCompanyByCompanyName(String companyName) {
        try {
            conn = getConn();

            sql = "SELECT COUNT(*) FROM company WHERE company.companyName = ?;";
            ps = conn.prepareStatement(sql);
            ps.setString(1, companyName);
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

    //根据输入的公司名称查询公司id
    @Override
    public int selectCompanyIdByCompanyName(String companyName) {
        int companyId = -1;
        try {
            conn = getConn();

            sql = "SELECT company.companyId FROM company WHERE company.companyName = ?;";
            ps = conn.prepareStatement(sql);
            ps.setString(1, companyName);
            rs = ps.executeQuery();

            if (rs.next()) {
                companyId = rs.getInt("company.companyId");
            }

            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return companyId;
    }




}
