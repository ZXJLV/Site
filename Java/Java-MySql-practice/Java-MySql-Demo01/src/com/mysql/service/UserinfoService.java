package com.mysql.service;

public interface UserinfoService {

    //开卡
    public void insertUserinfo() throws Exception;

    //删除用户信息
    public void deleteUserinfo() throws Exception;

    //根据姓名和手机号后四位更改用户姓名
    public void updateUserInfoNameByUserNameAndUserPhone() throws Exception;

    //查看所有用户把staffId，calorieId替换为staffName，calorieType
    public void selectUserInfoUpdateStaffNameAndCalorieType() throws Exception;

}
