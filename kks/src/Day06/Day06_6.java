package Day06;

import java.util.Scanner;

public class Day06_6 {//c s
	
	
	//게시판 [ 클래스 버전 ]
		// 0. 게시물 섨계 => 클래스 선언
			// 필드 : 제목, 내용, 작성자, 비밀번호
			// 생성자 : 사용유무 선택
	
		// 1. 첫화면 [ 모든 게시물 출력(번호, 제목, 작성자)]
	
		// 2. 메뉴 [ 1.글쓰기 2.글보기]
			// 1. 글쓰기 [ 제목, 내용, 작성자, 비밀번호] => 4개 변수 => 객체화
			// 2. 글보기 [ 해당 글번호의
				// 글번호는 배열에 저장되는 순서
				// 글보기 메뉴
	
		// 3. 글보기 메뉴 
			// 1. 뒤로가기(목록보기)
			// 2. 삭제
				// 작성자와 비밀번호 입력받아 동일하면 삭제
			// 3. 수정
				// 작성자와 비밀번호 입력받아 동일하면 수정
	
	public static void main(String[] args) {//m s
		
		//준비 [ 모든 {} 안에서 사용되는 변수 선언 ]
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];
/////////////////////////////////////////////////////////////////		
		while(true) {//w1 s [ 무한루프 종료조건 없음 ]
			System.out.println("-----------------커뮤니티----------------");
			System.out.println("번호\t작성자\t제목");
				//배열내 머든 객체를 출력 반복문
			int index = 0;//인덱스 추가 [ 반복순서 : 배열내 객체 수 체크 ]
			for(Board board : boardlist) {
				if( board != null ) { // 만약에 해당 board 객체가 내용물이 있으면 출력
					System.out.printf("%d\t%s\t%s \n" , index , board.writer , board.title);
				}
				index++;// 인덱스 증가
			}
			System.out.println("(1)글쓰기 (2)글보기");
			System.out.println("--------------------------------------");
			int ch = scanner.nextInt();
			
			if(ch==1) { // ch1 s
				System.out.println("-----------------글쓰기----------------");
				// 4개 변수를 입력받는다
				System.out.println("제목 :"); String title =scanner.next();
				System.out.println("내용 :"); String content = scanner.next();
				System.out.println("작성자 :"); String writer = scanner.next();
				System.out.println("비밀번호 :"); String password = scanner.next();
				// 2. 4개 변수를 객체화 [ 객체를 만들어서 4개 변수를 객체내 필등[ 저장
				Board board = new Board( title , content , writer , password ); // 4개 필드를 갖는 생성자 사용
				// 3. 배열내 빈공간을 찾아서 빈공간에 객체 대입
				int i = 0;
				for( Board temp : boardlist ) {
					if( temp == null ) { // 빈공간 찾았으면 
						boardlist[i] = board; // 해당 인덱스에 새로운 객체 저장 
						break; // 한번 저장했으면 반복문 종료 
					}
					i++;
				}
				////////////
				
			}//ch1 e
			else if(ch == 2) { // ch2 s
				
			}//ch2 e
			else if(ch == 3) { // ch3 s
				
			}//ch3 e
			else {
				System.out.println("알림)) 잘못된 입력");
			}
		}//w1 e
//////////////////////////////////////////////////////////////		
	}//m e

}//c e
