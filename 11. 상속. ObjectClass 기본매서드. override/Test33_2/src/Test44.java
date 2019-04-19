import java.util.Random;

public class Test44 {
	public static void main(String[] args) {
//	Random2 rand = new Random2(); //nextInt를 모르니까 random2로 만들어준다.  
//	System.out.println(rand.newMethod(10)); //방법 1
		Random rand = new Object2();
//		Random rand1 = new Random();//그냥 random으로 받으면 기존 메서드실행된다. (+100 이아닌)
		System.out.println(rand.nextInt(10)); // 방법 2
//		System.out.println(rand1.nextInt(10));
 //오버라이드로 바꿔놨을 경우 원래의 기능 쓰려면 새로운 메소드 하나 만들어서 super.로 원래꺼를 쓸 수 있게 해주면 된다. 
		
	}
}
