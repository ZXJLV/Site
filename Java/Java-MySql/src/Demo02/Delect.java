package Demo02;

import java.sql.*;

public class Delect {
    public void deleteSelect(int id) throws ClassNotFoundException, SQLException {
        /*根据患者编号删除信息*/
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/hospital";
        String username = "root";
        String password = "root";

        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();
        String sql = "CALL proc_delete(" + id + ")";
        int row = stmt.executeUpdate(sql);

        if (row > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }

        String sql2 = "SELECT patient.* FROM patient";
        ResultSet rs = stmt.executeQuery(sql2);

        while (rs.next()) {
            System.out.print(rs.getString("patientID") + "\t");
            System.out.println(rs.getString("patientName"));
        }

        rs.close();
        stmt.close();
        conn.close();

    }
}
