package com.javamql.dao.impl;

import com.javamql.dao.BaseDao;
import com.javamql.dao.PatientDao;
import com.javamql.entity.Patient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PatientDaoImplMysql extends BaseDao implements PatientDao {

    //查patient所有信息
    @Override
    public List<Patient> selectPatientInfo() throws Exception {
        Connection conn = getConn();
        Patient patient = null;

        List<Patient> patientList = new ArrayList<Patient>();

        String sql = "select * from patient;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            patientList.add(new Patient(
                    rs.getInt("patientID"),
                    rs.getString("password"),
                    rs.getString("birthDate"),
                    rs.getString("gender"),
                    rs.getString("patientName"),
                    rs.getString("phoneNum"),
                    rs.getString("email"),
                    rs.getString("identityNum"),
                    rs.getString("address")
                    )
            );
        }

        closeAll(conn,ps,rs);

        for (Patient patient1 : patientList) {
            System.out.println(patient1);
        }

        return patientList;
    }

    //添加信息
    @Override
    public int insertPatient(Patient patient) throws Exception {

        String sql = "INSERT INTO patient (password,birthDate,gender,patientName,phoneNum,email,identityNum,address)" +
                                  "VALUES (?,?,?,?,?,?,?,?)";
        Object[] o = {patient.getPassword(),patient.getBirthDate(),patient.getGender(),patient.getPatientName(),patient.getPhoneNum(),patient.getEmail(),patient.getIdentityNum(),patient.getAddress()};

        //        PreparedStatement ps = conn.prepareStatement(sql);
//        ps.setString(1,patient.getPassword());
//        ps.setString(2,patient.getBirthDate());
//        ps.setString(3,patient.getGender());
//        ps.setString(4,patient.getPatientName());
//        ps.setString(5,patient.getPhoneNum());
//        ps.setString(6,patient.getEmail());
//        ps.setString(7,patient.getIdentityNum());
//        ps.setString(8,patient.getAddress());
//        int row = ps.executeUpdate();

        return updateAll(sql,o);
    }

    //删除patient表内的信息
    @Override
    public int deletePatientByPatientID(int patientID) throws Exception {

        String sql = "DELETE FROM patient WHERE patientID=?";
        Object[] o = {patientID};
//        PreparedStatement ps = conn.prepareStatement(sql);
//        ps.setInt(1,patientID);
//        int row = ps.executeUpdate();

        return updateAll(sql,o);
    }

    //更改姓名
    @Override
    public int updatePatientName(int patientID, String patientName) throws Exception {

        String sql = "UPDATE patient SET patientName=? WHERE patientID=?";
        Object[] o = {patientName, patientID};
        //        PreparedStatement ps = conn.prepareStatement(sql);
//        ps.setString(1,patientName);
//        ps.setInt(2,patientID);
//        int row = ps.executeUpdate();

        return updateAll(sql,o);
    }


}
