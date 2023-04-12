package cn.lx.entity;


public class Grade {

  private int gradeId;
  private String gradeName;
  private int classHour;
  private int subjectNameNum;


  public Grade( int gradeId, String gradeName,int classHour, int subjectNameNum) {
    this.gradeId = gradeId;
    this.gradeName = gradeName;
    this.classHour = classHour;
    this.subjectNameNum = subjectNameNum;
  }

  @Override
  public String toString() {
    return "Grade{" +
            "gradeId=" + gradeId +
            ", gradeName='" + gradeName +
            ", classHour=" + classHour + '\'' +
            ", subjectNameNum=" + subjectNameNum +
            '}';
  }

  public int getGradeId() {
    return gradeId;
  }

  public void setGradeId(int gradeId) {
    this.gradeId = gradeId;
  }

  public String getGradeName() {
    return gradeName;
  }

  public void setGradeName(String gradeName) {
    this.gradeName = gradeName;
  }

  public int getClassHour() {
    return classHour;
  }

  public void setClassHour(int classHour) {
    this.classHour = classHour;
  }

  public int getSubjectNameNum() {
    return subjectNameNum;
  }

  public void setSubjectNameNum(int subjectNameNum) {
    this.subjectNameNum = subjectNameNum;
  }
}
