package com.mysql.dao;

import com.mysql.entity.Userinfo;

import java.util.ArrayList;

public interface UserinfoDao {

    //添加用户信息
    public int insertUserInfo(Userinfo userinfo) throws Exception;

    //删除用户信息
    public int deleteUserInfo(int userInfoId) throws Exception;

    //查看用户所有信息
    public ArrayList<Userinfo> selectUserInfo() throws Exception;

    //根据用户姓名和手机号后四位查用户id
    public int selectUserInfoId(String userInfoName,String phone) throws Exception;

    //根据姓名和手机号后四位更改用户姓名
    public int updateUserInfoNameByUserNameAndUserPhone(String userInfoName,String phone,String newUserInfoName) throws Exception;

    //查看所有用户把staffId，calorieId替换为staffName，calorieType
    public void selectUserInfoUpdateStaffNameAndCalorieType(String userInfoName,String phone) throws Exception;

}
