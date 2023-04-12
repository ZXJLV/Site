package com.mysql.entity;

public class Calorie {

  private int calorieId;
  private String calorieType;
  private double discount;
  private double minRange;
  private double maxRange;

  public Calorie(int calorieId, String calorieType, double discount, double minRange, double maxRange) {
    this.calorieId = calorieId;
    this.calorieType = calorieType;
    this.discount = discount;
    this.minRange = minRange;
    this.maxRange = maxRange;
  }

  public Calorie(int calorieId) {
    this.calorieId = calorieId;
  }

  public Calorie() {
  }

  @Override
  public String toString() {
    return "Calorie{" +
            "calorieId=" + calorieId +
            ", calorieType='" + calorieType + '\'' +
            ", discount=" + discount +
            ", minRange=" + minRange +
            ", maxRange=" + maxRange +
            '}';
  }

  public int getCalorieId() {
    return calorieId;
  }

  public void setCalorieId(int calorieId) {
    this.calorieId = calorieId;
  }

  public String getCalorieType() {
    return calorieType;
  }

  public void setCalorieType(String calorieType) {
    this.calorieType = calorieType;
  }

  public double getDiscount() {
    return discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public double getMinRange() {
    return minRange;
  }

  public void setMinRange(double minRange) {
    this.minRange = minRange;
  }

  public double getMaxRange() {
    return maxRange;
  }

  public void setMaxRange(double maxRange) {
    this.maxRange = maxRange;
  }
}
