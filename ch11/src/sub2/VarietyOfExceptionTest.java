package sub2;
/*
 * 날짜 : 2020/11/16
 * 이름 : 김남현
 * 내용 : 다양한 예외종류 실습하기 교재 p265
 */
public class VarietyOfExceptionTest {
	public static void main(String[] args) {
		
		// 배열 인덱스번호 참조 에러
		int arr[] = new int[3];
		
		
		for (int i = 0; i <=3; i++) {
			try {
				arr[i] = i+1;
			}catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
		for (int num : arr) {
			System.out.println("arr 값 : "+num);
		}
		// NullPoint 에러
		
		
		try {
			Tiger tiger= null;
					
			tiger.move();
			tiger.hunt();	
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		// Casting 에러
		try {
			Animal a1 = new Eagle();
			Animal a2 = new Shark();
			
			Eagle eagle = (Eagle) a2;

		} catch (ClassCastException e) {
			e.printStackTrace();
		}
				
		System.out.println("프로그램 종료...");
	}
	

}
