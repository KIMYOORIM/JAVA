import java.util.regex.Pattern;

//Person 클래스를 사용합니다
public class MidTerm4 {
	public static void main(String[] args) {
//
//		Person[] p = new Person[3];
//		p[0] = new Person("짱구", 1, 50);
//		p[1] = new Person("철수", 1, 50);
//		p[2] = new Person("유리", 1, 50);
//		System.out.println("3,6,9 게임 시작~~~~~");
//
//		boolean loopEnd = true;
//
//		
//		while (loopEnd) {
//			for (int i = 0; i < p.length; i++) {
//				p[i].count();
//				
//				//해당 객체의 endgame이 true라면 반복종료
//				if (p[i].getEnd()) {
//					loopEnd = false;
//					break;
//				}
//			}
//		}
//		
//		System.out.println("게임이 끝났습니다~~~");
		
		//<교수님> 정규표현식 사용 3,6,9 가 몇개나 있는지. 
		String test = "3699999";
		Pattern pat = Pattern.compile("(3|6|9)") //정규표현식 패턴을 만들어준다. 원래는/(3|6|9)/ 이렇게 표현 / "[369]" 한자리 숫자일 때 사용
		Matcher match = pat.matcher(test); //해당되는게 있는지 찾아준다.(test에서 저 정규표현식이 매치되는지 봐줘)
		int matchCount = 0;
		for(int i = 0; i < 1000; i++) {
			if(match.find()) { //find, group 을 통해서만 볼 수 있다. (결과를?)
				this.clap = this.clap + "짝"
				System.out.println(match.group());
				matchCount++;
			}else { //매치끝날때까지 돈다. 
				break;
			}
		}
		System.out.println("총 매치 개수 : " + matchCount); //확인용
		
//	}
//}
