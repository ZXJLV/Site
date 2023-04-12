package cn.demo02.dao.impl;

import cn.demo02.dao.BaseDao;
import cn.demo02.dao.PatientDao;
import cn.demo02.entity.Patient;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PatientDaoImpl extends BaseDao implements PatientDao {

    //挂号
    @Override
    public int insertPatient(int doctorId, String patientName, String patientState, String diagnosticTime) throws Exception {
        String sql = "INSERT INTO patient (doctorId,patientName,patientState,diagnosticTime)" +
                                  "VALUES (?,?,?,?)";
        Object[] objects = {doctorId,patientName,patientState,diagnosticTime};

        return updateBuffer(sql,objects);
    }

    //打印挂号信息
    @Override
    public List<Patient> selectPatient() throws Exception {
        Connection conn = getConn();

        List<Patient> patientList = new ArrayList<Patient>();

        String sql = "SELECT patient.patientId, doctor.doctorName, patient.patientName, patient.patientState, patient.registrationTime \n" +
                "FROM patient \n" +
                "INNER JOIN doctor ON doctor.doctorId = patient.doctorId \n" +
                "WHERE patientState = '待就诊' \n" +
                "ORDER BY patient.registrationTime ASC;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            patientList.add(new Patient(
               rs.getInt(1),
               rs.getString(2),
               rs.getString(3),
               rs.getString(4),
               rs.getString(5)
            ));
        }

        closeAll(conn,ps,rs);

        for (Patient patient : patientList) {
            System.out.println(patient);
        }

        return patientList;
    }

    //查询叫号人员
    @Override
    public List<Patient> selectPatient2() throws Exception {
        Connection conn = getConn();

        List<Patient> patientList = new ArrayList<Patient>();

        String sql = "SELECT patient.patientId, patient.patientName, doctor.doctorName,patient.patientState, patient.registrationTime \n" +
                "FROM patient \n" +
                "INNER JOIN doctor ON doctor.doctorId = patient.doctorId \n" +
                "WHERE patientState = '待就诊' \n" +
                "AND registrationTime = (\n" +
                "    SELECT MIN(registrationTime) \n" +
                "    FROM patient \n" +
                "    WHERE patientState = '待就诊'\n" +
                ")";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            patientList.add(new Patient(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
            ));
        }

        closeAll(conn,ps,rs);

        for (Patient patient : patientList) {
            System.out.println(patient);
        }

        return patientList;
    }

    //查询叫号人员
    @Override
    public List<Patient> selectPatient3() throws Exception {
        Connection conn = getConn();

        List<Patient> patientList = new ArrayList<Patient>();

        String sql = "SELECT patient.patientId, patient.patientName, doctor.doctorName,patient.patientState, patient.registrationTime \n" +
                "FROM patient \n" +
                "INNER JOIN doctor ON doctor.doctorId = patient.doctorId \n" +
                "WHERE patientState = '正在就诊' \n" +
                "AND registrationTime = (\n" +
                "    SELECT MIN(registrationTime) \n" +
                "    FROM patient \n" +
                "    WHERE patientState = '正在就诊'\n" +
                ")";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            patientList.add(new Patient(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
            ));
        }

        closeAll(conn,ps,rs);

        for (Patient patient : patientList) {
            System.out.println(patient);
        }

        return patientList;
    }

    //查询出叫号人员id
    @Override
    public int selectPatientId() throws Exception {
        Connection conn = getConn();

        String sql = "SELECT patient.patientId, doctor.doctorName,patient.patientName, patient.patientState, patient.registrationTime \n" +
                "FROM patient \n" +
                "INNER JOIN doctor ON doctor.doctorId = patient.doctorId \n" +
                "WHERE patientState = '待就诊' \n" +
                "AND registrationTime = (\n" +
                "    SELECT MIN(registrationTime) \n" +
                "    FROM patient \n" +
                "    WHERE patientState = '待就诊'\n" +
                ")";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        int patientId = 0;

        while (rs.next()) {
            patientId = rs.getInt(1);
        }

        closeAll(conn,ps,rs);

        return patientId;
    }
    //查询出就诊人员id
    @Override
    public int selectPatientId2() throws Exception {
        Connection conn = getConn();

        String sql = "SELECT patient.patientId, doctor.doctorName,patient.patientName, patient.patientState, patient.registrationTime \n" +
                "FROM patient \n" +
                "INNER JOIN doctor ON doctor.doctorId = patient.doctorId \n" +
                "WHERE patientState = '正在就诊' \n" +
                "AND registrationTime = (\n" +
                "    SELECT MIN(registrationTime) \n" +
                "    FROM patient \n" +
                "    WHERE patientState = '正在就诊'\n" +
                ")";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        int patientId = 0;

        while (rs.next()) {
            patientId = rs.getInt(1);
        }

        closeAll(conn,ps,rs);

        return patientId;
    }

    //更改就诊状态为正在就诊
    @Override
    public int updatePatientState(int patientId) throws Exception {
        String sql = "UPDATE patient SET patientState='正在就诊' WHERE patientId=?";
        Object[] objects = {patientId};

        return updateBuffer(sql, objects);
    }

    //更改就诊状态为已就诊
    @Override
    public int updatePatientState2(int patientId) throws Exception {
        String sql = "UPDATE patient SET patientState='已就诊' WHERE patientId=?";
        Object[] objects = {patientId};

        return updateBuffer(sql, objects);
    }

    //更改就诊时间
    @Override
    public int updateDiagnosticTime(int patientId) throws Exception {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String diagnosticTime = formatter.format(localDateTime);

        String sql = "UPDATE patient SET diagnosticTime=? WHERE patientId=?";
        Object[] objects = {diagnosticTime,patientId};

        return updateBuffer(sql,objects);
    }



}
