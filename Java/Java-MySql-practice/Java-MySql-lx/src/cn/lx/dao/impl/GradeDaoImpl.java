package cn.lx.dao.impl;

import cn.lx.dao.BaseDao;
import cn.lx.dao.GradeDao;
import cn.lx.entity.Grade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GradeDaoImpl extends BaseDao implements GradeDao {

    //查询每个年级的科目数量，以及总课时数，年级名称
    @Override
    public List<Grade> selectGrade() {
        List<Grade> gradetList = new ArrayList<Grade>();
        Grade grade = null;
        try {
            Connection conn = getConn();

            String sql = "SELECT grade.gradeID,grade.gradeName, SUM(subject.classHour),COUNT(`subject`.subjectName) FROM grade\n" +
                    "INNER JOIN  subject ON grade.gradeID = subject.gradeID\n" +
                    "GROUP BY grade.gradeID;\n";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                gradetList.add(grade = new Grade(
                        rs.getInt("gradeID"),
                        rs.getString("gradeName"),
                        rs.getInt("SUM(subject.classHour)"),
                        rs.getInt("COUNT(`subject`.subjectName)")
                ));
            }
            System.err.println("\u001B[35mmsql:" + ps + "\u001B[0m");
            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return gradetList;
    }
}
