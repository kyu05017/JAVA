package 개인과제12_비회원제게시판;

public class Board {
	// * Board 클래스 선언
		// main 메소드는 실행할때만 사용
	
	// 1. 필드
	String title;
	String content;
	String writer;
	String password;

	
	// 2. 생산자
		// 자동 : 오른쪽클릭 source 밑에서 세번째 메뉴
		
		// 1. 빈생성자
	public Board() {
		
	}
		// 2. 1개 필드를 받는 생성자
	Board(String title) {
		this.title = title;
		//this.필드명 => 내부변수
		// * 외부로 부터 들어온 제목을 내부변수에 저장
	}
		// 3. 2개 필드를 받는 생성자
	Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	Board(String title, String content, String writer,String password) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
	}
		// 4. 3개 필드를 받는 생성자
		// 5. 4개 필드를 받는 생성자
}
