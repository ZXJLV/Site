package cn.steam.service.impl;

import cn.steam.dao.UserinfoDao;
import cn.steam.dao.WalletDao;
import cn.steam.dao.impl.UserinfoDaoImpl;
import cn.steam.dao.impl.WalletDaoImpl;
import cn.steam.service.UserInfoService;
import cn.steam.service.WalletService;

import java.util.Scanner;

public class WalletServiceImpl implements WalletService {
    Scanner input = new Scanner(System.in);
    WalletDao walletDao = new WalletDaoImpl();
    UserinfoDao userinfoDao = new UserinfoDaoImpl();

    UserInfoService userInfoService = new UserInfoServiceImpl();
//
//    //提现
//    @Override
//    public void updateWalletBalance() {
//        boolean judgementUserInfoEmail = true;
//        String userInfoEmail = null;
//        String userInfoPwd = null;
//
//        while (judgementUserInfoEmail) {
//            System.out.println("请输入邮箱：");
//            userInfoEmail = input.next();
//
//            //判断是否有这个账号
//            boolean booleanUserInfoEmail = userinfoDao.selectUserInfoByUserInfoEmail(userInfoEmail);
//            if (!booleanUserInfoEmail) {
//
//                judgementUserInfoEmail = false;
//            }else {
//                System.out.println("此邮箱未注册!");
//                System.exit(0);
//            }
//
//            System.out.println("请输入密码:");
//            userInfoPwd = input.next();
//
//            //根据账号查找密码，然后判断是否正确
//            String userInfoPwd2 = userinfoDao.selectUserInfoPwdByUserInfoEmail(userInfoEmail);
//
//            if (userInfoPwd2 == null){
//                System.out.println("密码错误");
//                judgementUserInfoEmail = true;
//            }
//        }
//
//        //根据邮箱和密码查询用户id
//        int userInfoId = userinfoDao.selectUserInfoIdByUserInfoEmailAndUserInfoPwd(userInfoEmail,userInfoPwd);
//
//        System.out.println("请输入要提现的金额：");
//        double walletBalance = input.nextDouble();
//
//        int rowLiftMoney = walletDao.updateWalletBalanceByUserInfoById(userInfoId,walletBalance);
//
//        if (rowLiftMoney>0) {
//            System.out.println("提现成功");
//        }else {
//            System.out.println("提现失败");
//        }
//
//    }


}
