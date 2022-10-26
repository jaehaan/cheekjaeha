package navermail.dkdk.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassCompare {
	
	public static void main(String[] args) {
		
		
		//문자열을 저장하는 Set 인스턴스를 3개생성
		Set<String> hashSet = new HashSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		
		
		//샘플 데이터 삽입
		hashSet.add("LG EDS");
		linkedHashSet.add("LG EDS");
		 treeSet.add("LG EDS");
		
		 hashSet.add("Triglows");
		 linkedHashSet.add("Triglows");
				 treeSet.add("Triglows");
				 
		 hashSet.add("39");
		 linkedHashSet.add("39");
		 treeSet.add("39");
		 
		 hashSet.add("BBQ");
		 linkedHashSet.add("BBQ");
		 treeSet.add("BBQ");
		 
		 hashSet.add("BHC");
		 linkedHashSet.add("BHC");
		 treeSet.add("BHC");

		  
		 
		 
		 //데이터출력\
		 //HashSet :어떤 순서로 출력될지 예측x
		 for(String company : hashSet) {
			 System.out.print(company + "\t");
		 }
		System.out.println(); 
		 //LinkedHashSet :add한 순서대로 출력돰
		for(String company : linkedHashSet) {
			 System.out.print(company + "\t");
		
		} 
		System.out.println();
		
		//TreeSet :정렬한 순서대로 출력되는데 숫자가 영문자보다 작고 대문자가 소문자보다 작음
		for(String company : treeSet) {
			System.out.print(company + "\t");
			 
			 }
		System.out.println();
		 
		 
		 
		 
		
	}

}
