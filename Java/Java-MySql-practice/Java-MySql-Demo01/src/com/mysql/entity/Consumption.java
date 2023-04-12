package com.mysql.entity;

public class Consumption {

  private int consumptionId;
  private int userInfoId;
  private String userInfoName;
  private int staffTypeId;
  private String staffTypeName;
  private int projectTypeId;
  private String projectTypeName;
  private double projectTypePrice;
  private double consumptionActual;
  private String recordTime;

  @Override
  public String toString() {
    return "消费记录：{" +
            "消费记录Id：" + consumptionId +
            ", 用户姓名：'" + userInfoName + '\'' +
            ", 员工类型名称：'" + staffTypeName + '\'' +
            ", 项目类型名称：'" + projectTypeName + '\'' +
            ", 消费金额：" + projectTypePrice +
            ", 实际消费金额：" + consumptionActual +
            ", 消费时间：'" + recordTime + '\'' +
            '}';
  }

  public Consumption(int consumptionId, String userInfoName, String staffTypeName, String projectTypeName, double projectTypePrice, double consumptionActual, String recordTime) {
    this.consumptionId = consumptionId;
    this.userInfoName = userInfoName;
    this.staffTypeName = staffTypeName;
    this.projectTypeName = projectTypeName;
    this.projectTypePrice = projectTypePrice;
    this.consumptionActual = consumptionActual;
    this.recordTime = recordTime;
  }

  public Consumption() {
  }

  public Consumption(int consumptionId, int userInfoId, int staffTypeId, int projectTypeId, String projectTypeName, double projectTypePrice, double consumptionActual, String recordTime) {
    this.consumptionId = consumptionId;
    this.userInfoId = userInfoId;
    this.staffTypeId = staffTypeId;
    this.projectTypeId = projectTypeId;
    this.projectTypeName = projectTypeName;
    this.projectTypePrice = projectTypePrice;
    this.consumptionActual = consumptionActual;
    this.recordTime = recordTime;
  }

  public int getConsumptionId() {
    return consumptionId;
  }

  public void setConsumptionId(int consumptionId) {
    this.consumptionId = consumptionId;
  }


  public int getUserInfoId() {
    return userInfoId;
  }

  public void setUserInfoId(int userInfoId) {
    this.userInfoId = userInfoId;
  }


  public int getStaffTypeId() {
    return staffTypeId;
  }

  public void setStaffTypeId(int staffTypeId) {
    this.staffTypeId = staffTypeId;
  }


  public int getProjectTypeId() {
    return projectTypeId;
  }

  public void setProjectTypeId(int projectTypeId) {
    this.projectTypeId = projectTypeId;
  }


  public double getProjectTypePrice() {
    return projectTypePrice;
  }

  public void setProjectTypePrice(double projectTypePrice) {
    this.projectTypePrice = projectTypePrice;
  }


  public double getConsumptionActual() {
    return consumptionActual;
  }

  public void setConsumptionActual(double consumptionActual) {
    this.consumptionActual = consumptionActual;
  }


  public String getRecordTime() {
    return recordTime;
  }

  public void setRecordTime(String recordTime) {
    this.recordTime = recordTime;
  }

}
