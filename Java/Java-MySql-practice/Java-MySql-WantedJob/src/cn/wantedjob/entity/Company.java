package cn.wantedjob.entity;

public class Company {

  private int companyId;
  private String companyName;
  private int companyTypeId;
  private int companyMinEmployeeNum;
  private int companyMaxEmployeeNum;
  private int collectId;

  @Override
  public String toString() {
    return "Company{" +
            "companyId=" + companyId +
            ", companyName='" + companyName + '\'' +
            ", companyTypeId=" + companyTypeId +
            ", companyMinEmployeeNum=" + companyMinEmployeeNum +
            ", companyMaxEmployeeNum=" + companyMaxEmployeeNum +
            ", collectId=" + collectId +
            '}';
  }

  public int getCompanyId() {
    return companyId;
  }

  public void setCompanyId(int companyId) {
    this.companyId = companyId;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public int getCompanyTypeId() {
    return companyTypeId;
  }

  public void setCompanyTypeId(int companyTypeId) {
    this.companyTypeId = companyTypeId;
  }

  public int getCompanyMinEmployeeNum() {
    return companyMinEmployeeNum;
  }

  public void setCompanyMinEmployeeNum(int companyMinEmployeeNum) {
    this.companyMinEmployeeNum = companyMinEmployeeNum;
  }

  public int getCompanyMaxEmployeeNum() {
    return companyMaxEmployeeNum;
  }

  public void setCompanyMaxEmployeeNum(int companyMaxEmployeeNum) {
    this.companyMaxEmployeeNum = companyMaxEmployeeNum;
  }

  public int getCollectId() {
    return collectId;
  }

  public void setCollectId(int collectId) {
    this.collectId = collectId;
  }

  public Company() {
  }

  public Company(int companyId, String companyName, int companyTypeId, int companyMinEmployeeNum, int companyMaxEmployeeNum, int collectId) {
    this.companyId = companyId;
    this.companyName = companyName;
    this.companyTypeId = companyTypeId;
    this.companyMinEmployeeNum = companyMinEmployeeNum;
    this.companyMaxEmployeeNum = companyMaxEmployeeNum;
    this.collectId = collectId;
  }
}
