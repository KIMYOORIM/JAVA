import java.util.Random;
import java.util.Scanner;

//주사위 게임 만들기  q 입력시 종료 할 수 있게
public class Dice {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			System.out.println("진행하려면 엔터, 종료하려면 q를 입력하세요.");
			String quit = scan.nextLine();
		
			if (quit.equalsIgnoreCase("q")) {
				System.out.println("게임이 종료되었습니다.");
				break;
			}
		
			System.out.println("컴퓨터 차례입니다.");
			int dice = rand.nextInt(6)+1;
			System.out.println("컴퓨터  :" + dice + "\n");
	
			int user = 1;
			System.out.println("사용자 차례입니다. 숫자를 입력해주세요");
			user = Integer.parseInt(scan.nextLine()); //숫자받을때  엔터도 같이 입력한걸로 인식해서 line으로 입력하고 형변환 하는게 더 깔끔하다. 
			
	
			if (dice == user) {
				System.out.println("비겼습니다.\n");
			} else if (dice > user) {
				System.out.println("컴퓨터가 이겼습니다.\n");
			} else if (dice < user) {
				System.out.println("사용자가 이겼습니다.\n");
			}
	
		}
	}
}
