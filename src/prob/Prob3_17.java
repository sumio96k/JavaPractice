package prob;

public class Prob3_17 {

	public static void main(String[] args) {
		int rand = (int)(Math.random()*100)+1;
		System.out.println(rand);
		
		if (rand <= 50) {
			if (rand % 2 == 0) {
				System.out.println("50以下の偶数です。");
			} else {
				System.out.println("50以下です。");
			}
		} else {
			if (rand % 2 == 0) {
				System.out.println("偶数です。");
			}
		}
	}

}
