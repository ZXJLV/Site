package Demo04_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert extends DBUtil {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        Connection conn = getConn();

        System.out.println("请输入你的姓名：");
        String name = input.next();
        System.out.println("请输入你的性别：");
        String gender = input.next();
        System.out.println("请输入你的密码：");
        String pwd = input.next();
        System.out.println("请输入你的手机号：");
        String phone = input.next();
        System.out.println("请输入你的邮箱：");
        String email = input.next();
        System.out.println("请输入你的身份证号：");
        String id = input.next();
        System.out.println("请输入你的初生日期：");
        String data = input.next();
        System.out.println("请输入你的地址：");
        String address = input.next();

        String sql = "INSERT INTO patient (`password`,birthDate,gender,patientName,phoneNum,email,identityNum,address) " +
                          "VALUES (?,?,?,?,?,?,?,?) ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,pwd);
        ps.setString(2,data);
        ps.setString(3,gender);
        ps.setString(4,name);
        ps.setString(5,phone);
        ps.setString(6,email);
        ps.setString(7,id);
        ps.setString(8,address);

        int row = ps.executeUpdate();

        if (row > 0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

        closeAll(conn,ps,null);

    }
}
