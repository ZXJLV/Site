package cn.steam.service;

public interface UserInfoService {

    //注册
    void insertUserInfo();

    //登录
    void selectUserInfoByUserInfoEmailAndUserInfoPwd();

    //注销
    void deleteUserInfoAndInventory();

}
