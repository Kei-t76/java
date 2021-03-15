//コメントアウト(//), (/*コメント */)行を分ける場合
//コンパイル: javac (ファイル名) (ファイル名).class ファイルが作成される
//実行: java (ファイル名)

public class prac_1{
    public static void main(String[] args){
        //文字表示, 計算
        System.out.println("Hello World");
        System.out.println("こんにちわ");
        System.out.println(1+1);

        //変数宣言
        int x;
        x = 3;
        System.out.println(x * x * 3.14);

        //整数型
        long worldpeople; worldpeople = 69000000L;
        int salary; salary = 152000;
        short age; age = 18;
        byte glasses; glasses = 2;

        //浮動小数点型
        double height; height = 171.2;
        float weight; weight = 67.5F;

        //真偽値型
        boolean isMarried; isMarried = true;
        boolean result; result = false;

        //文字列 charは一文字, Stringは文字列
        char gender; gender = '男';
        String name; name = "名前";

        //変わってはいけない変数(定数宣言)
        final double TAX = 1.08;
        
    }
}