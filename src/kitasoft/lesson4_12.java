package kitasoft;

import java.util.Scanner;

public class lesson4_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int val = 0;
		while (true) {
			int num = Integer.parseInt(sc.nextLine());
			val += num;
			if (val > 100) {
				break;
			}
		}
		System.out.println(val);
	}

}
