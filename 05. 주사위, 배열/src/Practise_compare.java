import java.util.Scanner;

//String �� (.equals)
public class Practise_compare {
public static void main(String[] args) {
	String a = "hello"; //���� ���� , �ּҰ� ���� ������ ������ �ȳ��� ��
	//String b = "hello";
	Scanner scan  = new Scanner(System.in);
	String c = scan.nextLine();
	
System.out.println(a == c); //�긦 ���� false�� �����°��ݾ� -> python������ �°� ����.
System.out.println(a.equals(c)); //�̰� ��� �ּҰ� ���� �� ���ٰ� ���� �̰� ����

System.out.println(a.hashCode());
System.out.println(c.hashCode());
}
}
