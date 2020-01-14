//コードのアーカイブ場所
public class Sub {
    public static void main(String[] args) {
        int money = 100;
        money ++; //money に1足す演算
        System.out.println("所持金は" + money + "円です");

        System.out.print("ねむ"); //改行されないprint
        System.out.println("たい・・・");

        int low = 10;
        int high = 11;
        int high_and_low = Math.max (low , high); //どっちの方が数が大きいのか比べる命令
        System.out.println(low + "と" + high + "を比べて、大きいのは" + high_and_low + "！！");

        String age_string = "28";
        int age_int = Integer.parseInt (age_string); //String型をint型に変換
        System.out.println("私は12回目の" + ++age_int + "才になりました！");

        int random = new java.util.Random().nextInt(10000); //乱数を呼び出す命令
        System.out.println("私はキン消しを" + ++random + "個持ってます！");

        System.out.println("名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine(); //入力した文字をString型で保存する命令
        System.out.println("年齢を入力してください");
        int age = new java.util.Scanner(System.in).nextInt(); //入力した数字をint型で保存する命令
        System.out.println(age + "歳の" + name + "君！！君の個人情報はGoogleに売ったよ！");

        System.out.println("true か false を入力してね！");
        boolean if_sentaku = new java.util.Scanner(System.in).nextBoolean();
        if (if_sentaku == true) { //入力した文字がtrue だったらゲームクリア
            System.out.println("おめでとう！！ゲームクリア！！");
        } else { //false だったらゴミみたいな扱いに
            System.out.println("雑魚が・・・");
        }

        if_sentaku = new java.util.Scanner(System.in).nextBoolean();
        while (if_sentaku == true) { //true を選択すると、陽キャに永遠絡まれる
            System.out.println("うぇ〜いwwwwwww");
            System.out.println("うぇ〜いwwwwwww");
        }

        boolean if_int_test = true;
        if (if_int_test == true) {
            int if_int = 10;
            System.out.println(if_int);
        } else {
            System.out.println("このメッセージは表示されないはずだよ");
        }
        //System.out.println( if_int ); //ifなどの中でintなどの変数を作っても、ifを抜けたらその変数は消滅する

        System.out.println("パスワードを入力してください");
        String string_if_test = new java.util.Scanner(System.in).nextLine();
        if (string_if_test.equals("test")) { // 変数名.equals("文字") でパスワードのようなものが作れる
            System.out.println("なんで分かるんあんた・・・");
        } else {
            System.out.println("パスワードが間違っています");
        }

        int[] score; //intがいっぱい入る可能性がある箱を制作
        score = new int[5]; //intの箱には0~4の番地を作った (箱の数は５個)
        score[4] =19; //int箱4番地(５番目)に１９を代入
        int score_check = score.length; //箱の名前.lengthで箱の数を調べられる
        System.out.println(score_check);
        System.out.println(score[4]);
        System.out.println(score[0]); //代入していなくても0がデフォルトではいっている
        int[] score1 = new int[] { 10, 30, 50 }; //省略法は２個ある
        int[] score2 = { 20, 30, 40 }; //こっちの方が入力が少ないし分かりやすいと思う

        int[] custom_for_value_test = { 12, 121, 241, 5252, 32 };
        for (int value : custom_for_value_test) { //基本配列の表示にしようするみたい？
            System.out.println(value);            //別の使い方、使い道がわからない
        }

        String word_length_check = "明太子と共生していたPresley";
        System.out.println(word_length_check.length()); //String変数.length で文字の長さを図る命令

        int [] [] number_box_1 = new int [3] [3]; //3x3の数字の箱を用意
        number_box_1 [0] [0] = 10; //左上から右下にかけて入れていっている
        number_box_1 [0] [1] = 20;
        number_box_1 [0] [2] = 30;
        number_box_1 [1] [0] = 40;
        number_box_1 [1] [1] = 50;
        number_box_1 [1] [2] = 60;
        number_box_1 [2] [0] = 70;
        number_box_1 [2] [1] = 80;
        number_box_1 [2] [2] = 90;
        System.out.println(number_box_1 [1] [1]); //使い道は、マインスイーパーや○✖︎ゲームなど、二次元の箱を開けたりする時に使いそう

        int [] [] number_box_2 = { { 10, 20, 30 }, { 40, 50 }, { 60, 70, 80 } };
        //今配列は、
        //■ ■ ■
        // ■ ■
        //■ ■ ■
        //こうなっている
        System.out.println(number_box_2.length);
        //これは、
        //■ ■ ■ 1
        // ■ ■ 2
        //■ ■ ■ 3
        //と横の列が何個あるのかを調べている
        System.out.println(number_box_2[0].length);
        //これは、
        //1 2 3
        //■ ■ ■
        // ■ ■
        //■ ■ ■
        //と一列目に数字が何個あるのかを調べている
        System.out.println(number_box_2[1].length);
        //これは、
        //■ ■ ■
        // 1 2
        // ■ ■
        //■ ■ ■
        //と二列目に数字が何個あるのかを調べている
    }
}
