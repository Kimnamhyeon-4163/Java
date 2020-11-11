package p61;

public class OpEx5 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		//and 연산 둘다 충족해야 트루
		System.out.println(a>b && a ==10);//t t t
		System.out.println(a>b && a ==b);//t f f
		//or연산 둘중하나면 충족 트루
		System.out.println(a>b || a ==b);//t f t
		System.out.println(a<b || a ==b);//f f f
		//xor 연산 두개 조건이 같으면 펄스 다르면 트루
		System.out.println(a>b ^ a ==10);//ttf
		System.out.println(a>b ^ a ==b);//tft
		//not연산 트루면 펄스 펄스면 트루
		System.out.println(!(a>b));//f
		System.out.println(!(a<b));//t
	}
	
}
