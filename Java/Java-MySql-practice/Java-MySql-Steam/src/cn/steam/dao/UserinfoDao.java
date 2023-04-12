package cn.steam.dao;

import cn.steam.entity.Userinfo;

import java.util.List;

public interface UserinfoDao {

    //判断是否有这个账号
    boolean selectUserInfoByUserInfoEmail(String userInfoEmail);

    //判断是否有这个昵称
    boolean selectUserInfoByUserInfoNickName(String userInfoNickName);

    //注册
    int insertUserInfo(Userinfo userinfo);

    //登录
    String selectUserInfoByUserInfoEmailAndUserInfoPwd(String userInfoEmail, String userInfoPwd);

    //根据账号查找密码
    String selectUserInfoPwdByUserInfoEmail(String userInfoEmail);

    //根据邮箱和密码查询userinfoId
    int selectUserInfoIdByUserInfoEmailAndUserInfoPwd(String userInfoEmail, String userInfoPwd);

    //根据邮箱和密码删除userinfo
    int deleteUserInfoByUserInfoEmailAndUserInfoPwd(String userInfoEmail, String userInfoPwd);

}
