package test06;
/*
 * 날짜 : 2020/11/19
 * 이름 : 김남현
 * 내용 : 클래스 상속 연습문제
 */
public class JavaTest6 {

	public static void main(String[] args) {
		Landload master = new Landload();
		master.getMoney();
	}
}
class Rent{
	public void payment() {
		System.out.println("임대료를 받습니다.");
	}
}
class Landload extends Rent{
	public void getMoney() {
		System.out.println("건물주 입니다.");
		this.payment();
	}
	
}