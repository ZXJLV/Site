package com.javamysql.dao;

public interface PrescriptionDao {

    //根据checkitemID删除prescription表内的信息
    public int deletePrescriptionByCheckitemID(int checkitemID) throws Exception;

}
