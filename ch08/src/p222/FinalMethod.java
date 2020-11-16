package p222;

public class FinalMethod {
	void method() {
		
	}
	final void finalMethod() {
		
	}
}
class SubFinalMethod extends FinalMethod{
	void method() {
		System.out.println("method() 재정의");
	}
/*	void finalMethod() {
		System.out.println("finalMethod() 재정의");
	}*/
}