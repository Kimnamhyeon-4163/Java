package p162;


public class Overloading {

	public static void main(String[] args) {
		
		Operator op = new Operator();
		System.out.println(op.mutiply(4, 3));
	}
}
class Operator{
	int mutiply(int x,int y) {
		return x*y;
	}
}