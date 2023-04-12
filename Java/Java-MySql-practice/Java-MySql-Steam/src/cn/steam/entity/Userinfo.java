package cn.steam.entity;


public class Userinfo {

  private int userInfoId;
  private String userInfoNickName;
  private String userInfoEmail;
  private String userInfoPwd;
  private String userInfoCountry;

  public Userinfo(String userInfoNickName) {
    this.userInfoNickName = userInfoNickName;
  }

  @Override
  public String toString() {
    return "Userinfo{" +
            "userInfoId=" + userInfoId +
            ", userInfoNickName='" + userInfoNickName + '\'' +
            ", userInfoEmail='" + userInfoEmail + '\'' +
            ", userInfoPwd='" + userInfoPwd + '\'' +
            ", userInfoCountry='" + userInfoCountry + '\'' +
            '}';
  }

  public int getUserInfoId() {
    return userInfoId;
  }

  public void setUserInfoId(int userInfoId) {
    this.userInfoId = userInfoId;
  }

  public String getUserInfoNickName() {
    return userInfoNickName;
  }

  public void setUserInfoNickName(String userInfoNickName) {
    this.userInfoNickName = userInfoNickName;
  }

  public String getUserInfoEmail() {
    return userInfoEmail;
  }

  public void setUserInfoEmail(String userInfoEmail) {
    this.userInfoEmail = userInfoEmail;
  }

  public String getUserInfoPwd() {
    return userInfoPwd;
  }

  public void setUserInfoPwd(String userInfoPwd) {
    this.userInfoPwd = userInfoPwd;
  }

  public String getUserInfoCountry() {
    return userInfoCountry;
  }

  public void setUserInfoCountry(String userInfoCountry) {
    this.userInfoCountry = userInfoCountry;
  }

  public Userinfo() {
  }

  public Userinfo(int userInfoId, String userInfoNickName, String userInfoEmail, String userInfoPwd, String userInfoCountry) {
    this.userInfoId = userInfoId;
    this.userInfoNickName = userInfoNickName;
    this.userInfoEmail = userInfoEmail;
    this.userInfoPwd = userInfoPwd;
    this.userInfoCountry = userInfoCountry;
  }
}
