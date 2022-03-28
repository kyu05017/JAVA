package Day19;

import java.util.*;

public class Day19_3 {
	
	public static void main(String[] args) {
		
		// 1. Map 컬렉션 == json
			// * 키 ( 객체 )  , 값 ( 객체 ) = 엔트리
			// 키 : Set컬렉션 사용		[ 중복 불가능 	]
			// 값 : List컬렉션 사용		[ 중복 가능	]
		// HashMap 클래스
			// 1. 객체명.put ( 키객체 , 값객체 ) : 엔트리 ( 키 = 값 ) 추가
			// 2. 객체명.size() : 엔트리 개수
			// 3. 객체명.get ( 키객체 ) : 해당 객체의 값을 출력
			// 4. 객체명.KeySet() : 객체내 모든 키 호출 가능
			// 5. 객체명.values() : 객체내 모든 값을 호출 
				// * 키 ( 중복 불가 )를 알고 있으면 값을 알수 있다.
				// for( 임시객체명 : 객체명.KeySet() ) { } 
			// 6. 객체명.remove ( 키객체 ) : 해당 키의 엔트리 삭제
			// 7. 객체명.clear() : 모든 엔트리를 삭제
		
		// * List컬렉션 : 순서 ( 인덱스 ) 저장 = 배열과 유사
		// * Set컬렉션  : 순서없는 저장	= 중복 불가능 
		// * Map컬렉션  : 키(Set)와 값(List)으로 이루어진 엔트리를 여러개 저장 [ 순서가 존재하지 않는다 ] = 
		
		// 1. HashMap 클래스의 객체 선언
		HashMap<String, Integer> map = new HashMap<>();
		// HashMap : 컬렉션 프레임 워크 Map 클래스
			// 1. < 제네릭, 제네릭 > : key , value 와 구성된 제네릭
				// 2. map : 객체명 ( 아무거나 )
					// new : 객체 생성시 메모리 할당
						// HashMap<>()  생성자
		// 2. map 객체에 추가
		map.put("신용권", 85);
		System.out.println("확인 : " + map);
		map.put("홍길동", 90);
		System.out.println("확인 : " + map);
		map.put("동장군", 80);
		System.out.println("확인 : " + map);
		map.put("홍길동",95);
		// * Key 값은 중복 불가
		System.out.println("확인 : " + map);
		map.put("유재석",95);
		// * value 값은 중복 가능
		System.out.println("확인 : " + map);
		// 3. map객체명.size() : map객체네 엔트리 (키 = 값) 개수
		System.out.println("총 엔트리 길이 : " + map.size());
		// 4. map객체명.get( 키 ) : map 객체네 키 -> 값 호출
		System.out.println("객체내 값 호출 : " + map.get("유재석"));
		// 리스트 = [ 객체, 객체, 객체 ]
		// 세트 = [ 객체, 객체, 객체 ] 
		// 맵 = { 키 = 값}
		
		// 5. 모든 key 값 호출
		System.out.println("map 내 모든 키 호출 : " + map.keySet());
		// 6. 모든 value 값 호출
		System.out.println("map 내 모든 값 호출 : " + map.values());
		
		// 7. 반복문
			// 1. Iterator 
		System.out.println("Iterator");
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println("for");
			// 2. for
		for(String temp : map.keySet()) {
			System.out.println("\t"+temp + " : " + map.get(temp));
		}
		
		System.out.println();
		// 8. 삭제
		map.remove("홍길동");
		System.out.println("확인 : " + map);
		System.out.println("총 엔트리 길이 : " + map.size());
		// 9. 모두 삭제
		map.clear();
		System.out.println("확인 : " + map);
		System.out.println("총 엔트리 길이 : " + map.size());
		
	}
}
