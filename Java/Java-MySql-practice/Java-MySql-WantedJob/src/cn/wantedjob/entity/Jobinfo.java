package cn.wantedjob.entity;

import cn.wantedjob.dao.JobInfoDao;
import cn.wantedjob.dao.impl.JobInfoDaoImpl;

import java.util.List;

public class Jobinfo {

  private int jobInfoId;
  private String jobTypeName;
  private int jobId;
  private String jobInfoTitle;
  private double jobInfoMinSalary;
  private double jobInfoMaxSalary;
  private int provinceId;
  private int experieceMinYear;
  private int experieceMaxYear;
  private int educationMinId;
  private int comanyId;
  private String jobName;
  private String educationName;
  private String companyName;
  private int regionId;
  private String provinceName;
  private String cityName;
  private String areaName;

  public Jobinfo(String jobTypeName, String jobName, String jobInfoTitle, double jobInfoMinSalary, double jobInfoMaxSalary,
                 int experieceMinYear, int experieceMaxYear, String educationName, String companyName, int regionId,
                 String provinceName, String cityName, String areaName) {
    this.jobTypeName = jobTypeName;
    this.jobName = jobName;
    this.jobInfoTitle = jobInfoTitle;
    this.jobInfoMinSalary = jobInfoMinSalary;
    this.jobInfoMaxSalary = jobInfoMaxSalary;
    this.experieceMinYear = experieceMinYear;
    this.experieceMaxYear = experieceMaxYear;
    this.educationName = educationName;
    this.companyName = companyName;
    this.regionId = regionId;
    this.provinceName = provinceName;
    this.cityName = cityName;
    this.areaName = areaName;
  }

  @Override
  public String toString() {
    JobInfoDao jobInfoDao = new JobInfoDaoImpl();
    List<Jobinfo> jobinfoList = jobInfoDao.selectJobinfoByjobTypeName(jobTypeName);
    StringBuilder sb = new StringBuilder();
    for (Jobinfo jobinfo : jobinfoList) {
      sb.append("职业类型名称: ").append(jobinfo.getJobTypeName()).append("\t");
      sb.append("职业名称: ").append(jobinfo.getJobName()).append("\t");
      sb.append("职业信息标题: ").append(jobinfo.getJobInfoTitle()).append("\t");
      sb.append("最低薪资: ").append(jobinfo.getJobInfoMinSalary()).append("\t");
      sb.append("最高薪资: ").append(jobinfo.getJobInfoMaxSalary()).append("\t");
      sb.append("工作经验最低年限: ").append(jobinfo.getExperieceMinYear()).append("\t");
      sb.append("工作经验最高年限: ").append(jobinfo.getExperieceMaxYear()).append("\t");
      sb.append("最低学历: ").append(jobinfo.getEducationName()).append("\t");
      sb.append("公司名称: ").append(jobinfo.getCompanyName()).append("\t");
      sb.append("地区ID: ").append(jobinfo.getRegionId()).append("\t");
      sb.append("地区名称: ").append(jobinfo.getProvinceName()).append("\t");
      sb.append(jobinfo.getCityName()).append("\t");
      sb.append(jobinfo.getAreaName()).append("\n");
    }
    return sb.toString();
  }

  public int getJobInfoId() {
    return jobInfoId;
  }

  public void setJobInfoId(int jobInfoId) {
    this.jobInfoId = jobInfoId;
  }

  public String getJobTypeName() {
    return jobTypeName;
  }

  public void setJobTypeName(String jobTypeName) {
    this.jobTypeName = jobTypeName;
  }

  public int getJobId() {
    return jobId;
  }

  public void setJobId(int jobId) {
    this.jobId = jobId;
  }

  public String getJobInfoTitle() {
    return jobInfoTitle;
  }

  public void setJobInfoTitle(String jobInfoTitle) {
    this.jobInfoTitle = jobInfoTitle;
  }

  public double getJobInfoMinSalary() {
    return jobInfoMinSalary;
  }

  public void setJobInfoMinSalary(double jobInfoMinSalary) {
    this.jobInfoMinSalary = jobInfoMinSalary;
  }

  public double getJobInfoMaxSalary() {
    return jobInfoMaxSalary;
  }

  public void setJobInfoMaxSalary(double jobInfoMaxSalary) {
    this.jobInfoMaxSalary = jobInfoMaxSalary;
  }

  public int getProvinceId() {
    return provinceId;
  }

  public void setProvinceId(int provinceId) {
    this.provinceId = provinceId;
  }

  public int getExperieceMinYear() {
    return experieceMinYear;
  }

  public void setExperieceMinYear(int experieceMinYear) {
    this.experieceMinYear = experieceMinYear;
  }

  public int getExperieceMaxYear() {
    return experieceMaxYear;
  }

  public void setExperieceMaxYear(int experieceMaxYear) {
    this.experieceMaxYear = experieceMaxYear;
  }

  public int getEducationMinId() {
    return educationMinId;
  }

  public void setEducationMinId(int educationMinId) {
    this.educationMinId = educationMinId;
  }

  public int getComanyId() {
    return comanyId;
  }

  public void setComanyId(int comanyId) {
    this.comanyId = comanyId;
  }

  public String getJobName() {
    return jobName;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }

  public String getEducationName() {
    return educationName;
  }

  public void setEducationName(String educationName) {
    this.educationName = educationName;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public int getRegionId() {
    return regionId;
  }

  public void setRegionId(int regionId) {
    this.regionId = regionId;
  }

  public String getProvinceName() {
    return provinceName;
  }

  public void setProvinceName(String provinceName) {
    this.provinceName = provinceName;
  }

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public String getAreaName() {
    return areaName;
  }

  public void setAreaName(String areaName) {
    this.areaName = areaName;
  }

  public Jobinfo() {
  }

  public Jobinfo(int jobInfoId, String jobTypeName, int jobId, String jobInfoTitle, double jobInfoMinSalary, double jobInfoMaxSalary, int provinceId, int experieceMinYear, int experieceMaxYear, int educationMinId, int comanyId, String jobName, String educationName, String companyName, int regionId, String provinceName, String cityName, String areaName) {
    this.jobInfoId = jobInfoId;
    this.jobTypeName = jobTypeName;
    this.jobId = jobId;
    this.jobInfoTitle = jobInfoTitle;
    this.jobInfoMinSalary = jobInfoMinSalary;
    this.jobInfoMaxSalary = jobInfoMaxSalary;
    this.provinceId = provinceId;
    this.experieceMinYear = experieceMinYear;
    this.experieceMaxYear = experieceMaxYear;
    this.educationMinId = educationMinId;
    this.comanyId = comanyId;
    this.jobName = jobName;
    this.educationName = educationName;
    this.companyName = companyName;
    this.regionId = regionId;
    this.provinceName = provinceName;
    this.cityName = cityName;
    this.areaName = areaName;
  }
}
