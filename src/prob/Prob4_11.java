package prob;

public class Prob4_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 0;
		for (int i = 1; i <= 5; i++) {
			int rand = (int)(Math.random()*100)+1;
			System.out.println(rand);
			if (num < rand) {
				num = rand;
			}
		}
		System.out.println("最大値：" + num);
	}

}
