package cn.lx.service.impl;

import cn.lx.dao.GradeDao;
import cn.lx.dao.impl.GradeDaoImpl;
import cn.lx.entity.Grade;
import cn.lx.service.GradeService;

public class GradeServiceImpl implements GradeService {
    GradeDao gradeDao = new GradeDaoImpl();

    //查询每个年级的科目数量，以及总课时数，年级名称
    @Override
    public void selectSubject() {
        for (Grade grade : gradeDao.selectGrade()) {
            System.out.println(grade);
        }
    }
}
