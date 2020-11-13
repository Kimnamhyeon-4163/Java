package sub3;
/*
 * 날짜 : 2020/11/12
 * 이름 : 김남현
 * 내용 : 인터페이스 실습하기 교재 p228
 * 
 * 
 */
public class InterfaceTest3 {
	//인터페이스 - 객체간의 결도를 완화
	
	public static void main(String[] args) {
		 Bulb bulb = new Bulb();
		 Cablbe socket= new Cable(bulb);
		 
		 socket.switchOn();
		 socket.switchOff():
	}

}
