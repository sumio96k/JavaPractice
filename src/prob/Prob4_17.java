package prob;

public class Prob4_17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String box1 = "";

		for (int i = 1; i <= 10; i++) {
			box1 += "■";
			String box2 = "";
			for (int j = 10 - i; j >= 1; j--) {
				box2 += "□";
			}
			System.out.print(box1);
			System.out.println(box2);
			
		}
	}

}
