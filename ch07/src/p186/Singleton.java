package p186;

public class Singleton {

	private static Singleton instance = new Singleton();
	private Singleton() {
		System.out.println("객체생성");
	}
	public static Singleton getInstance() {
		System.out.println("객체 리턴");
		return instance;
	}
}
