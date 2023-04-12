package com.taobao.entity;


public class Shoppingcar {

  private int shoppingcarId;
  private int userinfoId;
  private int productId;
  private int productCount;
  private String productName;
  private Double productPRice;
  private String productDescription;
  private String userinfoNikeName;

  @Override
  public String toString() {
    return "购物车：{" +
            "购物车Id=" + shoppingcarId +
            ", 用户Id=" + userinfoId +
            ", 商品Id=" + productId +
            ", 商品个数=" + productCount +
            ", 商品名称='" + productName + '\'' +
            ", 商品价格=" + productPRice +
            ", 商品描述='" + productDescription + '\'' +
            ", 用户昵称='" + userinfoNikeName + '\'' +
            '}';
  }

  public int getShoppingcarId() {
    return shoppingcarId;
  }

  public void setShoppingcarId(int shoppingcarId) {
    this.shoppingcarId = shoppingcarId;
  }

  public int getUserinfoId() {
    return userinfoId;
  }

  public void setUserinfoId(int userinfoId) {
    this.userinfoId = userinfoId;
  }

  public int getProductId() {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }

  public int getProductCount() {
    return productCount;
  }

  public void setProductCount(int productCount) {
    this.productCount = productCount;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Double getProductPRice() {
    return productPRice;
  }

  public void setProductPRice(Double productPRice) {
    this.productPRice = productPRice;
  }

  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public String getUserinfoNikeName() {
    return userinfoNikeName;
  }

  public void setUserinfoNikeName(String userinfoNikeName) {
    this.userinfoNikeName = userinfoNikeName;
  }

  public Shoppingcar() {
  }

  public Shoppingcar(int shoppingcarId, int userinfoId, int productId, int productCount, String productName, Double productPRice, String productDescription, String userinfoNikeName) {
    this.shoppingcarId = shoppingcarId;
    this.userinfoId = userinfoId;
    this.productId = productId;
    this.productCount = productCount;
    this.productName = productName;
    this.productPRice = productPRice;
    this.productDescription = productDescription;
    this.userinfoNikeName = userinfoNikeName;
  }
}
