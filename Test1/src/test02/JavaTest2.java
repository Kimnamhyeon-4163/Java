package test02;

import java.util.Scanner;

public class JavaTest2 {
/*
 * 날짜 : 2020/11/05
 * 이름 : 김남현
 * 내용 : 자바 기본 입출력 연습문제
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//sc:키보드 객
		int input;
		System.out.print("input 값 잆력 : ");
		input = sc.nextInt();
		int result = (1+2)*input;
		System.out.println("(1 + 2) x input = "+result);
		String name;
		System.out.print("name 값 입력 : ");
		name = sc.next();
		String hello = "안녕!"+ name + "님 반갑습니다.";
		System.out.println(hello);
		
	
	
	}
}
