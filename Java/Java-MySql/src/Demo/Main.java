package Demo;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*查出患者的平均消费*/
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/hospital";
        String username = "root";
        String password = "root";

        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();
        String sql = "SELECT patient.patientName,AVG(checkitem.checkItemCost) AS avg FROM patient LEFT JOIN prescription ON patient.patientID = prescription.patientID LEFT JOIN checkitem ON prescription.checkItemID = checkitem.checkItemID GROUP BY patient.patientName;";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()){
            System.out.print(rs.getString("patientName") + "\t\t");
            System.out.println(rs.getString("avg"));
        }

        rs.close();
        conn.close();

    }
}
