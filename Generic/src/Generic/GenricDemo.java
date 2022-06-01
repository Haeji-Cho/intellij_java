package Generic;

import objectType.Beer;

public class GenricDemo {
    public static void main(String[] args) {
        Cup<Beer> c = new Cup<Beer>(); //Beer만 들어갈 수 있는 컵이다.

        c.setBeverage(new Beer());
        Beer b1 = c.getBeverage();

        //c.serBeverage(new Boricha()); //Beer만 들어갈 수 있는 컵이라 보리차는 오류 발생
        b1 = c.getBeverage();
    }
}
