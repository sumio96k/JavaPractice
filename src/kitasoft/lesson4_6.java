package kitasoft;

import java.util.Scanner;

public class lesson4_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= 10; i++) {
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 0:
				lose++;
				break;
			case 1:
				win++;
				break;
			}
		}
		System.out.println("勝ち " + win + " 回");
		System.out.println("負け " + lose + " 回");
		
	}

}
