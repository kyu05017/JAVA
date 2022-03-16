package Day11;

import java.util.Scanner;

public class Day11_4_BoardApp {
	/*
	 * 
	 *게시판 + 댓글 [ 예외처리, 파일처리, 리스트 ]
	 * 			//m) 게시물 클래스
	 * 				// 필드
	 * 					// 게시물번호[인덱스] 비밀번호 제목 내용 작성자 작성일 조회수
	 * 					// 댓글리스트 
	 * 			//m) 댓글
	 * 				// 내용, 작성자, 작성일
	 *			//c) 컨트롤
	 *				// 1.목록 2.쓰기 3.보기 4.수정 5.삭제 6 댓글쓰기 7. 댓글삭제
	 *				// 8 저장 9 불러오기 10댓글저장 11 불러오기
	 *			//v) Day11_4_BoardApp 
	 *					//프론트
	 *					// 입력받아 컨트롤러에게 입력받은 값 전달.
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {//사용자가 문자 입력시 형변환이 불가능 해서 예외가 발생함!!!!!!!! > catch
				Controller.boardlist(); // 객체없이 메소드호출 static 메소드여서
				System.out.print("1.쓰기 2.보기 선텍: \n");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					Controller.writer();
				}
				else if(ch == 2) {

				}
				else {
					
				}
			}
			catch(Exception e) {
			System.err.println("메세지))숫자만 입력가능합니다.");
			scanner = new Scanner(System.in); // 다시 메모리 할당
			}
		}
		
	}
}
