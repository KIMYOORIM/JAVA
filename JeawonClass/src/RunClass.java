
public class RunClass {
public static void main(String[] args) {
	Student[] student = new Student[10];
	Student[] subject = new Student[3]; //과목담을공간
	String[] name = {"JAVA","PYTHON","DB"};
	
	
	
	for(int a = 0; a < student.length ; a++) {
		student[a] = new Student(); //10명학생의 객체 생성.
		student[a].name = (a+1) + "번 학생";
	}
	
	for(int i = 0; i < subject.length; i++) { //subject의 과목이름을 넣어줌.
		subject[i] = new Student(); //빠트리면 안돼
		subject[i].name = name[i];
	}
	
	
	System.out.println();

}
	
}
