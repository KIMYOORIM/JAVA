import java.util.Arrays;

public class RunClass {
	public static void main(String[] args) {
		Student[] student = new Student[10];
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
		}
		Random2 rand = new Random2();
		String[] names = {"김동준", "고지인", "이형섭", "박성민", "김경현", "송진우", "정형석", "김예근", "공현", "최성욱"}; //db와매칭이되어 만들어진다?
		for (int i = 0; i < student.length; i++) {
			student[i].name = names[i];
			rand.randomStudent(student[i]);
		}
		Arrays.sort(student);
		//sort 내부에 compareTo 메소드를 실행 하게끔 하는데 이 기준을 student에서 지정해 준거야 
		//student[0].compareTo(student[1]); 이게 생략되어있는 것과 같아 알아서 배열을 비교 해줄거야.앞부분이 student[0]인거고 비교하는 대상인 student[1]이 o.student 인거야. 알아서 자리를 바꿔줄거야. 
		for (int i = 0; i < student.length; i++) {
			System.out.println("" + (i + 1) + "등 : " + student[i].print());
		}
	}
}
