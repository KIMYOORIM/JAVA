//���������� ��ü���� 
public class MBox {
	public int totalCoin = 0;// ���� ������ �ִ� ��
	public String name;
	public void deposit(int inputCoin) {
		if(inputCoin < 1000) {
			this.totalCoin = this.totalCoin + inputCoin; // �����뿡 ���µ��� �������� ������
		}
	}
	
}
