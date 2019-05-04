import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Map;

//map 사용 
public class RunClass2 {
public static void main(String[] args) {
	Random rand = new Random();
	String[] names = { "철수", "영희", "짱구", "유리", "길동", "꺽정", "둘리", "뽀로로", "보고", "유신" };
	
	HashMap<String, Student> map = new HashMap<String, Student>();
//	ArrayList<Student> student = new ArrayList<Student>();
//student형태로 리스트를 만들어서 add로 student데이터들을10개 넣어준것. 
	for (int i = 0; i < names.length; i++) {
		map.put(names[i], new Student(names[i]));
	}
	for(Map.Entry<String, Student> item : map.entrySet()) {
		Student one = item.getValue();
		if(one.middleScore < one.finalScore) {
			System.out.println(one);
		}
	}
	
}
}

