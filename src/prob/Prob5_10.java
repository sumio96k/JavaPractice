package prob;

public class Prob5_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arry = new int[7];
		for (int i = 0; i < arry.length; i++) {
			int rand = (int)(Math.random()*10)+1;
			arry[i] = rand;
			System.out.print(arry[i] + " ");
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < arry.length; i++) {
			for (int j = 0; j < arry[i]; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
