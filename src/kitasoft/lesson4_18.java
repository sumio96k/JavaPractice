package kitasoft;

import java.util.Scanner;

public class lesson4_18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int val = 0;
		while (true) {
			int num = Integer.parseInt(sc.nextLine());
			val += num;
			if (num == 0) {
				break;
			}
		}
		System.out.println(val);
		
	}

}
