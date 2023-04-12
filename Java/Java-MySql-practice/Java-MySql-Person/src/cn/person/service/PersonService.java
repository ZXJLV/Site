package cn.person.service;

public interface PersonService {

    //查询所有人员信息按照编号降序排列，并返回查询结果
    void selectPresent();

    //将新的人员信息保存到数据库
    void insertPresent();

    //将指定的人员从数据库中删除
    void deletePresent();

}
