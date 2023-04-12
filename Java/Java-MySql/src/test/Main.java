package test;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;

        String url= "jdbc:mysql://localhost:3306/hospital?useUnicode=true&characterEncoding=UTF-8";
        String user = "root";
        String password = "root";

        conn = DriverManager.getConnection(url, user, password);

        Statement stmt = conn.createStatement();
        ResultSet resultSet = stmt.executeQuery("select * from patient");

        System.out.println("patientID\tpassword\tbirthDate\tgender\tpatientName\tphoneNum\temail\tidentityNum\taddress");
        while (resultSet.next()) {
            System.out.print(resultSet.getString("patientID")+"\t");
            System.out.print(resultSet.getString("password")+"\t");
            System.out.print(resultSet.getString("birthDate")+"\t");
            System.out.print(resultSet.getString("gender")+"\t");
            System.out.print(resultSet.getString("patientName")+"\t");
            System.out.print(resultSet.getString("phoneNum")+"\t");
            System.out.print(resultSet.getString("email")+"\t");
            System.out.print(resultSet.getString("identityNum")+"\t");
            System.out.print(resultSet.getString("address")+"\t");
            System.out.println();
        }

        resultSet.close();
        conn.close();

    }
}