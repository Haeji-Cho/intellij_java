public class divisorDemo {
    public static void main(String[] args) {
        int divided = 10;

        try{
            int divisor = Integer.parseInt(args[0]);
            System.out.println(divided/divisor);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("오류1");
        }catch (NumberFormatException e){
            System.out.println("오류2");
        }catch (ArithmeticException e){
            System.out.println("오류3");
        }finally {
            System.out.println("항상");
        }
        System.out.println("종료");
    }
}


