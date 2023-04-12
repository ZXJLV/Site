package Demo01_2;

import com.javamql.dao.BaseDao;

import java.io.*;
import java.sql.*;

public class Select extends BaseDao {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        Connection conn = getConn();

        String sql = "SELECT * FROM patient";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            System.out.print(rs.getString(1)+"\t");
            System.out.print(rs.getString(2)+"\t");
            System.out.print(rs.getString(3)+"\t");
            System.out.print(rs.getString(4)+"\t");
            System.out.print(rs.getString(5)+"\t");
            System.out.print(rs.getString(6)+"\t");
            System.out.print(rs.getString(7)+"\t");
            System.out.print(rs.getString(8)+"\t");
            System.out.print(rs.getString(9)+"\t");
            System.out.println();
        }

        closeAll(conn,ps,rs);

    }
}
