package sub3;

public class Adder {

	
	//멤버변수
	private int x;
	//생성자
	public Adder (int x) {
		this.x =x;
	}
	//getter,setter 메서드 정의
	// -외부에서 클래스의 멤버변수의 참조를 위한 메서드
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	//멤버 메서드
	public void add(int x) {
		this.x = x +50;
	}
	
	public void add(int[] arr) {
		arr[0]++;
	}
	
	public void add(Adder a1) {
		a1.x = a1.x +40;
	}//참조변수 선언 a1는 Stack에 생성이때 a1는 a를 복사한값 같은 주소값을 가짐
	
	public Adder addNew(Adder a2) {
		a2 = new Adder (1);//만들었다가 사라짐 하는것없음 그래서 아까x값이 출력
							//return 값이 있으면 만든 객체에서 출력함 값이 나옴 
		return a2;
		//return new Adder(1);이랑 같은 코드
	}
}

