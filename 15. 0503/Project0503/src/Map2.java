//문자열. 대부분 사용하는 키밸류 형태 
import java.util.HashMap;
import java.util.Map;

public class Map2 {
public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<String, String>();
	//키에사용할 제네릭과 값에 사용할 제네릭 두개다. 숫자와 문자열을 가지고 사용  예시
	map.put("name","hello");
	map.put("name","aaa"); //나중에 넣어준애로 변경 된다. 
	map.put("name","bbb");//출력하는데에 순서가 없다. 
	System.out.println(map);
	
	for(Map.<String,String> item : map.entrySet()) {//foreach 하나씩 접근 여기 안되는거 교수님 파일 확인해 .
		System.out.println(item.getKey());
		System.out.println(item.getValue());
	//hash<string,student>로하면 되겠지 우리는 student class를
}
}
}