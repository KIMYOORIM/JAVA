//�ֻ��� ���� ����� �����Բ�
import java.util.Random;
import java.util.Scanner;

public class Practice2_0322 {
	public static void main(String[] args) {
		int comDice = 0;
		int userDice = 0;
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 10000; i ++) {
			System.out.println("��ǻ���� �ֻ����� �������? (�����Ͻ÷��� q�� �Է��ϼ���)");
		 String inputString = scan.nextLine();
			if (inputString.equalsIgnoreCase("q")) {                           //���� ���� ���� x
				System.out.println("������ ����Ǿ����ϴ�.");
				break;
			}
		scan.nextLine();
	
		comDice = rand.nextInt(6)+1;
		System.out.println("��ǻ���� �ֻ�����" + comDice + "�Դϴ�.");
		
		System.out.println("��������ֻ����� �������?");
		scan.hasNextLine();
		
		comDice = rand.nextInt(6)+1;
		System.out.println("������� �ֻ�����" + comDice + "�Դϴ�.");
		
		if (comDice == userDice) {
			System.out.println("�����ϴ�.");
		}else if (comDice > userDice) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
	    }else if (comDice < userDice)
	    	System.out.println("����ڰ� �̰���ϴ�.");
	}
	}
}
