package Day18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day18_3 {
	
	public static void main(String[] args) {
	
		// p. 731
			// LinkedList 클래스
		
		// 			ArrayList	 VS		 LinkedList 
		// 			   배열                   링크
		//내부구조차이   인덱스 기준 메모리연결     서로다른 메모리 주소 연결
		//   속도    
		//add[ 추가 ]    빠름                  
		//add[ 삽입 = 중간]                       빠름
		// 검색 			빠름						
		// 삭제 									빠름
		
		
		// p. 732
		
		// 1. 어레이 리스트 객체 선언 [ 제네릭 : 문자열 ]
		ArrayList<String> list1 = new ArrayList<>();
		// 2. 링크드 리스트 객체 선언 [ 제네릭 : 문자열 ]
		LinkedList<String> list2 = new LinkedList<>();
		
		// 3. 시간 변수
		long statTime;
		long endTime;
		
		// ArrayList 10000개의 객체를 삽입하는데 걸리는 시간 체크
		statTime = System.nanoTime();
		for(int i = 0 ; i < 10000; i++) {
		//	list1.add(0, i+""); 정수형을 문자열로 변환 
			list1.add(0,String.valueOf(i)); // 정수형을 문자열로 변환 
			// 문자열을 정수로 바꾸는 법
			// Integer.ParseInt(문자열);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : "+ (endTime - statTime) + "ns");
		
		// LinkedList 10000개의 객체를 삽입하는데 걸리는 시간 체크
		statTime = System.nanoTime();
		for(int i = 0 ; i < 10000; i++) {
			//	list2.add(0, i+""); 정수형을 문자열로 변환 
				list2.add(0,String.valueOf(i)); // 정수형을 문자열로 변환 
				// 문자열을 정수로 바꾸는 법
				// Integer.ParseInt(문자열);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : "+ (endTime - statTime) + "ns");
	}
}
