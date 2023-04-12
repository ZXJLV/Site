public class StingBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer(20);

        sb.append("HELLO");
        sb.append("WORLD");
        System.out.println(sb);

        sb.insert(5," ");
        System.out.println(sb);



    }
}
