import java.util.Random;

public class Test55 extends Random{
	//상속을 받아도 내가사용할 property생성가능. 
	int[] resultArr = new int[10]; //10개의 값을 담을 배열 생성
	
	public void nextInt2(int range) { //랜덤함수를 상속받아 새로운 메소드를 생성한거잖아. 
		for(int i = 0; i < resultArr.length; i++) {
			resultArr[i] = super.nextInt(range);
	}
	}

}
