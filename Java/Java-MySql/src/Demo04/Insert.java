package Demo04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    public void insert(int password,String birthDate,String gender,String patientName,String phoneNum,String email,String identityNum,String address) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/hospital";
        String username = "root";
        String userpassword = "root";

        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url, username, userpassword);
        Statement statement = conn.createStatement();
        String sql = "INSERT INTO `patient` (password,birthDate,gender,patientName,phoneNum,email,identityNum,address) VALUES ('"+password+"', '"+birthDate+"', '"+gender+"', '"+patientName+"', '"+phoneNum+"', '"+email+"', '"+identityNum+"', '"+address+"');";
        int row = statement.executeUpdate(sql);

        if (row>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

        statement.close();
        conn.close();


    }
}
