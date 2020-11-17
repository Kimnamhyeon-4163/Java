package p233;

public class ComplexerMain2 {

	public static void main(String[] args) {
		Fax fax = new Fax(){
			

			@Override
			public void send(String tel) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void receive(String tel) {
				// TODO Auto-generated method stub
				
			}
		};
		fax.send("1234");
		fax.receive("5678");
	}
}
