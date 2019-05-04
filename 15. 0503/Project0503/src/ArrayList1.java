import java.util.ArrayList;

public class ArrayList1 {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();//여기서 사용될 객체데이터는 무엇이다 라고 제네릭 설정. 
	list.add("AAAA"); //추가 
	list.add("BBBB");
	list.add("CCCC");
	list.add("DDDD");
	System.out.println(list);
	
	list.add("AAAA"); //수정 인덱스1이 내용을 수정. 
	list.add("BBBB");
	list.add("CCCC");
	list.add("DDDD");
	list.set(1,"EEEE");
	System.out.println(list);
	
	
	//특정 데이터를 가져와서 사용.
	String tmp = list.get(2);
	System.out.println(tmp);
	System.out.println(list.get(2));
	
	//배열로 바꿔서 사용하는 부분이 많다 
	
	
	
	
	}
}
