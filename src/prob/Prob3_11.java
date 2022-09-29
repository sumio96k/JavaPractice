package prob;

public class Prob3_11 {

	public static void main(String[] args) {
		int rand = (int)(Math.random()*100)+1;
		System.out.println(rand);
		
		if (rand >= 20 && rand <= 80) {
			System.out.println("20以上80未満です");
		} else {
			System.out.println("20未満か、80以上です");
		}
	}

}
