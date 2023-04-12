package cn.wantedjob.entity;


public class Userinfotype {

  private int userInfoTypeId;
  private String userInfoName;

  @Override
  public String toString() {
    return "Userinfotype{" +
            "userInfoTypeId=" + userInfoTypeId +
            ", userInfoName='" + userInfoName + '\'' +
            '}';
  }

  public int getUserInfoTypeId() {
    return userInfoTypeId;
  }

  public void setUserInfoTypeId(int userInfoTypeId) {
    this.userInfoTypeId = userInfoTypeId;
  }

  public String getUserInfoName() {
    return userInfoName;
  }

  public void setUserInfoName(String userInfoName) {
    this.userInfoName = userInfoName;
  }

  public Userinfotype() {
  }

  public Userinfotype(int userInfoTypeId, String userInfoName) {
    this.userInfoTypeId = userInfoTypeId;
    this.userInfoName = userInfoName;
  }
}
