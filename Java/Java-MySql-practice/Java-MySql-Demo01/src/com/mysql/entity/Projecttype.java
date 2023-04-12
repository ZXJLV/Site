package com.mysql.entity;

public class Projecttype {

  private int projectTypeId;
  private String projectTypeName;
  private double projectTypePrice;
  private int staffTypeId;

  public Projecttype(int projectTypeId, String projectTypeName, double projectTypePrice, int staffTypeId) {
    this.projectTypeId = projectTypeId;
    this.projectTypeName = projectTypeName;
    this.projectTypePrice = projectTypePrice;
    this.staffTypeId = staffTypeId;
  }

  public Projecttype() {
  }

  @Override
  public String toString() {
    return "Projecttype{" +
            "projectTypeId=" + projectTypeId +
            ", projectTypeName='" + projectTypeName + '\'' +
            ", projectTypePrice=" + projectTypePrice +
            ", staffTypeId=" + staffTypeId +
            '}';
  }

  public int getProjectTypeId() {
    return projectTypeId;
  }

  public void setProjectTypeId(int projectTypeId) {
    this.projectTypeId = projectTypeId;
  }

  public String getProjectTypeName() {
    return projectTypeName;
  }

  public void setProjectTypeName(String projectTypeName) {
    this.projectTypeName = projectTypeName;
  }

  public double getProjectTypePrice() {
    return projectTypePrice;
  }

  public void setProjectTypePrice(double projectTypePrice) {
    this.projectTypePrice = projectTypePrice;
  }

  public int getStaffTypeId() {
    return staffTypeId;
  }

  public void setStaffTypeId(int staffTypeId) {
    this.staffTypeId = staffTypeId;
  }
}
