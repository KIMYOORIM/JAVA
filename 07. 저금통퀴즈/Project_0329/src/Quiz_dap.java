//돼지저금통 퀴즈 예시
public class Quiz_dap {
	private int coin;

	public void deposit(int coin, String message) { // 코인이 들어옴
		this.coin = this.coin + coin; // 들어온 코이을 합쳐 줌. //this coin 은 맨위 private의 coin
		if (message.contentEquals("")) {
			System.out.println("땡그랑"); // 코인이 들어오면 땡그랑 출력

		} else {
			System.out.println(message);// 메세지와 같이들어오면 메세지 출력
		}

	}
}