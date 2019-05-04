import java.util.ArrayList;

public class ArrayList2 {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(2); //정수를 리스트 구조로 저장하기 
	list.add(5);
	list.add(10);
	list.add(3);
	list.add("abc");
	
	System.out.println(list);
	
	for (int i = 0; i < list.size();i++) { //for문 돌면서 안에 내용 가져오기 .
		System.out.println(list.get(i)); //List 자체는 interface야 arraylist는 거기서 나온애라서 
	}
	
	}
}
