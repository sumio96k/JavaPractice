package prob;

public class Prob3_01 {

	public static void main(String[] args) {
		int rand = (int) (Math.random() * 10) + 1;
		System.out.println(rand);

		if (rand >= 5) {
			System.out.println("5以上です。");
		}

	}

}
