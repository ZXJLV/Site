package cn.demo02.entity;

public class Patient {

  private int patientId;
  private int doctorId;
  private String patientName;
  private String patientState;
  private String registrationTime;
  private String diagnosticTime;
  private String doctorName;



  public Patient(int patientId, String patientName,String doctorName,String patientState, String registrationTime ) {
    this.patientId = patientId;
    this.patientName = patientName;
    this.doctorName = doctorName;
    this.patientState = patientState;
    this.registrationTime = registrationTime;
  }

  public Patient(int patientId, int doctorId, String patientName, String patientState, String registrationTime, String diagnosticTime) {
    this.patientId = patientId;
    this.doctorId = doctorId;
    this.patientName = patientName;
    this.patientState = patientState;
    this.registrationTime = registrationTime;
    this.diagnosticTime = diagnosticTime;
  }

  public Patient() {
  }

  @Override
  public String toString() {
    return "挂号信息：{" +
            "患者Id:" + patientId +
            ", 患者姓名：" + patientName +
            ", 医生姓名：'" + doctorName + '\'' +
            ", 就诊状态：'" + patientState + '\'' +
            ", 挂号时间：'" + registrationTime + '\'' +
            '}';
  }

  public int getPatientId() {
    return patientId;
  }

  public void setPatientId(int patientId) {
    this.patientId = patientId;
  }

  public int getDoctorId() {
    return doctorId;
  }

  public void setDoctorId(int doctorId) {
    this.doctorId = doctorId;
  }

  public String getPatientName() {
    return patientName;
  }

  public void setPatientName(String patientName) {
    this.patientName = patientName;
  }

  public String getPatientState() {
    return patientState;
  }

  public void setPatientState(String patientState) {
    this.patientState = patientState;
  }

  public String getRegistrationTime() {
    return registrationTime;
  }

  public void setRegistrationTime(String registrationTime) {
    this.registrationTime = registrationTime;
  }

  public String getDiagnosticTime() {
    return diagnosticTime;
  }

  public void setDiagnosticTime(String diagnosticTime) {
    this.diagnosticTime = diagnosticTime;
  }
}
