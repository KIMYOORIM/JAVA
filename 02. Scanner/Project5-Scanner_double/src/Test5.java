import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("첫번째 숫자를 입력해 주세요.");
		Scanner scan2 = new Scanner(System.in);

		double number1 = scan2.nextDouble();
		System.out.println("두번재 숫자를 입력해 주세요.");
		double number2 = scan2.nextDouble();

		double sumNumber = number1 + number2;
		System.out.printf("%f 와 %f의 합은 %f입니다.", number1, number2, sumNumber);

	}
}
