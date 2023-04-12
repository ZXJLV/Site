package com.taobao.service.impl;

import com.taobao.dao.ShoppingcarDao;
import com.taobao.dao.UserinfoDao;
import com.taobao.dao.impl.ShoppingcarDaoImpl;
import com.taobao.dao.impl.UserinfoDaoImpl;
import com.taobao.entity.Shoppingcar;
import com.taobao.entity.Userinfo;
import com.taobao.service.UserinfoService;
import java.util.List;
import java.util.Scanner;

public class UserinfoServiceImpl implements UserinfoService {
    Scanner input = new Scanner(System.in);
    UserinfoDao userinfoDao = new UserinfoDaoImpl();
    ShoppingcarDao shoppingcarDao = new ShoppingcarDaoImpl();

    @Override
    public List<Shoppingcar> selectUserinfoAndShoppingcar() {

        System.out.println("请输入用户名：");
        String userinfoNickName = input.next();
        System.out.println("请输入密码：");
        String userinfoPassword = input.next();

        //登录，并获得返回值对象
        Userinfo userinfo1 =  userinfoDao.selectUserinfoByUserNickNameAndUserPassword(
                new Userinfo(-1, null, userinfoNickName, userinfoPassword, null, null, null)
        );
        //查看购物车，根据登录时获取的用户id，将查询结果放在集合里
        List<Shoppingcar> shoppingcarList = shoppingcarDao.selectShoppingcarList(userinfo1.getUserinfoId());

        userinfo1.setShoppingcarList(shoppingcarList);

        return shoppingcarList;
    }
}
