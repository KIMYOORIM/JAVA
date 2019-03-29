//돼지저금통 퀴즈 예시
import java.util.Scanner;

public class Quizdap_Run {
	public static void main(String[] args) {
		Quiz_dap moneyBox = new Quiz_dap();
		Scanner scanner = new Scanner(System.in);

		for(int i = 0; i<99999;i++) { //crash 입력 전까지 반복
			System.out.println("메뉴 선택 1.입금, 2.입금+메세지,3.종료 : ");
		int selectMenu = scanner.nextInt();
		if(selectMenu == 1) {
			System.out.println("입금할 금액 : ");
		int coin = scanner.nextInt();
		moneyBox.deposit(coin, "");
		}else if(selectMenu == 2) {
			System.out.println("입금할 금액 : ");
		}
		int coin = scanner.nextInt();
		System.out.println("메세지 : ");
		

		moneyBox.deposit(coin, message);
		if (message.equals("crash")) { //crash입력시 종료 
			break;
		}
		//moneyBox.deposit(100, "");// string 추가했기때문에 같이 써주어야함
		//moneyBox.deposit(100, "용돈"); // 돈이 두번 들어왔으니까 두번 땡그랑이 출력됨 .
	
		}
	}
}
