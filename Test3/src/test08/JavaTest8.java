package test08;
/*
 * 날짜 : 2020/11/19
 * 이름 : 김남현
 * 내용 : 다형성 연습문
 */
public class JavaTest8 {

	public static void main(String[] args) {
		Product p1 = new Television("가전", 100);
		Product p2 = new Computer("컴퓨터", 150);
		p1.info();
		p2.info();
		
	}
}
