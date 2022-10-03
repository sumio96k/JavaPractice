package kitasoft;

public class lesson4_17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 9) {
					System.out.println(i + "*" + j + "=" + (i * j));
				} else {
					System.out.print(i + "*" + j + "=" + (i * j));
				}
				
			}
		}
	}

}
