import java.util.Random;

public class Test_paper {
	public static void main(String[] args) {

		int dice;
		Random dice2 = new Random();
		System.out.println("�ֻ����� �����ּ���");
		dice = dice2.nextInt(100);
		dice = dice % 6;
		dice = dice++;
		// 6���� ������ �� �������� 0~5�����ۿ� �ȳ����� ������ ����.

		if (dice == 1) {
			System.out.println("�۸�");
		} else if (dice == 2) {
			System.out.println("�߿�");
		} else {
			System.out.println(dice);
		}
	}
}
