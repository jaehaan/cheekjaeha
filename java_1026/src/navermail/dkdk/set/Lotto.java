package navermail.dkdk.set;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Lotto {

	public static void main(String[] args) {
		
		
		//랜덤한 숫자를 추출하기 위한 인스턴스 생성
		Random r = new Random();
		
		
		//ArryList 활용
		ArrayList <Integer> a1 = new ArrayList<>();
		
		//ArrayList 의 size 가 6보다 작을 때 까지
		while(a1.size() < 6) {
			
			//1-45까지의 숫자를 랜덤
			int su =r.nextInt(45)+1;
			
			
			//중복 검사를 해서 통과하면 add하고 통과하지 못하면 add수행하지 않음
			if(a1.contains(su)) {
				continue;
			}
			a1.add(su);
			
		}
		
		//출력하기 전에 정렬 
		a1.sort(null);
		
		
		
		
		System.out.println(a1);
		
		
		//TreeSet : 중복된 데이터를 저장하지 않고 저장된 순서를 기억합니다.
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		while(treeSet.size() < 6) {
			
			//1-45까지의 숫자를 랜덤
			int su =r.nextInt(45)+1;
			
		treeSet.add(su);
		}
		for(Integer i:treeSet) {
			System.out.printf(i+"\t");
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
