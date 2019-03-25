
public class mainClass { // main에서는 인스턴스만 생성해서 일을 시킨다(메소드 사용).
	public static void main(String[] args) {
		MakeSum makeSum = new MakeSum();
		makeSum.doMake(1, 100);
		makeSum.doMake(1000, 2000);

	}
}
