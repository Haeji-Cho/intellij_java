import objectType.Cup;
import objectType.boricha;
import objectType.Beer;

public class GenericalClassDemo_cup {
    public static void main(String[] args) {
        Cup c = new Cup();

        c.setBeverage(new Beer());
        Beer b1 = (Beer) c.getBeverage(); //type형 변환

        c.setBeverage(new boricha());
        //b1 = (Beer) c.getBeverage(); //오류 발생
    }
}

//실행 중에 컵에 어떤 음료가 들었는지 모르기때문에 문제가 발생할 수 있디.