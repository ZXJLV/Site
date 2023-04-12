package cn.mychool2;

import cn.mychool2.service.StudentService;
import cn.mychool2.service.impl.StudentServiceImpl;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();

        //studentService.insertStudent();
        //studentService.deleteStudent();
        //studentService.updateStudent();
        studentService.selectStudent();



    }
}