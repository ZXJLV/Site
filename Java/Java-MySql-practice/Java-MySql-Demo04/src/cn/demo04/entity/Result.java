package cn.demo04.entity;

import java.sql.Timestamp;

public class Result {

  private int studentNo;
  private int subjectNo;
  private String examDate;
  private int studentResult;
  private String studentName;
  private String subjectName;

  @Override
  public String toString() {
    return "Result{" +
            "studentNo=" + studentNo +
            ", subjectNo=" + subjectNo +
            ", examDate='" + examDate + '\'' +
            ", studentResult=" + studentResult +
            ", studentName='" + studentName + '\'' +
            ", subjectName='" + subjectName + '\'' +
            '}';
  }

  public int getStudentNo() {
    return studentNo;
  }

  public void setStudentNo(int studentNo) {
    this.studentNo = studentNo;
  }

  public int getSubjectNo() {
    return subjectNo;
  }

  public void setSubjectNo(int subjectNo) {
    this.subjectNo = subjectNo;
  }

  public String getExamDate() {
    return examDate;
  }

  public void setExamDate(String examDate) {
    this.examDate = examDate;
  }

  public int getStudentResult() {
    return studentResult;
  }

  public void setStudentResult(int studentResult) {
    this.studentResult = studentResult;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public Result() {
  }

  public Result(int studentNo,String studentName, int subjectNo,String subjectName,  String examDate, int studentResult ) {
    this.studentNo = studentNo;
    this.subjectNo = subjectNo;
    this.examDate = examDate;
    this.studentResult = studentResult;
    this.studentName = studentName;
    this.subjectName = subjectName;
  }
}
