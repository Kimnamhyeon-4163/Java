package p113;

public class ArrEx8 {

	
	public static void main(String[] args) {
		int[] number = new int[100];
		//배열변수에 대입
		for (int i = 0; i < number.length; i++) {
			number[i] = i+1;
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}
}
