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
				//비밀번호 입력받아 동일하면 삭제
			// 3. 수정
				//비밀번호 입력받아 동일하면 수정
	
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
				if( board != null) { // 만약에 해당 board 객체가 내용물이 있으면 출력
					System.out.printf("%d\t%s\t%s \n" , (index) , board.writer , board.title);
				}
				index++;// 인덱스 증가
			}
			System.out.println("(1)글쓰기 (2)글보기 (3)종료");
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
				System.out.println("------------------글보기-----------------");
				System.out.println("게시물 번호 선택");int bno = scanner.nextInt();
					//배열내 머든 객체를 출력 반복문			//현재 인데스 번호 
				// 반복문 사용 목적 없음 => 출력할[인덱스] 위치를 입력받았기 때문에
				// 입력받은 인덱스 위치에 출력
				System.out.printf("작성자: %s  제목: %s\n",boardlist[bno].writer,boardlist[bno].title);
				System.out.printf("내용 : %s\n",boardlist[bno].content);
				System.out.println("(1)목록보기 (2)글삭제 (3)글수정"); int ch2 = scanner.nextInt();
				System.out.println("--------------------------------------");
				
				if (ch2 == 1) {
					System.out.println("알림)) 메뉴로 돌아갑니다");
				}
				else if (ch2 == 2) {
					System.out.println("------------------글삭제-----------------");
					System.out.println("글을 삭제 합니다.");
					System.out.println("비밀번호를 입력하세요.");
					String password = scanner.next();
					if( boardlist[bno].password.equals(password) ) { // 게시물객체내 비밀번호 == 입력한 비밀번호 
						System.out.println(" 알림)) 삭제 성공 ");
						boardlist[bno] = null; // 해당 게시물에 null 변경 // 삭제처리
						
						// 삭제후에 삭제된 인덱스 뒤로 한칸씩 앞으로 이동 
							// 왜???  만약에 해당 코드가 없을경우 배열내 사이사이 공백 발생 
						for( int i = bno ; i< boardlist.length ; i++ ) {
							// * 검색된 게시물의 인덱스부터 마지막인덱스까지 1씩증가 
							
							if( i == boardlist.length-1) boardlist[ boardlist.length-1 ] = null;
							// i가 마지막인덱스와 같으면 마지막인덱스에는 null 대입
							else boardlist[i] = boardlist[i+1];// 삭제된 게시물 다음 게시물
							// 마지막 인덱스가 아니면 인덱스 당기기 
							
								// *  	만약에 2번 인덱스 삭제시 
								// 		2인덱스 = 3인덱스 
								//	  	3인덱스 = 4인덱스 
								//		4인덱스 = 5인덱스 
								//      ~~~~~~~~~~~
								//		98인덱스 = 99인덱스 [ 0번~99번 -> 100개 인덱스 ]
								//		99인덱스 = null [ 99번 인덱스 : 마지막인덱스 ] 
						
						}
						
					}else {
						System.out.println(" 알림)) 비밀번호가 다릅니다 [ 삭제실패 ]");
					}
					System.out.println("--------------------------------------");
				}
				else if (ch2 == 3) {
					System.out.println("------------------글수정-----------------");
					System.out.println("글을 수정 합니다.");
					System.out.println("비밀번호를 입력하세요.");
					String pw2 = scanner.next();
					if (pw2.equals(boardlist[bno].password)) {
						System.out.println("수정할 제목을 입력하세요");
						boardlist[bno].title = scanner.next();
						System.out.println("수정할 내용을 입력하세요");
						boardlist[bno].content = scanner.next();
						System.out.println("수정이 완료 되었습니다.");
					}
					else {
						System.out.println("비밀번호가 틀렸습니다.");
					}
					
					System.out.println("--------------------------------------");
					
				}
				else {
					System.out.println("잘못 입력하여습니다");
				}
				
			}//ch2 e
			else if(ch == 3) { // ch3 s
				System.out.println("알림) 종료했습니다.");
				break;
			}//ch3 e
			else {
				System.out.println("알림)) 잘못된 입력");
			}
		}//w1 e
//////////////////////////////////////////////////////////////		
	}//m e

}//c e
