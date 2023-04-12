package cn.wantedjob.service;

import cn.wantedjob.entity.Userinfo;

public interface UserinfoService {

    //查询用户类型
    void selectUserInfoType();

    //添加用户信息
    void insertUserInfo(Userinfo userinfo);

    //根据账号查询有没有这个账号
    void selectUserinfoByUserinfoName(String userinfoName);

    //根据账号和密码查询是否正确
    void selectUserinfoByUserInfoNameAndUserInfoPwd(String userinfoName, String userinfoPwd);

}
