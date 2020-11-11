package sub2;

public class Student extends Person {

	public Student(String name, int age,String school,String major) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.school = school;
		this.major=major;
	
	}
	private String school;
	private String major;
	
	
	
	public void hello() {
		System.out.println(name+"입니다.");
		System.out.println(age+"세 입니다.");
		System.out.println(school+"에 다니고 있습니다.");
		System.out.println(major+" 전공입니다.");
	}
	
	
	
}
