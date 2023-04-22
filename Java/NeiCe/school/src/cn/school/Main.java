package cn.school;

import cn.school.service.Apply_infoService;
import cn.school.service.impl.Apply_infoServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean a = true;
        Scanner input = new Scanner(System.in);
        Apply_infoService applyInfoService = new Apply_infoServiceImpl();

        System.out.println("*****欢迎使用运动会报名系统*****");
        while (a) {
        System.out.print("1.学生报名\t");
        System.out.print("2.按比赛项目查询\t");
        System.out.print("3.按班级查询\t");
        System.out.print("4.取消报名\t");
        System.out.println("5.退出系统\t");
        System.out.println("请选择（1~5）：");
        int xz = input.nextInt();

        switch (xz) {
            case 1:
                applyInfoService.insertApply_info();
                break;
            case 2:
                applyInfoService.selectApply_infoByGame();
                break;
            case 3:
                applyInfoService.selectApply_infoByClass1();
                break;
            case 4:
                applyInfoService.deleteApply_infoByName();
                break;
            case 5:
                System.out.println("谢谢使用");
                a = false;
                break;
            default:
                System.out.println("输入错误");
                break;
        }

        }

    }
}
