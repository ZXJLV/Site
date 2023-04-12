package cn.demo04.dao.impl;

import cn.demo04.dao.BaseDao;
import cn.demo04.dao.StudentDao;

import java.sql.SQLException;

public class StudentDaoImpl extends BaseDao implements StudentDao {

    //根据学生id删除student表中的信息
    @Override
    public int deleteStudentByStudentId(int studentId) {
        String sql = "DELETE FROM student WHERE student.studentNo = ?";
        Object[] objects = {studentId};

        try {
            return updateBuffer(sql, objects);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
