//���������� ���� ����
public class Quiz_dap {
	private int coin;

	public void deposit(int coin, String message) { // ������ ����
		this.coin = this.coin + coin; // ���� ������ ���� ��. //this coin �� ���� private�� coin
		if (message.contentEquals("")) {
			System.out.println("���׶�"); // ������ ������ ���׶� ���

		} else {
			System.out.println(message);// �޼����� ���̵����� �޼��� ���
		}

	}
}