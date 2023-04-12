package Test02;

import java.sql.*;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入姓名：");
        String name = input.next();
        System.out.println("请输入密码：");
        String pwd = input.next();

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/hospital";
        String username = "root";
        String password = "root";

        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "SELECT * FROM patient WHERE patient.patientName=? AND patient.`password`=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, pwd);

        System.out.println("sql:"+ps.toString());

        ResultSet rs = ps.executeQuery();
        //String sql = "SELECT * FROM patient WHERE patient.patientName='"+name+"'and patient.`password`='"+pwd+"'";
        //ResultSet rs = stmt.executeQuery(sql);

        if (rs.next()){
            System.out.println("欢迎"+rs.getString("patientName"));
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }

        rs.close();
        conn.close();

    }
}
