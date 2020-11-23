package test05;

public class Car{
	private String name;
	private int price;
	
	public Car(String name, int price) {
		this.name=name;
		this.price=price;
	}
	public void drive() {
		System.out.println(name+"운행 중...");
	}
	public void info() {
		System.out.println("==============");
		System.out.println("브랜드 : "+name);
		System.out.println("브랜드 : "+price);
	}
}