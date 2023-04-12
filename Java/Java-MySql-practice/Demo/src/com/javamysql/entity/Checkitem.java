package com.javamysql.entity;

public class Checkitem {

  private int checkItemID;
  private String checkItemName;
  private double checkItemCost;
  private String depName ;

  public Checkitem(int checkItemID, String checkItemName, double checkItemCost, String depName) {
    this.checkItemID = checkItemID;
    this.checkItemName = checkItemName;
    this.checkItemCost = checkItemCost;
  }

  public Checkitem(int checkItemID, String checkItemName, double checkItemCost) {
    this.checkItemID = checkItemID;
    this.checkItemName = checkItemName;
    this.checkItemCost = checkItemCost;
  }

  public Checkitem() {
  }

  public long getCheckItemID() {
    return checkItemID;
  }

  public void setCheckItemID(int checkItemID) {
    this.checkItemID = checkItemID;
  }

  public String getCheckItemName() {
    return checkItemName;
  }

  public void setCheckItemName(String checkItemName) {
    this.checkItemName = checkItemName;
  }

  public double getCheckItemCost() {
    return checkItemCost;
  }

  public void setCheckItemCost(double checkItemCost) {
    this.checkItemCost = checkItemCost;
  }

  @Override
  public String toString() {
    return "检查项目:{" +
            "检查项目ID：" + checkItemID +
            ", 检查项目名称：'" + checkItemName + '\'' +
            ", 检查项目金额：" + checkItemCost +
            '}';
  }

}
