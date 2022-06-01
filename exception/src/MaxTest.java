public class MaxTest {
    public static void main(String[] args) {
        Max<Number> n = new Max<>();
        System.out.println(n.max(10.0, 8.0));
        System.out.println(n.max(5, 8.0));
        Max<String> s = new Max<>();
        System.out.println(s.max("Hello", "hi"));
        System.out.println(s.max("goog", "morning"));

        Min m = new Min();
    }
}

class Max<T>{
    T max(T t1, T t2){
        if(t1 instanceof Number){
            Double d1 = ((Number) t1).doubleValue();
            Double d2 = ((Number) t2).doubleValue();
            return d1>d2 ? t1:t2;
        }else {
            String s1 = t1.toString();
            String s2 = t2.toString();
            return s1.length()>s2.length() ? t1:t2;
        }
    }
}

class Min{
    <T> T min(T t1, T t2){
        return t1;
    }
}