package cn.steam.dao;

import cn.steam.entity.Inventory;

import java.util.List;

public interface InventoryDao {

    //根据用户姓名查看库存
    List<Inventory> selectInventoryByUserInfoNickName(String userInfoNickName);

    //根据用户id删除库存
    int deleteInventoryByUserInfoId(int userInfoId);

    //根据用户id查询库存id
    int selectInventoryIdByUserInfoId(int userInfoId);


}
