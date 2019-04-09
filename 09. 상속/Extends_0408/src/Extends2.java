//똑같은 이름의 메소든데 동작을 변경할 거야(사칙연산). 변경사항이 없으면 기존 동작을 하게 된다. 
public class Extends2 extends Extends_prac{
public void printResult() { 
	super.printResult(); //변경전에 부모클래스가 가지고있던 동작도 실행해 .
	System.out.println("더하기 결과 : " + (this.number1 + this.number2));
	System.out.println("빼기 결과 : " + (this.number1 - this.number2));
	System.out.println("곱하기 결과 : " + (this.number1 * this.number2));
	System.out.println("나누기 결과 : " + (this.number1 / this.number2));
}
public void newMethod() {
	
}
}
//this는 내 클래스. super는 상속이 이루어졌을 때 만 부모클래스 접근할 때 사용.