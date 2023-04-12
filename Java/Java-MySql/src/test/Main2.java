package test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String driver = "com.mysql.jdbc.Driver";
        String url= "jdbc:mysql://localhost:3306/hospital?useUnicode=true&characterEncoding=UTF-8";
        String username = "root";
        String password = "root";

        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM patient";
        ResultSet rs = stmt.executeQuery(sql);

        List<patient> patientList = new ArrayList<patient>();
        while (rs.next()) {
//            System.out.print(rs.getString(1)+"\t");
//            System.out.print(rs.getString(2)+"\t");
//            System.out.print(rs.getString(3)+"\t");
//            System.out.print(rs.getString(4)+"\t");
//            System.out.print(rs.getString(5)+"\t");
//            System.out.println();

            patientList.add(new patient(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)));

        }

        for (patient patient1 : patientList){
            System.out.println(patient1);
        }

        rs.close();
        conn.close();
    }
}
