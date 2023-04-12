package com.mysql.entity;

public class Staff {

  private int staffId;
  private String staffName;
  private int staffTypeId;
  private String staffTypeName;

  public Staff(int staffId, String staffName, int staffTypeId) {
    this.staffId = staffId;
    this.staffName = staffName;
    this.staffTypeId = staffTypeId;
  }

  public Staff(int staffId, String staffName,String staffTypeName) {
    this.staffId = staffId;
    this.staffName = staffName;
    this.staffTypeName = staffTypeName;
  }

  public Staff() {
  }

  @Override
  public String toString() {
    return "员工：{" +
            "员工Id：" + staffId +
            ", 员工姓名：'" + staffName + '\'' +
            ", 员工类型：" + staffTypeName +
            '}';
  }

  public int getStaffId() {
    return staffId;
  }

  public void setStaffId(int staffId) {
    this.staffId = staffId;
  }

  public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public int getStaffTypeId() {
    return staffTypeId;
  }

  public void setStaffTypeId(int staffTypeId) {
    this.staffTypeId = staffTypeId;
  }
}
