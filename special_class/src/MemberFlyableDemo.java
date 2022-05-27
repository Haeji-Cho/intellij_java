public class MemberFlyableDemo {
    class Eagle implements Flyable{
        @Override
        public void fly() {
            System.out.println("독수리가 난다.");
        }

        public void sound(){
            System.out.println("휘익");

        }
    }

    Eagle eagle = new Eagle();

    public static void main(String[] args) {
        MemberFlyableDemo f = new MemberFlyableDemo();
        f.eagle.fly();
        f.eagle.sound();

    }


}
