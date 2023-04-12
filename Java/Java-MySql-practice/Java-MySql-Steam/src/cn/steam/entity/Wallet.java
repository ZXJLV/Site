package cn.steam.entity;


public class Wallet {

  private int walletId;
  private double walletBalance;
  private int userInfoId;

  @Override
  public String toString() {
    return "Wallet{" +
            "walletId=" + walletId +
            ", walletBalance=" + walletBalance +
            ", userInfoId=" + userInfoId +
            '}';
  }

  public int getWalletId() {
    return walletId;
  }

  public void setWalletId(int walletId) {
    this.walletId = walletId;
  }

  public double getWalletBalance() {
    return walletBalance;
  }

  public void setWalletBalance(double walletBalance) {
    this.walletBalance = walletBalance;
  }

  public int getUserInfoId() {
    return userInfoId;
  }

  public void setUserInfoId(int userInfoId) {
    this.userInfoId = userInfoId;
  }

  public Wallet() {
  }

  public Wallet(int walletId, double walletBalance, int userInfoId) {
    this.walletId = walletId;
    this.walletBalance = walletBalance;
    this.userInfoId = userInfoId;
  }
}
