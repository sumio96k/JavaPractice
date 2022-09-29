package prob;

public class Prob3_18 {

	public static void main(String[] args) {
		int rand = (int)(Math.random()*36)-10;
		System.out.println("摂氏"+ rand +"度");
		
		if (rand >= 30) {
			System.out.println("真夏日です。");
		} else if (rand < 30 && rand >= 25) {
			System.out.println("夏日です。");
		} else if (rand < 0) {
			System.out.println("真冬日です。");
		}
	}

}
