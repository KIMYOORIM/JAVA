import java.util.Arrays;
import java.util.Scanner;

//퀴즈 열명의 국어점수를 입력받아서 입력된 값 출력 및 총점 평균 구하라.
public class Practice5_0322 {
public static void main(String[] args) {

	
	//int[] scoreNum = {0,0,0,0,0,0,0,0,0,0,0,0}
	int[] scoreNum = new int[10];      //배열 카드를 만드느 것.
	
	Scanner nameScan = new Scanner(System.in);
	
	for(int i= 0; i < scoreNum.length ; i++) { //입력받을 때 한번에 계산해도 되지만 나중에 수정이 필요할 때 불편해짐. 분리하는 게 좋음.
		System.out.println("국어점수 : ");
		scoreNum[i] = nameScan.nextInt();
	
	}
	System.out.println(Arrays.toString(scoreNum)); //for문을 통해서 출력하기 

	//여기부터 총점 만들기
	int total = 0;
	double average = 0;
	
	for(int i = 0; i < scoreNum.length; i++) {
	total = total + scoreNum[i];
	}
average = (double)total / scoreNum.length;

System.out.println("총점은 : " + total);
System.out.println("총점은 : " + average);
}
	
		
	}

//추가 과제 : 이름, 국어점수, 수학,영어 점수 입력받고 각 점수출력하고 학생의 총점수랑 평균 