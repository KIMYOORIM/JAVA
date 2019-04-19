//object 클래스의 .equals(비교)와 tostring(출력)객체 
public class Class1 {
	public static void main(String[] args) {
		Object a = new RunClass();
		Object b = new RunClass(); //object변수로 가져오게 되면, 기존 object 메소드가 실행. 주소값비교니까 false
		// RunClass 변수로 가져오면, 내가 만든 메소드가 실행된다. 숫자비교니까 true나오지. 
		
		System.out.println("a.equals 결과:" + a.equals(b));
		System.out.println(a);
		System.out.println(a.toString());
	}
	
	
	
	

}
