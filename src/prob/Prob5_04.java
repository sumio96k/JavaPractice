package prob;

public class Prob5_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = new int[10];
		String upper = "50以上の数は：";
		String under = "50未満の数は：";
		for (int i = 0; i < data.length; i++) {
			int rand = (int)(Math.random()*100)+1;
			data[i] = rand;
			
			if (i + 1 == data.length) {
				System.out.println(rand + " ");
			} else {
				System.out.print(rand + " ");
			}
			
			if (rand >= 50) {
				upper += data[i] + " ";
			} else {
				under += data[i] + " ";
			}
		}
		System.out.println(upper);
		System.out.println(under);
	}

}
