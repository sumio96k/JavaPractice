package prob;

public class Prob5_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] arry = new int[5];
		String s1 = "0以上60未満：";
		String s2 = "60以上80未満：";
		String s3 = "80以上：";
		for (int i = 0; i < arry.length; i++) {
			int rand = (int)(Math.random()*100)+1;
			arry[i] = rand;
			System.out.print(arry[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < arry.length; i++) {
			if (arry[i] >= 0 && arry[i] < 60) {
				s1 += arry[i] + " ";
			} else if (arry[i] >= 60 && arry[i] < 80) {
				s2 += arry[i] + " ";
			} else {
				s3 += arry[i] + " ";
			}
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
