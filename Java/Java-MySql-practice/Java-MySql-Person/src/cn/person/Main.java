package cn.person;

import cn.person.service.PersonService;
import cn.person.service.impl.PersonServiceImpl;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonServiceImpl();

        //查询所有人员信息按照编号降序排列，并返回查询结果
        //personService.selectPresent();

        //将新的人员信息保存到数据库
        //personService.insertPresent();

        //将指定的人员从数据库中删除
        //personService.deletePresent();

    }
}