import java.util.Calendar;

import static java.util.Arrays.sort;

public class staticImport와no {
    public static void main(String[] args) {
        int [] data = {3, 4, 1, 7};

        sort(data);
        System.out.println(Calendar.JANUARY);


        Calendar.getInstance();
    }
}
