import java.util.Random;
import java.util.Scanner;

public class Test_Quiz2 {
	public static void main(String[] args) {
		int computer;
		int user;

		System.out.println("��ǻ�Ͱ� ������������ �Է��� �ּ���.");
		Random rand = new Random();
		computer = rand.nextInt(3);
		if (computer == 0) {
			System.out.println("��ǻ�� : ����");
		} else if (computer == 1) {
			System.out.println("��ǻ�� : ����");
		} else if (computer == 2) {
			System.out.println("��ǻ�� : ��");

		}

		Scanner scan = new Scanner(System.in);
		System.out.println("����ڰ� ������������ �Է����ּ���.");
		user = scan.nextInt();
		if (user == 0) {
			System.out.println("����� : ����");
		} else if (user == 1) {
			System.out.println("����� : ����");
		} else if (user == 2) {
			System.out.println("����� : ��");
		}

		if (computer == user) {
			System.out.println("�����ϴ�.");
		} else if (computer == 0 && user == 1) {
			System.out.println("����ڰ� �̰���ϴ�.");
		} else if (computer == 0 && user == 2) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		} else if (computer == 1 && user == 0) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		} else if (computer == 1 && user == 2) {
			System.out.println("����ڰ� �̰���ϴ�.");
		} else if (computer == 2 && user == 0) {
			System.out.println("����� �̰���ϴ�.");
		} else if (computer == 2 && user == 1) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");

		}

	}

}
