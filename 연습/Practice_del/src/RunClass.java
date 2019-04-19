import java.util.Arrays;

public class RunClass {
public static void main(String[] args) {
	//10명 배열생성. 
	StudentClass[] student1 = new StudentClass[10];
	String[] name = {"보라돌이","뚜비","나나","뽀","따따","또또","기기","꼬꼬","뚜뚜","헤헤"};
	for(int i = 0; i< student1.length;i++) {
		student1[i] = new StudentClass();
	} //10명의 새로운 객체 생성. 
	
	Random3 random = new Random3();
	for(int a = 0; a < student1.length; a++) {
		student1[a].name = name[a];//학생a번째의 name에는 이름배열의a번째를 넣어줄거야. 
		random.rand(student1[a]);
	}
	
	//여기부터 소트할거야. 
	Arrays.sort(student1);
	//기준정해주러가자 
	for (int b = 0; b < student1.length;b++) {
		System.out.println((b+1) + " 등은 "+ student1[b].toString());
	}
	
}
}
