package p70;

public class OpEx8 {
	
	public static void main(String[] args) {
		 String name = "홍길동";
		 System.out.println("안녕하세요"+name +"입니다.");
		 
		 int height = 180;
		 System.out.println("저의 키는 "+height+"cm입니다.");
		 //String weight =75.5; 에러가남 문자자료형 변수에는 수자 대입을 못함
		 String weight = 75.5 + "";
		 System.out.println("저의 몸무게는 "+weight+"kg입니다.");
		 
		 int ageInt = 30; //정수
		 String ageStr = "30"; //문자열
	}

}
