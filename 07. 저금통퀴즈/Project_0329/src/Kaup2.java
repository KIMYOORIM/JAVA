import java.util.Scanner;

public class Kaup2 {
	public double weight;
	public double height;
nner(System.in);

	public void process() {
		this.inputData();
		this.result();

	}

	public void inputData() {
		Scanner scanner = new Sca
		System.out.println("체중입력 (단위 kg) : ");
		this.weight = scanner.nextDouble();

		System.out.println("신장입력 (단위 m) : ");
		this.height = scanner.nextDouble(); // 입력 받았지? 내부에 사용하는애로 만들오 주는게 좋아

	}

	public void result() {
		double calcResult = (double) this.weight / (this.height * this.height); // 앞에 더블은 안써도돼 그래도 습관적으로 붙혀
		// System.out.println("계산 결과 : " + calcResult); //여기까지가 계산 하는 것
		if (calcResult > 30) {
			System.out.println("비만");
		} else if ((calcResult >= 20) && (calcResult <= 24)) {
			System.out.println("정상");
		} else if (calcResult < 20) {
			System.out.println("저체중");
		} else if ((calcResult >= 13) && (calcResult <= 15)) {
			System.out.println("여윔");
		} else if ((calcResult >= 10) && (calcResult <= 13)) {
			System.out.println("영양 실조증");
		} else if (calcResult < 10) {
			System.out.println("이하는 소모증"); // 조건문은 하나씩 만들어도돼 왜?
		}
	}
}