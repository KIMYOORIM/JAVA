
public class RunClass {
		int name = 5;
		String name1 = "Hello";


	public boolean equals(RunClass obj1) { //이건 오버라이드가 아니라 새로운 메소드를 만든거다. 
		if(this.name == obj1.name) {
			return true;	
		}
		return false;
	}
	
	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return this.name1;
	}
}
