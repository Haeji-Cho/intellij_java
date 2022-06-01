public class TryCathDemo {
    public static void main(String[] args) {
        int[] array = {0, 1, 2};

        try{
            System.out.println(array[3]);
            System.out.println(array[0]); //오류가 나오면 바로 exeption으로 넘어가서 array[0]문장은 실행이 안된다.
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("오류");
        }
        System.out.println("웁스스");
   }
}
