package cn.steam.service.impl;

import cn.steam.dao.InventoryDao;
import cn.steam.dao.RecordDao;
import cn.steam.dao.UserinfoDao;
import cn.steam.dao.WalletDao;
import cn.steam.dao.impl.InventoryDaoImpl;
import cn.steam.dao.impl.RecordDaoImpl;
import cn.steam.dao.impl.UserinfoDaoImpl;
import cn.steam.dao.impl.WalletDaoImpl;
import cn.steam.entity.Userinfo;
import cn.steam.service.UserInfoService;
import cn.steam.service.WalletService;

import java.util.Scanner;

public class UserInfoServiceImpl implements UserInfoService {
    Scanner input = new Scanner(System.in);
    UserinfoDao userinfoDao = new UserinfoDaoImpl();
    InventoryDao inventoryDao = new InventoryDaoImpl();
    RecordDao recordDao = new RecordDaoImpl();
    WalletDao walletDao = new WalletDaoImpl();
    Userinfo userinfo = new Userinfo();

    WalletService walletService = new WalletServiceImpl();

    //注册
    @Override
    public void insertUserInfo() {
        boolean judgementUserInfoEmail = true;
        boolean judgementUserInfoNickName = true;
        boolean judgementUserInfoPwd = true;

        System.out.println("！！！！！注册！！！！！");

        while (judgementUserInfoNickName) {
        System.out.println("请输入名称：");
        String userInfoNickName = input.next();
        userinfo.setUserInfoNickName(userInfoNickName);

        //判断是否有这个昵称
        boolean booleanUserInfoNickName = userinfoDao.selectUserInfoByUserInfoNickName(userInfoNickName);
            if (!booleanUserInfoNickName) {
                System.out.println("此名称已重复!");
                System.out.println("请重新输入名称");
            }else {
                judgementUserInfoNickName = false;
            }
        }

        while (judgementUserInfoEmail) {
        System.out.println("请输入邮箱：");
        String userInfoEmail = input.next();
        userinfo.setUserInfoEmail(userInfoEmail);

        //判断是否有这个账号
        boolean booleanUserInfoEmail = userinfoDao.selectUserInfoByUserInfoEmail(userInfoEmail);
            if (!booleanUserInfoEmail) {
                System.out.println("此邮箱已注册!");
                System.out.println("是否跳转到登录(y/n)");
                String tz = input.next();
                if(tz.equals("y")){
                    judgementUserInfoEmail = false;
                    //调用登录方法
                    selectUserInfoByUserInfoEmailAndUserInfoPwd();

                    System.exit(0);
                }else {
                    System.out.println("请重新输入邮箱");
                }
            }else {
                judgementUserInfoEmail = false;
            }
        }

        while (judgementUserInfoPwd) {
            System.out.println("请输入密码：");
            String userInfoPwd = input.next();
            System.out.println("请再次输入密码：");
            String userInfoPwd2 = input.next();
            //判断两段密码是否一致
            if (userInfoPwd.equals(userInfoPwd2)) {
                userinfo.setUserInfoPwd(userInfoPwd);
                judgementUserInfoPwd = false;
            } else {
                System.out.println("两次密码不一致");
            }
        }

        System.out.println("请输入国家：");
        String userInfoCountry = input.next();
        userinfo.setUserInfoCountry(userInfoCountry);

        //注册
        int rowInsertUserInfo = userinfoDao.insertUserInfo(userinfo);

        if (rowInsertUserInfo>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }


    }

    //登录
    @Override
    public void selectUserInfoByUserInfoEmailAndUserInfoPwd() {
        boolean judgementUserInfoEmail = true;
        String userInfoEmail = null;
        String userInfoPwd = null;

        while (judgementUserInfoEmail) {
        System.out.println("请输入邮箱：");
        userInfoEmail = input.next();

            //判断是否有这个账号
            boolean booleanUserInfoEmail = userinfoDao.selectUserInfoByUserInfoEmail(userInfoEmail);
            if (!booleanUserInfoEmail) {

                judgementUserInfoEmail = false;
            }else {
                System.out.println("此邮箱未注册!");
                System.out.println("是否跳转到注册(y/n)");
                String tz = input.next();
                if(tz.equals("y")){
                    //调用注册方法
                    insertUserInfo();

                    System.exit(0);
                }else {
                    System.out.println("请重新输入邮箱");
                }
            }

            System.out.println("请输入密码:");
            userInfoPwd = input.next();

            //根据账号查找密码，然后判断是否正确
            String userInfoPwd2 = userinfoDao.selectUserInfoPwdByUserInfoEmail(userInfoEmail);

            if (userInfoPwd2 == null){
                System.out.println("密码错误");
                judgementUserInfoEmail = true;
            }
        }

        //登录
        String userinfoNickName = userinfoDao.selectUserInfoByUserInfoEmailAndUserInfoPwd(userInfoEmail,userInfoPwd);

        if (userinfoNickName!=null){
            System.out.println("欢迎"+userinfoNickName);
        }

    }

    //注销
    @Override
    public void deleteUserInfoAndInventory() {
        boolean judgementUserInfoEmail = true;
        String userInfoEmail = null;
        String userInfoPwd = null;

        while (judgementUserInfoEmail) {
            System.out.println("请输入邮箱：");
            userInfoEmail = input.next();

            //判断是否有这个账号
            boolean booleanUserInfoEmail = userinfoDao.selectUserInfoByUserInfoEmail(userInfoEmail);
            if (!booleanUserInfoEmail) {

                judgementUserInfoEmail = false;
            }else {
                System.out.println("此邮箱未注册!");
                System.out.println("是否跳转到注册(y/n)");
                String tz = input.next();
                if(tz.equals("y")){
                    //调用注册方法
                    insertUserInfo();

                    System.exit(0);
                }else {
                    System.out.println("请重新输入邮箱");
                }
            }

            System.out.println("请输入密码:");
            userInfoPwd = input.next();

            //根据账号查找密码，然后判断是否正确
            String userInfoPwd2 = userinfoDao.selectUserInfoPwdByUserInfoEmail(userInfoEmail);

            if (userInfoPwd2 == null){
                System.out.println("密码错误");
                judgementUserInfoEmail = true;
            }
        }

        //根据邮箱和密码查询用户id
        int userInfoId = userinfoDao.selectUserInfoIdByUserInfoEmailAndUserInfoPwd(userInfoEmail,userInfoPwd);
        //根据用户id查询库存id
        int inventoryId = inventoryDao.selectInventoryIdByUserInfoId(userInfoId);
        //根据用户id删除订单
        recordDao.deleteRecordByUserInfoId(userInfoId);
        //根据库存id删除钱包    //如果钱包有钱让他提现
        walletDao.deleteWalletByInventoryId(userInfoId);
        boolean booleanWalletBalance = walletDao.selectWalletByInventoryId(userInfoId);

        if (booleanWalletBalance){
            System.out.println("余额不为零");
            System.out.println("是否提现？");
            String liftMoney = input.nextLine().toLowerCase();

            if (liftMoney.equals("y")){
                //调用提现方法
//                walletService.updateWalletBalance();
            }else {
                System.exit(0);
            }
        }
        //根据用户id删除库存
        int rowDelete = inventoryDao.deleteInventoryByUserInfoId(userInfoId);
        //根据邮箱和密码删除用户
        userinfoDao.deleteUserInfoByUserInfoEmailAndUserInfoPwd(userInfoEmail,userInfoPwd);


        if (rowDelete>0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }

    }


}
