import java.util.Random;

public class Student {
	String name;
	int korScore1 = 0;
	int korScore2 = 0;
	int engScore1 = 0;
	int engScore2 = 0;
	int mathScore1 = 0;
	int mathScore2 = 0;
	int midScore = 0;
	int finalScore = 0;
	String a = null;

	Random rand = new Random();
	public void examScore() {
		Student[] student = new Student[100];

		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
			student[i].name = (i+1) + "번 학생 ";
			student[i].korScore1 = rand.nextInt(100);
			student[i].engScore1 = rand.nextInt(100);
			student[i].mathScore1 = rand.nextInt(100);
			student[i].midScore = (student[i].korScore1 + student[i].engScore1 + student[i].mathScore1);
			//System.out.println(student[i].name + "의 중간고사 총점은 : " + student[i].midScore + "점 입니다. ");
	
			student[i].korScore2 = rand.nextInt(100);
			student[i].engScore2 = rand.nextInt(100);
			student[i].mathScore2 = rand.nextInt(100);
			student[i].finalScore = (student[i].korScore2 + student[i].engScore2 + student[i].mathScore2);
			//System.out.println(student[i].name + "의 기말고사 총점은 : " + student[i].finalScore + "점 입니다. ");
			if (student[i].midScore < student[i].finalScore) {
				a = a +student[i].name +"의 중간고사 총점:" +student[i].midScore + " 기말고사 총점:" + student[i].finalScore + "\n";
			}
			}	
		System.out.println("성적이 오른 학생: \n"  + a); 
	}
}