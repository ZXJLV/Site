package cn.lx.dao;

import cn.lx.entity.Grade;

import java.util.List;

public interface GradeDao {

    //查询每个年级的科目数量，以及总课时数，年级名称
    List<Grade> selectGrade();

}
