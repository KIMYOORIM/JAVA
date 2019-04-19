import java.util.Random;
//랜덤클래스의 기능 확장
public class Random2 extends Random {
 public Student randomStudent(Student target) { //target이라는 애를 받아 채워주는 메서드 생성
	 target.kor = this.nextInt(101);
	 target.eng = this.nextInt(101);
	 target.math = this.nextInt(101);
	 return target;//void엔 return필요 x int 에만 필욧하다다.
 }
}
//랜덤클래스 상속받아 만듬. 랜덤이가지고있는 모든 메서드 가능 그래서 this.nextint가 가능한것.super.nextint도 가능. 오버라이드 안했으니까. 그리고 타겟에 랜덤갑을ㄹ 넣어줬고 리턴 ㅏ겠다하면 리턴도 스튜던트타입으로 리턴 해야돼
//리턴 안해줘도 정상동ㄱ작은 한다. 
