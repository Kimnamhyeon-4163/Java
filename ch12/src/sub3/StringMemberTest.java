package sub3;
/*
 * 날짜 : 2020/11/17
 * 이름 : 김남현
 * 내용 : String 멤버메서드 실습하기 교재 p302
 */
public class StringMemberTest {

	public static void main(String[] args) {
		
		String str ="Hello Korea";
		
		//length
		System.out.println("문자열 str 길이 : "+str.length());
		
		//charAt - 문자열에서 특정문자 추출
		System.out.println("문자열 str의 6번 index 문자 : "+str.charAt(6));
		
		//substring -문자열 자르기
		System.out.println("문자열 str에서 0에서 5까지 문자열 : "+str.substring(0,5));
		System.out.println("문자열 str에서 6에서 마지막까지 문자열 : "+str.substring(6));
		
		
		//indexOf,lastIndexOf - 문자열에서 특정문자 인덱스번호 추출
		int idex1 = str.indexOf("e");
		int idex2 = str.lastIndexOf("e");
		
		System.out.println("문자열 str에서 앞에서 부터 문자e의 인덳 번호 : "+idex1);
		System.out.println("문자열 str에서 뒤에서 부터 문자e의 인덳 번호 : "+idex2);
		
		//replace - 문자열 교체
		String newStr = str.replace("Korea", "USA");
		System.out.println("newStr : "+newStr);		
		
		//valueOf - 기본타입 변수를 문자열로 변환
		int var1 = 1;
		double var2 = 2.13;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		System.out.println("s1 : "+s1);
		System.out.println("s3 : "+s2);
		System.out.println("s2 : "+s3);
		
		
	}
}
