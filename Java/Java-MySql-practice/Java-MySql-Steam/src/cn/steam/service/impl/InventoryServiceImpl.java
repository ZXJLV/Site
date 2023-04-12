package cn.steam.service.impl;

import cn.steam.dao.InventoryDao;
import cn.steam.dao.UserinfoDao;
import cn.steam.dao.impl.InventoryDaoImpl;
import cn.steam.dao.impl.UserinfoDaoImpl;
import cn.steam.entity.Inventory;
import cn.steam.service.InventoryService;

import java.util.Scanner;

public class InventoryServiceImpl implements InventoryService {
    Scanner input = new Scanner(System.in);
    InventoryDao inventoryDao = new InventoryDaoImpl();
    UserinfoDao userinfoDao = new UserinfoDaoImpl();

    //查看库存
    @Override
    public void selectInventory() {
        boolean booleanUserInfo = true;
        String userInfoNickName = null;

        while (booleanUserInfo){
            System.out.println("请输入用户名：");
            userInfoNickName = input.next();

            booleanUserInfo = userinfoDao.selectUserInfoByUserInfoNickName(userInfoNickName);
            if (booleanUserInfo){
                System.out.println("未查找到此用户名，请重新输入");
            }
        }

        for (Inventory inventory : inventoryDao.selectInventoryByUserInfoNickName(userInfoNickName)) {
            System.out.println(inventory);
        }

    }
}
