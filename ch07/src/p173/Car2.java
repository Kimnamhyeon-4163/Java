package p173;


import p144.Car;

public class Car2 {

	String color;
	String company;
	String type;
	public Car2(){
		this("white", "기아","경차");
	}
	public Car2(String color, String company, String type){
		this.color=color;
		this.company=company;
		this.type=type;
	}
	public Car2(String com, String t){
		this("white", com, t);
	}
	public Car2(String t){
		this("white","기아",t);
		
	}
	public String toString() {
		return color + "-" + company + "-" + type;
	}
}
