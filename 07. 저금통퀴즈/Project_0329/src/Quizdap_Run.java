//���������� ���� ����
import java.util.Scanner;

public class Quizdap_Run {
	public static void main(String[] args) {
		Quiz_dap moneyBox = new Quiz_dap();
		Scanner scanner = new Scanner(System.in);

		for(int i = 0; i<99999;i++) { //crash �Է� ������ �ݺ�
			System.out.println("�޴� ���� 1.�Ա�, 2.�Ա�+�޼���,3.���� : ");
		int selectMenu = scanner.nextInt();
		if(selectMenu == 1) {
			System.out.println("�Ա��� �ݾ� : ");
		int coin = scanner.nextInt();
		moneyBox.deposit(coin, "");
		}else if(selectMenu == 2) {
			System.out.println("�Ա��� �ݾ� : ");
		}
		int coin = scanner.nextInt();
		System.out.println("�޼��� : ");
		

		moneyBox.deposit(coin, message);
		if (message.equals("crash")) { //crash�Է½� ���� 
			break;
		}
		//moneyBox.deposit(100, "");// string �߰��߱⶧���� ���� ���־����
		//moneyBox.deposit(100, "�뵷"); // ���� �ι� �������ϱ� �ι� ���׶��� ��µ� .
	
		}
	}
}
