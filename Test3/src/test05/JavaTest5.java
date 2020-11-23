package test05;
/*
 * 날짜 : 2020/11/19
 * 이름 : 김남현
 * 내용 : 싱글톤 객체 연습문제
 */
public class JavaTest5 {

	public static void main(String[] args) {
		
			CarFactory factory= CarFactory.getInstance();
			
			Car avante = factory.createCar("아반테", 2500);
			Car sonata = factory.createCar("소나타", 3000);
			
			avante.info();
			sonata.info();
	}
}


