public class MemeberClassDemo {

    public String secret = "비공개";
    String s = "외부";

    class MemberClass{
        String s = "내부";

        public void show1(){
            System.out.println("내부 클래스");
            System.out.println(secret);

            System.out.println(s);

            System.out.println(MemeberClassDemo.this.s);

        }
    }
    public static void main(String[] args) {

        MemeberClassDemo m = new MemeberClassDemo();
        MemeberClassDemo.MemberClass m1 = m.new MemberClass();

        System.out.println(m1.s);
        m1.show1();
    }
}
