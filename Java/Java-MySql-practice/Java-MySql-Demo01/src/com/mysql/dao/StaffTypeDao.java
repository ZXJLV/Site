package com.mysql.dao;

public interface StaffTypeDao {

    //根据员工类型名称查询员工类型id
    public int selectStaffIdByStaffName(String StaffName) throws Exception;

}
