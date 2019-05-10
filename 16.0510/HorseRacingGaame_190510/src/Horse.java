import java.util.Random;

public class Horse {
	//기본
	private String name = "";
	private int speed = 0;
	private int moveMeter = 0;
	private Stadium stadium = null;

	//속도를 결정할 속성들
	
	//생성자
	public Horse(String name) {
		Random rand = new Random();
		this.speed = rand.nextInt(6) + 5;
		// TODO Auto-generated constructor stub
	}
	
	/*메소드
	 * -field의 properties값을 설정 = 생성자에서 해결가능
	 * moveMeter를 산출해내는 메소드 
	 *  
	 */
	public void move() {
		
	}
}
