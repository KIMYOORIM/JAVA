import java.util.Scanner;

public class Quiz2_run {
public static void main(String[] args) {
	Quiz2 kaup = new Quiz2() {
		Scanner scanner = new Scanner(System.in);
		
		if(kaupIndex > 30) {
			System.out.println("��");
			int tall = scanner.nextInt();
			int weight = scanner.nextInt();
		}else if((kaupIndex >= 20) && (kaupIndex <= 24)) {
			System.out.println("����");
		}else if (kaupIndex < 20) {
			System.out.println("��ü��");
		}else if((kaupIndex >= 13) && (kaupIndex <= 15)) {
			System.out.println("����");
		}else if((kaupIndex >= 10) && (kaupIndex <= 13)) {
			System.out.println("���� ������");
		}else if (kaupIndex < 10) {
			System.out.println("���ϴ� �Ҹ���");
		
	}
		
	
}
}
