package sub1;

public class StockAccount extends Account{
	//Account를 상속받는 StockAccount를 정의하는 것
	//멤버변수
	/*private String bank;
	private String id;
	private String name;
	private int money;*///Account에있어서 생략가능한

	private String stock;
	private int amount;
	private int price;
	
	
	
	public StockAccount(String bank, String id, String name, int money, String stock, int amount, int price) {
		super(bank, id, name, money);//부모상속자 호출
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}
	
	//멤버메서드
	/*public void deposit() {}
	public void withdraw() {}
	public void show() {}*/
	
	public void sell(int amount, int price) {
		
		this.amount -= amount;
		int total = amount*price;
		money +=total;
	
	
	}
	public void buy(int amount, int price) {
		this.amount += amount;
		int total = amount*price;
		money -=total;
	}
	public void show() {
		
		System.out.println("==============");
		System.out.println("은행명 : "+bank);
		System.out.println("계좌번호 : "+id);
		System.out.println("입금주 : "+name);
		System.out.println("현재잔액 : "+money);
		System.out.println("주식종목 : "+stock);
		System.out.println("주식수량 : "+amount);
		System.out.println("주식가격 : "+price);
		
	}
	
	
	
	
}
