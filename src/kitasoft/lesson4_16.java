package kitasoft;

import java.util.Scanner;

public class lesson4_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		for (int i = 2; num > 1; i++) {
			while (num % i == 0) {
				System.out.println(i);
				num /= i;
			}
		}

	}

}
