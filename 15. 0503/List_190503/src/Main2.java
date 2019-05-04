import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main2 {
	public static void main(String[] args) {

		Student[] students = new Student[10];

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student((i + 1) + "번째 학생");
		}
		
		System.out.println("*********************LIST****************************");
		// 배열을 리스트로
		List<Student> list = Arrays.asList(students);
		for (int i = 0; i < students.length; i++) {
			if (students[i].getMidTerm() < students[i].getFinalTerm()) {
				System.out.println(students[i]);
			}
		}
		
		// list
		List<Student> students2 = new ArrayList<Student>();
		Student[] stArr = new Student[students2.size()];

		//리스트를 배열로
		System.out.println("*********************Array***************************");
		for (int i = 0; i < stArr.length; i++) {	
			System.out.println(stArr[i] + "번째 학생");
		}
		
		
		for (int i = 0; i < 10; i++) {
			students2.add(new Student((i + 1) + "번째 학생"));
		}

		// get으로 리스트의 인덱스에 해당하는 데이터를 가져온다
		for (int i = 0; i < students.length; i++) {
			if (students2.get(i).getMidTerm() < students2.get(i).getFinalTerm()) {
				System.out.println(students2.get(i));
			}
		}
		System.out.println("*********************LIST****************************");
		
		// 각각의 인데스의 데이터에 대해 접근해서
		students2.forEach(new Consumer<Student>() {

			@Override
			public void accept(Student t) {
				// TODO Auto-generated method stub
				if (t.getMidTerm() < t.getFinalTerm()) {
					System.out.println(t);
				}
			}
		});
		//리스트를 배열로
		Student[] students3 = (Student[])students2.toArray();
	}
}
