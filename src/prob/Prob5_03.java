package prob;

public class Prob5_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = new int[10];
		String odd = "奇数は：";
		String even = "偶数は：";
		for (int i = 0; i < data.length; i++) {
			int rand = (int)(Math.random()*100)+1;
			data[i] = rand;
			
			if (i + 1 == data.length) {
				System.out.println(rand + " ");
			} else {
				System.out.print(rand + " ");
			}
			
			if (rand % 2 != 0) {
				odd += data[i] + " ";
			} else {
				even += data[i] + " ";
			}
		}
		System.out.println(odd);
		System.out.println(even);
	}

}
