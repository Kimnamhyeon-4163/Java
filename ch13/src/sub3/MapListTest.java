package sub3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sub1.Apple;

/*
 * 날짜 : 2020/11/18
 * 이름 : 김남현
 * 내용 : Collection MapList 응용 실습하기
 */
public class MapListTest {
	public static void main(String[] args) {
		
		List<Map<Integer, Apple>> list = new ArrayList<>();
		
		Map<Integer, Apple> map1 = new HashMap<>();
		map1.put(101, new Apple("한국",3000));
		map1.put(102, new Apple("중국",2500));
		map1.put(103, new Apple("일본",2000));
		
		
		Map<Integer, Apple> map2 = new HashMap<>();
		map2.put(201, new Apple("미국",3000));
		map2.put(202, new Apple("중국",2500));
		map2.put(203, new Apple("호주",2000));
		
		Map<Integer, Apple> map3 = new HashMap<>();
		map3.put(301, new Apple("태국",3000));
		map3.put(302, new Apple("대만",2500));
		map3.put(303, new Apple("홍콩",2000));
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		
		//한국 사과 출력
		list.get(0).get(101).show();
		//호주 사과 출력
		Map<Integer, Apple> map =list.get(1);
		Apple apple = map.get(203);
		apple.show();
		//대만 사과 출력
		list.get(2).get(302).show();
	}

}
