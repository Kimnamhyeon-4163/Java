package test08;

public class Computer extends Product{
	public Computer(String category, int price) {
		super(category,price);
	}
	public void info() {
		System.out.println("제품분류 : "+category);
		System.out.println("제품가격 : "+price);
	}
	
	

}
