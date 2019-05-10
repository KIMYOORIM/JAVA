
public class Person {
	String name;
	Person[] players; // 주소로 접근하는 것이기 때문에 매번 갱신된 sayNumber를 가져올 수 있는 것
	// 2. 차례를 알고있는 경우
	int position = 0;
	int startNumber = 0;
	int endNumber = 0;
	int sayNumber = 0;

	// Constructor
	Person(String name) {
		this.name = name;
	}

	// 게임에 참여한 사람(객체) 인지 및 나의 포지션,시작 숫자, 끝 숫자
	public void readyGame(Person[] players, int position, int startNumber, int endNumber) {
		this.players = players;
		this.position = position;
		this.startNumber = startNumber;
		this.endNumber = endNumber;
	}

	// 앞에 있는 사람이 말하는 것에서 +1을 하는 것을
	public void sayNumber() {
		// 나 -> 이전사람
		// 0 -> 2
		// 1 -> 0
		// 2 -> 1
		// 이 나올 수 있게끔 조정한 부분. (0 + 3 -1) % 3
		// 해서 나의 이전사람이 누구였는지 찾아서 그사람의 sayNumber에 + 1 을 한 것이
		// 나의 sayNumber가 되는 것임.
		
		// case 1
		this.sayNumber = this.players[(this.position + (this.players.length - 1)) % this.players.length].sayNumber + 1;
		System.out.println(this.name + " say " + this.sayNumber);

		// case 2
//		int prevPosition = this.position - 1;
//		if (prevPosition < 0) {
//			prevPosition = this.players.length - 1;
//		}
		int nextPosition = (this.position + 1) % this.players.length;
		// 무한루프에 빠지지 않게 조건걸기 : endNumber이전 숫자일 때만 다음 사람에게 넘겨라
		if (this.sayNumber < this.endNumber) {
			// 다음사람에게 차례를 넘기기
			this.players[nextPosition].sayNumber();
		}
	}
	//game start
	public void gameStrart() {
		this.players[(this.position + (this.players.length - 1)) % this.players.length].sayNumber = this.startNumber - 1;
		this.sayNumber();
	}
}
