package cn.demo02.entity;

public class Doctor {

  private int doctorId;
  private String doctorName;
  private int technicalOfficesId;
  private int doctorHouseId;
  private int doctorLevelId;
  private int maxVisits;

  @Override
  public String toString() {
    return "Doctor{" +
            "doctorId=" + doctorId +
            ", doctorName='" + doctorName + '\'' +
            ", technicalOfficesId=" + technicalOfficesId +
            ", doctorHouseId=" + doctorHouseId +
            ", doctorLevelId=" + doctorLevelId +
            ", maxVisits=" + maxVisits +
            '}';
  }

  public int getDoctorId() {
    return doctorId;
  }

  public void setDoctorId(int doctorId) {
    this.doctorId = doctorId;
  }

  public String getDoctorName() {
    return doctorName;
  }

  public void setDoctorName(String doctorName) {
    this.doctorName = doctorName;
  }

  public int getTechnicalOfficesId() {
    return technicalOfficesId;
  }

  public void setTechnicalOfficesId(int technicalOfficesId) {
    this.technicalOfficesId = technicalOfficesId;
  }

  public int getDoctorHouseId() {
    return doctorHouseId;
  }

  public void setDoctorHouseId(int doctorHouseId) {
    this.doctorHouseId = doctorHouseId;
  }

  public int getDoctorLevelId() {
    return doctorLevelId;
  }

  public void setDoctorLevelId(int doctorLevelId) {
    this.doctorLevelId = doctorLevelId;
  }

  public int getMaxVisits() {
    return maxVisits;
  }

  public void setMaxVisits(int maxVisits) {
    this.maxVisits = maxVisits;
  }

  public Doctor() {
  }

  public Doctor(int doctorId, String doctorName, int technicalOfficesId, int doctorHouseId, int doctorLevelId, int maxVisits) {
    this.doctorId = doctorId;
    this.doctorName = doctorName;
    this.technicalOfficesId = technicalOfficesId;
    this.doctorHouseId = doctorHouseId;
    this.doctorLevelId = doctorLevelId;
    this.maxVisits = maxVisits;
  }
}
