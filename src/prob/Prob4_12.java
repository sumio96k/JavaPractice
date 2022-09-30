package prob;

public class Prob4_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 100;
		
		for (int i = 1; i <= 5; i++) {
			
			int rand = (int)(Math.random()*100)+1;
			System.out.println(rand);
			if (num > rand) {
				num = rand;
			}
		}
		System.out.println("最小値は：" + num);
	}

}
