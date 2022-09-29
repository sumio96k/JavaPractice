package prob;

public class Prob3_16 {

	public static void main(String[] args) {
		int rand = (int)(Math.random()*100)+1;
		System.out.println(rand);
		
		if (rand % 2 == 0) {
			if (rand % 3 == 0 ) {
				System.out.println("2と3の公倍数です。");
			} else {
				System.out.println("2の倍数です。");
			}
			
		} else if (rand % 3 == 0) {
			System.out.println("3の倍数です。");
		}
	}

}
