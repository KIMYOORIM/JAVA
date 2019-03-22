//배열
public class Practice3_0322 {
	public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
//	int[] arr2 = arr1;
//	int[] arr3 = arr2;
//	
//	arr3[0] = 10;
//	
//	System.out.println(arr[0]);
//	System.out.println(arr2[0]);
//	System.out.println(arr3[0]);
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]);
	}
	System.out.println();
	
	
int[] arr2 = arr;
int[] arr3 = arr2;
arr3[0] = 10;

for(int i = 0; i < arr.length; i++) { //for문으로 배열 자체를 출력
	System.out.print(arr[i]);
	System.out.print(" ");
}
	}
	}


