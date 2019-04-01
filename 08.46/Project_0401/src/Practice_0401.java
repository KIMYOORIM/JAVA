import java.util.Arrays;
import java.util.Scanner;

public class Practice_0401 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int k, w;
	
		int[][] arr = new int[4][4];
		
		System.out.println("숫자를 입력해 주세요 ");
		for (k = 0; k < 3; k++) { 
		    int a = 0;
			for (w = 0; w < 3; w++) { 
				int input = scanner.nextInt();
				arr[k][w] = input;
				a += arr[k][w]; //앞 세개의 합
			}
			
			//System.out.println(a);//합출력
 		}

	}
}
