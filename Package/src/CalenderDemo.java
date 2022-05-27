import java.util.Calendar;
import java.util.Date;

public class CalenderDemo {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        Calendar c = Calendar.getInstance();
        System.out.println(c);

        System.out.println(c.get(Calendar.HOUR_OF_DAY)); //ctrl + space를 누르고 원하는 값을 선택할 수 있다.
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.MONTH)+1); //month는 1을 더해줘야 한다.
    }
}
