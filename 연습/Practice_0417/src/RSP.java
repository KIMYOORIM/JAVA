//컴퓨터랑 사람이랑 가위바위보 할건데 사용자는 문자로 쓸거야 비교해서 출력해봐
import java.util.Random;
import java.util.Scanner;


public class RSP {
	public static void main(String[] args) {
		int com;
		String user;

		// 컴퓨터 랜덤
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("진행하려면 엔터를 누르세요 ");
		scan.nextLine();
		System.out.println("컴퓨터 차례입니다.");
		com = rand.nextInt(3);
		String comString = null; // null 로 공간을 만들어준다. 한것과 안한거 둘 다 해보기
		if (com == 0) {
			comString = "가위";
		} else if (com == 1) {
			comString = "바위";
		} else if (com == 2) {
			comString = "보";
		}
		System.out.println("컴퓨터 : " + comString);

		// 사용자 입력

		String userString = null;
		System.out.println("사용자 차례입니다.턴을 진행하려면 엔터를 누르고 입력하세요.");
		scan.nextLine();
		userString = scan.nextLine();
		System.out.println("사용자 : " + userString);

		if (comString.equalsIgnoreCase(userString)) {
			System.out.println("비겼습니다.");
		} else if (comString.equalsIgnoreCase("가위") && userString.equalsIgnoreCase("바위")) {
			System.out.println("사용자가 이겼습니다.");
		} else if (comString.equalsIgnoreCase("가위") && userString.equalsIgnoreCase("보")) {
			System.out.println("사용자가 졌습니다.");
		} else if (comString.equalsIgnoreCase("바위") && userString.equalsIgnoreCase("가위")) {
			System.out.println("사용자가 졌습니다.");
		} else if (comString.equalsIgnoreCase("바위") && userString.equalsIgnoreCase("보")) {
			System.out.println("사용자가 이겼습니다.");
		} else if (comString.equalsIgnoreCase("보") && userString.equalsIgnoreCase("가위")) {
			System.out.println("사용자가 이겼습니다.");
		} else if (comString.equalsIgnoreCase("보") && userString.equalsIgnoreCase("바위")) {
			System.out.println("사용자가 졌습니다.");
		}

	}
}
