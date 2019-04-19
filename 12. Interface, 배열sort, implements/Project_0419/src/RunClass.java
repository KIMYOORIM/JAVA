import java.util.Arrays;
import java.util.Random;
//객체데이터 만들어서 객체 생성해주고 랜덤으로 값 넣어주는거 시험에 나와. 
public class RunClass {
	public static void main(String[] args) {
		Random rand = new Random();
		
		Student[] student = new Student[10]; //배열생성하고 
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
		}
		
		
		for (int i = 0; i < student.length; i++) {
			student[i].name = (i + 1) + "번 학생";
			student[i].kor = rand.nextInt(101);
			student[i].eng = rand.nextInt(101);
			student[i].math = rand.nextInt(101);
		}
		//여기까지 시험. 
		for (int i = 0; i < student.length; i++) {
			student[i].total = student[i].kor + student[i].eng + student[i].math;
		}
		
//		for (int i = 0; i < student.length; i++) {
//			for (int j = i; j < student.length; j++) {
//				if (student[i].total < student[j].total) {
//					Student tmp = student[i]; //객체 프린트 할때 tmp 값
//					student[i] = student[j];
//					student[j] = tmp;
//					
//				}
//			}
//		}
		
		Arrays.sort(student);
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].print());
		}
	}
//anotation해서 javadoc잡아주어야한다. 내부에서 사용할 땐 안해도 외부에서 사용시에는 해야한다. 
}
