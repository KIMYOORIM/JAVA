import java.util.Arrays;
import java.util.Scanner;

//���� ������ ���������� �Է¹޾Ƽ� �Էµ� �� ��� �� ���� ��� ���϶�.
public class Practice5_0322 {
public static void main(String[] args) {

	
	//int[] scoreNum = {0,0,0,0,0,0,0,0,0,0,0,0}
	int[] scoreNum = new int[10];      //�迭 ī�带 ����� ��.
	
	Scanner nameScan = new Scanner(System.in);
	
	for(int i= 0; i < scoreNum.length ; i++) { //�Է¹��� �� �ѹ��� ����ص� ������ ���߿� ������ �ʿ��� �� ��������. �и��ϴ� �� ����.
		System.out.println("�������� : ");
		scoreNum[i] = nameScan.nextInt();
	
	}
	System.out.println(Arrays.toString(scoreNum)); //for���� ���ؼ� ����ϱ� 

	//������� ���� �����
	int total = 0;
	double average = 0;
	
	for(int i = 0; i < scoreNum.length; i++) {
	total = total + scoreNum[i];
	}
average = (double)total / scoreNum.length;

System.out.println("������ : " + total);
System.out.println("������ : " + average);
}
	
		
	}

//�߰� ���� : �̸�, ��������, ����,���� ���� �Է¹ް� �� ��������ϰ� �л��� �������� ��� 