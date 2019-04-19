import java.util.Arrays;
import java.util.Random;

//3명의 국어점수를 입력받아 등수대로 나열하세요.
//얘 메인클래스 없잖아 메서드 만들어줘야지

public class Student {
	int korScore;

	Random rand = new Random();
	Student[] student = new Student[3];

	public void hehe() {
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
			student[i].korScore = rand.nextInt(101);
			System.out.println((i+1)+ "번째 학생의 국어점수는 " + student[i].korScore);

		}
		//System.out.println(Arrays.toString(student));//이렇게 출력하면 스튜던트배열안에 있는 객체의 속성의 해시값이 나온다. 다른 메소드를 만들어볼까?
	}
	}
