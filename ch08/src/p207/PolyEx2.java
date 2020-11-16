package p207;


public class PolyEx2 {
	public static void main(String[] args) {
		 Parent p = new Child();
		 p.run();
		 Child c  = (Child)p;
		 c.eat();
	}

}
