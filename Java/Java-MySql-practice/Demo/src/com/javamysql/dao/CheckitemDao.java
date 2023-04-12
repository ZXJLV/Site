package com.javamysql.dao;

import com.javamysql.entity.Checkitem;

import java.util.ArrayList;

public interface CheckitemDao {

    //增加检查项目
    public int insertCheckItem(Checkitem checkItem) throws Exception;

    //查检查项目id
    public int selectCheckItemId(String checkItemName) throws Exception;

    //根据checkItemID删除checkItem表内的信息
    public int deleteCheckItemByCheckItemID(int checkItemID) throws Exception;

    //查询检查项目
    public ArrayList<Checkitem> selectCheckItem() throws Exception;

    //更改检查项目名称和金额
    public int updateCheckItemCost(int checkItemID,String checkItemName,double checkItemCost) throws Exception;

    //查询检查项目和科室名称
    public ArrayList<Checkitem> selectCheckItemAndDepName() throws Exception;


}
