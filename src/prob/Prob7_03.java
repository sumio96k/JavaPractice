package prob;

public class Prob7_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Calculation c = new Calculation();
        c.setNumber1(8);    //  一つ目の数をセット
        c.setNumber2(9);    //  二つ目の数をセット
        //  二つの数の和を表示
        System.out.println(c.getNumber1() + " + " + c.getNumber2() + " = " + c.add());
        //  二つの数の差を表示
        System.out.println( c.getNumber1() + " - " + c.getNumber2() + " = " + c.sub());
	}

}
