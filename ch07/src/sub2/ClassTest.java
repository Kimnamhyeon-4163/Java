package sub2;
/*
 * 
 * 날짜 : 2020/11/9
 * 이름 : 김남현
 * 내용 : 자바 클래스 실습하기 교재 p140
 */
public class ClassTest {

	
	public static void main(String[] args) {
		//국민은행 객체(Instance) 생성
		Account kb = new Account("국민은행","121-11-1234","김유신", 10000);
		
		
		// 국민은행 객체 멤버초기화
		/* kb.bank = "국민은행 ";
		kb.id = "121-11-1234";
		kb.name = "김유신";
		kb.money = 10000;*/
		//국민은행 객체 활용하기
		kb.deposit(15000);
		
		// 캡슐화 적용으로 취약코드 예방
		//kb.money++;
		
		kb.withdraw(5000);
		kb.show();
		
		
		
		//우리은행 객체 (Instance)생성
		Account wr = new Account("우리은행","121-12-1234","김유신",5000);
		
		//우리은행 객체 멤버 초기
		/*wr.bank = "우리은행";
		wr.id = "121-12-1234";
		wr.name = "김춘추";
		wr.money = 5000;*/
		
		//우리은행 객체 활용하기
		wr.deposit(10000);
		
		// 캡슐화 적용으로 취양코드 예방
		//wr.money--;
		
		wr.withdraw(7000);
		wr.show();
	}
}
