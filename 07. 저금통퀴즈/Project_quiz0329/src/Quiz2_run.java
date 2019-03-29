import java.util.Scanner;

public class Quiz2_run {
public static void main(String[] args) {
	Quiz2 kaup = new Quiz2() {
		Scanner scanner = new Scanner(System.in);
		
		if(kaupIndex > 30) {
			System.out.println("비만");
			int tall = scanner.nextInt();
			int weight = scanner.nextInt();
		}else if((kaupIndex >= 20) && (kaupIndex <= 24)) {
			System.out.println("정상");
		}else if (kaupIndex < 20) {
			System.out.println("저체중");
		}else if((kaupIndex >= 13) && (kaupIndex <= 15)) {
			System.out.println("여윔");
		}else if((kaupIndex >= 10) && (kaupIndex <= 13)) {
			System.out.println("영양 실조증");
		}else if (kaupIndex < 10) {
			System.out.println("이하는 소모증");
		
	}
		
	
}
}
