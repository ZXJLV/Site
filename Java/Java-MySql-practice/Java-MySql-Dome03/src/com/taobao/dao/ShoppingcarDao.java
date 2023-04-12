package com.taobao.dao;

import com.taobao.entity.Shoppingcar;

import java.util.List;

public interface ShoppingcarDao {

    //查看购物车
    List<Shoppingcar> selectShoppingcarList(int userinfoId);
}
