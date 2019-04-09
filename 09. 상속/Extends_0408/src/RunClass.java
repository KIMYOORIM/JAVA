
public class RunClass {
public static void main(String[] args) {
	Extends2 test2 = new Extends2();//확장해서 클래스를 만들어도 동일하게 사용 가능하다. 
	//Extends_prac test2 = new Extends2();
	//변수는 부모클래스 이름으로 생성된 변수를 사용해도 된다. 
	//생성된 건 extend2이다. 공간만 부모클래스이용.
	// 변수는 내가 지정한 클래스대로 무엇을 할 수있는지를 구분하게 된다. 
	//부모 공간 사용했을 시 메소드는 부모 클래스것만 사용 할 수있지만 동작은 사칙연산을 하게된다???
	test2.inputNumber(); 
	test2.printResult();
	test2.newMethod(); //부모클래스로 했을 때 자식 크래스의 동작은 수행할 수 없다?
}
}
