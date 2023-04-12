package cn.demo02.service.impl;

import cn.demo02.dao.DoctorDao;
import cn.demo02.dao.DoctorLevelDao;
import cn.demo02.dao.PatientDao;
import cn.demo02.dao.impl.DoctorDaoImpl;
import cn.demo02.dao.impl.DoctorLevelDaoImpl;
import cn.demo02.dao.impl.PatientDaoImpl;
import cn.demo02.service.PatientService;

import java.util.Scanner;

public class PatientServiceImpl implements PatientService {
    Scanner input = new Scanner(System.in);
    DoctorDao doctorDao = new DoctorDaoImpl();
    PatientDao patientDao = new PatientDaoImpl();
    DoctorLevelDao doctorLevelDao = new DoctorLevelDaoImpl();

    //挂号
    @Override
    public void insertPatient() throws Exception {

        System.out.println("请输入您的姓名：");
        String patientName = input.next();

        doctorLevelDao.selectDoctorLevel();

        System.out.println("请输入您要选择的等级的序号：");
        int doctorLevel = input.nextInt();

        int rowInsert = patientDao.insertPatient(doctorDao.selectDoctorMaxVisitsTheDoctorId(doctorLevel),patientName,"待",null);

        if (rowInsert > 0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

    }

    //打印挂号信息
    @Override
    public void selectPatient() throws Exception {
        patientDao.selectPatient();


    }

    //叫号
    @Override
    public void updatePatientState() throws Exception {

        System.out.println("叫号人员：");
        patientDao.selectPatient2();

        int patientId = patientDao.selectPatientId();
        patientDao.updatePatientState(patientId);
        System.out.println("已将此患者状态更改为”正在就诊“");

    }

    //就诊
    @Override
    public void updatePatientState2() throws Exception {
        System.out.println("就诊人员：");
        patientDao.selectPatient3();

        Thread.sleep(1000);

        String patientStateOK = "";
        System.out.println("是否就诊完毕？(输入y)");
        patientStateOK = input.nextLine().toLowerCase();

        while (!patientStateOK.equals("y")) {
            System.out.println("请输入“y”");
            patientStateOK = input.nextLine().toLowerCase();
        }

        int patientId = patientDao.selectPatientId2();

        patientDao.updatePatientState2(patientId);
        System.out.println("已将此患者状态更改为”已就诊“");

        //更改就诊时间
        patientDao.updateDiagnosticTime(patientId);
    }









}
