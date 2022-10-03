package kitasoft;

import java.util.Scanner;

public class lesson4_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int x = 0;
		for (int i = 0; i < num; i++) {
			
			System.out.print(x);
			x++;
			if (x > 9) {
				x = 0;
			}
		}
	}

}
