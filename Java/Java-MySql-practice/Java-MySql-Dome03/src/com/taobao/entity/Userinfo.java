package com.taobao.entity;

import java.util.List;

public class Userinfo {

  private int userinfoId;
  private String userinfoName;
  private String userinfoNickName;
  private String userinfoPassword;
  private String userinfoPhone;
  private String userinfoSex;
  private String userinfoAddress;
  private List<Shoppingcar> shoppingcarList;

  public List<Shoppingcar> getShoppingcarList() {
    return shoppingcarList;
  }

  public void setShoppingcarList(List<Shoppingcar> shoppingcarList) {
    this.shoppingcarList = shoppingcarList;
  }

  @Override
  public String toString() {
    return "Userinfo{" +
            "userinfoId=" + userinfoId +
            ", userinfoName='" + userinfoName + '\'' +
            ", userinfoNickName='" + userinfoNickName + '\'' +
            ", userinfoPassword='" + userinfoPassword + '\'' +
            ", userinfoPhone='" + userinfoPhone + '\'' +
            ", userinfoSex='" + userinfoSex + '\'' +
            ", userinfoAddress='" + userinfoAddress + '\'' +
            '}';
  }

  public int getUserinfoId() {
    return userinfoId;
  }

  public void setUserinfoId(int userinfoId) {
    this.userinfoId = userinfoId;
  }

  public String getUserinfoName() {
    return userinfoName;
  }

  public void setUserinfoName(String userinfoName) {
    this.userinfoName = userinfoName;
  }

  public String getUserinfoNickName() {
    return userinfoNickName;
  }

  public void setUserinfoNickName(String userinfoNickName) {
    this.userinfoNickName = userinfoNickName;
  }

  public String getUserinfoPassword() {
    return userinfoPassword;
  }

  public void setUserinfoPassword(String userinfoPassword) {
    this.userinfoPassword = userinfoPassword;
  }

  public String getUserinfoPhone() {
    return userinfoPhone;
  }

  public void setUserinfoPhone(String userinfoPhone) {
    this.userinfoPhone = userinfoPhone;
  }

  public String getUserinfoSex() {
    return userinfoSex;
  }

  public void setUserinfoSex(String userinfoSex) {
    this.userinfoSex = userinfoSex;
  }

  public String getUserinfoAddress() {
    return userinfoAddress;
  }

  public void setUserinfoAddress(String userinfoAddress) {
    this.userinfoAddress = userinfoAddress;
  }

  public Userinfo() {
  }

  public Userinfo(int userinfoId, String userinfoName, String userinfoNickName, String userinfoPassword, String userinfoPhone, String userinfoSex, String userinfoAddress) {
    this.userinfoId = userinfoId;
    this.userinfoName = userinfoName;
    this.userinfoNickName = userinfoNickName;
    this.userinfoPassword = userinfoPassword;
    this.userinfoPhone = userinfoPhone;
    this.userinfoSex = userinfoSex;
    this.userinfoAddress = userinfoAddress;
  }
}
