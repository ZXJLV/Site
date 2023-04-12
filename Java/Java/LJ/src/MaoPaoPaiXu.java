//冒泡排序
public class MaoPaoPaiXu {
    public static void main(String[] args) {
        int a;
        int[] num = {99,88,35,42,52};

        for (int j = 0; j < num.length - 1; j++) {
            for (int i = 0; i < num.length - j - 1; i++) {
                if (num[i] > num[i + 1]) {
                    a = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = a;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

    }
}
