package prob;

public class Prob3_15 {

	public static void main(String[] args) {
		int rand = (int)(Math.random()*100)+1;
		System.out.println("点数：" + rand);
		
		if (rand >= 80) {
			System.out.println("優");
		} else if (rand < 80 && rand >= 70) {
			System.out.println("良");
		} else if (rand < 70 && rand >= 60) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
	}

}
