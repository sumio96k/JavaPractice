package prob;

public class Prob5_08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arry = new int[5];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for (int i = 0; i < arry.length; i++) {
			int rand = (int)(Math.random()*21)-10;
			arry[i] = rand;
			System.out.print(arry[i] + " ");
			if (arry[i] > 0) {
				count1++;
			} else if (arry[i] < 0) {
				count2++;
			} else {
				count3++;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("0より大きい数：" + count1 + "個");
		System.out.println("0より小さい数：" + count2 + "個");
		System.out.println("0の個数：" + count3 + "個");
	}

}
