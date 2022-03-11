package Day07;

import java.util.Scanner;

//대여없이 반납하면 눌포인트 수정

public class Day07_5_bookApplication {// c s
	
	// bookAplication 클래스 : 압출력 관련코드
			// Book : 도서관련 코드
			// Member 클래스 : 회원관련코드
			
			// * 도서 대여 console 프로그램[클래스버전]
				// 1. 클래스
					// 1. book
						// 1. 필드  : ISBM[도서코드], 도서명, 작가, 도서대여여부, 대여회원 
						// 2. 메소드 : 1. 도서검색 2. 도서목록 3.도서대여 4. 도서반납
						// 3. 관리자 메소드 : 1.도서 등록 2.도서삭제
					// 2. member	
						// 1. 필드 : 회원번호, 회원아이디, 비밀번호,이름,연락처
						// 2. 메소드 : 회원가입 , 로그인, 아이디찾기 , 비밀번호 찾기
						
					
				// 2. 화면설계
					// 1. 초기메뉴 [ 1. 회원가입 2. 로그인 3.아이디찾기 4.비밀번호찾기]
					// 2. 일반회원메뉴 [ 1.도서검색 2. 도서목록 3. 도서대여 4. 도서반납 5.로그아웃 ]
					// 3. 관리자 메뉴 [ 1. 도서등록 2. 도서목록 3.도서삭제 4.순위(도전) 5.로그아웃 ]
	
	// * main 밖에 변수를 선언하는 이유 : 모든 메소드에서 사용하기 위해
		// 지역변수 : 중괄호 {} 내에서 선언된 변수는 {} 밖으로 못나감
			// 서로 다른 중괄호에서 내에서 사용시 => 전역변수
		//static : 프로그램 종료시 까지 메모리에 할당	
			// 프로그램 시작시 메모리 할당이 되고 종료시 메모리초기화
			// 프로그램 전반적으로 모든곳에 사용되는 메모리에 사용
			// 왜 static을 권장하지 않는 이유 => 계속 메모리가 할당이 되어 프로그램이 무거워진다.
	
	
	static Scanner scanner = new Scanner(System.in);
	static Member[] members = new Member[1000];//모든 클래스에서 사용하는 회원목록 
	static Book[] books = new Book[1000];
	
	// 0. 코드르 읽어주는 메소드
	public static void main(String[] args) { // m s
		
		//메소드 호출
			
		// 1. 내부호출 불가능
		//menu(); //내부호출 불가능 모든 메소드에 static 붙여야함
			//static : 메모리 우선할당 이기때문에 static외 메소드, 필드를 못읽음
			//main 메소드는 static 메소드 이기때문에 static 메모드만 내부호출 가능 
		// 2. 외부호출
			// 1. 객체 생성 -> 메소드 호출
			Day07_5_bookApplication appAplication = new Day07_5_bookApplication();
			appAplication.menu();
			
			
		
	}// m e
	
	// 1. 초기 메뉴 메소드
	void menu() {
		Day07_5_bookApplication appAplication = new Day07_5_bookApplication();
		Member member = new Member(); // 1~4번에서 사용하려고
		while(true) { // 종료조선 [ 5번 ]
			System.out.println("-----------회원제 도서대여 프로그램-----------");
			System.out.println("1.회원가입/ 2.로그인/ 3.아이디찾기/ 4.비밀번호찾기");
			int ch = scanner.nextInt();
			
			if(ch == 1) {//회언가입
				boolean result = member.singup();
				if(result == true)System.out.println("알림))회원가입 성공");
				else System.out.println("알림)) 회원가입 실패");
			}
			else if(ch == 2) {//로그인
				//로그인메소드 호출
					//1. 일반회원 메소드
				String result = member.login();
				
				if( result == null ) { // 로그인실패 
					System.out.println("알림)) 동일한 회원정보가 없습니다.");
				}else if( result.equals("admin")) { // 관리자
					// 2. 관리자 메뉴 메소드 호출 
					System.out.println("알림)) 안녕하세요~ "+result+"님");
					adminmenu(); // 내부 메소드 호출
				}else{ // 일반 
					// 1. 일반회원 메뉴 메소드 호출
					System.out.println("알림)) 안녕하세요~ "+result+"님");
					membermenu(result);
				}
					//2. 관리자메뉴 메소드
			}	
			else if(ch == 3) {//아이디 찾기
				member.findid();
			}
			else if(ch == 4) {//비밀번호찾기
				member.findpw();
			}
			else if(ch == 5) {
				System.out.println("알림))종료 합니다.");
				break;
			}
		}
	}
	
	// 2. 일반회원 메뉴 메소드
	void membermenu(String loginid) { //인수의 변수명을 아무거나
		while(true) {
			System.out.println("---------------도서대여시스템-----------------");
			System.out.println("1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃");
			int ch= scanner.nextInt();
			Book book = new Book();
			
			if(ch==1) {//도서검색
				book.bsearch();
			}
			else if(ch==2) {//도서목록
				book.blist();
			}
			else if (ch ==3) {//도서대여
				book.brental(loginid);
			}
			else if(ch ==4) {//도서반납
				book.bback(loginid);
			}
			else if(ch==5) {//로그아웃
				return;
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	// 3. 관리자 메뉴 메소드
	void adminmenu() {
		while(true) {
			System.out.println("--------------- 관리자 메뉴-----------------");
			System.out.println("1.도서추가 2.도서목록 3.도서삭제 4.로그아웃");
			int ch= scanner.nextInt();
			Book book = new Book();
			
			if(ch==1) {//도서추가
				book.badd();
			}
			else if(ch==2) {//도서목록
				book.blist();
			}
			else if(ch ==3) {//도서삭제
				book.bremove();
			}
			else if(ch==4) {//로그아웃
				return;
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
}// c e
