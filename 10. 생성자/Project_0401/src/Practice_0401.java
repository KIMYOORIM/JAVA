//3*3배열에 숫자를 입력받아서 합을 구하라 
import java.util.Arrays;
import java.util.Scanner;

public class Practice_0401 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int k, w;
		String a = "";

		int[][] arr = new int[4][4];

		System.out.println("숫자를 입력해 주세요 ");
		for (k = 0; k < 3; k++) {
			int sumNumber = 0;
			for (w = 0; w < 3; w++) {
				int input = scanner.nextInt();
				arr[k][w] = input;
				a += arr[k][w] + "   ";
				sumNumber += arr[k][w];// 앞 세개의 합
			}
			arr[k][w] = sumNumber;
			a += arr[k][w] + "\n";
			// System.out.println(a);//합출력
		}
		System.out.println(a);
	}
}
