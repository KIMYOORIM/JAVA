
import java.util.Scanner;

public class Practice_division {
	int number1;
	int number2;
	String tmp;

	public void dodivision() {
		Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			System.out.println("숫자1 : ");
			tmp = scan.nextLine();
			try {
				this.number1 = Integer.parseInt(tmp); //문자로 받아서 숫자로 변환 계산. 
			} catch (Exception e) { //에러가 발생하면 catch 부분으로 온다. 
				this.number1 = 0; //default 값으로 설정
			}
			System.out.println("숫자2 : ");
			String tmp = scan.nextLine();
			try {
				this.number2 = Integer.parseInt(tmp);
			} catch (Exception e) {
				// TODO: handle exception
				this.number2 = 0;
			}
	}
	public void printResult() {
		double resultNumber = 0;
		resultNumber = (double)this.number1 / this.number2;
		resultNumber = (double)Math.round(resultNumber * 1000) / 1000; //얘때문에 infinity값 안나옴.
			System.out.println(
					this.number2 + "나누기" + this.number2 + "은" + resultNumber + "입니다.");
			// 출력값 소수점 자리수 제한

		}
}
//System.out.println(String.format("%.2f", pie)); //결과 : 3.14
//System.out.println(Math.round(money*1000)/1000); 소수점이 0 이면 절삭 