public class DateNullPointTest {
    public static void main(String[] args) {
        MyDate d = null;

        try {
            System.out.printf("%d년 %d월 %d일\n", d.y, d.m, d.day);
        }catch (Exception e){
            d = new MyDate(2035, 12, 25);
            System.out.printf("%d년 %d월 %d일\n", d.y, d.m, d.day);
        }
    }
}

class MyDate{
    int y, m, day;

    public MyDate(int y, int m, int day) {

        this.y = y;
        this.m = m;
        this.day = day;
    }
}
