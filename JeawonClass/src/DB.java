import java.util.Arrays;

public class DB extends Subject {

	public void dbTest() {
		Random1 random = new Random1();
		random.dbRand();
		System.out.println(Arrays.toString(random.dbTest)); // db다섯번퀴즈
	}

}
