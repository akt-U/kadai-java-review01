
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        double zeiritu = 0.1;
        double result;
        result = taxmethod(price, zeiritu);
        double total = price + result;
        System.out.println(price + "円の商品の税込み価格は" + Math.floor(total) + "円（消費税は" + Math.floor(result) + "円）です。 ");

    }
    public static double taxmethod(double price, double zeiritu) {
        double result = price * zeiritu;
        return result;
    }

}
