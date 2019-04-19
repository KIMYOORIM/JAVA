import java.util.Arrays;
import java.util.Random;

public class RunClass1 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		StudentClass1[] student = new StudentClass1[10];
		
		for (int i = 0; i < student.length; i++) {
			student[i] = new StudentClass1();
		}       //배열을 반복해서 생성해준다. 선언해야 생성되는 것처럼 (이차원 배열처럼)
		
		
		for (int i = 0; i < student.length; i++) {
			student[i].name = (i + 1) + "번 학생";
			student[i].kor = rand.nextInt(101);
			student[i].eng = rand.nextInt(101);
			student[i].math = rand.nextInt(101);		//각각에 프로퍼티에 랜덤을 값을 준다.
		}										
		
		
		for (int i = 0; i < student.length; i++) {
			student[i].total = student[i].kor + student[i].eng + student[i].math;
		}             //토탈은 각각의 스투던트에 점수의 총합
		
		
		// 이중 for문 이용한 sort
		for (int i = 0; i < student.length; i++) {
			for (int j =i; j< student.length; j++) {
				if (student[i].total < student[j].total) {//0번째부터 나머지를 다비교 크면 교환 j=i를 넣으면 자기자신하고도 비교,상관은 없다.
					StudentClass1 tmp = student[i];
					student[i] = student[j];
					student[j] = tmp;
					
				}
			}
				
		}
		
		for (int i = 0 ; i < student.length; i++) {
			System.out.println(student[i].print()); // 이중for문이용한 소트한것을 출력하는 프린트문
		
		}
		
		System.out.println(Arrays.toString(student));//배열 출력 스투던트 클래스의 토탈을 리턴해준다. 스투던트에서 오버라이드한 함수.
					//인스턴스를 만들었으니까 그 인스턴스는 원래 클래스에서 선언한 속성과 함수를 따른다. 그리고 인스턴스를 배열로 만든 형태
	
	}

}

