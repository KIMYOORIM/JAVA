public class Practice_0325quiz3 {
		public void doCheck(int inputNumber) {
			if (inputNumber < 1) {
			
			System.out.println("�˻��� ���ڸ� �Է��ϼ���");
			return;
			}
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

