package sub2;
/*
 * 날짜 : 2020/11/4
 * 이름 : 김남현
 * 내용 : ������ �迭 �ǽ��ϱ� ���� p118
 */
public class MultiArrayTest {

	public static void main(String[] args) {
		//1�����迭
		int scores[] = {80,60,78,62,92};
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("�迭 scores�� ���� : "+sum);
		
		//2�����迭
		int arr2d[][] = {{1,  2,  3,  4},
						 {5,  6,  7,  8},
						 {9, 10, 11, 12}};
		/*System.out.println("�迭 arr2d[0][0] : "+arr2d[0][0]);
		System.out.println("�迭 arr2d[0][1] : "+arr2d[0][1]);
		System.out.println("�迭 arr2d[0][2] : "+arr2d[0][2]);
		System.out.println("�迭 arr2d[0][3] : "+arr2d[0][3]);
		
		System.out.println("�迭 arr2d[1][0] : "+arr2d[1][0]);
		System.out.println("�迭 arr2d[1][1] : "+arr2d[1][1]);
		System.out.println("�迭 arr2d[1][2] : "+arr2d[1][2]);
		System.out.println("�迭 arr2d[1][3] : "+arr2d[1][3]);
		
		System.out.println("�迭 arr2d[2][0] : "+arr2d[2][0]);
		System.out.println("�迭 arr2d[2][1] : "+arr2d[2][1]);
		System.out.println("�迭 arr2d[2][2] : "+arr2d[2][2]);
		System.out.println("�迭 arr2d[2][3] : "+arr2d[2][3]);*/
		for(int a=0; a<3 ; a++) {
			for(int b=0; b<4 ; b++) {
				System.out.println("�迭 arr2d["+a+"]["+b+"] : "+arr2d[a][b]);
			}
		}
		
		//3�����迭
		int arr3d[][][] = {{{1,2,3},
						    {4,5,6},
							{7,8,9}},
						   {{10,11,12},
							{13,14,15},
							{16,17,18}},
						   {{19,20,21},
							{22,23,24},
							{25,26,27}}};
		System.out.println("3���� �迭 arr3d[0][0][0] : "+arr3d[0][0][0]);
		System.out.println("3���� �迭 arr3d[1][0][1] : "+arr3d[1][0][1]);
		System.out.println("3���� �迭 arr3d[1][2][2] : "+arr3d[1][2][2]);
		System.out.println("3���� �迭 arr3d[2][1][1] : "+arr3d[2][1][1]);
		
		
		
		
	}
}