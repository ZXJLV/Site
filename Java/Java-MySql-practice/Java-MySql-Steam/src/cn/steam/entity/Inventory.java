package cn.steam.entity;

public class Inventory {

  private int inventoryId;
  private String gameName;
  private double gameTime;
  private int gameAchievementNum;
  private double gameNumGb;
  private int shopId;
  private int userInfoId;

  public Inventory(String gameName, double gameTime, int gameAchievementNum, double gameNumGb) {
    this.gameName = gameName;
    this.gameTime = gameTime;
    this.gameAchievementNum = gameAchievementNum;
    this.gameNumGb = gameNumGb;
  }

  @Override
  public String toString() {
    return "库{" +
            ", 游戏名称='" + gameName + '\'' +
            ", 游玩时长=" + gameTime +
            ", 成就=" + gameAchievementNum +
            ", 内存占用=" + gameNumGb +
            '}';
  }

  public int getInventoryId() {
    return inventoryId;
  }

  public void setInventoryId(int inventoryId) {
    this.inventoryId = inventoryId;
  }

  public String getGameName() {
    return gameName;
  }

  public void setGameName(String gameName) {
    this.gameName = gameName;
  }

  public double getGameTime() {
    return gameTime;
  }

  public void setGameTime(double gameTime) {
    this.gameTime = gameTime;
  }

  public int getGameAchievementNum() {
    return gameAchievementNum;
  }

  public void setGameAchievementNum(int gameAchievementNum) {
    this.gameAchievementNum = gameAchievementNum;
  }

  public double getGameNumGb() {
    return gameNumGb;
  }

  public void setGameNumGb(double gameNumGb) {
    this.gameNumGb = gameNumGb;
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

  public Inventory() {
  }

  public Inventory(int inventoryId, String gameName, double gameTime, int gameAchievementNum, double gameNumGb, int shopId, int userInfoId) {
    this.inventoryId = inventoryId;
    this.gameName = gameName;
    this.gameTime = gameTime;
    this.gameAchievementNum = gameAchievementNum;
    this.gameNumGb = gameNumGb;
    this.shopId = shopId;
    this.userInfoId = userInfoId;
  }
}
