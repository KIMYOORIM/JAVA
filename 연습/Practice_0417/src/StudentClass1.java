
public class StudentClass1 {
	String name;
	int kor;
	int eng;
	int math;
	int total;

	
	
	public String print() {
		return this.name + " 총점 : " + this.total + "(국어 " + this.kor + ", 영어 " + this.eng + ", 수학 " + this.math + ")";
	}
	
	@Override
	public String toString() {
		String tmp = String.format("%03d", this.total); // 0을 안쓰면 11이 100 앞에나옴 첫글자부터 한글자씩 스트링처리되서 비교되므로 3자리 숫자로 출력하게끔. 
		return tmp;
	}
				//상속 받았을 때 오버라이드를 사용한다.
	private void toStrig() {
		// TODO Auto-generated method stub

	}
	
	
	
	
}
