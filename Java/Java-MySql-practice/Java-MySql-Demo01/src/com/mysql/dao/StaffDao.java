package com.mysql.dao;

import com.mysql.entity.Staff;

import java.util.ArrayList;

public interface StaffDao {

    //查staff表所有信息
    public ArrayList<Staff> selectStaff() throws Exception;
}
