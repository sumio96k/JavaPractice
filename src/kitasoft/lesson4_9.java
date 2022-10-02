package kitasoft;

import java.util.Scanner;

public class lesson4_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		boolean flg = true;
		for (int i = 1; i <= 10; i++) {
			int num = Integer.parseInt(sc.nextLine());
			if (flg == true) {
				x = num;
				flg = false;
			}
			if (x > num) {
				x = num;
			}
			
			if (y <= num) {
				y = num;
			}
			
		}
		System.out.println("最小値 " + x);
		System.out.println("最大値 " + y);

	}

}
