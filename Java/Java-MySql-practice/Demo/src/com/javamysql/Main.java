package com.javamysql;

import com.javamysql.Service.CheckitemService;
import com.javamysql.Service.impl.CheckitemServiceImpl;
import com.javamysql.dao.CheckitemDao;
import com.javamysql.dao.impl.CheckitemDaoImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        CheckitemDao checkitemDao = new CheckitemDaoImpl();
        CheckitemService checkitemService = new CheckitemServiceImpl();

        System.out.println("1.添加检查项目");
        System.out.println("2.删除检查项目");
        System.out.println("3.改检查项目名称和金额");
        System.out.println("4.查询检查项目");
        System.out.println("请输入：");
        int switchInput = input.nextInt();

        switch (switchInput){
            case 1:
                //添加检查项目
                checkitemService.insertCheckitem();
                break;
            case 2:
                //删除检查项目
                checkitemService.deleteCheckitem();
                break;
            case 3:
                //改检查项目名称和金额
                checkitemService.updateCheckItemNameAndCheckItemCost();
                break;
            case 4:
                //查询检查项目
                checkitemDao.selectCheckItemAndDepName();
                break;
        }









    }
}