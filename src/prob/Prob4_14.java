package prob;

public class Prob4_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int rand = (int) (Math.random() * 10) + 1;
		String s = "";

		if (rand % 2 == 0) {
			for (int i = 1; i <= rand; i++) {
				s += "★";
			}
			System.out.println(s);
		} else {
			for (int i = 1; i <= rand; i++) {
				s += "☆";
			}
			System.out.println(s);
		}
	}

}
