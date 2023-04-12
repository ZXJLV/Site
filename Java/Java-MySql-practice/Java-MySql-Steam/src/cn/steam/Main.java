package cn.steam;

import cn.steam.service.InventoryService;
import cn.steam.service.UserInfoService;
import cn.steam.service.WalletService;
import cn.steam.service.impl.InventoryServiceImpl;
import cn.steam.service.impl.UserInfoServiceImpl;
import cn.steam.service.impl.WalletServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserInfoService userInfoService = new UserInfoServiceImpl();
        InventoryService inventoryService = new InventoryServiceImpl();
        WalletService walletService = new WalletServiceImpl();

        //注册
        //userInfoService.insertUserInfo();

        //登录
        //userInfoService.selectUserInfoByUserInfoEmailAndUserInfoPwd();

        //查看库存
        //inventoryService.selectInventory();

        //注销
        //userInfoService.deleteUserInfoAndInventory();

        //提现
        //walletService.updateWalletBalance();


    }
}