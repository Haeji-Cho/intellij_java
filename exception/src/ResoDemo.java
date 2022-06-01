public class ResoDemo {
    public static void main(String[] args) {
        try(Reso r = new Reso()){
            r.show();
        }catch (Exception e){
            System.out.println("예외 처리");
        }
    }
}

class Reso implements AutoCloseable {

    void show() {
        System.out.println("자원 사용");
    }

    @Override
    public void close() throws Exception {
        System.out.println("자원 닫기");
    }
}