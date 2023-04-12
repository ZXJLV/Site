package com.mysql.entity;

import java.sql.Timestamp;

public class Userinfo {

  private int userInfoId;
  private String userInfoName;
  private String phone;
  private double balance;
  private int staffId;
  private String staffName;
  private String openBlock;
  private int calorieId;
  private String calorieType;
  private double rechargeable;

  public Userinfo(int userInfoId, String userInfoName, String phone, double balance, String staffName, String openBlock, String calorieType, double rechargeable) {
    this.userInfoId = userInfoId;
    this.userInfoName = userInfoName;
    this.phone = phone;
    this.balance = balance;
    this.staffName = staffName;
    this.openBlock = openBlock;
    this.calorieType = calorieType;
    this.rechargeable = rechargeable;
  }

  public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public String getCalorieType() {
    return calorieType;
  }

  public void setCalorieType(String calorieName) {
    this.calorieType = calorieName;
  }

  public Userinfo(String userInfoName, String phone, double balance, int staffId, int calorieId, double rechargeable) {
    this.userInfoName = userInfoName;
    this.phone = phone;
    this.balance = balance;
    this.staffId = staffId;
    this.calorieId = calorieId;
    this.rechargeable = rechargeable;
  }

  public Userinfo(int userInfoId, String userInfoName, String phone, double balance, int staffId, String openBlock, int calorieId, double rechargeable) {
    this.userInfoId = userInfoId;
    this.userInfoName = userInfoName;
    this.phone = phone;
    this.balance = balance;
    this.staffId = staffId;
    this.openBlock = openBlock;
    this.calorieId = calorieId;
    this.rechargeable = rechargeable;
  }

  public Userinfo() {
  }

  @Override
  public String toString() {
    return "Userinfo{" +
            "userInfoId=" + userInfoId +
            ", userInfoName='" + userInfoName + '\'' +
            ", phone=" + phone +
            ", balance=" + balance +
            ", staffId=" + staffId +
            ", openBlock=" + openBlock +
            ", calorieId=" + calorieId +
            ", rechargeable=" + rechargeable +
            '}';
  }

  public int getUserInfoId() {
    return userInfoId;
  }

  public void setUserInfoId(int userInfoId) {
    this.userInfoId = userInfoId;
  }

  public String getUserInfoName() {
    return userInfoName;
  }

  public void setUserInfoName(String userInfoName) {
    this.userInfoName = userInfoName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public int getStaffId() {
    return staffId;
  }

  public void setStaffId(int staffId) {
    this.staffId = staffId;
  }

  public String getOpenBlock() {
    return openBlock;
  }

  public void setOpenBlock(String openBlock) {
    this.openBlock = openBlock;
  }

  public int getCalorieId() {
    return calorieId;
  }

  public void setCalorieId(int calorieId) {
    this.calorieId = calorieId;
  }

  public double getRechargeable() {
    return rechargeable;
  }

  public void setRechargeable(double rechargeable) {
    this.rechargeable = rechargeable;
  }
}
