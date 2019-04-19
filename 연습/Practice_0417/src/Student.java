import java.util.Arrays;
import java.util.Random;

public class Student {
	String name;
	int korScore;
	int engScore;
	int mathScore;
	int totalScore;
	
	public void totalStudent() {
	Student[] student = new Student[10]; //학생열명데이터 생성.
	
	for(int i = 0; i<student.length;i++) {
		student[i] = new Student(); //new 뒤에는 클래스명이 와야하지.
		Random rand = new Random();
		student[i].name = (i+1) + "번 학생";
		student[i].korScore = rand.nextInt(101);
		student[i].engScore = rand.nextInt(101);
		student[i].mathScore = rand.nextInt(101);
		student[i].totalScore = student[i].korScore + student[i].engScore + student[i].mathScore;
		System.out.println(student[i].name + "학생의 국어점수는 : " + student[i].korScore + " 영어점수는 :" + student[i].engScore + " 수학점수는 : "+student[i].mathScore + " 총점은 : "+student[i].totalScore);
		
	}
	
	//문자열로 비교해서 위아래 비교할 수 있게. 두자리수 감안해서 앞에 0붙을 수 있게.
	for(int a = 0; a < student.length; a++) {
		for(int b= a +1; b < student.length; b++) {
			if(student[a].totalScore <student[b].totalScore) {
				int tmp = student[a].totalScore;
				student[a].totalScore = student[b].totalScore;
				student[b].totalScore = tmp; //자리 바꿔 줌 
				
			}
			
		}
		
	}
		System.out.println(Arrays.toString(student));
	
	}
}
