package Demo02_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete extends DBUtil{
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入你要删除信息的姓名：");
        String name = input.next();

        Connection conn = getConn();

        String sql = "DELETE FROM patient WHERE patientName=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        int rows = ps.executeUpdate();

        if (rows>0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }

        closeAll(conn,ps,null);




    }
}
