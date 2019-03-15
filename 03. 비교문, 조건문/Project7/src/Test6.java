import java.util.Random;
import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Random a = new Random();
		int randomVal = a.nextInt(100); // 99까지
		System.out.println(randomVal);

		Random c = new Random();
		double bee = c.nextInt(17);
		System.out.println(bee); // double안돼?

		// 교수님
		Random ran1 = new Random();
		int num1 = ran1.nextInt(100);
		System.out.println("랜덤숫자 : " + num1);
		System.out.println("나머지 : " + (num1 % 2));

		// scanner
		Scanner b = new Scanner(System.in);
		int num;
		System.out.println("0~100 사이의 숫자를 입력하세요");
		num = b.nextInt();
		System.out.println(num);

		// if
		int blue = 8;
		if (9 < 30) {
			System.out.println("9는 30보다 작다");
		}
		if (blue < 30) {
			System.out.println("blue는 50보다 작다");
		}

		int pink = 10;
		if (pink > 80) {
			System.out.println("pink는 80보다 크다");

		} else if (pink < 80) {
			System.out.println("pink는 80보다 작다");

		}

		// 교수님 if
		if (num1 % 2 == 1) {
			System.out.println("홀수 입니다. ");
		} else {
			System.out.println("짝수 입니다.");
		}
		
		//if else
			Random ran3 = new Random();
			int num4 = ran3.nextInt(100);
			int num5 = ran3.nextInt(100); 
			System.out.println(num4);
			System.out.println(num5);
			
			if (num4 < num5) {
				System.out.println("num5 승리 ");
			}
			else if (num4 > num5) {
				System.out.println("num4 승리 ");
	
			}
			else {
				System.out.println(" 동점  ");
			}
}	
}