package cn.demo04.service.impl;

import cn.demo04.dao.GradeDao;
import cn.demo04.dao.impl.GradeDaoImpl;
import cn.demo04.entity.Grade;
import cn.demo04.service.GradeService;

public class GradeServiceImpl implements GradeService {
    GradeDao gradeDao = new GradeDaoImpl();

    //查询每个科室的课时数
    @Override
    public void selectGrade() {
        //遍历查询结果
        for (Grade grade : gradeDao.selectGrade()) {
            System.out.println(grade);
        }

    }

}
