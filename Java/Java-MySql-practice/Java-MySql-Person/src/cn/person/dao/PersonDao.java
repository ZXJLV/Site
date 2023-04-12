package cn.person.dao;

import cn.person.entity.Person;

import java.util.List;

public interface PersonDao {

    //查询所有人员信息按照编号降序排列，并返回查询结果
    List<Person> selectPersonAll();

    //将新的人员信息保存到数据库
    int insertPerson(Person person);

    //将指定的人员从数据库中删除
    int deletePerson(int id);

}
