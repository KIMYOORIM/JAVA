import java.util.Random;

//여기까지는 다 이해하시고 넘어가세요 
public class Student {
	String name;
	int midTerm;
	int finalTerm;

	Student(String name) { // 생성자 사용한 초기화
		this.name = name;
		Random rand = new Random();
		this.midTerm = rand.nextInt(1001);
		this.finalTerm = rand.nextInt(1001);
	}

	@Override
	public String toString() { //이거 안하면 주소값 나올거야. 
		return this.name + "(중간 : " + this.midTerm +", 기말 : " + this.finalTerm + ")";
		
	}

}

