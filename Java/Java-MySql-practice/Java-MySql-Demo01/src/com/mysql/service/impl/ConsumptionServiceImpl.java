package com.mysql.service.impl;

import com.mysql.dao.*;
import com.mysql.dao.impl.*;
import com.mysql.service.ConsumptionService;

import java.util.Scanner;

public class ConsumptionServiceImpl implements ConsumptionService {
    Scanner input = new Scanner(System.in);

    ConsumptionDao consumptionDao = new ConsumptionDaoImpl();
    UserinfoDao userinfoDao = new UserinfoDaoImpl();
    StaffTypeDao staffTypeDao = new StaffTypeDaoImpl();
    ProjectTypeDao projectTypeDao = new ProjectTypeDaoImpl();
    CalorieDao calorieDao = new CalorieDaoImpl();

    //添加消费记录
    @Override
    public void insertConsumption() throws Exception {

        System.out.println("请输入用户姓名：");
        String userInfoName = input.next();
        System.out.println("请输入手机号后四位：");
        String phone = input.next();
        System.out.println("请输入员工类型名称：");
        String staffTypeName = input.next();
        System.out.println("请输入项目类型名称：");
        String projectTypeName = input.next();

        double consumptionActual = 0;

        if (calorieDao.selectCalorieType(userinfoDao.selectUserInfoId(userInfoName,phone)).equals("白银卡")){
            consumptionActual = projectTypeDao.selectProjectPriceByProjectName(projectTypeName)*calorieDao.selectCalorieDiscount(calorieDao.selectCalorieType(userinfoDao.selectUserInfoId(userInfoName,phone)));
            System.out.println(consumptionActual);
        }else if(calorieDao.selectCalorieType(userinfoDao.selectUserInfoId(userInfoName,phone)).equals("黄金卡")){
            consumptionActual = projectTypeDao.selectProjectPriceByProjectName(projectTypeName)*calorieDao.selectCalorieDiscount(calorieDao.selectCalorieType(userinfoDao.selectUserInfoId(userInfoName,phone)));
            System.out.println(consumptionActual);
        }else if(calorieDao.selectCalorieType(userinfoDao.selectUserInfoId(userInfoName,phone)).equals("钻石卡")){
            consumptionActual = projectTypeDao.selectProjectPriceByProjectName(projectTypeName)*calorieDao.selectCalorieDiscount(calorieDao.selectCalorieType(userinfoDao.selectUserInfoId(userInfoName,phone)));
            System.out.println(consumptionActual);
        }else {
            consumptionActual = projectTypeDao.selectProjectPriceByProjectName(projectTypeName)*calorieDao.selectCalorieDiscount(calorieDao.selectCalorieType(userinfoDao.selectUserInfoId(userInfoName,phone)));
        }

        int rowInsertConsumption = consumptionDao.insertConsumption(
                userinfoDao.selectUserInfoId(userInfoName,phone),
                staffTypeDao.selectStaffIdByStaffName(staffTypeName),
                projectTypeDao.selectProjectIdByProjectName(projectTypeName,staffTypeDao.selectStaffIdByStaffName(staffTypeName)),
                projectTypeDao.selectProjectPriceByProjectName(projectTypeName),
                consumptionActual
        );

        if (rowInsertConsumption > 0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    //打印消费记录
    @Override
    public void selectConsumption() throws Exception {

        System.out.println("请输入用户姓名：");
        String userInfoName = input.next();

        consumptionDao.selectConsumption(userInfoName);

    }

}
