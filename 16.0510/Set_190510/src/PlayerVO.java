
public class PlayerVO implements Comparable<PlayerVO>{
	String name = "";
	String position = "";
	int regyear = 0;
	
	public PlayerVO(String name, String position, int year) {
		this.name = name;
		this.position = position;
		this.regyear = year;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+ ":" + this.position + "(" + regyear + ")";
	}
	
	@Override
	//음수, 양수, 0 으로 정렬순서를 정한다. 문자열은 charAt()-charAt()의 결과와
	// String.length - String.length으로 결정한다. 
	public int compareTo(PlayerVO otherPlayer) {
		// TODO Auto-generated method stub
		System.out.println("Trying sort");
		return this.name.compareTo(otherPlayer.name);
	}
}
