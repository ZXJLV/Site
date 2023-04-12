package com.javamql.dao;

public interface PrescriptionDao {
    //删除信息
    public int deletePrescriptionByPatientID(int patientID) throws Exception;

}
