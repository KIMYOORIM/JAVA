//형변환
public interface Test4 {
public static void main(String[] args) {
	int a =66;
	short b = 3;
	b = (short)a;
	System.out.println(b);
	
	short c = 10;
	int d;
	d = c;
	System.out.println(c);

	System.out.println();
//앞에 애들도 더블이면 소수점까지 제대로 나옴 -> 캐스팅 
	int number1 = 10;
	int number2 = 3;
	double resultNumber = number1/number2;
	System.out.println(resultNumber);
	
	int number3 = 10;
	int number4 = 3;
	double resultNumber1 = (double)number3/(double)number4;
	System.out.println(resultNumber1);
	
//대입연산자
	
}
}
