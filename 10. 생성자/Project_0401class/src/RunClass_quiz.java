import java.util.Scanner;

public class RunClass_quiz {
	public static void main(String[] args) {
		
		//public void inputScore(){
		Scanner scan = new Scanner(System.in);
		Quiz_1[] dataArray = new Quiz_1[5]; //5개 배열 선언
		
	for(int i = 0 ; i < dataArray.length; i++) {
		System.out.println((i+1) + "번째 학생 ");
		dataArray[i] = new Quiz_1();
		
		System.out.println("");
	System.out.println("이름");
	dataArray[i].name = scan.nextLine(); //this.name = main창에 넣은 변수 다가져와서 
	
	
	System.out.println("�������� ");
	String korString = scan.nextLine();
	dataArray[i].korScore = Integer.parseInt(korString);
	System.out.println("��������");
	String engString = scan.nextLine();
	dataArray[i].engScore = Integer.parseInt(engString);
	System.out.println("�������� ");
	String mathString = scan.nextLine();
	dataArray[i].mathScore = Integer.parseInt(mathString);
	System.out.println("����");
	int sumScore = dataArray[i].korScore + dataArray[i].engScore + dataArray[i].mathScore;
	System.out.println(sumScore);
	System.out.println("���");
	int aveScore = sumScore / 3;
	System.out.println(aveScore);
	
	
}
}
}