import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*************************************************************************
 * 참고 사이트 : https://vaert.tistory.com/107 HashMap 은 순서가 없다
 **************************************************************************/
public class Main3 {
	public static void main(String[] args) {
		// generic 1 : key, generic 2: value
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// data input
		map.put(0, "AAAA");
		map.put(0, "BBBB");
		map.put(1, "CCCC");

		System.out.println(map);

		//
		System.out.println(map.entrySet().size());

		// 해쉬맵 순차적인 출력
		for (Map.Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}

		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("name", "AAAA");
		map2.put("score", "100");
		map2.put("total", "230");

		System.out.println(map2);

		// Quiz2 : 맵을 사용하여 성적 데이터 10명 생성(Student 클래스 사용)하고,
		// 기말고사 점수가 향샹된 사람 출력하세요
		//key = Integer
		HashMap<Integer, Student> map3 = new HashMap<Integer, Student>();
		System.out.println("*******************성적이 향상된 학생 목록********************");
		for (int i = 0; i < 10; i++) {
			map3.put(i, new Student((i + 1) + "번째 학생"));
			if (map3.get(i).getMidTerm() < map3.get(i).getFinalTerm()) {
				System.out.println(map3.get(i));
			}
		}
		
		//key = String
		System.out.println("*******************성적이 향상된 학생 목록2********************");
		HashMap<String, Student> class1 = new HashMap<String, Student>();

		String[] keySet = new String[10];
		for (int i = 0; i < 10; i++) {
			keySet[i] = (i + 1) + "번째 학생";
		}

		for (int i = 0; i < 10; i++) {
			class1.put(keySet[i], new Student(keySet[i]));
			if (class1.get(keySet[i]).getMidTerm() < class1.get(keySet[i]).getFinalTerm()) {
				System.out.println(class1.get(keySet[i]));
			}
		}
		
		//value = 복수의 value => 실패, 이유 : 하나의 key에 복수개의 value가 매칭되는것이 불가능
		System.out.println("*******************성적이 향상된 학생 목록2********************");
		HashMap<String, Integer> class2 = new HashMap<String, Integer>();
		for (int i = 0; i < 10; i++) {
			class1.put(keySet[i], );
			class1.
			if (class1.get(keySet[i]).getMidTerm() < class1.get(keySet[i]).getFinalTerm()) {
				System.out.println(class1.get(keySet[i]));
			}
		}
	}
}
