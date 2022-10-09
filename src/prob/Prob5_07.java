package prob;

public class Prob5_07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int arry[] = new int[5];
		int sum = 0;
		String over = "平均より大きい数：";
		String under = "平均より小さい数：";
		for (int i = 0; i < arry.length; i++) {
			int rand = (int)(Math.random()*10)+1;
			arry[i] = rand;
			System.out.print(arry[i] + " ");
			sum += arry[i];
		}
		for (int i = 0; i < arry.length; i++) {
			if (arry[i] > (sum / arry.length)) {
				over += arry[i] + " ";
			} else if (arry[i] < (sum / arry.length)) {
				under += arry[i] + " ";
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("合計値：" + sum);
		System.out.println("平均値：" + (sum / arry.length));
		System.out.println();
		System.out.println(over);
		System.out.println(under);
		
	}

}
