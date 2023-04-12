package cn.demo04.dao;

import cn.demo04.entity.Result;

import java.util.List;

public interface ResultDao {

    //查询考试成绩小于60
    List<Result> selectStudentResult();

    //根据学生id删除result表中的信息
    int deleteResultByStudentId(int studentId);
}
