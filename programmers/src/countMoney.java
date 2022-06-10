public class countMoney {
    public static void main(String[] args) {
        Solution s = new Solution(3, 40, 5);
        s.show();
    }
}

class Solution{
    int price;
    int money;
    int count;
    int result = 0;

    public Solution(int price, int money, int count) {
        this.price = price;
        this.money = money;
        this.count = count;
        for(int i = 0; i < count; i++) {
            price = price * (count + 1);
            result += price;
        }
        result = money - result;
    }
    void show(){
        System.out.println(result);
    }




}