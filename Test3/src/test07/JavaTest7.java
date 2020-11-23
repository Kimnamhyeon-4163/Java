package test07;

/*
 * 날짜 : 2020/11/19
 * 이름 : 김남현
 * 내용 : 자바 클래스 연습문
 */
public class JavaTest7 {
	public static void main(String[] args) {
		Customr kim = new Customr(1001,"김춘추");
		VipCustomr lee = new VipCustomr(1002, "이순신");
		
		System.out.println("김춘추님이 지불할 금액 : "+kim.calcPrice(10000));
		System.out.println("이순신님이 지불할 금액 : "+lee.calcPrice(10000));
		
		kim.showInfo();
		lee.showInfo();
	}

}
