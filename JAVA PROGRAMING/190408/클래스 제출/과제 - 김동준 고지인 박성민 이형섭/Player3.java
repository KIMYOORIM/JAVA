import java.util.Random;

public class Player3 extends Player {
	Player3() {
		this.hp = 1;
		this.name = "재원곤듀님*^o^*";
		System.out.println("가녀린 숫가락살인마  " + this.name + " 드응자앙~! 뾰로롱~!~~! @@");
	}

	public int getAttackPower() {
		return 10;
	}

	public void beUnderAttak(int attackPower) {
		Random random = new Random();
		int hitNumber = random.nextInt(2);
		if (hitNumber == 1) {
			if (attackPower > 0) {
				hp = hp + attackPower;
				System.out.println("낄낄ㅋ ㅋ " + attackPower + "의 데미지를 흡수했습니다. 현재 체력은^^~? " + hp + "이라능^-^");
			} else if (attackPower < 0) {
				hp = hp + Math.abs(attackPower);
				System.out.println("곤듀는 외로워...");
			} else {
				System.out.println("^-^??");
			}
		} else {
			System.out.println("재워니 무서워또 >ㅂ<");
		}
	}
}
