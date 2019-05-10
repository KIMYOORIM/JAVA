/****************************************
 교수님이 짜주는 3,6,9 게임
 person 객체 생성
 -말하기
 -다음사람에게 차례넘기기?
 	1. (현재 객체의 이전객체가 누군지, 다음객체가 누군지)
 	2. 내 차례가 몇번째 차례인지
 -게임에 참여한 사람이 누군지 알고 있음
 
 ** 철저하게 객체의 입장에서 짜는 것. 
*****************************************/
public class Main {
	public static void main(String[] args) {
		String[] names = {"유림", "선화", "배욱", "신우"};
		Person[] players = new Person[names.length];
		final int GAME_START_NUMBER = 10;
		final int GAME_END_NUMBER = 100;
		//Person 객체 생성
		for(int i = 0; i < names.length; i++) {
			players[i] = new Person(names[i]);
		}
		
		//readyGame
		for(int i = 0; i < players.length; i++) {
			players[i].readyGame(players, i, GAME_START_NUMBER, GAME_END_NUMBER); 
		}
		
		players[0].gameStrart();
		
	}
}
