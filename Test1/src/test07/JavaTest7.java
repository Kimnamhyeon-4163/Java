package test07;
/*
 * 날짜 2020/11/05
 * 이름 김남현
 * 내용 자바 삼항연산자 연습문제
 */
public class JavaTest7 {

	
	public static void main(String[] args) {
		
		int x = 12;
		int y = 21;
		int max =(x>y?x:y);//?앞의 값이 참이면x 거짓이면y값이 출력된다
		
		System.out.println("x와 y중 큰수 : "+max);
	}
}
