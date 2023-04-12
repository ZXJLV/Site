package cn.demo04;

import cn.demo04.service.GradeService;
import cn.demo04.service.ResultService;
import cn.demo04.service.impl.GradeServiceImpl;
import cn.demo04.service.impl.ResultServiceImpl;

public class Main {
    public static void main(String[] args) {
        ResultService resultService = new ResultServiceImpl();
        GradeService gradeService = new GradeServiceImpl();

        //查询考试成绩小于60并删除
        //resultService.selectResult();

        //查询每个科室的课时数
        gradeService.selectGrade();




    }
}