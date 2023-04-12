package com.javamql.dao.impl;

import com.javamql.dao.BaseDao;
import com.javamql.dao.PrescriptionDao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PrescriptionDaoImpMysql extends BaseDao implements PrescriptionDao {

    //删除prescription表内的信息
    @Override
    public int deletePrescriptionByPatientID(int patientID) throws Exception {

        String sql = "DELETE FROM patient WHERE patientID=?";
        Object[] o = {patientID};
//        PreparedStatement ps = conn.prepareStatement(sql);
//        ps.setInt(1,patientID);
//        int row = ps.executeUpdate();

        return updateAll(sql,o);

    }

}
