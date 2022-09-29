package prob;

public class Prob3_12 {

	public static void main(String[] args) {
		int rand = (int)(Math.random()*21)-10;
		System.out.println(rand);
		
		if (rand <= 0) {
			System.out.println("負の値です");
		} else {
			System.out.println("正の値です");
		}
		
	}

}
