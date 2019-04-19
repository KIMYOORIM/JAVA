import java.util.Arrays;
import java.util.Random;

public class Test4 {
	public static void main(String[] args) {
		Test55 rand = new Test55();
		rand.nextInt2(10);
		System.out.println(Arrays.toString(rand.resultArr)); // resultArr라는 배열을 출력하고 싶은거잖아.
//	double n2 = rand.nextDouble();
	}
}
