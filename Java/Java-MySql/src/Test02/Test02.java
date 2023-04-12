package Test02;

import Demo04.Insert;

import java.sql.*;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner input = new Scanner(System.in);
        Insert insert = new Insert();

// "INSERT INTO `test.patient` (password,birthDate,gender,patientName,phoneNum,email,identityNum,address) VALUES ('188488', '2077-07-07', '男', '杨一铭', '17777777777', 'YYM@163.com', '888888', '夜之城');";

        System.out.println("请输入密码：");
        int password = input.nextInt();
        System.out.println("请输入出生日期：");
        String birthDate = input.next();
        System.out.println("请输入性别：");
        String gender = input.next();
        System.out.println("请输入姓名：");
        String patientName = input.next();
        System.out.println("请输入电话号码：");
        String phoneNum = input.next();
        System.out.println("请输入邮箱：");
        String email = input.next();
        System.out.println("请输入身份证号：");
        String identityNum = input.next();
        System.out.println("请输入地址：");
        String address = input.next();




        //配置
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/hospital";
        String username = "root";
        String userpassword = "root";

        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url, username, userpassword);
        String sql = "INSERT INTO `patient` (password,birthDate,gender,patientName,phoneNum,email,identityNum,address) VALUES (?,?,?,?,?,?,?,?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,password);
        ps.setString(2,birthDate);
        ps.setString(3,gender);
        ps.setString(4,patientName);
        ps.setString(5,phoneNum);
        ps.setString(6,email);
        ps.setString(7,identityNum);
        ps.setString(8,address);
//        Statement statement = conn.createStatement();
//        String sql = "INSERT INTO `patient` (password,birthDate,gender,patientName,phoneNum,email,identityNum,address) VALUES ('"+password+"', '"+birthDate+"', '"+gender+"', '"+patientName+"', '"+phoneNum+"', '"+email+"', '"+identityNum+"', '"+address+"');";
        System.out.println(ps.toString());
        int row = ps.executeUpdate();

        if (row>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

        conn.close();
    }
}
