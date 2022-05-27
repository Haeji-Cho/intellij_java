public class WrapperClass {
    public static void main(String[] args) {
        Integer bi1 = new Integer(10);
        int i1 = bi1.intValue();
        int i2 = bi1;
        System.out.println(i1);
        System.out.println(i2);

        double d = bi1.doubleValue();
        bi1.compareTo(i1);
        int i3 = bi1 + 10;

        double s1 = Double.parseDouble("3.14"); //문자열을 double타입으로 바꾸는 것
        int i4 = Integer.parseInt("15", 16); //16진수의 15를 int로 바꾸는 것
        System.out.println(i4);
    }
}
