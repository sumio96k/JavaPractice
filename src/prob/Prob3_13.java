package prob;

public class Prob3_13 {

	public static void main(String[] args) {
		int rand = (int) (Math.random() * 3) + 1;
		System.out.println(rand);

		switch (rand) {
		case 1:
			System.out.println("グー");
		case 2:
			System.out.println("パー");
		case 3:
			System.out.println("チョキ");
		}
	}

}
