package com.javamql.dao;

import com.javamql.entity.Patient;

import java.util.ArrayList;
import java.util.List;

public interface PatientDao {

    //查patient所有信息
    public List<Patient> selectPatientInfo() throws Exception;

    //添加病人信息
    public int insertPatient(Patient patient) throws Exception;

    //删除病人信息
    public int deletePatientByPatientID(int patientID) throws Exception;

    //修改病人姓名
    public int updatePatientName(int patientID, String patientName) throws Exception;
}
