import java.util.Random;

public class Random1 extends Random {
	int[] javaTest = new int[3]; // 세번의 실습평가
	int[] dbTest = new int[5]; // 다섯번의 퀴즈가 있다.
	int[] pythonTest = new int[2];// 두번의 코드리뷰평가

	public void rand(Student student) { // 학생태도점수 랜덤값출력
		student.attendance = this.nextInt(101);
	}

	public void javaRand() { // 자바의 실습평가 랜덤출력.
		for (int i = 0; i < javaTest.length; i++) {
			javaTest[i] = super.nextInt(101); // 랜덤값출력
			System.out.println((i + 1) + "번째 실습평가 점수는  : " + javaTest[i]);
		}
	}

	public void dbRand() { //db의 실습평가 랜덤출력.
			for(int i = 0; i < javaTest.length; i++) {
				javaTest[i] = super.nextInt(101); //랜덤값출력
				System.out.println((i+1) + "번째 퀴즈 점수는  : " + dbTest[i] );
		}
	}

	public void pythonRand() { // python의 실습평가 랜덤출력.
		for (int i = 0; i < pythonTest.length; i++) {
			pythonTest[i] = super.nextInt(101); // 랜덤값출력
			System.out.println((i + 1) + "번째 퀴즈 점수는  : " + pythonTest[i]);
		}

	}
}
