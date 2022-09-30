package prob;

public class Prob4_2 {

	public static void main(String[] args) {
		int rand = (int)(Math.random()*10)+1;
		System.out.println("数：" + rand);
		int i = 1;
		while (i <= rand) {
			i++;
			System.out.print("■");
		}
	}

}
