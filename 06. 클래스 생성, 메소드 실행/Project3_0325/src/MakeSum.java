
public class MakeSum { // Ŭ���� �����(main�ϳ�, �޼ҵ常��°� �ϳ�)
	public void doMake(int startNumber, int endNumber) { // �޼ҵ� �����. ������ public void���� �̸������ְ� �Է°� ������ ������
		int totalNumber = 0; // �μ��� ���ϱ� ���� ���� ����
		for (int i = startNumber; i < endNumber + 1; i++) {
			totalNumber = totalNumber + i; // ���¸� �����
		}
		System.out.println("���۰� : " + startNumber + ", ���ᰪ : " + endNumber);
		System.out.println("���� �հ� : " + totalNumber);
	}
}
