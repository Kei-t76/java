//配列

public class prac_4{
    public static void main(String[] args){
        //配列変数の宣言
        int[] score;
        //要素の作成と代入
        score = new int[5];
        //同時に行う
        //int[] score = new int[5];

        //配列の長さ取得
        int kobakos = score.length;
        System.out.println("要素の数: " + kobakos);

        //配列の要素に値を代入
        score[1] = 30;
        System.out.println(score[1]);

        //配列の初期化
        //配列を定義した時点で自動で0が格納される
        System.out.println(score[2]); //0出力 String型はnullが格納される

        //配列作成の省略記法
        //int[] score1 = new int[] {10, 30, 40, 50, 60}
        //int[] score2 = {10, 20, 30, 40 ,50}

        //配列とfor文
        for (int i = 0; i < score.length; i++){
            System.out.println(score[i]);
        }

        //拡張for文, valueにscoreの値が順に格納される
        for (int value : score){
            System.out.println(value);
        }

        //文字列の時は length()
        //配列の時は length

        //多次元配列
        int[][] scores = new int[2][3];
        scores[0][0] = 40;
        



    }
}