import java.util.HashMap; //숫자 

public class Map {
public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	//키에사용할 제네릭과 값에 사용할 제네릭 두개다. 숫자와 문자열을 가지고 사용  예시
	map.put(0,"hello");
	map.put(0,"aaa"); //나중에 넣어준애로 변경 된다. 
	map.put(1,"bbb");
	System.out.println(map);
}
}
