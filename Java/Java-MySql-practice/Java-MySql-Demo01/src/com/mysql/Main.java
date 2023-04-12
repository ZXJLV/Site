package com.mysql;

import com.mysql.dao.CalorieDao;
import com.mysql.dao.ProjectTypeDao;
import com.mysql.dao.StaffDao;
import com.mysql.dao.UserinfoDao;
import com.mysql.dao.impl.CalorieDaoImpl;
import com.mysql.dao.impl.ProjectTypeDaoImpl;
import com.mysql.dao.impl.StaffDaoImpl;
import com.mysql.dao.impl.UserinfoDaoImpl;
import com.mysql.service.ConsumptionService;
import com.mysql.service.UserinfoService;
import com.mysql.service.impl.ConsumptionServiceImpl;
import com.mysql.service.impl.UserinfoServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        UserinfoService userinfoService = new UserinfoServiceImpl();
        ConsumptionService consumptionService = new ConsumptionServiceImpl();

        System.out.println("1.开卡");
        System.out.println("2.删除用户信息");
        System.out.println("3.添加消费记录");
        System.out.println("4.打印小票");
        System.out.println("5.更改姓名");
        System.out.println("6.查看用户信息");

        System.out.println("请选择:");
        int inp = input.nextInt();

        switch (inp) {
            case 1:
                //开卡
                userinfoService.insertUserinfo();
                break;
            case 2:
                //注销
                userinfoService.deleteUserinfo();
                break;
            case 3:
                //消费
                consumptionService.insertConsumption();
                break;
            case 4:
                //打印小票
                consumptionService.selectConsumption();
                break;
            case 5:
                //更改用户姓名
                userinfoService.updateUserInfoNameByUserNameAndUserPhone();
                break;
            case 6:
                //查看用户信息
                userinfoService.selectUserInfoUpdateStaffNameAndCalorieType();
                break;
            default:
                break;
        }







    }
}