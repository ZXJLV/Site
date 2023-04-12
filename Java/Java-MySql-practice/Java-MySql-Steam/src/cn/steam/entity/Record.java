package cn.steam.entity;


public class Record {

  private int recordId;
  private String recordIdName;
  private String recordDate;
  private String recordType;
  private int shopId;
  private int userInfoId;

  @Override
  public String toString() {
    return "Record{" +
            "recordId=" + recordId +
            ", recordIdName='" + recordIdName + '\'' +
            ", recordDate='" + recordDate + '\'' +
            ", recordType='" + recordType + '\'' +
            ", shopId=" + shopId +
            ", userInfoId=" + userInfoId +
            '}';
  }

  public int getRecordId() {
    return recordId;
  }

  public void setRecordId(int recordId) {
    this.recordId = recordId;
  }

  public String getRecordIdName() {
    return recordIdName;
  }

  public void setRecordIdName(String recordIdName) {
    this.recordIdName = recordIdName;
  }

  public String getRecordDate() {
    return recordDate;
  }

  public void setRecordDate(String recordDate) {
    this.recordDate = recordDate;
  }

  public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  public int getShopId() {
    return shopId;
  }

  public void setShopId(int shopId) {
    this.shopId = shopId;
  }

  public int getUserInfoId() {
    return userInfoId;
  }

  public void setUserInfoId(int userInfoId) {
    this.userInfoId = userInfoId;
  }

  public Record() {
  }

  public Record(int recordId, String recordIdName, String recordDate, String recordType, int shopId, int userInfoId) {
    this.recordId = recordId;
    this.recordIdName = recordIdName;
    this.recordDate = recordDate;
    this.recordType = recordType;
    this.shopId = shopId;
    this.userInfoId = userInfoId;
  }
}
