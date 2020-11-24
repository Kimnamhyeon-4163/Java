package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/*
 * 날짜 : 2020/11/24
 * 이름 : 김남현
 * 내용 : 스트림과 Property 파일 응용 실습하기
 */
public class PropertyTest {

	public static void main(String[] args, Properties country) throws FileNotFoundException{
	
		Properties prop = new Properties();
		prop.setProperty("101", "서울");
		prop.setProperty("102", "대전");
		prop.setProperty("103", "대구");
		prop.setProperty("104", "부산");
		prop.setProperty("105", "광주");
		
		System.out.println("101번 데이터 : "+prop.getProperty("101"));
		System.out.println("102번 데이터 : "+prop.getProperty("102"));
		System.out.println("104번 데이터 : "+prop.getProperty("104"));
		
		//스트림을 통한 데이터 파일 내보내기
		String filePath = "/Users/kimnamhyeon/Desktop/cities.properties";
		FileInputStream fis = new FileInputStream(filePath);
		InputStreamReader isr = new InputStreamReader(fis);
		try {
			country.load(isr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
