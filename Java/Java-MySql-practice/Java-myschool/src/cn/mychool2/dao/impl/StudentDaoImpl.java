package cn.mychool2.dao.impl;

import cn.mychool2.dao.BaseDao;
import cn.mychool2.dao.StudentDao;
import cn.mychool2.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl extends BaseDao implements StudentDao {
    @Override
    public int insertStudent(String name) {

        String sql = "INSERT INTO student (name) VALUES (?)";
        Object[] objects = {name};

        try {
            return updateBuffer(sql, objects);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteStudent(int id) {
        String sql = "DELETE FROM student WHERE id = ?";
        Object[] objects = {id};

        try {
            return  updateBuffer(sql,objects);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateStudent(int id, String name) {
        String sql = "UPDATE student SET name = ? WHERE id = ?";
        Object[] objects = {name,id};

        try {
            return updateBuffer(sql,objects);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Student> selectStudent(int id) {
        List<Student> students = new ArrayList<Student>();
        Student student = null;
        try {
            Connection conn = getConn();

            String sql = "SELECT * FROM student WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                students.add(student = new Student(
                        rs.getInt(1),
                        rs.getString(2)
                ));
            }
            System.err.println("\u001B[36mmsql:" + ps + "\u001B[0m");
            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return students;
    }


}
