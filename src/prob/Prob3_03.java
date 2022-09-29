package prob;

public class Prob3_03 {
	public static void main(String[] args) {
		int rand = (int)(Math.random()*100)+1;
		System.out.println(rand);
		
		if (rand < 50) {
			System.out.println("50未満です");
		}
	}
}
