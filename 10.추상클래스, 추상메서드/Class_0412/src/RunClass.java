import java.util.Scanner;

public class RunClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. 삼각형 넓이 구하기, 2. 사각형 넓이 구하기, 3. 원 넓이 구하기");
		int selectMenu = scanner.nextInt();
		
		Figure figure = null; //여러 속성을 만들기 위해서 여기다가 객체생성해줌. null로 한 이유는 아래 각 속성을 받기위한 빈 공간이다. 
		if (selectMenu == 1) { //다른 클래스에서 만든 변수는 속성값이 하나 이상 들어갈 수 없다. 
			figure = new Triangle();
		} else if (selectMenu == 2) {
			figure = new Squre();
		} else if (selectMenu == 3) {
			figure = new Circle();
		}
		
		figure.inputValue();
		figure.printResult();
	}
}
