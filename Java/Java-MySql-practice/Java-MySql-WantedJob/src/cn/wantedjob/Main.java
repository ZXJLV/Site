package cn.wantedjob;

import cn.wantedjob.entity.Userinfo;
import cn.wantedjob.service.CompanyService;
import cn.wantedjob.service.JobInfoService;
import cn.wantedjob.service.UserinfoService;
import cn.wantedjob.service.impl.CompanyServiceImpl;
import cn.wantedjob.service.impl.JobInfoServiceImpl;
import cn.wantedjob.service.impl.UserinfoServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Userinfo userinfo = new Userinfo();

        UserinfoService userinfoService = new UserinfoServiceImpl();
        CompanyService companyService = new CompanyServiceImpl();
        JobInfoService jobInfoService = new JobInfoServiceImpl();

        System.out.println("1,注册");
        System.out.println("2,登录");
        System.out.println("3.查看招聘信息");

        System.out.println("请选择：");
        int choose = input.nextInt();

        switch (choose) {
            case 1:
                //注册
                System.out.println("请输入您的名称：");
                userinfo.setUserInfoLoginName(input.next());
                System.out.println("请输入账号：");
                userinfo.setUserInfoName(input.next());
                System.out.println("请输入密码：");
                userinfo.setUserInfoPwd(input.next());
                //查询用户类型
                userinfoService.selectUserInfoType();
                System.out.println("请选择用户类型：");
                userinfo.setUserInfoTypeId(input.nextInt());

                int userInfoTypeId = userinfo.getUserInfoTypeId();
                String userInfoCompanyName = null;
                int companyId = -1;

                //循环输入
                if (userInfoTypeId == 2) {
                    boolean isExistingCompany = false;
                    do {
                        System.out.println("请输入你的公司名称：");
                        userInfoCompanyName = input.next();
                        isExistingCompany = companyService.selectCompanyByCompanyName(userInfoCompanyName);
                    } while (!isExistingCompany);
                    userinfo.setUserInfoCompanyId(companyService.selectCompanyIdByCompanyName(userInfoCompanyName));
                }else {
                    userinfo.setUserInfoCompanyId(null);
                }

                System.out.println("请输入手机号：");
                userinfo.setUserInfoPhone(input.next());

                //添加用户信息
                userinfoService.insertUserInfo(userinfo);
                break;
            case 2:
                //登录
                System.out.println("请输入账号：");
                userinfo.setUserInfoName(input.next());
                System.out.println("请输入密码：");
                userinfo.setUserInfoPwd(input.next());
                //根据账号查询有没有这个账号
                userinfoService.selectUserinfoByUserinfoName(userinfo.getUserInfoName());
                //根据账号和密码查询是否正确
                userinfoService.selectUserinfoByUserInfoNameAndUserInfoPwd(userinfo.getUserInfoName(),userinfo.getUserInfoPwd());
                break;
            case 3:
                //筛选招聘信息
                System.out.println("请输入您要应聘的行业类型：");
                String jobTypeName = input.next();

                if (jobTypeName.equals("无")){

                }else {
                    //根据输入的行业类型名称查询
                    jobInfoService.selectJobInfoByJobTypeName(jobTypeName);
                }
                break;

        }




    }
}