//pdf16 숙제)
import java.util.Random;

public class Object2 extends Random{

	//방법1. 새로운 메소드를 만든다. 
	//public void newMethod(int range){
	//int newRandomNumber = super.nextInt(range) + 100; //새로운걸 만들거야. 원래거에서 100을 더해줘. 
	//return newRandomNumber ;
	
	
	
	@Override
	//방법 2. 오버라이드 . 부모클래스이름과 동일하게 쓸거야 .
	public int nextInt(int range) {
		int newRandomNumber = super.nextInt(range) + 100;
		return newRandomNumber; 
		// TODO Auto-generated method stub
	}
//	Random a = new Random();
//	int b = a.nextInt();
//	
}
