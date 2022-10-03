package kitasoft;

import java.util.Scanner;

public class lesson4_19 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int val = 0;
		int count = 0;
		while (true) {
			int num = Integer.parseInt(sc.nextLine());
			
			if (num == 0) {
				break;
			} else {
				val += num;
				count++;
			}
		}
		System.out.println(val / count);
		
	}

}
