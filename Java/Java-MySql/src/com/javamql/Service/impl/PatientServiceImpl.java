package com.javamql.Service.impl;

import com.javamql.Service.PatientService;
import com.javamql.dao.impl.PatientDaoImplMysql;
import com.javamql.dao.impl.PrescriptionDaoImpMysql;

public class PatientServiceImpl implements PatientService {
    PatientDaoImplMysql patientDaoImplMysql = new PatientDaoImplMysql();
    PrescriptionDaoImpMysql prescriptionDaoImpMysql = new PrescriptionDaoImpMysql();

    //删除patient，prescription表内的信息
    @Override
    public void deletePatientByPatientID(int patientID) throws Exception {
        prescriptionDaoImpMysql.deletePrescriptionByPatientID(patientID);
        patientDaoImplMysql.deletePatientByPatientID(patientID);
    }
}
