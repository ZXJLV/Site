package cn.demo02.dao.impl;

import cn.demo02.dao.BaseDao;
import cn.demo02.dao.DoctorLevelDao;
import cn.demo02.entity.Doctorlevel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DoctorLevelDaoImpl extends BaseDao implements DoctorLevelDao {

    //打印所有医生等级
    @Override
    public ArrayList<Doctorlevel> selectDoctorLevel() throws Exception {
        Connection conn = getConn();

        ArrayList<Doctorlevel> doctorlevelArrayList = new ArrayList<Doctorlevel>();
        String sql = "SELECT * FROM doctorlevel";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            doctorlevelArrayList.add(new Doctorlevel(
                    rs.getInt(1),
                    rs.getString(2)
            ));
        }

        closeAll(conn,ps,rs);

        for (Doctorlevel doctorlevel : doctorlevelArrayList) {
            System.out.println(doctorlevel);
        }

        return doctorlevelArrayList;
    }
}
