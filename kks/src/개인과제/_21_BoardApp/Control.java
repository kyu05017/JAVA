package 개인과제._21_BoardApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Control {
	
	public static ArrayList<Board> boardlist = new ArrayList<>();
	public static ArrayList<Reply> replylist = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	// 쓰기
	public static void writer(String title, String writting, String id, String pw) {
		// 1. 객체화 [ 변수가 하나이상이면 관리하기 불편함으로 하나의 객체로 묶어서 편하게 한다 ]
		Board board = new Board(title, writting, id, pw);
		// 2. 리스트에 저장 [ 콘솔의 메모리 ]
		boardlist.add(board);
		// 3. 파일에도 저장 [ 외부로 전달 ]
		DB.save();
	}
	// 보기

	// 수정
	public static boolean update(int number,String pw,String newtitle, String newcontents) {
		
		Board temp = Control.boardlist.get(number);
		for(Board temp2 : Control.boardlist) {
			if(temp2.getPassword().equals(pw)) {
				temp.setTitle(newtitle);
				temp.setContens(newcontents);
				DB.save();
			return true;
			}	
			else {
				return false;
			}
		}
		return false;
	}
	// 삭제
	public static boolean delete(int number, String pw) {
		
		Board temp = Control.boardlist.get(number);
		for(Board temp2 : Control.boardlist) {
			if(temp2.getPassword().equals(pw)) {
				Control.boardlist.remove(number);
				DB.save();
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	// 댓글 작성
	public static void reply_wwrite(int number, String replyCT, String replyID, String replyPW) {	
		Reply reply = new Reply(number,replyCT, replyID, replyPW);
		replylist.add(reply);
		DB.resave();
	}
	public static void reply_remove(int num) {
		
		
		System.out.println(replylist.get(num).getReply_writer() + "님 의 비밀번호 입력:");
		String pw = scanner.next();
		if(pw.equals(replylist.get(num).getReply_password())){
			System.out.println("메세지)) 댓글을 삭제합니다.");
			replylist.remove(num);
		}
	}

}
