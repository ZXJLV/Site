package cn.demo02.dao;

import cn.demo02.entity.Doctor;

import java.util.ArrayList;

public interface DoctorDao {

    //查出接诊人数最大的医生id
    public int selectDoctorMaxVisitsTheDoctorId(int doctorLevelId) throws Exception;

}
