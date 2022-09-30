package prob;

public class Prob4_01 {

	public static void main(String[] args) {
		int rand = (int)(Math.random()*10)+1;
		System.out.println("数：" + rand);
		
		for (int i = 1; i <= rand; i++) {
			System.out.print("■");
		}
	}

}
