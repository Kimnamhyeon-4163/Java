package sub1;
/*
 * 날짜 : 2020/11/23
 * 이름 : 김남현
 * 내용 : 람다식 실습하기 p402
 */

public class LambdaTest {
	public static void main(String[] args) {
		
		// 람다식 : 인터페이스를 활용한 코드블럭으 ㄹ갖는 익명함수
		Lambda1 lam1 = ()->{System.out.println("Lamdba1 람다식 실행...");};
			lam1.method();
			Lambda2 lam2 = (x)->{
				System.out.println("Lambda2 람다식 매개변수 x : "+x);
			};
		/*	Lambda2 lam2 = x->System.out.println("Lambda2 람다식 매개변수 x : "+x);
		*/
			lam2.method(10);
			
			Lambda3 lam3 = (x, y)-> x + y;
				
			
			int result = lam3.method(2,3);
			System.out.println("Lambda3 람다식 결과 : "+result);
	}

}
