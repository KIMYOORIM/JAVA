import java.util.Scanner;
// 소수체크할 때만 사용. 수정
public class Practice_0325check {
	public void doCheck() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("검사할 숫자를 입력하세요");
		int inputNumber = scanner.nextInt(); // 2부터 숫자-1
		if (inputNumber <1) { //정수가 들어왔는지 체크
			System.out.println("양수만 입력해 주세요");
			return; //결과값 돌려줌.for문 끝내줌 계속 돌리려면 return 사용 x
		}

		boolean isPrimeNumber = true; //둘 중 하나로만 잡아두면돼
		for (int i = 2; i < inputNumber / 2; i++) {
			if (inputNumber % i == 0) {
				// 나머지가 영이면 나눠진거
			isPrimeNumber = false; //한번이라도 나눠지면 false가 출력되게
			break; //한번이라도 나눠졌으면 for문 빠져나오게끔. 
			}
		}

		if (isPrimeNumber) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");

		}
	}
}