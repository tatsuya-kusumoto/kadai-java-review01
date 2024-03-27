
public class Review01 {

    public static void main(String[] args) {
        int price = 1500; // 商品価格
        int tax = tax(price); // 消費税
        int taxInclPrice = price + tax; // 税込価格
        System.out.println(price + "円の商品の税込価格は" + taxInclPrice + "円（消費税は" + tax + "円）です。");

    }

    public static int tax(int money) {
        double taxRate = 0.1; // 税率(10%)
        int result = (int) (money * taxRate);
        return result;
    }

}
