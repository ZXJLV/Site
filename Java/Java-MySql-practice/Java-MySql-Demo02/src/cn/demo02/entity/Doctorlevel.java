package cn.demo02.entity;

public class Doctorlevel {

  private int doctorLevelId;
  private String doctorLevelName;

  @Override
  public String toString() {
    return "医生等级：{" +
            "等级Id：" + doctorLevelId +
            ", 等级名称：'" + doctorLevelName + '\'' +
            '}';
  }

  public int getDoctorLevelId() {
    return doctorLevelId;
  }

  public void setDoctorLevelId(int doctorLevelId) {
    this.doctorLevelId = doctorLevelId;
  }

  public String getDoctorLevelName() {
    return doctorLevelName;
  }

  public void setDoctorLevelName(String doctorLevelName) {
    this.doctorLevelName = doctorLevelName;
  }

  public Doctorlevel() {
  }

  public Doctorlevel(int doctorLevelId, String doctorLevelName) {
    this.doctorLevelId = doctorLevelId;
    this.doctorLevelName = doctorLevelName;
  }
}

