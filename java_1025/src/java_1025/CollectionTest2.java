package java_1025;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest2 {

	public static void main(String[] args) {
		//문자열을 저장하는 ArrayList 생성
		ArrayList <String> a1 = new ArrayList<>();
		
		//샘플데이터 추가
		a1.add("one");
		a1.add("three");
		
		//1970년 1월 1일 자정부터 지나온 시간을 밀리초 단위의 정수로 가져오기
		long start = System.currentTimeMillis();
		
		//두번째에 데이터를 100000 개 추가
		for(int i =0; i<100000; i++) {
			a1.add(1,"two");
		}
		//1970년 1월 1일 자정부터 지나온 시간을 밀리초 단위의 정수로 가져오기
		long end = System.currentTimeMillis();
		
		
		//걸린시간
		System.out.println(end - start);
		
		
		//문자열을 저장하는 LinkedList생성
		LinkedList<String> li = new LinkedList<>();
		
		//샘플 데이터추가
		li.add("One");
		li.add("Three");
		
		start = System.currentTimeMillis();
		for(int i =0; i<1000000; i++) {
			li.add(1, "훈발롬");
		}
		
		end = System.currentTimeMillis();
		System.out.println(li);
	}
}
