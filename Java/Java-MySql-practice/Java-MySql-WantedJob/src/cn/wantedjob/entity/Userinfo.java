package cn.wantedjob.entity;

public class Userinfo {

  private int userInfoId;
  private String userInfoLoginName;
  private String userInfoName;
  private String userInfoPwd;
  private int userInfoTypeId;
  private String userInfoTypeName;
  private Integer userInfoCompanyId;
  private String userInfoCompanyName;
  private String userInfoPhone;
  private int collectId;

  @Override
  public String toString() {
    return "Userinfo{" +
            "userInfoId=" + userInfoId +
            ", userInfoLoginName='" + userInfoLoginName + '\'' +
            ", userInfoName='" + userInfoName + '\'' +
            ", userInfoPwd='" + userInfoPwd + '\'' +
            ", userInfoTypeId=" + userInfoTypeId +
            ", userInfoTypeName='" + userInfoTypeName + '\'' +
            ", userInfoCompanyId=" + userInfoCompanyId +
            ", userInfoCompanyName='" + userInfoCompanyName + '\'' +
            ", userInfoPhone='" + userInfoPhone + '\'' +
            ", collectId=" + collectId +
            '}';
  }

  public int getUserInfoId() {
    return userInfoId;
  }

  public void setUserInfoId(int userInfoId) {
    this.userInfoId = userInfoId;
  }

  public String getUserInfoLoginName() {
    return userInfoLoginName;
  }

  public void setUserInfoLoginName(String userInfoLoginName) {
    this.userInfoLoginName = userInfoLoginName;
  }

  public String getUserInfoName() {
    return userInfoName;
  }

  public void setUserInfoName(String userInfoName) {
    this.userInfoName = userInfoName;
  }

  public String getUserInfoPwd() {
    return userInfoPwd;
  }

  public void setUserInfoPwd(String userInfoPwd) {
    this.userInfoPwd = userInfoPwd;
  }

  public int getUserInfoTypeId() {
    return userInfoTypeId;
  }

  public void setUserInfoTypeId(int userInfoTypeId) {
    this.userInfoTypeId = userInfoTypeId;
  }

  public String getUserInfoTypeName() {
    return userInfoTypeName;
  }

  public void setUserInfoTypeName(String userInfoTypeName) {
    this.userInfoTypeName = userInfoTypeName;
  }

  public Integer getUserInfoCompanyId() {
    return userInfoCompanyId;
  }

  public void setUserInfoCompanyId(Integer userInfoCompanyId) {
    this.userInfoCompanyId = userInfoCompanyId;
  }

  public String getUserInfoCompanyName() {
    return userInfoCompanyName;
  }

  public void setUserInfoCompanyName(String userInfoCompanyName) {
    this.userInfoCompanyName = userInfoCompanyName;
  }

  public String getUserInfoPhone() {
    return userInfoPhone;
  }

  public void setUserInfoPhone(String userInfoPhone) {
    this.userInfoPhone = userInfoPhone;
  }

  public int getCollectId() {
    return collectId;
  }

  public void setCollectId(int collectId) {
    this.collectId = collectId;
  }

  public Userinfo() {
  }

  public Userinfo(int userInfoId, String userInfoLoginName, String userInfoName, String userInfoPwd, int userInfoTypeId, String userInfoTypeName, int userInfoCompanyId, String userInfoCompanyName, String userInfoPhone, int collectId) {
    this.userInfoId = userInfoId;
    this.userInfoLoginName = userInfoLoginName;
    this.userInfoName = userInfoName;
    this.userInfoPwd = userInfoPwd;
    this.userInfoTypeId = userInfoTypeId;
    this.userInfoTypeName = userInfoTypeName;
    this.userInfoCompanyId = userInfoCompanyId;
    this.userInfoCompanyName = userInfoCompanyName;
    this.userInfoPhone = userInfoPhone;
    this.collectId = collectId;
  }
}
