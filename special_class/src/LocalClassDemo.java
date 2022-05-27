public class LocalClassDemo {
    private String s1 = "외부";

    void method(){
        int x = 1; //final을 쓰지 않았지만 숨어있음
        class LocalClass{
            String s2 = "내부";
            String s3 = s1;
            String s4 = LocalClassDemo.this.s1;

            public void show(){
                System.out.println("지역 클래스");

            }
        }

        LocalClass lc = new LocalClass();
        System.out.println(lc.s2);
        lc.show();
    }
    public static void main(String[] args){
        LocalClassDemo lcd = new LocalClassDemo();
        lcd.method();
        new LocalClassDemo().method();
    }
}
