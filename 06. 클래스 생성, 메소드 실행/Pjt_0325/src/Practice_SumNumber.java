import java.util.Scanner;

public class Practice_SumNumber { //Ŭ���� ����
	public void doSum() {
		int number1 = 0;
		int number2 = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("���� : ");
		number1 = scan.nextInt();

		System.out.println("���� : ");
		number2 = scan.nextInt();

		Practice_Sum2 sum2 = new Practice_Sum2();
		int result = sum2.sumNumbers(number1, number2);
		System.out.println("�ΰ��� ������ ����" + result + "�Դϴ�.");

	}
	public void hello() {
		System.out.println("Hello Java"); // �̷��� ���� �ٸ� ���� ���ѵ���
	}
}
