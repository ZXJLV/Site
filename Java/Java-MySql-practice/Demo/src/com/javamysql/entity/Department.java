package com.javamysql.entity;


public class Department {

  private int depID;
  private String depName;

  public Department(int depID, String depName) {
    this.depID = depID;
    this.depName = depName;
  }

  public Department() {
  }

  public long getDepID() {
    return depID;
  }

  public void setDepID(int depID) {
    this.depID = depID;
  }

  public String getDepName() {
    return depName;
  }

  public void setDepName(String depName) {
    this.depName = depName;
  }

  @Override
  public String toString() {
    return "科室{" +
            "科室ID：" + depID +
            ", 科室名称：'" + depName + '\'' +
            '}';
  }

}
