import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String s = "for the people, by the people, for the people";

        StringTokenizer st = new StringTokenizer(s, ",  ");

        System.out.println(st.countTokens());

        while (st.hasMoreTokens()){ //토큰이 있을 땨가지
            System.out.print("[" + st.nextToken() + "]");  //토큰 하나씩 출력해주기
        }
    }
}
