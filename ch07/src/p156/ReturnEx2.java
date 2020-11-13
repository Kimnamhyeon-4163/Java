package p156;

public class ReturnEx2 {

	public static void main(String[] args) {
		Return2 obj = new Return2();
		obj.getTest(0);
		obj.getTest(1);

		System.out.println(obj.getName(0));
		System.out.println(obj.getName(1));
	}
}

class Return2 {

	void getTest(int tybe) {
		System.out.println("getTest() 메서드 시자 ");
		if (tybe == 1) {
			return;
		}
		System.out.println("getTest() 매서드 ");
	}

	String getName(int type) {
		if (type == 1) {
			return "홍길동";
		}
		return null;
	}

}
