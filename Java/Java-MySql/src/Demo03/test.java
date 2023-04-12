package Demo03;

import java.sql.SQLException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        Update update = new Update();

        String rawName = null;
        String updateName = null;

        System.out.print("请输入原姓名：");
        rawName = input.next();
        updateName = input.next();
        update.update(rawName,updateName);
    }
}
