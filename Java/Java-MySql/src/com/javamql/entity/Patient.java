package com.javamql.entity;

public class Patient {

  private int patientID;
  private String password;
  private String birthDate;
  private String gender;
  private String patientName;
  private String phoneNum;
  private String email;
  private String identityNum;
  private String address;

  public Patient(int patientID, String password, String birthDate, String gender, String patientName, String phoneNum, String email, String identityNum, String address) {
    this.patientID = patientID;
    this.password = password;
    this.birthDate = birthDate;
    this.gender = gender;
    this.patientName = patientName;
    this.phoneNum = phoneNum;
    this.email = email;
    this.identityNum = identityNum;
    this.address = address;
  }

  public Patient() {
  }

  public int getpatientID() {
    return patientID;
  }

  public void setPatientId(int patientID) {
    this.patientID = patientID;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getPatientName() {
    return patientName;
  }

  public void setPatientName(String patientName) {
    this.patientName = patientName;
  }

  public String getPhoneNum() {
    return phoneNum;
  }

  public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getIdentityNum() {
    return identityNum;
  }

  public void setIdentityNum(String identityNum) {
    this.identityNum = identityNum;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Patient{" +
            "patientId=" + patientID +
            ", password='" + password + '\'' +
            ", birthDate='" + birthDate + '\'' +
            ", gender='" + gender + '\'' +
            ", patientName='" + patientName + '\'' +
            ", phoneNum='" + phoneNum + '\'' +
            ", email='" + email + '\'' +
            ", identityNum='" + identityNum + '\'' +
            ", address='" + address + '\'' +
            '}';
  }

}


