package prob;

public class Prob4_3 {

	public static void main(String[] args) {
		int rand = (int)(Math.random()*10)+1;
		System.out.println("数：" + rand);
		int i = 1;
		 do {
			i++;
			System.out.print("■");
		} while (i <= rand);
	}

}
