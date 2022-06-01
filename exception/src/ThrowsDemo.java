public class ThrowsDemo {
    public static void main(String[] args) {
        int[] x = {1, 2};
        try{
            show(x);
            throw new Exception(); //예외만들어서 넘기고
        }catch (Exception e){
            System.out.println("오류");
        }
    }

    static void show(int[] a) throws ArrayIndexOutOfBoundsException{ //호출한 메소드에게 예외를 떠넘긴다
        System.out.println(a[a.length]);
    }
}
