package sub2;

public class Person {

	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public void hello() {
		System.out.println(name+"입니다.");
		System.out.println(age+"세 입니다.");
	}
	
	

}


