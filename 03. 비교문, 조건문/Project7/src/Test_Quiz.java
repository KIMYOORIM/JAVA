import java.util.Random;
import java.util.Scanner;

public class Test_Quiz {
	public static void main(String[] args) {

		Scanner stone = new Scanner(System.in);
		int num;
		System.out.println("가위바위보 : ");
		num = stone.nextInt(3);

		if (num == 0)
			System.out.println("가위");
		else if (num == 1)
			System.out.println("바위");
		else
			System.out.println("보");

		System.out.println(num);

		Random rand = new Random();
		int num2 = rand.nextInt(3);
		if (num2 == 0)
			System.out.println("가위");
		else if (num2 == 1)
			System.out.println("바위");
		else
			System.out.println("보");

		if (num > num2)
			System.out.println("num이 이겼습니다.");

		else if (num < num2)
			System.out.println("num2가 이겼습니다.");
		else
			System.out.println("비겼습니다.");
	}
}
