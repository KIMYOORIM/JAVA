import java.util.Scanner;

public class Quiz3_primeNumber {
	public void doCheck() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�˻��� ���ڸ� �Է��ϼ���");
		int inputNumber = scanner.nextInt(); // 2���� ����-1

		boolean isPrimeNumber = true; //�� �� �ϳ��θ� ��Ƶθ��
		for (int i = 2; i < inputNumber; i++) { //2���� ���� -1���� �ѹ� �������� �Ҽ��� �ƴ�
			if (inputNumber % i == 0) {
				// �������� ���̸� ��������
			isPrimeNumber = false; //�ѹ��̶� �������� false�� ��µǰ�
			break; //�ѹ��̶� ���������� for�� ���������Բ�. 
			}
		}

		if (isPrimeNumber) {
			System.out.println("�Ҽ��Դϴ�.");
		} else {
			System.out.println("�Ҽ��� �ƴմϴ�.");

		}
	}
}