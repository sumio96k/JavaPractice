package kitasoft;

import java.util.Scanner;

public class lesson4_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int st = 0;
		int ball = 0;
		while (true) {
			System.out.println("ストライク=1 or ボール=2 or ファウル=3 ?");
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				st++;
				break;
			case 2:
				ball++;
				break;
			case 3:
				if (st < 2) {
					st++;
				}
				break;
			}
			if (st == 3 || ball == 4) {
				break;
			}
		}
		System.out.println(ball + "ボール," + st + "ストライク");
	}

}
