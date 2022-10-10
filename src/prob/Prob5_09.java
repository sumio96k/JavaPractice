package prob;

public class Prob5_09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arry = new int[10];
		String over = "50以上の数：";
		String under = "50未満の数：";
		for (int i = 0; i < arry.length; i++) {
			int rand = (int)(Math.random()*101);
			arry[i] = rand;
			System.out.print(arry[i] + " ");
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < arry.length; i++) {
			if (arry[i] >= 50) {
				over += arry[i] + " ";
			} else {
				under += arry[i] + " ";
			}
		}
		System.out.println(over);
		System.out.println(under);
	}

}
