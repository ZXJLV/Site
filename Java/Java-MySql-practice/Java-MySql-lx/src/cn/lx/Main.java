package cn.lx;

import cn.lx.service.GradeService;
import cn.lx.service.impl.GradeServiceImpl;

public class Main {
    public static void main(String[] args) {
        GradeService gradeService = new GradeServiceImpl();

        gradeService.selectSubject();
    }
}