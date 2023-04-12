package cn.steam.dao;

public interface WalletDao {

    //根据库存id删除钱包
    int deleteWalletByInventoryId(int userInfoId);

    //根据用户id判断钱包是否有钱
    boolean selectWalletByInventoryId(int userInfoId);

    //更改walletBalance根据用户id
    int updateWalletBalanceByUserInfoById(int userInfoId,double howManyMoney);

}
