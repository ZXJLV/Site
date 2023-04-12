package com.mysql.entity;


public class Stafftype {

  private int staffTypeId;
  private String staffTypeName;

  public Stafftype(int staffTypeId, String staffTypeName) {
    this.staffTypeId = staffTypeId;
    this.staffTypeName = staffTypeName;
  }

  public Stafftype() {
  }

  @Override
  public String toString() {
    return "Stafftype{" +
            "staffTypeId=" + staffTypeId +
            ", staffTypeName='" + staffTypeName + '\'' +
            '}';
  }

  public int getStaffTypeId() {
    return staffTypeId;
  }

  public void setStaffTypeId(int staffTypeId) {
    this.staffTypeId = staffTypeId;
  }

  public String getStaffTypeName() {
    return staffTypeName;
  }

  public void setStaffTypeName(String staffTypeName) {
    this.staffTypeName = staffTypeName;
  }
}
