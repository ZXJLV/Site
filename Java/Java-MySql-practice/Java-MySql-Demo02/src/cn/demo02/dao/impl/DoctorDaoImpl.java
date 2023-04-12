package cn.demo02.dao.impl;

import cn.demo02.dao.BaseDao;
import cn.demo02.dao.DoctorDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DoctorDaoImpl extends BaseDao implements DoctorDao {

    //查出接诊人数最大的医生id
    public int selectDoctorMaxVisitsTheDoctorId(int doctorLevelId) throws Exception {
        Connection conn = getConn();

        String sql = "SELECT\n" +
                "\tMIN(doctor.doctorId ) \n" +
                "FROM\n" +
                "\tdoctor\n" +
                "WHERE\n" +
                "\tdoctor.maxVisits = (\n" +
                "SELECT\n" +
                "\tMAX(doctor.maxVisits) \n" +
                "FROM\n" +
                "\tdoctor \n" +
                "WHERE\n" +
                "\tdoctorLevelId = 2\n" +
                "\t\n" +
                "\t)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        int i=0;
        if (rs.next()) {
            i = rs.getInt(1);
        }

        closeAll(conn,ps,rs);

        return i;
    }





}
