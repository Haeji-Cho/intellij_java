import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        for(int i = 0; i < 5; i ++)
            System.out.print(r.nextInt(100)+ " "); //100안에서 random 수 5ㄱㅐ 출력
    }
}
