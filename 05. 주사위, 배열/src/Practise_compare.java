import java.util.Scanner;

//String 비교 (.equals)
public class Practise_compare {
public static void main(String[] args) {
	String a = "hello"; //같은 문자 , 주소가 같기 때문에 오류가 안나는 것
	//String b = "hello";
	Scanner scan  = new Scanner(System.in);
	String c = scan.nextLine();
	
System.out.println(a == c); //얘를 쓰면 false가 나오는거잖아 -> python에서는 맞게 나옴.
System.out.println(a.equals(c)); //이걸 써야 주소가 같을 때 같다고 나와 이게 맞음

System.out.println(a.hashCode());
System.out.println(c.hashCode());
}
}
