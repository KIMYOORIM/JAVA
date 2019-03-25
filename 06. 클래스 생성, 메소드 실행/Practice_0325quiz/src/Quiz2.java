
public class Quiz2 {
	public void SumNumber(int num1, int num2) {
		int totalNumber = 0;
		for (int i = num1; i < num2 + 1; i++) {
			totalNumber = totalNumber + i;

		}
		System.out.println("1부터 100까지의 합은 : " + totalNumber);

	}
}
/*
 * //public class TotalNumber { 
 * public void doTotal { 
 * int totalNumner=0;
 * for (int i = 0; i<100;i++){
 * int number = i+1;
 * totalNumber = totalNumber + number;}
 * System.out.println("1부터 100까지의 합은 : " + totalNumber);
 * 
 */