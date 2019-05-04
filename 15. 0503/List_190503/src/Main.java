/************************************************************************
List list = new ArrayList(); 와 ArrayList list = new ArrayList(); 의 차이는 무엇인가.

클래스를 생성할 때 도형 타입으로 생성하게 되면 정사각형이 아닌 다른 직사각형, 삼각형 등 
도형 인터페이스를 구현한 클래스에서 사용 될 수 있다. 
하지만 정사각형 클래스로 생성하게 되면 직사각형, 삼각형 등 에서는 사용할 수 없다.

 - 자바의 다형성 관련 -

도형에 비유하여 풀어보면,

List list = new ArrayList();
-> 도형 list = new 정사각형();

ArrayList list = new ArrayList();
-> 정사각형 list = new 정사각형();
(List는 interface다. interface는 공통되는 메소드를 추출해 놓은 클래스로 생각하면 된다.)
참고 사이트 : https://yongdev.tistory.com/13
*************************************************************************/
import java.util.ArrayList;

public class Main  {
	public static void main(String[] args) {
		//String 을 generic으로 명시해줘야 해당 값의 타입을 인식할 수 있다.
		ArrayList<String> stringList = new ArrayList<String>();
		
		//추가 
		stringList.add("AAAA");
		stringList.add("BBBB");
		stringList.add("CCCC");
		stringList.add("DDDD");
		
		System.out.println(stringList);
		
		//변경
		stringList.set(1, "EEEE");
		
		System.out.println(stringList);
		
		//가져오기
		String getFromList = stringList.get(0);
		
		System.out.println(getFromList);
		
		//확인
		System.out.println(stringList.contains("AAAA"));
		System.out.println(stringList.contains("FFFF"));
		
		//해당 값의 인덱스 확인
		System.out.println(stringList.indexOf("AAAA"));
		System.out.println(stringList.indexOf("FFFF"));
		
		//길이
		System.out.println(stringList.size());
		
		//비어있는지 확인
		System.out.println(stringList.isEmpty());
		
		//모두 비우기
		stringList.clear();
		
		System.out.println(stringList.size());
		System.out.println(stringList.isEmpty());
		
		//배열로 전환
		String[] stringArray = new String[0];
		stringList.toArray();
		
		
		//Quiz 1 정수 2,5,10,3,1 을 리스트 구조로 저장해보세요
		//list는 객체 데이터들만 사용 가능
		
		//case 1 : class 로. 개뻘짓 
		ArrayList<NumberClass> numList = new ArrayList<NumberClass>();
		numList.add(new NumberClass(2));
		numList.add(new NumberClass(5));
		numList.add(new NumberClass(10));
		numList.add(new NumberClass(3));
		numList.add(new NumberClass(1));
		
		//case 2 : Integer
		ArrayList<Integer> numList2 = new ArrayList<Integer>();
		numList2.add(2);
		numList2.add(5);
		numList2.add(10);
		numList2.add(3);
		numList2.add(1);
		
		System.out.println(numList2);
		
		//case 3 : 그냥 써도 됨. 
		ArrayList numList3 = new ArrayList();
		numList3.add(2);
		numList3.add(5);
		numList3.add(10);
		numList3.add(3);
		numList3.add(1);
		
		System.out.println(numList3);
		
		
	}
}
