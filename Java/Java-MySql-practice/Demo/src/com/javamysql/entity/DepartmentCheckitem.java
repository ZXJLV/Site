package com.javamysql.entity;


public class DepartmentCheckitem {

  private int id;
  private int depID;
  private int checkItemID;

  public DepartmentCheckitem(int id, int depID, int checkItemID) {
    this.id = id;
    this.depID = depID;
    this.checkItemID = checkItemID;
  }

  public DepartmentCheckitem() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getDepID() {
    return depID;
  }

  public void setDepID(int depID) {
    this.depID = depID;
  }

  public int getCheckItemID() {
    return checkItemID;
  }

  public void setCheckItemID(int checkItemID) {
    this.checkItemID = checkItemID;
  }

  @Override
  public String toString() {
    return "DepartmentCheckitem{" +
            "id=" + id +
            ", depID=" + depID +
            ", checkItemID=" + checkItemID +
            '}';
  }

}
