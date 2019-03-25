import java.util.Scanner;

public class Quiz3_primeNumber {
	public void doCheck() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("검사할 숫자를 입력하세요");
		int inputNumber = scanner.nextInt(); // 2부터 숫자-1

		boolean isPrimeNumber = true; //둘 중 하나로만 잡아두면돼
		for (int i = 2; i < inputNumber; i++) { //2부터 숫자 -1까지 한번 나눠지면 소수가 아님
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