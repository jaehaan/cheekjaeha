package java_1025;

import java.util.Arrays;

public class ArraysMain {
	public static void main(String[] args) {

		//문자열 배열 생성
		String [] singers = {"장원영", "카리나", "지젤", "민지", "태연", "아이유", "수지"};

		//이분 검색 수행 -sort를하지않으면 잘못된 결과(=음수) 리턴

		int result = Arrays.binarySearch(singers, "태연"); //소트안하면 음수나옴
		System.out.println(result);



		//데이터정렬
		Arrays.sort(singers);
		//정렬한 데이터 확인
		System.out.println(Arrays.toString(singers));
		result = Arrays.binarySearch(singers, "태연");
		if(result >= 0) {
			System.out.printf("%s는 %d 번째 존재\n", "태연", result);
		}else {
			System.out.printf("%s는 존재하지 않음\n", "태연");
		}



	}

}
