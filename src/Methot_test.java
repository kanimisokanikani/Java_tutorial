public class Methot_test {
    public static void main (String[] args){
        method_test_1 (); //method_test_1 という名前のメソッドを呼び出す
        method_test_2 ("わし"); //method_test_2 という名前のメソッドを呼び出して、nameにわしを入れる
        method_test_2 ("わだす");
        method_test_2 ("わい");
        method_test_2 ("わて");
        method_test_3 (300, 200); //method_test_3 という名前のメソッドを呼び出して、xに300を yに200を入れる
        //int test_test = 400        mainで作った変数は、メソッドに持ち越しなどはできない
    }
    public static void method_test_1 () { //method_test_1 と言う名前のメソッドを作っておき、カッコ内に処理を書く
        System.out.println("test");
    }
    public static void method_test_2 (String name) {    //メソッドを呼び出す時、カッコに文字を入力していると、
        System.out.println("ぼくは " + name + " だよ！"); //String型で自動的に入力される
    }
    public static void method_test_3 (int x, int y) {
        int answer = x + y; //answer変数はこのメソッドを終えたら使えなくなる (消滅する)
        System.out.println( x + "+" + y + "=" + answer );
        //System.out.println( test_test );   mainの変数はもってこれないので、エラーが出る
    }
}
