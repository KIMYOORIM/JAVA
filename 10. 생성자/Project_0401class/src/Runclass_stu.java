//객체데이터
import java.util.Scanner;

public class Runclass_stu {
	public static void main(String[] args) {
//	Student s1 = new Student();
//	s1.name = "홍길동";
//	s1.korScore = 100;
//	s1.engScore = 30;
//	s1.mathScore = 20;
//	s1.memo = "메사에 진취적임";

		Student[] sArray = new Student[10]; //배열생성 (변수만 10개 만든거)
		//한번에 열명 데이터 만들어서 첫번째 사람에 접근 한 것.
		// sArray[0].name = "홍길동";
		Scanner scan = new Scanner(System.in);//객체생성
		for (int i = 0; i < sArray.length; i++) {
			sArray[i] = new Student();
			System.out.println("" + (i + 1) + "번째 학생 데이터 입력");
			System.out.println("이름 : ");
			sArray[i].name = scan.nextLine();
			System.out.println("국어점수 : ");
			String korString = scan.nextLine();
			sArray[i].korScore = Integer.parseInt(korString); //"100"=>100 문자열 숫자로 변환
			System.out.println("영어점수 : ");
			String engString = scan.nextLine();
			sArray[i].engScore = Integer.parseInt(engString);
			System.out.println("수학점수 : ");
			String mathString = scan.nextLine();
			sArray[i].mathScore = Integer.parseInt(mathString);
			scan.nextLine();
			
		}
	}
}