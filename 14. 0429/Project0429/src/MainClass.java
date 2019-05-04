import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		String[] names = {"철수","영희","짱구","유리","길동","꺽정","둘리","뽀로로","하빛","두두"};
		Student[] student = new Student[names.length];
		
		for(int i = 0 ; i<names.length;i++) {
			student[i] = new Student(names[i]);
	}
		List<Student> list = Arrays.asList(student);// 배열이 있는데 리스트로 바꿀 때 . 여기확인하자. 
		for(int i = 0; i<student.length; i++) {
			if(student[i].midTerm < student[i].finalTerm) {
				System.out.println(student[i]);
			}
		}//부모클래스 이름으로 ArrayList 생성해도 문제 없다. 교수님 파일 line8 객체데이터 자체가 들어간거다. line11
		//전체로 접근한다.?
		//몇번째에 있는애를 뽑아올래. .get(index)
		//consumer??? foreach 에 자바독 보고 반드시 consumer를 바탕으로 한 객체가 들어와야한는걸 확이
		//그래ㅓㅅ new consumer 라는 애를 만들어 준것
		//그안에 없는 unimplement 뜨면 선택해서 생성한다ㅣ. 
}
}