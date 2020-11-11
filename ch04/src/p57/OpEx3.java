package p57;



public class OpEx3 {
	public static void main(String[] args) {
		 int a = 10;
		 int b = 10;
		 ++a;
		 b++;
		
		 System.out.println(a);
		 System.out.println(b);
		 
		 int c =10;
		 int d = ++c;
		 System.out.println("전위연산 결과 :" +d);
		 
		 int x =10;
		 int y =x++;
		 System.out.println("후위연산 결과 : "+y);
		 System.out.println("x : "+x);
		 
		 int q = 10;
		 q++;
		 System.out.println("q++ : "+q);
		 int w = 10;
		 w += 1;
		 System.out.println("w += 1 :"+w);
		 int e =10;
		 e = e+1;
		 System.out.println("e=e+1: "+e);
	}

}
