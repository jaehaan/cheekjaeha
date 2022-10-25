package java_1025;

import java.text.SimpleDateFormat;
import java.util.Date;

//import java.sql.Date;   이 모양의 데이터메소드가 없다.

public class DateCreate {
	public static void main(String[] args) {
		
		//현재 시간을 갖는 java.util.date 인스턴트 생성
		Date currenTime = new Date();
		
		//출력
		System.out.println(currenTime);
		
		//원하는 날짜를 가지고 생성          //1986년 5월 5일 13시
		Date firstMeetingTime = new Date(86, 4, 5, 13, 0, 0);
		//출력 
		System.out.println(firstMeetingTime);
		
		
		//년도 만 추출해서 출력
		System.out.println(firstMeetingTime.getYear()+1900);
		
		
		
		//원하는 포맷으로 출력
		//1986년 5월 5일 ?요일 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일");
		System.out.println(sdf.format(firstMeetingTime));
		
		//연습해볼만 과제 - 년월일을 비교해서 년원일이 같으면 시간 과 분을 그렇지않으면 년월일을 출력
		
		
		
		
		
		
		
	}
	
	
	
	

}
