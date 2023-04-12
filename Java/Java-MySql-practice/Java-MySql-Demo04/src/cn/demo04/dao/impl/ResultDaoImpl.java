package cn.demo04.dao.impl;

import cn.demo04.dao.BaseDao;
import cn.demo04.dao.ResultDao;
import cn.demo04.entity.Result;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResultDaoImpl extends BaseDao implements ResultDao {

    //查询考试成绩小于60
    @Override
    public List<Result> selectStudentResult() {
        List<Result> resultList = new ArrayList<Result>();
        try {
            Connection conn = getConn();

            String sql = "SELECT result.studentNo,student.studentName,result.subjectNo,`subject`.subjectName,result.examDate,result.studentResult FROM result \n" +
                    "INNER JOIN student ON student.studentNo = result.studentNo\n" +
                    "INNER JOIN `subject` ON `subject`.subjectNo = result.subjectNo\n" +
                    "WHERE result.studentResult<60";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                resultList.add(new Result(
                        rs.getInt("studentNo"),
                        rs.getString("studentName"),
                        rs.getInt("subjectNo"),
                        rs.getString("subjectName"),
                        rs.getString("examDate"),
                        rs.getInt("studentResult")
                        ));
            }
            System.err.println("\u001B[36mmsql:" + ps + "\u001B[0m");
            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultList;
    }

    //根据学生id删除result表中的信息
    @Override
    public int deleteResultByStudentId(int studentId) {
        String sql = "DELETE FROM result WHERE result.studentNo = ?";
        Object[] objects = {studentId};

        try {
            return updateBuffer(sql,objects);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
