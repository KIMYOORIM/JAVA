import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("ù��° ���ڸ� �Է��� �ּ���.");
		Scanner scan2 = new Scanner(System.in);

		double number1 = scan2.nextDouble();
		System.out.println("�ι��� ���ڸ� �Է��� �ּ���.");
		double number2 = scan2.nextDouble();

		double sumNumber = number1 + number2;
		System.out.printf("%f �� %f�� ���� %f�Դϴ�.", number1, number2, sumNumber);

	}
}
