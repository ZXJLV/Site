package com.mysql.service;

public interface ConsumptionService {

    //添加消费记录
    public void insertConsumption() throws Exception;

    //打印消费记录
    public void selectConsumption() throws Exception;
}
