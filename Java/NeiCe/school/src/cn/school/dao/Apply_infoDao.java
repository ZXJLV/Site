package cn.school.dao;

import cn.school.entity.Apply_info;

import java.util.List;

public interface Apply_infoDao {

    //添加学生信息
    int insertApply_info(Apply_info applyInfo);

    //按比赛项目查询
    List<Apply_info> selectApply_infoByGame(String game);

    //按班号查询
    List<Apply_info> selectApply_infoByClass1(int class1);

    //根据名字删除信息
    int delecteApply_infoByName(String name);


}
