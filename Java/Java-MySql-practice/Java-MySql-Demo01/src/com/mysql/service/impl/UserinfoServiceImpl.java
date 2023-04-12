package com.mysql.service.impl;

import com.mysql.dao.CalorieDao;
import com.mysql.dao.ConsumptionDao;
import com.mysql.dao.StaffDao;
import com.mysql.dao.UserinfoDao;
import com.mysql.dao.impl.CalorieDaoImpl;
import com.mysql.dao.impl.ConsumptionDaoImpl;
import com.mysql.dao.impl.StaffDaoImpl;
import com.mysql.dao.impl.UserinfoDaoImpl;
import com.mysql.entity.Userinfo;
import com.mysql.service.UserinfoService;

import java.util.Scanner;

public class UserinfoServiceImpl implements UserinfoService {
    Scanner input = new Scanner(System.in);
    UserinfoDao userinfoDao = new UserinfoDaoImpl();
    CalorieDao calorieDao = new CalorieDaoImpl();
    StaffDao staffDao = new StaffDaoImpl();
    ConsumptionDao consumptionDao = new ConsumptionDaoImpl();

    //开卡
    @Override
    public void insertUserinfo() throws Exception {

        System.out.println("请输入客户的姓名：");
        String userInfoName = input.next();
        System.out.println("请输入客户的手机号：");
        String phone = input.next();
        System.out.println("请输入客户的充值的金额：");
        double balance = input.nextDouble();

        staffDao.selectStaff();
        System.out.println("请选择员工id：");
        int staffId = input.nextInt();

//        int i = 1;
//        int calorieId = 0;
//
//
//        if (balance >= 100 && balance <= 999) {
//            for (Calorie calorie : calorieDao.selectCalorie()) {
//                if (i == 1) {
//                    calorieId = calorie.getCalorieId();
//                }
//                i++;
//            }
//        } else if (balance >= 1000 && balance <= 9999) {
//            for (Calorie calorie : calorieDao.selectCalorie()) {
//                if (i == 2) {
//                    calorieId = calorie.getCalorieId();
//                }
//                i++;
//            }
//        } else if (balance >= 10000 && balance <= 999999) {
//            for (Calorie calorie : calorieDao.selectCalorie()) {
//                if (i == 3) {
//                    calorieId = calorie.getCalorieId();
//                }
//                i++;
//            }
//        }

        int row = userinfoDao.insertUserInfo(new Userinfo(
                userInfoName, phone, balance, staffId, calorieDao.selectCalorieId(balance), balance)
        );

        if(row > 0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加成功");
        }


    }

    //删除用户信息
    @Override
    public void deleteUserinfo() throws Exception {

        System.out.println("请输入用户id：");
        int userInfoId = input.nextInt();

        consumptionDao.deleteConsumption(userInfoId);
        int rowUserinfo = userinfoDao.deleteUserInfo(userInfoId);

        if(rowUserinfo > 0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }

    }

    //根据姓名和手机号后四位更改用户姓名
    @Override
    public void updateUserInfoNameByUserNameAndUserPhone() throws Exception {

        System.out.println("请输入要更改的姓名：");
        String userName = input.next();
        System.out.println("请输入您手机号：");
        String phone = input.next();
        System.out.println("请输入更改后的姓名：");
        String newUserName = input.next();

        int rowUpdate = userinfoDao.updateUserInfoNameByUserNameAndUserPhone(userName,phone,newUserName);

        if(rowUpdate > 0){
            System.out.println("更改成功");
        }else {
            System.out.println("更改失败");
        }

    }

    //查看所有用户把staffId，calorieId替换为staffName，calorieType
    @Override
    public void selectUserInfoUpdateStaffNameAndCalorieType() throws Exception {
        System.out.println("请输入用户姓名：");
        String userName = input.next();
        System.out.println("请输入用户手机号：");
        String phone = input.next();

        userinfoDao.selectUserInfoUpdateStaffNameAndCalorieType(userName,phone);

    }

}
