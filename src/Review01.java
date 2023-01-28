
public class Review01 {

    public static void main(String[] args) {
        //商品価格入力
        int price = 1500;

        //税率入力
        double zeiritu = 0.1;

        //消費税価格定義
        int result;

        //taxメソッドに以降
        result = tax(price, zeiritu);

        //税込み料金に計算
        int total = price + result;

        //出力
        System.out.println(price + "円の商品の税込価格は" + total + "円（消費税は" + result + "円）です。 ");

    }
        //taxメソッド　整数で返す
    public static int tax(int price, double zeiritu) {

        //キャストしてメインに戻す
        int result = (int) (price * zeiritu);
        return result;
    }

}
