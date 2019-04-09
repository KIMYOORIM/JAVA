import java.util.Arrays;
import java.util.Scanner;

public class Practice_arrays {
	public static void main(String[] args) {
		//배열복사의 원리
		int[] arr = { 1, 2, 3, 4 };
		int[] arr2 = arr;
		int[] arr3 = arr2;

		arr3[0] = 10;
		System.out.println(Arrays.toString(arr));//배열을 System.out.println() 으로 출력하려면, 
                                                 //Arrays.toString() 메서드를 사용해 문자열로 변환해야 합니다. 
		                                         //배열 요소를 쉼표로 구분하여 보기 좋게 변환해 줍니다.
		System.out.println(arr[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		
		//실제 값이 저장된 것이 아니라 공간의 주소값을 저장. 
		int[] arr4 = {10,20,30};
		System.out.println(arr4);
		
		Scanner scanner = new Scanner(System.in);
		int[] grades = new int[5]; //grade 라는 배열 변수에 다섯개의 정수값을 넣겠다?
		
		for(int i = 0; i< grades.length; i++) {
			System.out.println(i + "성적 점수를 넣어주세요");
			int userInput = scanner.nextInt();//userInput 이라는 변수 생성후 값을 받겠다?
			grades[i] = userInput;
		}
		
		System.out.println("처리할 점수들은 다음과 같습니다.");
		System.out.println(Arrays.toString(grades)); //toString이 뭐야?
			
		}
		
	}