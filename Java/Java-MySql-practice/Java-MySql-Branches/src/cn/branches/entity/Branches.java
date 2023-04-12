package cn.branches.entity;


public class Branches {

  private int id;
  private String businessNo;
  private String name;
  private String cityArea;
  private String address;
  private String telephone;
  private String summary;

  @Override
  public String toString() {
    return "网点{" +
            "网点id=" + id +
            ", 营业执照号='" + businessNo + '\'' +
            ", 网点名称='" + name + '\'' +
            ", 所在城区='" + cityArea + '\'' +
            ", 网点地址='" + address + '\'' +
            ", 联系电话='" + telephone + '\'' +
            ", 网点简介='" + summary + '\'' +
            '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getBusinessNo() {
    return businessNo;
  }

  public void setBusinessNo(String businessNo) {
    this.businessNo = businessNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCityArea() {
    return cityArea;
  }

  public void setCityArea(String cityArea) {
    this.cityArea = cityArea;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public Branches() {
  }

  public Branches(int id, String businessNo, String name, String cityArea, String address, String telephone, String summary) {
    this.id = id;
    this.businessNo = businessNo;
    this.name = name;
    this.cityArea = cityArea;
    this.address = address;
    this.telephone = telephone;
    this.summary = summary;
  }
}
