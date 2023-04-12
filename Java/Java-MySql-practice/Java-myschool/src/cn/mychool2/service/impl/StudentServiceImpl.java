package cn.mychool2.service.impl;

import cn.mychool2.dao.StudentDao;
import cn.mychool2.dao.impl.StudentDaoImpl;
import cn.mychool2.entity.Student;
import cn.mychool2.service.StudentService;

public class StudentServiceImpl implements StudentService {

    StudentDao studentDao = new StudentDaoImpl();

    @Override
    public void insertStudent() {
        int row = studentDao.insertStudent("张三");
        if (row > 0) {
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

    }

    @Override
    public void deleteStudent() {
        int row = studentDao.deleteStudent(2);
        if (row > 0) {
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }

    @Override
    public void updateStudent() {
        int row = studentDao.updateStudent(3,"李四");
        if (row > 0) {
            System.out.println("更改成功");
        }else {
            System.out.println("更改失败");
        }
    }

    @Override
    public void selectStudent() {
        for (Student student : studentDao.selectStudent(3)) {
            System.out.println(student);
        }
    }


}
