import Generic.Cup;
import objectType.Beer;

public class GenericClass3Demo { //raw타입 필요성
    public static void main(String[] args) {
        Cup c = new Cup();

        c.setBeverage(new Beer());

        Beer beer = (Beer) c.getBeverage();
    }
}
