public class Text {
    public static void main(String[] args) {

        // /fill -3376 224 202 -3376 224 221 minecraft:smooth_stone

        int a = 224;
        int b = 224;

        for (int i = 0; i <= 71;i++){

            System.out.println("/fill -3376 "+(a+1)+" 202 -3376 "+(b+1)+" 221 minecraft:smooth_stone");
            a++;
            b++;

        }



    }
}
