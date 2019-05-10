import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add(new String("A"));
		System.out.println(set);
		
		ArrayList<PlayerVO> list = new ArrayList<PlayerVO>();
		
		//각 list나 배열등 저장방법(프레임워크)별로 데이터 넣고 빼는거 연습 해볼 것. 목적은 
		//어떤 데이터구조일때 어떤 list나 배열 구조가 유용한지 파악
		list.add(new PlayerVO("김유림", "투수", 1999));
		list.add(new PlayerVO("김선화", "포수", 2005));
		list.add(new PlayerVO("지배욱", "1루수", 2003));
		list.add(new PlayerVO("이형섭", "2루수", 2010));
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);

	}
}
