package kitasoft;

import java.util.Scanner;

public class lesson4_22 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int fibo1 = 0;
		int fibo2 = 1;
		int fibo = 0;
		for (int i = 0; i < num; i++) {
			if (i == 0 || i ==1) {
				System.out.print(i + ", ");
			} else {
				fibo1 = fibo2;
				fibo2 = fibo;
				fibo = fibo1 + fibo2;
				
				System.out.print(fibo + ", ");
			}
		}
	}

}
