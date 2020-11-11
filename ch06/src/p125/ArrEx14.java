package p125;

public class ArrEx14 {

	
	public static void main(String[] args) {
		//원본배열
		int[] arrInt = {1,2,3};
		
		//복사할 배열
		int[] arrInt2 = new int[5];
		System.arraycopy (arrInt,0,arrInt2,2,arrInt.length );
		//배열값출력
		
		int i = 0;
		for (int isyso = 0; isyso < arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
	}
	
}
