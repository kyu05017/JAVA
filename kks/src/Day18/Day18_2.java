package Day18;

import java.util.List;
import java.util.Vector;

public class Day18_2 {
	// p. 730
	public static void main(String[] args) {
		
		// p. 730
			// list 컬렉션
				// arraylist
				// vector
				// linkedlist
		
		// arraylsit VS vector [ 동기화 차이 ] 
		// 	동기화 x 	    동기환 o
		// 싱글스레드 		멀티스레드
		// 	main 		Thread,runnable
		//
		//
		//Vector 클래스
		// 1. Vector 리스트 객체 선언
		Vector<Board> list = new Vector<>();
		// 2. 리스트 객체네 추가
			// 1. 리스트내 객체 바로 추가 new : 객체 메모리 할당
		list.add(new Board("제목1", "내용1", "글쓴이1"));
			// 2. 객체 생성후 리스트내 객체 추가
		Board board = new Board("제목2", "내용2", "글쓴이2");
		list.add(board);
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		System.out.println("확인 : " + list);
		
		// 1. 검색
		System.out.println("객체 검색 : " + list.contains(board));
		System.out.println("객체 검색 위치 : " + list.indexOf(board));
		
		// 2. 삭제
		list.remove(2);
		System.out.println("2번 인덱스 삭제 후 : " + list);
		list.remove(2);
		System.out.println("2번 인덱스 삭제 후 : " + list);
		System.out.println("----------------------------------------");
		System.out.println("제목  내용  작성자");
		// 3. 반복문을 이용한 개시물출력
		for(Board temp : list) {
			System.out.println(temp.subject+" "+temp.contents+" "+temp.writer);
		}
		System.out.println("----------------------------------------");
		for(int i = 0; i < list.size(); i++) {
			Board board2 = list.get(i);
			System.out.println(board2.subject+" "+board2.contents+" "+board2.writer);
		}
	}
}
