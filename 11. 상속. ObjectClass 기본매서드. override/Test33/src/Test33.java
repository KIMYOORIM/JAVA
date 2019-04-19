
public class Test33 {
	public static void main(String[] args) {
		Object a = new O2(); // Object 클래스 객체 생성.
		Object b = new O2(); // 실제사용한건 new로 만들어 쓴 애다.

		System.out.println(".equals 결과" + a.equals(b)); // 주소값비교하기 때문에 False
		System.out.println("a.tostring 결과" + a.toString());
		System.out.println("a 결과 : " + a);// a는 a.toString과 같다.
		System.out.println("b.tostring 결과" + b.toString());
		System.out.println("b 결과 : " + b);

	}
}
