
public class Student implements Comparable<Student> { //내 클래스에 이 comparable이라는 규칙을 사용할거야. sort가 알게끔 해주는거지 compareto를 
	String name;
	int kor;
	int eng;
	int math;
	int total;

	public String print() {
		return this.name + " 총점 : " + this.total + "(국어 " + this.kor + ", 영어 " + this.eng + ", 수학 " + this.math + ")";
	}
	@Override
	public int compareTo(Student o) { //o는 변수야  비교대상. 대상과 나를 비교해서 나를 앞으로 보낼 지 말지를 지정하게 된다. 
		if (this.total > o.total) { 
			return -1; //(나를 기준으로 )음수일경우에는 나를 앞으로 보내  <>비교로 오름차순, 내림차순 비교 할 수있다. 
		} else if (this.total < o.total) {
			return 1; //
		}
		return 0;
	}
}
