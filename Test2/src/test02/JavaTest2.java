package test02;
/*
* 날짜 : 2020/11/13
* 이름 : 김남현
* 내용 : 배열에서 최대대값 찾기
*/
public class JavaTest2 {

	public static void main(String[] args) {
		 int arr[] = {17,92,18,33,58,7,26,42};
		 int maxNum = arr[0];
		 for (int i = 0; i < 8; i++) {
			if (maxNum < arr[i]) {
				maxNum= arr[i];
			}
		}
		 System.out.println("배열 arr에서 가장 큰수 : "+maxNum);
	}
}
