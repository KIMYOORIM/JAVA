
public class Practice_pdf7 {
	public static void makeSum(int startValue, int endValue) {
		int start = startValue;
		int end = endValue;
		int sum = 0;

		for (int i = start; i <= end; i++) {
			sum = sum + i;
		} // end for

		System.out.println("���۰�: " + start);
		System.out.println("���ᰪ: " + end);
		System.out.println("�� ��: " + sum);

	}

	public static void main(String[] args) {
		Practice_pdf7 m = new Practice_pdf7();
		m.makeSum(1, 100);
		m.makeSum(2, 200);
		m.makeSum(3, 300);

	}

}
