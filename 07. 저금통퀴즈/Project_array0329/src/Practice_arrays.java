import java.util.Arrays;
import java.util.Scanner;

public class Practice_arrays {
	public static void main(String[] args) {
		//�迭������ ����
		int[] arr = { 1, 2, 3, 4 };
		int[] arr2 = arr;
		int[] arr3 = arr2;

		arr3[0] = 10;
		System.out.println(Arrays.toString(arr));//�迭�� System.out.println() ���� ����Ϸ���, 
                                                 //Arrays.toString() �޼��带 ����� ���ڿ��� ��ȯ�ؾ� �մϴ�. 
		                                         //�迭 ��Ҹ� ��ǥ�� �����Ͽ� ���� ���� ��ȯ�� �ݴϴ�.
		System.out.println(arr[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		
		//���� ���� ����� ���� �ƴ϶� ������ �ּҰ��� ����. 
		int[] arr4 = {10,20,30};
		System.out.println(arr4);
		
		Scanner scanner = new Scanner(System.in);
		int[] grades = new int[5]; //grade ��� �迭 ������ �ټ����� �������� �ְڴ�?
		
		for(int i = 0; i< grades.length; i++) {
			System.out.println(i + "���� ������ �־��ּ���");
			int userInput = scanner.nextInt();//userInput �̶�� ���� ������ ���� �ްڴ�?
			grades[i] = userInput;
		}
		
		System.out.println("ó���� �������� ������ �����ϴ�.");
		System.out.println(Arrays.toString(grades)); //toString�� ����?
			
		}
		
	}