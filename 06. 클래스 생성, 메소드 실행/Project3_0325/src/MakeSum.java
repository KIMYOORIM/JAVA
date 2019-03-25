
public class MakeSum { // 클래스 만든다(main하나, 메소드만드는거 하나)
	public void doMake(int startNumber, int endNumber) { // 메소드 만든다. 무조건 public void쓰고 이름정해주고 입력값 받을거 만들면돼
		int totalNumber = 0; // 두수를 더하기 위한 변수 만듬
		for (int i = startNumber; i < endNumber + 1; i++) {
			totalNumber = totalNumber + i; // 형태를 잡아줌
		}
		System.out.println("시작값 : " + startNumber + ", 종료값 : " + endNumber);
		System.out.println("범위 합계 : " + totalNumber);
	}
}
