package cn.person.service.impl;

import cn.person.dao.PersonDao;
import cn.person.dao.impl.PersonDaoImpl;
import cn.person.entity.Person;
import cn.person.service.PersonService;

import java.util.Scanner;

public class PersonServiceImpl implements PersonService {
    Scanner input = new Scanner(System.in);
    PersonDao personDao = new PersonDaoImpl();
    Person person = new Person();

    //查询所有人员信息按照编号降序排列，并返回查询结果
    @Override
    public void selectPresent() {
        for (Person person : personDao.selectPersonAll()) {
            System.out.println(person);
        }
    }

    //将新的人员信息保存到数据库
    @Override
    public void insertPresent() {

        System.out.println("请输入姓名：");
        person.setName(input.next());
        System.out.println("请输入性别：");
        person.setSex(input.next());
        System.out.println("请输入年龄：");
        person.setAge(input.nextInt());
        System.out.println("请输入等级：");
        person.setRank(input.next());
        System.out.println("请输入所在部门：");
        person.setDepartment(input.next());

        int rowInsertPerson = personDao.insertPerson(person);

        if (rowInsertPerson>0) {
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

    }

    //将指定的人员从数据库中删除
    @Override
    public void deletePresent() {

        System.out.println("请输入你的id：");
        int id = input.nextInt();

        int rowDeletePerson = personDao.deletePerson(id);

        if (rowDeletePerson>0) {
            System.out.println("删除成功");
        }else {
            System.out.println("未查找到此人");
        }


    }



}
