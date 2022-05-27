import java.util.StringTokenizer;

public class UnCheckedDemo {
    public static void main(String[] args) {
        String s = "Time is money";
        StringTokenizer st = new StringTokenizer(s);

        while (st.hasMoreTokens())
            System.out.println(st.nextToken());
     //   System.out.println(st.nextToken());
    }
}
