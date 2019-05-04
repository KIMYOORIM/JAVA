import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.Map;
public class RunClass {
	public static void main(String[] args) {
		String[] names = { "철수", "영희", "짱구", "유리", "길동", "꺽정", "둘리", "뽀로로", "보고", "유신" };
		ArrayList<Student> student = new ArrayList<Student>();
//student형태로 리스트를 만들어서 add로 student데이터들을10개 넣어준것. 
		for (int i = 0; i < names.length; i++) {
			student.add(new Student(names[i]));
		}
		//arraylist라는 애를 array로 변환해준것과 같다.
		Student[] arr = new Student[student.size()]; //[10]해준것과 같다. 
		student.toArray(arr);
		System.out.println(arr[0]);
		 //중간, 기말 비교해서 향상된사람 출력하는 거 이걸로 해보기 . 

	}
}
