package kitasoft;

import java.util.Scanner;

public class lesson4_20 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		String $ = "$";
		for (int i = 1; i <= size; i++) {
			System.out.println($);
			$ += "$";
		}
	}

}
