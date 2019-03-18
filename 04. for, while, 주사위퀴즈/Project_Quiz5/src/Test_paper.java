import java.util.Random;

public class Test_paper {
	public static void main(String[] args) {

		int dice;
		Random dice2 = new Random();
		System.out.println("주사위를 굴려주세요");
		dice = dice2.nextInt(100);
		dice = dice % 6;
		dice = dice++;
		// 6으로 나눴을 때 나머지는 0~5까지밖에 안나오기 때문에 가능.

		if (dice == 1) {
			System.out.println("멍멍");
		} else if (dice == 2) {
			System.out.println("야옹");
		} else {
			System.out.println(dice);
		}
	}
}
