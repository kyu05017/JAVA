package Day19;

import java.util.*;

public class Day19_1 {
	
	public static void main(String[] args) {
		
		// 컬렉션( 수집 ) 프레임워크 ( API [ 미리 만들어진 클래스] )
			// * 배열의 단점을 본완 사용
			// 1. List 컬렉션
				// * 인덱스 ( 저장순서가 존재 )가 존재 
				// 1. ArrayList 클래스	: 싱글스래드[ 순차적 추가/ 삭제 : 비교적 느림 ]
				// 2. Vector 클래스		: 멀티스레드 [ 동기화 지원 == 대기 상태 ] 
				// 3. LinkendList 클래스	: 중간 삽입/ 삭제 
			// 2. Set 컬렉션
				// * 인덱스 X ( 저장순서가 없기 때문에 자동으로 객체가 중복 불가능 )
				// 1. Hashset 클래스
					// 1. .add( 객체명 ) : set 객체내 객체 ( 요소 ) 추가
					// 2. size() : set객체내 객체 ( 요소 ) 개수
					// 3. .iterator : set 객체 순회 메소드
						// * Iterator < 제네릭 > 인터페이스명 : 순서없는 객체 순회 인터페이스 
						// * Iterator < 제네릭 > interator = set.iterator();
						//		1. iterator.hashnext() : 다음 객체 존재 여부 확인
						// 		2. iterator.next() : 다음 요소 가져오기
						// or
						// for( 임시객체명 : set객체명 ) { }
					// 4. .remove ( 객체명 ) : set 객체내 해당 요소 삭제
					// 5. .cleara(); : 해당 
			// 3. Map
		 //ㅇ
		// p. 737
		
		HashSet<String> set = new HashSet<String>();
		// 1. HashSet : 컬렉션 프레임 워크 클래스
			// 2. < 제네릭 > : Set 클래스 안에 들어가는 자료형
				// 3. set : 캑체명 ( 아무거나 ) 
					// 4. new : 객체 생성시 메모리 할당 
						// 5. HashSet< 생략가능 > () : 생성자
		
		
		// 2. set 객체내 객체 넣기 [ set객체명.add ( 객체명 ) ;
		set.add("Java");System.out.println("확인 : " + set);
		set.add("JDBC");System.out.println("확인 : " + set);
		set.add("Servlet/JSP");System.out.println("확인 : " + set);
		set.add("iBATIS");System.out.println("확인 : " + set);
		// 객체 중복 불가능
		set.add("Java");System.out.println("확인 ( 중복 불가능 ) : " + set);
		
		
		// 3. set객체내 객체 수 [ set객체명.size(); ]
		int size = set.size();System.out.println("[Iterator]총 객체수 : " + size);
		
		// 4. Iterator : 저장된 객체를 한번씩 가져오는 반복자 리턴 ( 순회 )
			// * set 컬렉션에서 사용되는 이유 : 인덱스가 없기 때문에 호출하는 방법이 없다 [ get이 없다 ]
		Iterator<String> iterator = set.iterator(); // set객체내 interator() :  순회
		while(iterator.hasNext()) { // .hasNext() 다음 요소 존재 여부 확인 = 다음 요소가 존재하면 true 없으면 false
			String element = iterator.next();	// .next() 다음 요소 가져오기
			System.out.println("\t" + element);
		}
		
		size = set.size();System.out.println("[for]총 객체수 : " + size);
		// * for 문과 컬렉션의 활용
			// for ( 임시 객체명 : 컬렉션 / 배열 ){ }  : 임시 객체명의 결렉션/ 배열 내 요소들을 한번씩 가져오는 반복자 
		for(String temp : set) {
			System.out.println("\t" + temp);
		}
		
		set.remove("JDBC");
		System.out.println("확인 : " + set);
		set.remove("iBATIS");
		System.out.println("확인 : " + set);
		
		System.out.println("총 객체수 : " + size);
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어있음");
		}
	}
}
