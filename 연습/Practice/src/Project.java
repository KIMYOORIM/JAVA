
public class Project extends Practice_ {
	
	public void test() {
		System.out.println(name + age);;//()안의 name은 사실  super.name 이다. 부모클래스의 name.
	}

	public Project(String name, int age) {
		super(name, age); //부모클래스의 생성자를 호출. name,age를 Project 생성자 내에서 초기화해줄 수있지만 확실하게 역할 분담하기 위함. 
	
	}
	

}
