package kitasoft;

import java.util.Scanner;

public class lesson4_21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j || (size - i - 1) == j) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}

}
