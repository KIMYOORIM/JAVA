//��ü������
import java.util.Scanner;

public class Runclass_stu {
	public static void main(String[] args) {
//	Student s1 = new Student();
//	s1.name = "ȫ�浿";
//	s1.korScore = 100;
//	s1.engScore = 30;
//	s1.mathScore = 20;
//	s1.memo = "�޻翡 ��������";

		Student[] sArray = new Student[10]; //�迭���� (������ 10�� �����)
		//�ѹ��� ���� ������ ���� ù��° ����� ���� �� ��.
		// sArray[0].name = "ȫ�浿";
		Scanner scan = new Scanner(System.in);//��ü����
		for (int i = 0; i < sArray.length; i++) {
			sArray[i] = new Student();
			System.out.println("" + (i + 1) + "��° �л� ������ �Է�");
			System.out.println("�̸� : ");
			sArray[i].name = scan.nextLine();
			System.out.println("�������� : ");
			String korString = scan.nextLine();
			sArray[i].korScore = Integer.parseInt(korString); //"100"=>100 ���ڿ� ���ڷ� ��ȯ
			System.out.println("�������� : ");
			String engString = scan.nextLine();
			sArray[i].engScore = Integer.parseInt(engString);
			System.out.println("�������� : ");
			String mathString = scan.nextLine();
			sArray[i].mathScore = Integer.parseInt(mathString);
			scan.nextLine();
			
		}
	}
}