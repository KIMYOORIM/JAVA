import java.util.Random;

public class Student {
	private String name = "";
	private int midTerm = 0;
	private int finalTerm = 0;

	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.setScore();
	}
	
	private void setScore() {
		Random rand = new Random();
		this.midTerm = rand.nextInt(1001);
		this.finalTerm = rand.nextInt(1001);
	}
	
	public int getMidTerm() {
		return this.midTerm;
	}
	
	public int getFinalTerm() {
		return this.finalTerm;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = String.format("%s의 MidTerm : %03d, FinalTerm : %03d", this.name, this.midTerm, this.finalTerm);
		return result;
	}
}
