package sub1;
/*
 * 날짜 : 2020/11/18
 * 이름 : 김남현
 * 내용 : Generic 클래스 실습하기 p384
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("대만", 2000);
		
		FruitBox<Apple> box1 = new FruitBox<>();
		box1.setFruit(apple);
		FruitBox<Banana> box2 = new FruitBox<>();
		box2.setFruit(banana);
		
		box1.getFruit().show();
		box2.getFruit().show();
	}

}
