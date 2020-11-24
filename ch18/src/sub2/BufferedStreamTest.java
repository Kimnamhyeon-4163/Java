package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 날짜 : 2020/11/24
 * 이름 : 김남현
 * 내용 : 버퍼 입출력 스트림 실습하기 p496
 */
public class BufferedStreamTest {

		public static void main(String[] args) {
			String filePath = "/Users/kimnamhyeon/Desktop/cherry blossom3.eps";
			String targetPath ="/Users/kimnamhyeon/Desktop/smaple3.eps";
			
			try {
				//파일과 스트림 연결
				FileInputStream fis = new FileInputStream(filePath);
				FileOutputStream fos = new FileOutputStream(targetPath);
				//버퍼스트림 생성 연결
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				int value = 0;
				
				while(true) {
					//fis로 데이터 읽기
					value=bis.read();
					if(value == -1) {
						// 더이상 읽을 데이터가 없을 경우
						break;
					}
					/*char ch = (char)value;
					System.out.print(ch);*/
					// fos로 데이터 쓰기
					bos.write(value);
				}
				//스트림 해제
				bis.close();
				bos.close();
				fis.close();
				fos.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("프로그램 종료...");
		}
}
