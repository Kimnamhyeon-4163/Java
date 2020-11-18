package sub2;
/*
 * 날짜 : 2020/11/18
 * 이름 : 김남현
 * 내용 : 제네릭 클래스 실습하기 p386
 */
public class MultiGenericTest {

	public static void main(String[] args) {
		
		Tv tv =new Tv("LG 올레드");
		SmartPhone iphone = new SmartPhone("아이폰12");
		
		Product<Tv, Integer> p1 = new Product<>(tv, 1000000);
		Product<SmartPhone, String> p2 = new Product<>(iphone, "iphone 12s");
	
		p1.show();
		p2.show();
	}
}
