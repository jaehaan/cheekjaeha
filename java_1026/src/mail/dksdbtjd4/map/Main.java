package mail.dksdbtjd4.map;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		
		//HashMap 인스턴스 생성
		Map<String, Object> map = new HashMap<>();
		
		//map에 데이터 저장 -put
		map.put("num", 1);
		map.put("name", "훈이");
		map.put("job", "singer");
		//동일한 key에 데이터 저장하면 이전 데이터가 삭제되고 수정
		map.put("job", "cyber singer");
		
		
		//전체 데이터확인
		System.out.println(map);
		
		//Map에서 데이터 가져오기
		System.out.println(map.get("name"));
		 //존재하지않는거 가져오면 null
		System.out.println(map.get("age"));
		
		
		//Map을 이용하면 key의 이름을 몰라도 모든 데이터의 접근하는 것이 가능
		
		//모든 key에 접근가능한 Set을 가져오기
		Set<String> keys = map.keySet();
		
		//Set을 순회
		for(String key : keys) {
			//key를 순회하면서 key에 저장된 value를확인
		System.out.println(key+":" + map.get(key));
		}
		
	}

}
