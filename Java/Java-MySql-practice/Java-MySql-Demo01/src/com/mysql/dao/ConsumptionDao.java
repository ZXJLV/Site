package com.mysql.dao;

import com.mysql.entity.Consumption;
import com.mysql.entity.Userinfo;

import java.util.ArrayList;

public interface ConsumptionDao {

    //删除消费记录
    public int deleteConsumption(int userInfoId) throws Exception;

    //添加消费记录
    public int insertConsumption(int userInfoId,int staffTypeId,int projectTypeId,double projectTypePrice,double consumptionActual) throws Exception;

    //打印小票
    public ArrayList<Consumption> selectConsumption(String userName) throws Exception;

}
