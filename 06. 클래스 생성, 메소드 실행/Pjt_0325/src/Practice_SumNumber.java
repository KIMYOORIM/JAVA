import java.util.Scanner;

public class Practice_SumNumber { //클래스 생성
	public void doSum() {
		int number1 = 0;
		int number2 = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("숫자 : ");
		number1 = scan.nextInt();

		System.out.println("숫자 : ");
		number2 = scan.nextInt();

		Practice_Sum2 sum2 = new Practice_Sum2();
		int result = sum2.sumNumbers(number1, number2);
		System.out.println("두개의 숫자의 합은" + result + "입니다.");

	}
	public void hello() {
		System.out.println("Hello Java"); // 이렇게 전혀 다른 일을 시켜도돼
	}
}
