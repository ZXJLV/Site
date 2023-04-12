package com.javamysql.Service;

import com.javamysql.entity.Checkitem;

public interface CheckitemService {

    //添加检查项目
    public void insertCheckitem() throws Exception;

    //删除检查项目
    public void deleteCheckitem() throws Exception;

    //更改检查项目名称和价格
    public void updateCheckItemNameAndCheckItemCost() throws Exception;
}
