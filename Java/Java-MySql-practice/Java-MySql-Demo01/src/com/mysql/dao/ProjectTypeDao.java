package com.mysql.dao;

public interface ProjectTypeDao {

    //根据项目类型名和员工类型id称查询项目类型id
    public int selectProjectIdByProjectName(String ProjectName,int staffTypeId) throws Exception;

    //根据项目类型名称查询项目类型金额
    public double selectProjectPriceByProjectName(String ProjectName) throws Exception;
}
