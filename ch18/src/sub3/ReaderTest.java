package sub3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/*
 * 날짜 : 2020/11/24
 * 이름 : 김남현
 * 내용 : 물자 입출력 스트림 실습하기 p501
 */
public class ReaderTest {

	public static void main(String[] args) {
		String filePath = "/Users/kimnamhyeon/Desktop/smaple.txt";
		String targetPath ="/Users/kimnamhyeon/Desktop/smaple2.txt";
										
				try {
					//파일과 입력 스트림 연결
							FileInputStream fis = new FileInputStream(filePath);
							InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
											
											
							int value = 0;
											
							while(true) {
								//fis로 데이터 읽기	
								value=isr.read();
								if(value == -1) {
									// 더이상 읽을 데이터가 없을 경우
									break;
								}
								char ch = (char)value;
								System.out.print(ch);
							
							}
							//스트림 해제
							fis.close();
							isr.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("프로그램 종료...");
	}
}
