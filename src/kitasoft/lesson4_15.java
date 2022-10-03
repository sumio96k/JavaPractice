package kitasoft;

import java.util.Scanner;

public class lesson4_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String sosu = "";
		int n = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				n++;
			} 
		}
		if (n == 2) {
			sosu = "素数です";
		} else {
			sosu = "素数ではありません";
		}
		System.out.println(sosu);
	}

}
