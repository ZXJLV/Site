package cn.mychool2.dao;

import cn.mychool2.entity.Student;

import java.util.List;

public interface StudentDao {

    int insertStudent(String name);

    int deleteStudent(int id);

    int updateStudent(int id, String name);

    List<Student> selectStudent(int id);

}
