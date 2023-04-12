package com.javamysql.dao.impl;

import com.javamysql.dao.BaseDao;
import com.javamysql.dao.PrescriptionDao;

public class PrescriptionDaoImpl extends BaseDao implements PrescriptionDao {

    //根据checkitemID删除prescription表内的信息
    @Override
    public int deletePrescriptionByCheckitemID(int checkitemID) throws Exception {

        String sql = "delete from prescription where checkitemID = ?";
        Object[] objects = {checkitemID};
        System.err.println("sql:"+sql);
        return updateBuffer(sql, objects);
    }
}
