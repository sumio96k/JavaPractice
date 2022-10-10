package prob;

public class Prob5_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int arry[][] = new int[3][3];
		for (int i = 0; i < arry.length; i++) {
			for (int j = 0; j < arry[i].length; j++) {
				int rand = (int)(Math.random()*10);
				arry[i][j] = rand;
				System.out.print(arry[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
