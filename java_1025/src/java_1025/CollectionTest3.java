package java_1025;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest3 {

	public static void main(String[] args) {
		
		
		
		//100000개의 데이터를 가진 ArrayList 와 LinkedList 생성
		ArrayList <Integer> a1 = new ArrayList<>();
		for(int i=0; i<100000; i++) {
			a1.add(i);
		}
		
		
		LinkedList<Integer> li = new LinkedList<>();
		for(int i=0; i<100000; i++) {
			li.add(i);
		}
		//ArrayList에서 100000개의 데이터를 읽는데 걸리는 시간 (확실히빠르데요)
		//데이터를 가져오는 메서드는 get(인덱스)
		//실행해서 가장 마지막에 나오는 숫자를 확인을 한 후 a1을 li로 변경해서 실행
		long start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			System.out.println(li.get(i));
		}
		long end = System.currentTimeMillis();
		System.out.println(end- start);
		
		
		System.out.println(a1);
	}
}
