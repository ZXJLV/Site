package Demo03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public void update(String rawName,String updateName) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/hospital";
        String username = "root";
        String password = "root";

        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url, username, password);
        Statement statement = conn.createStatement();
        String sql = "UPDATE patient SET patient.patientName='"+rawName+"' WHERE patient.patientName = '"+updateName+"'; ";
        int row = statement.executeUpdate(sql);

        if (row>0){
            System.out.println("更改成功");
        }else {
            System.out.println("更改失败");
        }

        statement.close();
        conn.close();


    }
}
