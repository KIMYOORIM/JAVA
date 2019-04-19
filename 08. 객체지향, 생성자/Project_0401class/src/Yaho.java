import java.util.Scanner;

public class Yaho {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int scanner_Input = 0;
		int maxValue = 4;
		int[][] arr = new int[maxValue+1][maxValue+1];
		for (int i = 0; i < maxValue; i++) {
			for (int j = 0; j < maxValue; j++) {
				while (true) {
					try {
						System.out.printf("입력 (%d행 %d열) : ", i + 1, j + 1);
						scanner_Input = Integer.parseInt(s.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.print("다시 ");
						s = new Scanner(System.in);
					}
				}
				arr[i][j] = scanner_Input;
			}
		}
		
		for (int i = 0; i < maxValue; i++) {
			for (int j = 0; j < maxValue; j++) {
				arr[i][maxValue] += arr[i][j];
				arr[maxValue][j] += arr[i][j];
			}

			arr[maxValue][maxValue] += arr[i][maxValue];
		}

		for (int i = 0; i < maxValue+1; i++) {
			for (int j = 0; j < maxValue+1; j++) {
				System.out.print(arr[i][j] + "	");
			}
			System.out.println();
		}

	}
}