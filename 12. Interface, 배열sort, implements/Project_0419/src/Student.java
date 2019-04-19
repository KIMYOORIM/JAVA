//외부에서 만든 규칙을 사용하는게 인터페이스다. 
public class Student implements Comparable<Student>{ //인터페이스를 추가할 때는 implements 
	String name; //부모타입의 이 여러 개의 파라미터 받으려면
	// 배열을 만들어서 선언하면 다 넣을 수 있다. 성적표 넣는 것처럼
	//소트하기위해선 내부에서 이중포문으로 만들어 주던가 외부에서 가져와서 그 규칙을 지켜주어야 한다. comparable비교를 위한 규칙을 추가하겠다. 
	int kor;
	int eng;
	int math;
	int total; //student클래스를 객체ㄷ데이터를 만들어줌. 1

	public String print() {
		return this.name + " 총점 : " + this.total + "(국어 " + this.kor + ", 영어 " + this.eng + ", 수학 " + this.math + ")";
	}
	
	@Override  //array의 메소드 실행
	public String toString() { //생성자는 default값 . 그리고 
		String tmp = String.format("%05d", this.total); //여기서 tmp는 변수 숫자를 문자열로 바꿔준다. 세자리에서 없는곳에 0을 채운다. 자바에서 자주사용은 안한다. 
		return tmp; // 프린트 할때 실행되는 메소드 오버라이드. 이부분 소트 사용시 필요없어 확인하세요.숫자 문자로 바꿔줄 때 이부분 주의해서 설정 해주자. 
	
	}

	@Override //이게 만들어진다. 내가작으면 음수 같으면 0 뒤에가 작으면 양수.
	public int compareTo(Student o) {
		if(this.total < o.total) {
	}
	return 1;
	}

}

