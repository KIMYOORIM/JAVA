import java.util.Scanner;
// �Ҽ�üũ�� ���� ���. ����
public class Practice_0325check {
	public void doCheck() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�˻��� ���ڸ� �Է��ϼ���");
		int inputNumber = scanner.nextInt(); // 2���� ����-1
		if (inputNumber <1) { //������ ���Դ��� üũ
			System.out.println("����� �Է��� �ּ���");
			return; //����� ������.for�� ������ ��� �������� return ��� x
		}

		boolean isPrimeNumber = true; //�� �� �ϳ��θ� ��Ƶθ��
		for (int i = 2; i < inputNumber / 2; i++) {
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