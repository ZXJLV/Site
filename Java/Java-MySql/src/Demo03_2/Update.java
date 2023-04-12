package Demo03_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update extends DBUtil {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        Connection conn = getConn();

        System.out.println("请输入要更改的姓名：");
        String rawName = input.next();
        System.out.println("请输入要更改为的姓名：");
        String updateName = input.next();

        String sql = "UPDATE patient SET patientName=? WHERE patientName=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,updateName);
        ps.setString(2,rawName);
        int row = ps.executeUpdate();

        if (row > 0){
            System.out.println("更改成功");
        }else {
            System.out.println("更改失败");
        }

        closeAll(conn,ps,null);

    }
}
