package Demo02;

import java.sql.SQLException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        Delect delect = new Delect();

        System.out.println("请输入编号：");
        delect.deleteSelect(input.nextInt());
    }
}
