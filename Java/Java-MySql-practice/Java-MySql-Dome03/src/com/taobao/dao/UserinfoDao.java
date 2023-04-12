package com.taobao.dao;

import com.taobao.entity.Userinfo;

public interface UserinfoDao {

    //登录
    Userinfo selectUserinfoByUserNickNameAndUserPassword(Userinfo userinfo);

}
