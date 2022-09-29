package prob;

public class Prob3_02 {
	public static void main(String[] args) {
		int rand = (int)(Math.random()*10)+1;
		System.out.println(rand);
		
		if (rand != 1) {
			System.out.println("1ではありません");
		}
	}
}
