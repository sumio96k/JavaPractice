package prob;

public class Prob4_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		while (true) {
			int rand = (int)(Math.random()*10)+1;
			System.out.println(rand);
			if (rand == 10) {
				System.out.println("終了します");
				break;
			}
		}
	}

}
