package cn.wantedjob.service.impl;

import cn.wantedjob.dao.UserinfoDao;
import cn.wantedjob.dao.impl.UserinfoDaoImpl;
import cn.wantedjob.entity.Userinfo;
import cn.wantedjob.entity.Userinfotype;
import cn.wantedjob.service.UserinfoService;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserinfoServiceImpl implements UserinfoService {
    Scanner input = new Scanner(System.in);
    UserinfoDao userinfoDao = new UserinfoDaoImpl();

    //查询用户类型
    @Override
    public void selectUserInfoType() {

        List<Userinfotype> userinfotypeList = userinfoDao.selectUserinfoType();
        Map<Integer, String> userinfoTypeMap = new HashMap<>();

        //将list存入map
        for (Userinfotype userinfotype : userinfotypeList) {
            userinfoTypeMap.put(userinfotype.getUserInfoTypeId(),userinfotype.getUserInfoName());
        }

        //遍历map
        for (Map.Entry<Integer, String> entry : userinfoTypeMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "," + value);
        }

    }

    //添加用户信息
    @Override
    public void insertUserInfo(Userinfo userinfo) {
        int rowUserinfo = userinfoDao.insertUserinfo(userinfo);

        if(rowUserinfo>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

    }

    //根据账号查询有没有这个账号
    @Override
    public void selectUserinfoByUserinfoName(String userinfoName) {
        if (!userinfoDao.selectUserinfoByUserInfoName(userinfoName)) {
            System.out.println("未查找到此账号");
        }
    }

    //根据账号和密码查询是否正确
    @Override
    public void selectUserinfoByUserInfoNameAndUserInfoPwd(String userinfoName, String userinfoPwd) {
        if (!userinfoDao.selectUserinfoByUserInfoNameAndUserInfoPwd(userinfoName,userinfoPwd)) {
            System.out.println("密码错误");
        }else {
            System.out.println("登录成功!");
        }
    }


}
