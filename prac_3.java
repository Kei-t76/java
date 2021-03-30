//条件分岐と繰り返し
public class prac_3{
    public static void main(String[] args){

        //条件分岐
        boolean tenki = true;
        if(tenki == true){
            System.out.println("洗濯をします");
            System.out.println("散歩に行きます");
        }else{
            System.out.println("DVDを見ます");
        }

        //繰り返し
        boolean doorClose = true;
        int loop = 0;
        while(doorClose == true){
            System.out.println("ノックする");
            System.out.println("1分待つ");
            loop ++;
            if(loop == 10){
                break;
            }
        }

        //文字列の比較
        //if(s.equals("夕日")){}

        //and演算
        //if(age >= 18 && gender ==1){}

        //or演算
        //(name.equals("鈴木") || married == true){}

        //否定演算子
        //if(!(age == 10)){}

        //switch文
        //左辺と右辺が一致するかのみを比較する(!=, <, >は使わない)
        //breakを書かないと次のcaseも実行する

        System.out.println("あなたの運勢を占います");
        int fortune = 1;

        switch (fortune) {
            case 1:
                System.out.println("大吉");
                break;
            case 2:
                System.out.println("中吉");
                break;
            case 3:
                System.out.println("吉");
                break;
            default:
                System.out.println("凶");
                break;
        }

        //2種類のwhile文
        //while(条件式){} ブロックを実行する前に条件を評価
        //do{}while(条件式); ブロックを実行後に条件を評価

        //for文

        for(int i = 0; i < 10; i++){
            System.out.println("こんにちは");
            System.out.println("現在" + (i + 1) + "周目→");
        }

        //制御構造のネスト

        //2重for文で九九
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.print(i * j);
                System.out.print(" "); //空白
            }
            System.out.println(""); //改行
        }

        //break文: 繰り返し自体を中断
        //contibue文: 今回の周だけ中断し, 次の周へ進める

        //無限ループ
        //while(true){}
        //for(;;){}




    }
}