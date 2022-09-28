package practice;

public class Practice {
	public static void main(String[] args) {
		int i = 0;
		int val = 0;
		for (int num = 1; num <= 10; num++) {
			if (num % 2 == 0) {
				i++;
				System.out.println(num);
				val += num;
			}
		}
		System.out.println("偶数の数は"+i);
		System.out.println("偶数の合計は"+ val);
		
		for (int num = 1; num <= 10; num++) {
			if (num < 10) {
				System.out.print(num+",");
			} else {
				System.out.println(num);
			}
			
		}
		
		int[] arry = new int[20];
		
		for (int f = 1; f < arry.length; f++) {
			arry[f] = arry[f-1] + 5;
		}
		
		for (int f = 0; f < arry.length; f++) {
			if (f <= 10) {
				if (arry[f] % 2 != 0) {
					System.out.println(arry[f] + ",");
				} else {
					System.out.println(arry[f]);
				}
				
			} else {
				if (arry[f] % 2 == 0) {
					System.out.println(arry[f] + ",");
				} else {
					System.out.println(arry[f]);
				}
			}
		}
		
	}
}
