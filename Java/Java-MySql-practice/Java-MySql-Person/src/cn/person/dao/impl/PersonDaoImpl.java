package cn.person.dao.impl;

import cn.person.dao.BaseDao;
import cn.person.dao.PersonDao;
import cn.person.entity.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl extends BaseDao implements PersonDao {

    //查询所有人员信息按照编号降序排列，并返回查询结果
    @Override
    public List<Person> selectPersonAll() {
        List<Person> personList = new ArrayList<Person>();

        try {
            Connection conn = getConn();

            String sql = "SELECT * FROM person \n" +
                         "ORDER BY person.id DESC ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                personList.add(new Person(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("sex"),
                        rs.getInt("age"),
                        rs.getString("rank"),
                        rs.getString("department")
                ));
            }

            closeAll(conn,ps,rs);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return personList;
    }

    //将新的人员信息保存到数据库
    @Override
    public int insertPerson(Person person) {
        String sql = "INSERT INTO person (name, sex, age, rank, department)\n" +
                                 "VALUES (?,?,?,?,?)";
        Object[] objects = {person.getName(),person.getSex(),person.getAge(),person.getRank(),person.getDepartment()};

        try {
            return updateBuffer(sql,objects);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //将指定的人员从数据库中删除
    @Override
    public int deletePerson(int id) {
        String sql = "DELETE FROM person WHERE person.id=?";
        Object[] objects = {id};

        try {
            return updateBuffer(sql,objects);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



}
