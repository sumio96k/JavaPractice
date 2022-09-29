package prob;

public class Prob3_14 {

	public static void main(String[] args) {
		int rand1 = (int)(Math.random()*10)+1;
		System.out.println(rand1);
		
		int rand2 = (int)(Math.random()*10)+1;
		System.out.println(rand2);
		
		int a = rand1;
		int b = rand2;
		
		if (a > b) {
			System.out.println("aのほうが大きいです。");
		} else if (a < b){
			System.out.println("bのほうが大きいです。");
		} else {
			System.out.println("等しいです");
		}
	}

}
