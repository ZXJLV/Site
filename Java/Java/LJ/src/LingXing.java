import java.util.Scanner;
//菱形
public class LingXing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入行数:");
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < row-i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <2*i-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (2*row - 1) - 2*i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}