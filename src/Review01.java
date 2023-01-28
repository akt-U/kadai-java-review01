
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        double zeiritu = 0.1;
        int result;
        result = tax(price, zeiritu);
        int total = price + result;
        System.out.println(price + "円の商品の税込価格は" + total + "円（消費税は" + result + "円）です。 ");

    }
    public static int tax(int price, double zeiritu) {
        int result = (int) (price * zeiritu);
        return result;
    }

}
