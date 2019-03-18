import java.util.Random;
import java.util.Scanner;

public class Test_ppt {
	public static void main(String[] args) {
		System.out.print("화면에 주사위를 굴릴까요?");
		String user;
		Scanner dice = new Scanner(System.in);
		user = dice.nextLine();
		int user2;
		user2 = dice.nextInt(7) + 1;

		System.out.print("컴퓨터가 주사위를 굴립니다.실행할까요?");
		String user3;
		Scanner dice3 = new Scanner(System.in);
		user3 = dice3.nextLine();

		int computer;
		Random robot = new Random();
		computer = robot.nextInt(7) + 1;
		System.out.println(computer);

		if (computer > user2) {
			System.out.println("You Lose!");

		} else if (computer < user2) {
			System.out.println("You Win!");
		} else {
			System.out.println("Draw");
		}
	}

}