public class nameTest {
    public static void main(String[] args) {
        String s1 = new String("김");
        String s2 = new String ("김");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
