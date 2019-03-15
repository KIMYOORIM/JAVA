import java.util.Random;
import java.util.Scanner;

public class Test_Quiz2 {
	public static void main(String[] args) {
		int computer;
		int user;

		System.out.println("컴퓨터가 가위바위보를 입력해 주세요.");
		Random rand = new Random();
		computer = rand.nextInt(3);
		if (computer == 0) {
			System.out.println("컴퓨터 : 가위");
		} else if (computer == 1) {
			System.out.println("컴퓨터 : 바위");
		} else if (computer == 2) {
			System.out.println("컴퓨터 : 보");

		}

		Scanner scan = new Scanner(System.in);
		System.out.println("사용자가 가위바위보를 입력해주세요.");
		user = scan.nextInt();
		if (user == 0) {
			System.out.println("사용자 : 가위");
		} else if (user == 1) {
			System.out.println("사용자 : 바위");
		} else if (user == 2) {
			System.out.println("사용자 : 보");
		}

		if (computer == user) {
			System.out.println("비겼습니다.");
		} else if (computer == 0 && user == 1) {
			System.out.println("사용자가 이겼습니다.");
		} else if (computer == 0 && user == 2) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else if (computer == 1 && user == 0) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else if (computer == 1 && user == 2) {
			System.out.println("사용자가 이겼습니다.");
		} else if (computer == 2 && user == 0) {
			System.out.println("사용자 이겼습니다.");
		} else if (computer == 2 && user == 1) {
			System.out.println("컴퓨터가 이겼습니다.");

		}

	}

}
