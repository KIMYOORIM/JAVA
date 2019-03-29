
public class Runclass_quiz {
public static void main(String[] args) {
	MBox_quiz money = new MBox_quiz();
	MBox_quiz money2 = new MBox_quiz();
	
	money.deposit(100);
	money.deposit(10);

	System.out.println(money.totalCoin);
	System.out.println(money2.totalCoin);
}
}
