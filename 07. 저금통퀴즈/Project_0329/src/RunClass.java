//돼지저금통 객체지향 
//public 외부에서 접근 가능. private 접근불가능, private는 내부 메소드를 통해서만 property변경 가능하다. ex)setname
//public 은  쓴 값대로 변경 가능. 
//그래서 box1.name으로 public에서는 변경 가능하지만 private에서는 오류가 남. 
public class RunClass { // 실행할 것을 메인함수에 넣으면돼
	public static void main(String[] args) {
		MBox box1 = new MBox();
		box1.deposit(100);
		box1.deposit(1000);

		System.out.println(box1.totalCoin);
	box1.name = "저금";
	}
	
}
