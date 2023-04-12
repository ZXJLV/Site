package cn.demo04.dao;

import cn.demo04.entity.Grade;

import java.util.List;

public interface GradeDao {

    //查询每个科室的课时数
    List<Grade> selectGrade();

}
