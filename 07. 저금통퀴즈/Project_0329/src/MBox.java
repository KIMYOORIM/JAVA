//돼지저금통 객체지향 
public class MBox {
	public int totalCoin = 0;// 내가 가지고 있던 돈
	public String name;
	public void deposit(int inputCoin) {
		if(inputCoin < 1000) {
			this.totalCoin = this.totalCoin + inputCoin; // 저금통에 들어온돈을 원래돈과 더해줌
		}
	}
	
}
