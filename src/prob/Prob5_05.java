package prob;

public class Prob5_05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] data = new int[10];
		String sanbai = "3の倍数は：";
		String sonota = "3の倍数以外は：";
		for (int i = 0; i < data.length; i++) {
			int rand = (int)(Math.random()*10)+1;
			data[i] = rand;
			
			if (i + 1 == data.length) {
				System.out.println(rand + " ");
			} else {
				System.out.print(rand + " ");
			}
			
			if (rand % 3 == 0) {
				sanbai += data[i] + " ";
			} else {
				sonota += data[i] + " ";
			}
		}
		System.out.println(sanbai);
		System.out.println(sonota);
	}

}
