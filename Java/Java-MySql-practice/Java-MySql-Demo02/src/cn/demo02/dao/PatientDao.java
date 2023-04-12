package cn.demo02.dao;

import cn.demo02.entity.Patient;

import java.util.ArrayList;
import java.util.List;

public interface PatientDao {

    //挂号
    public int insertPatient(int doctorId,String patientName,String patientState,String diagnosticTime) throws Exception;

    //打印挂号信息
    public List<Patient> selectPatient() throws Exception;

    //查询出叫号人员
    public List<Patient> selectPatient2() throws Exception;
    public List<Patient> selectPatient3() throws Exception;

    //查询出叫号人员id
    public int selectPatientId() throws Exception;
    public int selectPatientId2() throws Exception;

    //更改就诊状态为正在就诊
    public int updatePatientState(int patientId) throws Exception;
    //更改就诊状态为已就诊
    public int updatePatientState2(int patientId) throws Exception;

    //更改就诊时间
    public int updateDiagnosticTime(int patientId) throws Exception;


}
