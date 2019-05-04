//1. 1부터 1000까지 5의 배수의 합을 구하시오.(제약없음)
public class SumClass {
public static void main(String[] args) {
	int sum = 0;
	for(int i = 1; i < 1001; i++) {
		if(i % 5 == 0);
		sum = sum + i;
	}
	System.out.println("1 부터 1000까지  5의 배수의 합은 : " + sum + "입니다.");
}
}
