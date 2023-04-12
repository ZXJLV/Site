package cn.demo04.entity;


public class Grade {

  private int gradeId;
  private String gradeName;
  private int subjectNo;
  private String subjectName;
  private int classHour;



  public Grade(int gradeId, String gradeName, int classHour) {
    this.gradeId = gradeId;
    this.gradeName = gradeName;
    this.classHour = classHour;
  }

  @Override
  public String toString() {
    return "年级：{" +
            "年级Id=" + gradeId +
            ", 年级名称Name='" + gradeName + '\'' +
            ", 学时=" + classHour +
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

  public int getSubjectNo() {
    return subjectNo;
  }

  public void setSubjectNo(int subjectNo) {
    this.subjectNo = subjectNo;
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public int getClassHour() {
    return classHour;
  }

  public void setClassHour(int classHour) {
    this.classHour = classHour;
  }

  public Grade() {
  }

  public Grade(int gradeId, String gradeName, int subjectNo, String subjectName, int classHour) {
    this.gradeId = gradeId;
    this.gradeName = gradeName;
    this.subjectNo = subjectNo;
    this.subjectName = subjectName;
    this.classHour = classHour;
  }
}
