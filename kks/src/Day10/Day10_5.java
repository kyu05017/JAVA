package Day10;

import java.util.ArrayList;
import java.util.Scanner;


public class Day10_5 {
	//도서관관리 리스트
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 리스트 객체 생성
		ArrayList<Book> bookList = new ArrayList<>();
		// 리스트클래스 < 리스트안에 저장할 클래스 > 
			// <클래스> : 해당 클래스의 여러객체를 리스트에 저장
			// 길이는 가변 [ 기본 : 10 ] 추가하면 늘어나고 삭제하면 줄어든다.
		
		while(true) {
			System.out.println("1)등록 2)목록 3)삭제 4)수정");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
			// 배열
				// 1. 변수 입력받기
				System.out.println("도서명 : ");
				String bookname = scanner.next();
				System.out.println(" 저자 : ");
				String writer = scanner.next();
				// 2. 객체화 [ 여러개의 변수를 하나로 통합 ]
				Book book = new Book(bookname, writer);
				// 3. 배열저장 [ 공백을 찾아서 저장 ] vs 리스트 [ 공백을 찾을 필요가 없다 ]
				bookList.add(book);
				// 왜 이렇게 되냐? : 리스트명.add( 객체명 )
					//마지막 인덱스에 자동적으로 객체가 추가
			}
			else if(ch == 2) {
				// 1. 배열 [ null을 제외 ]
				System.out.println("책\t저자");
				for(Book book : bookList) {
					System.out.println(book.getBookName()+"\t"+book.getWriter());
				}
			}
			else if(ch == 3) {
				System.out.println("삭제할 책이름 입력");
				String aa = scanner.next();
				for(Book book : bookList) {
					if(book.getBookName().equals(aa)){
						bookList.remove(book);
						break;
					}
					
				}
				System.out.println("해당 책이 삭제 되었습니다.");
			}
			else if(ch == 4) {
				System.out.println("수정할 책이름 입력 :");
				String aa = scanner.next();
				for(Book book : bookList) {
					if(book.getBookName().equals(aa)) {
						System.out.println("새로운 저자명 입력 : ");
						String writer = scanner.next();
						book.setWriter(writer);
					}
				}
				System.out.println("수정이 완료되었습니다.");
			}
			
			
		}
	}
}
