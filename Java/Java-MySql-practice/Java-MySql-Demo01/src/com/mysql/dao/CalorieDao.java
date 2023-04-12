package com.mysql.dao;

import com.mysql.entity.Calorie;

import java.util.ArrayList;

public interface CalorieDao {

    //查Calorie表calorieId字段
    public int selectCalorieId(double balance) throws Exception;

    //根据用户id查出卡类型
    public String selectCalorieType(int userInfoId) throws Exception;

    //根据卡类型查出卡折扣
    public double selectCalorieDiscount(String calorieType) throws Exception;
}
