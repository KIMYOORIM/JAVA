//4. 짱구, 철수, 유리는 369 게임을 하고 있다. 369 게임 규칙에 맞춰서 결과를 출력하시오.
//1) 1부터 50까지 짱구, 철수, 유리가 돌아가면서 숫자를 출력하세요. 게임에서 틀리는 사람은 없다고 가정합니다. 즉 모든 사람은 50까지 정답만 말합니다(출력합니다).
//2) 369 게임은 숫자에 3,6,9가 들어간 경우 숫자 대신 '짝'이라는 박수소리를 출력하세요. (ex. 13인 경우 13을 출력하는 대신 '짝'을 출력. 33인 경우 '짝짝'을 출력)
public class Game {
	public static void main(String[] args) {
		String player1 = "짱구";
		String player2 = "철수";
		String player3 = "유리";

		for (int i = 1; i < 50; i = i + 3) {
			int a = i;
			int b = i+1;
			int c = i+2;
			if (a<10) {  
	            if (a == 3 || a == 6 || a == 9)
	                System.out.println("짝");
	            else
	            	System.out.println(player1 + a);
	        }
			if (b<10) {  
	            if (b == 3 || b == 6 || b == 9)
	                System.out.println("짝");
	            else
	            	System.out.println(player2 + b);
	        }
			if (c<10) {  
	            if (c == 3 || c == 6 || b == 9)
	                System.out.println("짝");
	            else
	            	System.out.println(player3 + c);
	        }
			else {
				boolean v1 = false;
				boolean v2 = false;
			//두자리수 비교 
			if (a>10) {  
			int a1 = a / 10;
			int a2 = a % 10;
	
	            if (a1 == 3 || a1 == 6 || a1 == 9)
	                v1 = true;
	            if (a2 == 3 || a2 == 6 || a2 == 9)
	                v2 = true;
	            else
	            	System.out.println(player1 + a);
	        }
			
			if (b>10) { 
				int b1 = b / 10;
				int b2 = b % 10;
	            if (b1 == 3 || b1 == 6 || b1 == 9)
	            	v1 = true;
	            if (b2 == 3 || b2 == 6 || b2 == 9)
	            	v2 = true;
	            else
	            	System.out.println(player2 + b);
	        }
			if (c>10) {  
				int c1 = a / 10;
				int c2 = a % 10;
	            if (c1 == 3 || c1 == 6 || c1 == 9)
	            	v1 = true;
	            if (c2 == 3 || c2 == 6 || c2 == 9)
	            	v2 = true;
	           
	        }
			if(v1 && v2) {
				System.out.println("짝짝");
			}else if(v1 || v2){
				System.out.println("짝");
			}else {
				System.out.println("박수없음");
			}
		

			}
		}
	}
}

