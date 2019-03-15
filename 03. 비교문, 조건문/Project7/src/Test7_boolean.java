//비교연산자
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

		// and 연산자 (&&) -앞뒤조건이 참이면참 아니면거짓, 괄호 없이도 실행가능 근데 해
		g = (blue != sky) && (blue > sky);
		System.out.println(g);

		// 교수님 수업
		int y = 8;
		int q = 9;

		if (y < q) {
			System.out.println("y가 q보다 작다");
		} else if (y == q) {
			System.out.println("s case");
		} else {
			System.out.println("other");
		}

	}
}
