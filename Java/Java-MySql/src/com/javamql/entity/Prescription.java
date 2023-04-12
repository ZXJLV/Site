package com.javamql.entity;


import java.sql.Timestamp;

public class Prescription {

  private long examID;
  private long patientID;
  private long depID;
  private String checkResult;
  private long checkItemID;
  private java.sql.Timestamp examDate;

  public Prescription(long examID, long patientID, long depID, String checkResult, long checkItemID, Timestamp examDate) {
    this.examID = examID;
    this.patientID = patientID;
    this.depID = depID;
    this.checkResult = checkResult;
    this.checkItemID = checkItemID;
    this.examDate = examDate;
  }

  public Prescription() {
  }

  public long getExamID() {
    return examID;
  }

  public void setExamID(long examID) {
    this.examID = examID;
  }

  public long getPatientID() {
    return patientID;
  }

  public void setPatientID(long patientID) {
    this.patientID = patientID;
  }

  public long getDepID() {
    return depID;
  }

  public void setDepID(long depID) {
    this.depID = depID;
  }

  public String getCheckResult() {
    return checkResult;
  }

  public void setCheckResult(String checkResult) {
    this.checkResult = checkResult;
  }

  public long getCheckItemID() {
    return checkItemID;
  }

  public void setCheckItemID(long checkItemID) {
    this.checkItemID = checkItemID;
  }

  public Timestamp getExamDate() {
    return examDate;
  }

  public void setExamDate(Timestamp examDate) {
    this.examDate = examDate;
  }

  @Override
  public String toString() {
    return "Prescription{" +
            "examID=" + examID +
            ", patientID=" + patientID +
            ", depID=" + depID +
            ", checkResult='" + checkResult + '\'' +
            ", checkItemID=" + checkItemID +
            ", examDate=" + examDate +
            '}';
  }
}
