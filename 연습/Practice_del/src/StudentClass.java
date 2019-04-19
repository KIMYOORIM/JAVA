//배열 sort 수업.
public class StudentClass implements Comparable<StudentClass>{
String name;
int korScore;
int engScore;
int mathScore;
int totalScore;


@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.name + " 총점  : " + this.totalScore + " 국어 : "+ this.korScore + " 영어 : " + this.engScore + " 수학 : " + this.mathScore;
}



@Override
public int compareTo(StudentClass o) {
	if (this.totalScore > o.totalScore) {
		return -1;
	}else if (this.totalScore < o.totalScore) {
		return 1;
	}else
	// TODO Auto-generated method stub
	return 0;
}



}
