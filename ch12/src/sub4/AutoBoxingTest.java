package sub4;
/*
 * 날짜 : 2020/11/17
 * 이름 : 김남현
 * 내용 : AutoBoxing AutoUnBoxing 실습하기
 */
public class AutoBoxingTest {

	public static void main(String[] args) {
		
		//Auto-boxing : 기본타입->Wrapper 변환
		Integer w1 = 1;
		Double w2 = 3.14;
		Boolean w3 = true;
		
		System.out.println("w1 : "+w1);
		System.out.println("w2 : "+w2);
		System.out.println("w3 : "+w3);
		
		//Auto-UNBoxing
		int var1 = w1;
		double var2 = w2;
		boolean var3 = w3;
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		
	}
}
