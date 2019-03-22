//Â¦¼ö ÇÕ±¸ÇÏ±â
public class Practice_quiz {
public static void main(String[] args) {
	int total = 0;
	int evenTotal = 0;
	int oddTotal = 0;
	
	for (int i = 0; i < 100; i++) {
		int number = i + 1;
		total = total + number;
		
		int evenNumber = 0;
		int oddNumber = number;
		
		if(number % 2 == 0 ) {
			evenNumber = number;
			oddNumber= 0;
		}
		
		evenTotal = evenTotal + evenNumber;
		oddTotal = oddTotal + oddNumber;
	}
	
	oddTotal = total - evenTotal;
	System.out.println("ÃÑÇÕÀº"+ total);	
	}


}