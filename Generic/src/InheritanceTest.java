import objectType.Beer;
import objectType.beverage;

import java.util.ArrayList;

public class InheritanceTest {
    public static void main(String[] args) {
        ArrayList<beverage> list1 = new ArrayList<>();
        list1.add(new Beer());

        ArrayList<Beer> list2 = new ArrayList<>();
        list1.add(new Beer());
        
        beverageTest(list1); 
        //beverageTest(list2); //상속관계가 없어서 오류 발생
    }
    
    static void beverageTest(ArrayList<beverage> list){}
}
