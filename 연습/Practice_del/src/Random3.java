import java.util.Random;

public class Random3 extends Random{
	public void rand(StudentClass stu) { //인자값에 넣어주어야한다. 
		stu.korScore = this.nextInt(101);
		stu.engScore = this.nextInt(101);
		stu.mathScore = this.nextInt(101);
		stu.totalScore = stu.engScore + stu.korScore + stu.mathScore;
	}
}
