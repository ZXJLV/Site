package cn.demo04.dao.impl;

import cn.demo04.dao.BaseDao;
import cn.demo04.dao.GradeDao;
import cn.demo04.entity.Grade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GradeDaoImpl extends BaseDao implements GradeDao {


    @Override
    public List<Grade> selectGrade() {
        List<Grade> resultList = new ArrayList<Grade>();
        Grade grade = null;

        try {
            Connection conn = getConn();

            String sql = "SELECT grade.gradeID,grade.gradeName, SUM(subject.classHour)\n" +
                    "FROM subject\n" +
                    "INNER JOIN grade ON grade.gradeID = subject.gradeID\n" +
                    "GROUP BY grade.gradeID;\n";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                resultList.add(new Grade(
                        rs.getInt("gradeID"),
                        rs.getString("gradeName"),
                        rs.getInt("SUM(subject.classHour)")
                        )
                );
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
}
