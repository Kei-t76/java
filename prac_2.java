public class prac_2{
    public static void main(String[] args){
        //変数宣言と計算
        int a;
        int b;

        a = 20;
        b = a + 5;

        System.out.println(a);
        System.out.println(b);

        //整数リテラルの先頭に0x, 0, 0bをつけると16, 8, 2進数になる, 任意の場所に'_'が入れれる
        int c = 0x11;
        int d = 0b0011;

        //エスケープシーケンス
        /* ¥", ¥', ¥¥, ¥n(改行)
        例: 金額を入力する時 ¥¥1200 */

        //文字列の結合
        System.out.println("こん" + "にちは");

        //インクリメント, デクリメント
        //先に
        a++;
        b--;
        //後から
        ++a;
        --b;

        //型変換
        //キャスト
        int age = (int) 3.2;
        System.out.println(age);

        //命令実行文
        //画面出力
        System.out.println("こんにちは");
        //改行なしの画面出力
        System.out.print("改行なしの文");
        //2値を比較して大きい方を代入する
        int m = Math.max(5,3);
        System.out.println(m + "のほうが大きいです");
        //文字列を数字に変換する
        String w = "31";
        int n = Integer.parseInt(w);
        System.out.println("来年"+ (n + 1) + "歳です");
        //乱数生成
        //0以上指定値未満のランダムな値を生成
        int r = new java.util.Random().nextInt(90);
        System.out.println(r);
        //キーボードからの入力を受け取る
        System.out.println("あなたの名前を入力してください");
        //一行の文字列を受け取る
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください");
        //一つの整数を受け取る
        int old = new java.util.Scanner(System.in).nextInt();

        System.out.println("ようこそ" + old + "歳の" + name + "さん");


    }
}