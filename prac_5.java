//メソッド
public class prac_5{
    //mainメソッドの定義
    public static void main(String[] args){
        System.out.println("メソッドを呼び出します");
        hello();
        hello_name("john");
        add(100, 20);
        System.out.println(sub(100, 20));
        int[] array = {1, 2, 3};
        printArray(array);

        int[] array_2 = makeArray(7);
        for (int i : array_2){
            System.out.println(i);
        }
        System.out.println("メソッドの呼び出しが終わりました");
    }


    //helloメソッドの定義
    public static void hello(){
        System.out.println("こんにちは");
    }

    //引数渡し
    public static void hello_name(String name){
        System.out.println(name + "さん、こんにちは");
    }

    //複数の引数渡し
    public static void add(int x, int y){
        int ans = x + y;
        System.out.println(x + "+" + y + "=" + ans);
    }  
    
    //渡す値: 実引数
    //受け取る値: 仮引数

    //戻り値の利用　
    public static int sub(int x, int y){
        int ans = x - y;
        return ans;
    }

    //オーバーロード
    /*同じ名前のメソッドを定義する, (引数の型が異なる, 引数の数が異なる, 
    引数の並び順が異なる(シグネチャが重複しない場合にのみ許される))*/

    //引数に配列を用いる
    //int型配列を受け取り, 全ての要素を表示するメソッド
    public static void printArray(int[] array){
        for(int element : array){
            System.out.println(element);
        }
    }

    //配列をメソッドで渡すと呼び出し先で書き換えられた値がreturnを使わなくても呼び出し元に影響する
    //引数としてアドレスを渡してるから

    //戻り値に配列を用いる
    public static int[] makeArray(int size){
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = i;
        }
        return newArray;
    }

    //コマンドライン引数
    //public static void main(Static[] args)
    //mainメソッドは文字列を受けとるように定義されている
    //プログラム起動時に追加情報を指定できる(コマンドライン引数)
    //




}