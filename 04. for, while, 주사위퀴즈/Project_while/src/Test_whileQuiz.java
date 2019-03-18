import java.util.Random;

public class Test_whileQuiz {
	public static void main(String[] args) {
		Random rand = new Random();

		int totalScore = 0;
		/*
		 * for (int i = 0; i < 8; i++) {
		 * int randNumber = rand.nextInt(101);
		 * System.out.println("입력된 점수 : " + randNumber); 
		 * totalScore = totalScore + randNumber; } 
		 * System.out.println("총점은 " + totalScore + "입니다.");
		 * 
		 * double averageScore = 0; averageScore = (double) totalScore / 8; // 나누기할때 꼭
		 * 더블로 바꿔줘야함 System.out.println("평균은" + averageScore + "입니다.");
		 */
		int index = 0;
		while (index < 0) {
			int randNumber = rand.nextInt(101);
			System.out.println("입력된 점수 : " + randNumber);
			totalScore = totalScore + randNumber;
			index++; //for 이랑 같으나 표현만 다른거
		}

	}
}

/*
 * import java.util.Scanner;
 * 
 * public class Test_whileQuiz { public static void main(String[] args) {
 * Scanner scoreNum = new Scanner(System.in);
 * 
 * for (int i = 0; i < 3; i++) { System.out.println(i); }int purple; purple =
 * scoreNum.nextInt(); int blue; blue = scoreNum.nextInt(); int green; green =
 * scoreNum.nextInt();
 * 
 * int scoreNum3; int average;
 * 
 * scoreNum3 = (purple + blue + green); System.out.println("총점은 : " + scoreNum3
 * + "점 입니다."); average = ((purple + blue + green) / 3);
 * System.out.println("평균은 : " + average + "점 입니다.");
 */
