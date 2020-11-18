package sub5;
/*
 * 날짜 : 2020/11/18
 * 이름 : 김남현
 * 내용 : Math 클래스 실습하기 교재 p311
 */

public class MathTest {
	public static void main(String[] args) {
		
		//Math m = new Math();
		
		System.out.println("PI값 : "+Math.PI);
		System.out.println("절대값 : "+Math.abs(-5));
		System.out.println("절대값 : "+Math.abs(-3.14));
		System.out.println("제곱근 : "+Math.sqrt(9));
		System.out.println("올림값 : "+Math.ceil(1.8));
		System.out.println("내림값 : "+Math.floor(1.8));
		System.out.println("내림값 : "+Math.floor(1.3));
		System.out.println("반올림 : "+Math.round(1.8));
		System.out.println("반올림 : "+Math.round(1.2));
		
		//random
		double num1 = Math.random();
		System.out.println("num1 : "+num1);//0~1사의의 실수
		double num2 =num1*10;
		System.out.println("num2 : "+num2);//0~10사이의 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : "+num3);//1~10사이 정수
		
		//1~45 사이 정수 구하기
		double rand =Math.ceil((Math.random()*45));
		System.out.println("임의의 수 : "+rand);
		
	}

}
