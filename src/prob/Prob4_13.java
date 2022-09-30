package prob;

public class Prob4_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int rand = (int) (Math.random() * 10) + 1;
		String s = "";

		if (rand >= 5) {
			for (int i = 1; i <= rand; i++) {
				s += "★";
			}
			System.out.println(s);
		} else {
			System.out.println("発生した数値：" + rand);
		}

	}

}
