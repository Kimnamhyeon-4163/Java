package sub2;

/**
 * 날짜 : 2020/11/3
 * 이름 : 김남현
 * 내용 : 반복문 for 실습하기 p90
 */
public class ForTest {

	public static void main(String[] args) {
		
		//for 기초
		//for(조건식;범위;증감)
		for(int i=1; i<=3 ;i++) {
			System.out.println("Hello Java!");
		}
		
		//1부터 10까지의 합
		
		int sum =0;
		for(int k=1; k<=100; k++ ) {
			sum += k;
		}
		System.out.println("1부터 10까지의 합 : " +sum);
		//1부터 10까지의 짝수합
		
		int eSum =0;
		for(int k=1 ; k<=10; k++) {
			
			if(k % 2 == 0) {
				eSum += 
						k;
			}
			
		}
		System.out.println("1부터 10까지의 짝수합 : " +
		eSum);
		
		//for 중첩(이중 for문)
		
		for(int a=1 ; a<=3 ; a++) {
			System.out.println("a : "+a);
			for(int b=1 ; b<=5 ; b++) {
				System.out.println("b : "+b);
				
			}
		}
		//구구단 출력
		
		for(int x=2 ; x<=9 ; x++) {
			
			System.out.println( x +"단");
			for(int y=1 ; y<=9 ; y++) {
				
				int z = x*y;
				//System.out.println(x +" x " + y + " = " +z);
				System.out.printf("%d x %d = %d\n", x,y,z);
				
			}
		}
		
		
		//별삼각형1 출력
		
		for (int start = 10; start >=1 ; start--) {
			for (int end = 1; end <= start; end++) {
				System.out.print("*");
				
			}
			System.out.print("\n");
		}
		
		
		//별삼각형2 출력
		
		for (int a = 1; a <=5; a++) {
			for (int b = 1; b<=5-a; b++) {
				System.out.print("*");
			}
			for (int c = 1; c <=a ; c++) {
				System.out.print("0");
			}
			System.out.print("\n");
		}
		
	
}
	
}