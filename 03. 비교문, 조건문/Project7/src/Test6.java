import java.util.Random;
import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Random a = new Random();
		int randomVal = a.nextInt(100); // 99����
		System.out.println(randomVal);

		Random c = new Random();
		double bee = c.nextInt(17);
		System.out.println(bee); // double�ȵ�?

		// ������
		Random ran1 = new Random();
		int num1 = ran1.nextInt(100);
		System.out.println("�������� : " + num1);
		System.out.println("������ : " + (num1 % 2));

		// scanner
		Scanner b = new Scanner(System.in);
		int num;
		System.out.println("0~100 ������ ���ڸ� �Է��ϼ���");
		num = b.nextInt();
		System.out.println(num);

		// if
		int blue = 8;
		if (9 < 30) {
			System.out.println("9�� 30���� �۴�");
		}
		if (blue < 30) {
			System.out.println("blue�� 50���� �۴�");
		}

		int pink = 10;
		if (pink > 80) {
			System.out.println("pink�� 80���� ũ��");

		} else if (pink < 80) {
			System.out.println("pink�� 80���� �۴�");

		}

		// ������ if
		if (num1 % 2 == 1) {
			System.out.println("Ȧ�� �Դϴ�. ");
		} else {
			System.out.println("¦�� �Դϴ�.");
		}
		
		//if else
			Random ran3 = new Random();
			int num4 = ran3.nextInt(100);
			int num5 = ran3.nextInt(100); 
			System.out.println(num4);
			System.out.println(num5);
			
			if (num4 < num5) {
				System.out.println("num5 �¸� ");
			}
			else if (num4 > num5) {
				System.out.println("num4 �¸� ");
	
			}
			else {
				System.out.println(" ����  ");
			}
}	
}