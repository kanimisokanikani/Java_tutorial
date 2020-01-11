public class Sub {
    public static void main(String[] args) {
        int money = 100;
        money ++; //money に1足す演算
        System.out.println("所持金は" + money + "円です");
        System.out.print("うんち！！"); //改行されないprint
        System.out.println("ぶりゅりゅ！www");
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
        String name =new java.util.Scanner(System.in).nextLine(); //入力した文字をString型で保存する命令
        System.out.println("年齢を入力してください");
        int age =new java.util.Scanner(System.in).nextInt(); //入力した数字をint型で保存する命令
        System.out.println(age + "歳の" + name + "君！！君の個人情報はGoogleに売ったよ！");
        System.out.println("true か false を入力してね！");
        boolean if_sentaku =new java.util.Scanner(System.in).nextBoolean();
        if (if_sentaku == true) { //入力した文字がtrue だったらゲームクリア
            System.out.println("おめでとう！！ゲームクリア！！");
        } else { //false だったらゴミみたいな扱いに
            System.out.println("雑魚が・・・");
        }
    }
}
