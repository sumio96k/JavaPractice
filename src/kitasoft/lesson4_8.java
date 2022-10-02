package kitasoft;

import java.util.Scanner;

public class lesson4_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = 0;
		for (int i = 1; i <= 10; i++) {
			int num = Integer.parseInt(sc.nextLine());
			if (x <= num) {
				x = num;
			}
		}
		System.out.println("最大値 " + x);
		
	}

}
