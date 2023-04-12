package cn.demo02.dao;

import cn.demo02.entity.Doctorlevel;

import java.util.ArrayList;

public interface DoctorLevelDao {

    //打印所有医生等级
    public ArrayList<Doctorlevel> selectDoctorLevel() throws Exception;

}
