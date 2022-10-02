package kitasoft;

import java.util.Scanner;

public class lesson4_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int kyojin = 0;
		int hanshin = 0;
		for (int i = 1; i <= 9; i++) {

			System.out.print(i + "回表、巨人の得点は？");
			kyojin += Integer.parseInt(sc.nextLine());

			System.out.print(i + "回裏、阪神の得点は？");
			hanshin += Integer.parseInt(sc.nextLine());

		}
		System.out.println("巨人；" + kyojin + "点, 阪神：" + hanshin + "点");
		if (kyojin > hanshin) {
			System.out.println("巨人の勝ち");
		} else if (kyojin < hanshin) {
			System.out.println("阪神の勝ち");
		} else {
			System.out.println("引き分け");
		}
	}

}
