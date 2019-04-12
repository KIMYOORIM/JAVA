//추상클래스 내용없이 변수만 썼을 때 뜬다. 
public abstract class ParentsClass { //부모클래스는 추상클래스로 만들어 준다. 
public void print() {
	System.out.println("hello"); //처음 extends할때는 이 일반메서드만 쓰고 메인에서 실행 확인. 
}
public abstract void print2(); //abstract 메소드는 반드시 불러주라고 자식 클래스에서 알려준다. 
}