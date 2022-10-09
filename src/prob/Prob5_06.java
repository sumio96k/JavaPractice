package prob;

public class Prob5_06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int arry[] = new int[10];

		for (int i = 0; i < arry.length; i++) {
			int rand = (int) (Math.random() * 10) + 1;

			arry[i] = rand;

		}
		int max = arry[0];
		int min = arry[0];
		double sum = 0;
		for (int i = 0; i < arry.length; i++) {
			if (i + 1 == arry.length) {
				System.out.println(arry[i] + " ");
			} else {
				System.out.print(arry[i] + " ");
			}

			if (arry[i] > max) {
				max = arry[i];
			}
			if (arry[i] < min) {
				min = arry[i];
			}
			
			sum += arry[i];
			
		}

		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
		System.out.println("平均値：" + (sum / arry.length));
	}

}
