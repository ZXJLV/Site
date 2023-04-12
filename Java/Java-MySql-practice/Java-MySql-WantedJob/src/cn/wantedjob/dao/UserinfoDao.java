package cn.wantedjob.dao;

import cn.wantedjob.entity.Jobinfo;
import cn.wantedjob.entity.Userinfo;
import cn.wantedjob.entity.Userinfotype;

import java.util.List;

public interface UserinfoDao {

    //查询用户类型
    List<Userinfotype> selectUserinfoType();

    //添加用户信息
    int insertUserinfo(Userinfo userinfo);

    //根据账号查询有没有这个账号
    boolean selectUserinfoByUserInfoName(String userInfoName);

    //根据账号和密码查询是否正确
    boolean selectUserinfoByUserInfoNameAndUserInfoPwd(String userInfoName, String userInfoPwd);


}
