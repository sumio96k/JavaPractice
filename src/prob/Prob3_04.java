package prob;

public class Prob3_04 {

	public static void main(String[] args) {
		int rand = (int)(Math.random()*100)+1;
		System.out.println(rand);
		
		if (rand <= 10 || rand >= 90) {
			System.out.println("10以下か90以上の値です");
		}
	}

}
