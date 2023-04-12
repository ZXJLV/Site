package cn.demo04.service.impl;
import cn.demo04.dao.ResultDao;
import cn.demo04.dao.StudentDao;
import cn.demo04.dao.impl.ResultDaoImpl;
import cn.demo04.dao.impl.StudentDaoImpl;
import cn.demo04.entity.Result;
import cn.demo04.service.ResultService;

public class ResultServiceImpl implements ResultService {
    ResultDao resultDao = new ResultDaoImpl();
    StudentDao studentDao = new StudentDaoImpl();

    //查询考试成绩小于60并删除
    @Override
    public void selectResult() {

        //获得几行受影响
        int rowDeleteResult = 0;
        int rowDeleteStudent = 0;

        //查出所有分数小于60的信息
        for (Result result : resultDao.selectStudentResult()) {
            System.out.println(result);
        }

        for (Result result : resultDao.selectStudentResult()) {
            //根据学生id删除result表中的信息
            rowDeleteResult = resultDao.deleteResultByStudentId(result.getStudentNo());
            //根据学生id删除student表中的信息
            rowDeleteStudent = studentDao.deleteStudentByStudentId(result.getStudentNo());
        }


        //判断是否删除成功
        if (rowDeleteResult > 0) {
            System.out.println("Student表数据删除成功");
        }else {
            System.err.println("删除失败");
        }

        if (rowDeleteStudent > 0) {
            System.out.println("result表数据删除成功");
        }else {
            System.err.println("删除失败");
        }

    }
}
