import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CountWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        StringTokenizer st = new StringTokenizer(input);

        int count = st.countTokens();
        System.out.println("단어 수: " +count);

        String[] st_array = new String[count];
        for(int i = 0; i < count; i++){
            st_array[i] = st.nextToken();
        }

        Arrays.sort(st_array);

        for(int i = 0; i < count; i++){
            System.out.print(st_array[i] + ", ");
        }

    }
}
