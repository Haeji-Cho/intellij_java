public class Buffer {
    public static void main(String[] args) {
        show(new String("멘붕"));
        show(new StringBuilder("meltsown"));
        show(new StringBuffer("!@#"));

    }
    public static void show(Object out){  //Object가 모든 클래스의 공통된 부모이므로
        System.out.println(out);
    }
}

