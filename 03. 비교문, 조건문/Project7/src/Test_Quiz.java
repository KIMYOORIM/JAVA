import java.util.Random;
import java.util.Scanner;

public class Test_Quiz {
	public static void main(String[] args) {

		Scanner stone = new Scanner(System.in);
		int num;
		System.out.println("���������� : ");
		num = stone.nextInt(3);

		if (num == 0)
			System.out.println("����");
		else if (num == 1)
			System.out.println("����");
		else
			System.out.println("��");

		System.out.println(num);

		Random rand = new Random();
		int num2 = rand.nextInt(3);
		if (num2 == 0)
			System.out.println("����");
		else if (num2 == 1)
			System.out.println("����");
		else
			System.out.println("��");

		if (num > num2)
			System.out.println("num�� �̰���ϴ�.");

		else if (num < num2)
			System.out.println("num2�� �̰���ϴ�.");
		else
			System.out.println("�����ϴ�.");
	}
}
