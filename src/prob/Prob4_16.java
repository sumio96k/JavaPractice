package prob;

public class Prob4_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int k = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				k = i * j;
				if (j == 9) {
					System.out.println(i + "*" + j + "=" + k + " ");
				} else {
					System.out.print(i + "*" + j + "=" + k + " ");
				}
				
			}
		}
	}

}
