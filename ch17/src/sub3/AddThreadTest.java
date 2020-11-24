package sub3;
/*
 * 날짜 : 2020/11/19
 * 이름 : 김남현
 * 내용 : 스레드(thread) 활용하기
 */
public class AddThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		AddThread at1 = new AddThread(1, 50);
		AddThread at2 = new AddThread(51, 100);
		
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		int tot1 =at1.getNum();
		int tot2 =at2.getNum();
		
		
		int total = tot1 + tot2;
		System.out.println("전체 합 : "+total);
		
		
	}

}
