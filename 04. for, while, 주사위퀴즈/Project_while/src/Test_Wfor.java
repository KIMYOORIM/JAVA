// 반복은 100번이 되지만 98번째(continue)까지만 반복되고 그뒤 실행안되고 다시 앞꺼 실행.
public class Test_Wfor {
public static void main(String[] args) {
for (int i = 0; i < 100; i ++) {
	//System.out.print("a")로 확인가능 98숫자는 안찍히고 a는 찍힘
	if (i == 98) {
		continue;
	}
	System.out.println(i);
	}
}

}
