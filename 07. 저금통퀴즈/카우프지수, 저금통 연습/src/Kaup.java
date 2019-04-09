import java.util.Scanner;

public class Kaup {

	double KaupValue;
	double weight;
	double heigt;

public void KaupNum() {
	Scanner scan = new Scanner(System.in);
	System.out.println("체중을 입력하세요. 단위/kg");
	this.weight = scan.nextDouble();
	
	System.out.println("키를 입력하세요. 단위/cm");
	this.heigt = scan.nextDouble();
	
	
	this.KaupValue = (double)this.weight /((this.heigt * this.heigt)/10000);
	
	if(KaupValue > 30) {
		System.out.println("과체중");
	}else if(KaupValue <= 24 && KaupValue >=20 ) {
	System.out.println("정상");
	}else if(KaupValue<20 && KaupValue>15){
		System.out.println("저체중");
	}else if(KaupValue >= 13 && KaupValue <=15){
		System.out.println("여윔");
	}else if(KaupValue >= 10 && KaupValue <= 13){
		System.out.println("영양실조증");
	}else if(KaupValue < 10){
		System.out.println("이하는 소모증");
	}
	System.out.println((double)KaupValue);
	

	{

	}
}
}
