//���������� ��ü���� 
//public �ܺο��� ���� ����. private ���ٺҰ���, private�� ���� �޼ҵ带 ���ؼ��� property���� �����ϴ�. ex)setname
//public ��  �� ����� ���� ����. 
//�׷��� box1.name���� public������ ���� ���������� private������ ������ ��. 
public class RunClass { // ������ ���� �����Լ��� �������
	public static void main(String[] args) {
		MBox box1 = new MBox();
		box1.deposit(100);
		box1.deposit(1000);

		System.out.println(box1.totalCoin);
	box1.name = "����";
	}
	
}
