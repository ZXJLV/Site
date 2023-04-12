package com.javamql;

import com.javamql.Service.PatientService;
import com.javamql.Service.impl.PatientServiceImpl;
import com.javamql.dao.PatientDao;
import com.javamql.dao.impl.PatientDaoImplMysql;
import com.javamql.entity.Patient;

public class Main {
    public static void main(String[] args) throws Exception {

        PatientDao patientDao = new PatientDaoImplMysql();
        PatientService patientService = new PatientServiceImpl();

        //查
        //patientDao.selectPatientInfo();

        //增
        int i = patientDao.insertPatient(new Patient(50,"123465","2077-7-7","男","杨九铭","1246798","1234@qq.com","5415614","郑州"));
        System.out.println(i);

        //删
        //patientService.deletePatientByPatientID(30);

        //改
        //int i = patientDao.updatePatientName(13,"李飞");
        //System.out.println(i);

    }
}
