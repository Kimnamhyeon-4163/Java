package p61;

public class OpEx5 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		//and ���� �Ѵ� �����ؾ� Ʈ��
		System.out.println(a>b && a ==10);//t t t
		System.out.println(a>b && a ==b);//t f f
		//or���� �����ϳ��� ���� Ʈ��
		System.out.println(a>b || a ==b);//t f t
		System.out.println(a<b || a ==b);//f f f
		//xor ���� �ΰ� ������ ������ �޽� �ٸ��� Ʈ��
		System.out.println(a>b ^ a ==10);//ttf
		System.out.println(a>b ^ a ==b);//tft
		//not���� Ʈ��� �޽� �޽��� Ʈ��
		System.out.println(!(a>b));//f
		System.out.println(!(a<b));//t
	}
	
}
