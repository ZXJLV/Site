package Demo04;

import java.sql.SQLException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
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

        insert.insert(password,birthDate,gender,patientName,phoneNum,email,identityNum,address);

        String str = "";
    }
}
