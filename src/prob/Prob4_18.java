package prob;

public class Prob4_18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		for (int i = 1; i <= 10; i++) {
			String box1 = "";
			String box2 = "";
			for (int j = i - 1 ; j >= 1; j--) {
				box1 += "■";
			}
			for (int j = 10 - i; j >= 1; j--) {
				box2 += "■";
			}
			box1 += "□";
			System.out.print(box1);
			System.out.println(box2);
			
		}
	}

}
