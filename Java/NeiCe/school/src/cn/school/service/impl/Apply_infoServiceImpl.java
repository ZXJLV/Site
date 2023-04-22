package cn.school.service.impl;

import cn.school.dao.Apply_infoDao;
import cn.school.dao.impl.Apply_infoDaoImpl;
import cn.school.entity.Apply_info;
import cn.school.service.Apply_infoService;

import java.util.Scanner;

public class Apply_infoServiceImpl implements Apply_infoService {
    Scanner input = new Scanner(System.in);
    Apply_infoDao applyInfoDao = new Apply_infoDaoImpl();
    Apply_info applyInfo = new Apply_info();

    //报名
    @Override
    public void insertApply_info() {

        System.out.println("请输入姓名：");
        applyInfo.setName(input.next());
        System.out.println("请输入年龄：");
        applyInfo.setAge(input.nextInt());
        System.out.println("请选择班级（1.一班 2.二班 3.三班）：");
        applyInfo.setClass1(input.nextInt());
        System.out.println("请选择报名项目（1.跳舞 2.跳远 3.跳绳 4.跳高）：");
        int game = input.nextInt();

        if (game == 1){
            applyInfo.setGame("跳舞");
        }else if (game == 2){
            applyInfo.setGame("跳远");
        }else if (game == 3){
            applyInfo.setGame("跳绳");
        }else if (game == 4){
            applyInfo.setGame("跳高");
        }

        int row = applyInfoDao.insertApply_info(applyInfo);

        if (row > 0){
            System.out.println("报名成功！");
        }else {
            System.out.println("报名失败！");
        }

    }

    //按比赛项目查询
    @Override
    public void selectApply_infoByGame() {
        String gameString = null;
        System.out.println("请选择要查询的比赛项目（1.跳舞 2.跳远 3.跳绳 4.跳高）");
        int gameInt = input.nextInt();

        if (gameInt == 1){
            gameString = "跳舞";
        }else if (gameInt == 2){
            gameString = "跳远";
        }else if (gameInt == 3){
            gameString = "跳绳";
        }else if (gameInt == 4){
            gameString = "跳高";
        }

        for (Apply_info apply_info : applyInfoDao.selectApply_infoByGame(gameString)) {
            System.out.println(apply_info+"\n");
        }

    }

    //按班号查询
    @Override
    public void selectApply_infoByClass1() {
        System.out.println("请选择要查询的班级（1.一班 2.二班 3.三班）：");
        int class1 = input.nextInt();

        for (Apply_info apply_info : applyInfoDao.selectApply_infoByClass1(class1)) {
            System.out.println(apply_info+"\n");
        }

    }

    //取消报名
    @Override
    public void deleteApply_infoByName() {
        System.out.println("请输入取消报名的学生姓名：");
        String name = input.next();

        int row = applyInfoDao.delecteApply_infoByName(name);

        if (row > 0){
            System.out.println("取消报名成功！\n");
        }else {
            System.out.println("取消报名失败！\n");
        }
    }


}
