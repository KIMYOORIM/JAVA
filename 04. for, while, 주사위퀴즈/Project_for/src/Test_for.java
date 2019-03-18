//8번 반복되는 애가 4번 반복됌. 중복 for문

public class Test_for {
public static void main(String[] args) {
	for (int i = 0; i < 4; i++) {
		System.out.println(i);
		for (int j = 0; j < 4; j++) {
			System.out.println(j); // 안에것 먼저 실행되서 0나오고 그뒤에 j 0123나오고 또 안에 1 실행 ..
		}
	}
}
}
