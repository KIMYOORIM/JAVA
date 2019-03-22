import java.util.Arrays;

//system.arraycopy 이용
public class Practice4_0322 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
//		int[] arr2 = arr1;
//		int[] arr3 = arr2;
	//	
//		arr3[0] = 10;
	//	
//		System.out.println(arr[0]);
//		System.out.println(arr2[0]);
//		System.out.println(arr3[0]);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		
	int[] arr2 = arr;
	int[] arr3 = arr2;
	arr3[0] = 10;

	System.out.println(Arrays.toString(arr)); //for문 없이 배열 자체를 출력해주는것. 
	
	}
}
