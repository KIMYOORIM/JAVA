import java.util.Scanner;

public class Calcul {
	Scanner scan = new Scanner(System.in);

	int sumNum = 1;
	int mulNum = 1;

	public void doCalcul() {
		System.out.println("숫자를 입력하세요");
		int inputNumber = Integer.parseInt(scan.nextLine());
		for(int i = 1; i<inputNumber+1; i ++) {
			sumNum = sumNum + i;
			mulNum = mulNum * i;
		}
		System.out.println("1부터 " + inputNumber + " 까지의 합은 :" + (sumNum-1) + "입니다.");
		System.out.println("1부터 " + inputNumber + " 까지의 곱은 : " + mulNum + "입니다.");
	
	}
}
 