package p126;

import java.sql.Array;
import java.util.Arrays;

public class ArrEx15 {

	public static void main(String[] args) {
		//원본 배열
		int[]arrInt = {1,2,3};
		//복사할 배열
		int[]arrInt2 = null;
	
		arrInt2 = Arrays.copyOf(arrInt, 5);
		//배열 값 출
	}
	
}
