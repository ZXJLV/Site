package cn.demo02.service;

public interface PatientService {

    //挂号
    public void insertPatient() throws Exception;

    //打印挂号信息
    public void selectPatient() throws Exception;

    //叫号
    public void updatePatientState() throws Exception;

    //就诊
    public void updatePatientState2() throws Exception;
}
