//�񱳿�����
public class Test7_boolean {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		boolean c;

		c = a == b;
		System.out.println(c);

		int blue = 40;
		int sky = 50;
		boolean g;
		g = blue != sky;
		System.out.println(g);

		// and ������ (&&) -�յ������� ���̸��� �ƴϸ����, ��ȣ ���̵� ���డ�� �ٵ� ��
		g = (blue != sky) && (blue > sky);
		System.out.println(g);

		// ������ ����
		int y = 8;
		int q = 9;

		if (y < q) {
			System.out.println("y�� q���� �۴�");
		} else if (y == q) {
			System.out.println("s case");
		} else {
			System.out.println("other");
		}

	}
}
