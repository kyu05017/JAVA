package Day18;

import java.util.ArrayList;

public class Day18_1 {

	
	// p. 722 : 컬렉션 프레임 워크
		// 여러개의 객체를 추가,검색,삭제 -> 배열
		// 배열의 문제점 :
			//  1. 불특정 다수의 객체를 저장 불가 [ 길이를 크게 설정 -> 비효울적 ]
			//  2. 삭제 했을때 듬성듬성 빠진 옥수수 [ 삭제시 인덱스가 빈 현상 ]
		// 객체들을 효율[ ! ] 적으로 추가, 삭제, 검색 ---> 컬렉션 프레임 워크
		// 컬렉션 => 수집 
		// * 저장 ( 수집 ) 관련 클래스 / 인터페이스
	
	// 1. List 인터페이스
		// 1. Arraylist 클래스
		// 2. Vector 클래스
		// 3. Linkedlist 클래스
	
	// 2. Set 인터페이스
		// 1. Hashset 클래스
		// 2. TreeSet 클래스
	
	// 3. Map 인터페이스
		// 1. HashMap 클래스
		// 2. Hashtable 클래스
		// 3. TreeMap 클래스
		// 4. Propertoes 클래스
	
	
	// p. 728 : Arraylist 클래스
		// 배열과 유사하지만 길이 ( 저장수 ) 가 가변 [ 자동 ]
		
		// 1. 리스트 클래스 선언 [ 리스트 안에 저장할 항목의 자료형 >> 제네릭 ] 
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
			// 1. ArrayList : 리스트 클래스
				// 2. < 제네릭 > : 클래스 내부 [ 리스트 내부 ] 에 들어가는 자료형 
					// 3. List : 리스트 객체명 ( 아무거나 )
						// 4. new Arraylist < 제네릭 = 생략가능 > ( 길이 = 생략가능 = 초기값 10개 ); // 생성자 
		// 2. 리스트객체명.add ( 객체명 == 제네릭 타입 ); 리스트객체 내 요소 추가
		list.add("Java");		// 0
		list.add("jdbc");		// 1
		list.add("Servlet/JSP");// 2 
		
		System.out.println("리스트내 요소들 확인" + list);
		list.add(2,"DateBase"); // 인덱스 2에 요소 추가 [ 기존 인덱스2 >> 인덱스3 ]
		System.out.println("특정 인덱스에 요소를 추가" + list);
		
		list.add("iBATIS");
		
		// 3. 리스트객체명.size() : 리스트 내 요소들의 개수 [ 길이 ]
		System.out.println("리스트내 객체 수 : " + list.size());
		
		// 4.리스트객체명.get() : 리스트 객체 내 특정 인덱스의 요소를 호출
		System.out.println("2번 인덱스 호출 " + list.get(2));
		
		// 5. 반복문 환용 [ 리스트와 반복문 같이 활용 ] 
			// 인덱스가 필요할때!!!
		for(int i = 0; i < list.size(); i++) {	// i 는 0 부터 리스트의 객체내의 총 길이까지 1씩 증가하며 반복
			String str = list.get(i); // i 번째 인덱스를 호출해서 문자열에 저장 
			System.out.println(i+":" + str);	// 저장된 값을 출력 
		}
		// * 반복문 활용2 
			// 인덱스 없이 요소들을 불러올때 
		int j = 1;	 // 인덱스를 만들어 대체 
		for(String temp : list) {
			System.out.println(j + ":" + temp);
			j++;
		}
		
		// 6. 리스트객체명.remove(); 
		list.remove(2);
		System.out.println("2번 인덱스 삭제 : " + list );
		list.remove(2);
		System.out.println("2번 인덱스 삭제 후 : " + list );
		list.remove("iBATIS");
		System.out.println("아이베티스 삭제 후 : " + list);
		// 모두 삭제
		list.clear();
		System.out.println("모두 삭제 후 : " + list);
		
		
	}
		
}
