import java.util.Scanner;

public class Kaup2 {
	public double weight;
	public double height;
nner(System.in);

	public void process() {
		this.inputData();
		this.result();

	}

	public void inputData() {
		Scanner scanner = new Sca
		System.out.println("ü���Է� (���� kg) : ");
		this.weight = scanner.nextDouble();

		System.out.println("�����Է� (���� m) : ");
		this.height = scanner.nextDouble(); // �Է� �޾���? ���ο� ����ϴ¾ַ� ����� �ִ°� ����

	}

	public void result() {
		double calcResult = (double) this.weight / (this.height * this.height); // �տ� ������ �Ƚᵵ�� �׷��� ���������� ����
		// System.out.println("��� ��� : " + calcResult); //��������� ��� �ϴ� ��
		if (calcResult > 30) {
			System.out.println("��");
		} else if ((calcResult >= 20) && (calcResult <= 24)) {
			System.out.println("����");
		} else if (calcResult < 20) {
			System.out.println("��ü��");
		} else if ((calcResult >= 13) && (calcResult <= 15)) {
			System.out.println("����");
		} else if ((calcResult >= 10) && (calcResult <= 13)) {
			System.out.println("���� ������");
		} else if (calcResult < 10) {
			System.out.println("���ϴ� �Ҹ���"); // ���ǹ��� �ϳ��� ������ ��?
		}
	}
}