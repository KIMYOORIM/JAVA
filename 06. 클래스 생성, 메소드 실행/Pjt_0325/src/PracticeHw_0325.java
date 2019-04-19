import java.util.Random;

public class PracticeHw_0325 {
public static void main(String[] args) {
	
	Random rand = new Random();
	for (int i = 0 ; i < 30; i++) {
		i = rand.nextInt(30);
		
System.out.println(i);
	}
}
}
