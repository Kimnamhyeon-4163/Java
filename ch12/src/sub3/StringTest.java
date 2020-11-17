package sub3;
/*
 * 날짜 : 2020/11/17
 * 이름 : 김남현
 * 내용 : StringClass 실습하기 p296
 */
public class StringTest {

	public static void main(String[] args) {
		
		//문자열= 문자 + 배열
		String str = "Hello";
		char[] arr = {'H','e','l','l','o'};
		
		//문자열 객체생성
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello";
		String str4 = "Hello";
		
		
		
		if (str1==str2) {
			System.out.println("str1과 str2가 참조값(주소값)이 서로 같다.");
		}else {
			System.out.println("str1과 str2가 참조값(주소값)이 서로 다르다.");
		}
		
		if (str3==str4) {
			System.out.println("str3과 str4가 참조값(주소값)이 서로 같다.");
		}else {
			System.out.println("str3과 str4가 참조값(주소값)이 서로 다르다.");
		}
		//문자열 비교
		if (str1.equals(str4)) {
			System.out.println("str1과 str4가 참조값(주소값)이 서로 같다.");
		}else {
			System.out.println("str1과 str4가 참조값(주소값)이 서로 같다.");
		}
		
		
	}
}
