package test;

public class patient {
    /*
    * CREATE TABLE `hospital`.`test.patient`  (
  `patientID` int(4) NOT NULL AUTO_INCREMENT COMMENT '病人编号',
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '登录密码',
  `birthDate` date NULL DEFAULT NULL COMMENT '出生日期',
  `gender` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '男' COMMENT '性别',
  `patientName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '病人姓名',
  `phoneNum` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `email` varchar(70) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `identityNum` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证号',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '地址不详' COMMENT '地址',
  PRIMARY KEY (`patientID`) USING BTREE,
  UNIQUE INDEX `identityNum`(`identityNum`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '病人表' ROW_FORMAT = DYNAMIC;
    * */
    int patientID;
    String password;
    String birthDate;
    String gender;
    String patientName;
    String phoneNum;
    String email;
    String identityNum;
    String address;

    public patient(int patientID, String password, String birthDate, String gender, String patientName, String phoneNum, String email, String identityNum, String address) {
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

    public patient() {
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
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
        return "test.patient{" +
                "patientID=" + patientID +
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
