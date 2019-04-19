
public class O2 { // extends Object가 생략 되어 있는 것 과 같다.
	int name = 1;
	

//	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// return super.toString(); //부모클래스 매소드를 수정한다. 오버라이딩. 부모에 메소드가 없으면 알아서 에러띄운다.
		return "" + this.name; // tostring 자체가 이름을 출력하는 메서드로 변경됨.
	}
//	@Override
//		public String toString() { 
//			// TODO Auto-generated method stub 
//			return super.toString(); // 이경우 주소로 비교가 되는 거지. 
//		}
	


//	Public boolean equals(Object obj){
//		Return super.equals(obj);} 와 같은거다. 내재적으로 가지고 있음. 
	
	
	
	@Override
	public boolean equals(Object obj) {//오버라이드 할때 오브젝트 클래스로만 인자 받게 해두었다. 
		O2 obj2 = (O2)obj; //캐스팅  내가 컨트롤 할 수있는 애들만 들어와야함. 다른 클래스로 캐스팅하면 에러난다. 
		if (this.name == obj2.name) { //숫자  같은지 비교.같으면 true, 다르면 false 
			return true;
		}
		return false;
		//return this.name == obj2.name
		
	}
//외부에서 메서드만 알아도 내용 없이 나머지 처리 구성가능. 추후 해당 메서드를 채워주면 실행가능하다. 
}
