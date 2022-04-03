package 개인과제._21_BoardApp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Control {
	
	public static ArrayList<Board> boardlist = new ArrayList<>();

	// 쓰기
	public static void writer(String title, String writting, String id, String pw) {
		// 1. 객체화 [ 변수가 하나이상이면 관리하기 불편함으로 하나의 객체로 묶어서 편하게 한다 ]
		Board board = new Board(title, writting, id, pw);
		// 2. 리스트에 저장 [ 콘솔의 메모리 ]
		boardlist.add(board);
		// 3. 파일에도 저장 [ 외부로 전달 ]
		save();
	}
	// 보기

	// 수정
	public static boolean update(int number,String pw,String newtitle, String newcontents) {
		
		Board temp = Control.boardlist.get(number);
		for(Board temp2 : Control.boardlist) {
			if(temp2.getPassword().equals(pw)) {
				temp.setTitle(newtitle);
				temp.setContens(newcontents);
				Control.save();
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
				Control.save();
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
			
		Reply reply = new Reply(replyCT, replyID, replyPW);
		Board board = new Board();
		reply.setReply_contents(replyCT);
		reply.setReply_writer(replyID);
		reply.setReply_password(replyPW);
		//board.getReplylist(board.setReplylist(reply));
	}
	
	// 게시물 저장
	public static void save() {
		try {
			FileOutputStream outputStream = new FileOutputStream("D:/bookDB.txt");
			for(Board temp : boardlist) {
				String contents = temp.getTitle() +","+temp.getContens()+","+temp.getPassword()+","+temp.getWriter()+","+temp.getViewcount()+","+temp.getDate()+"\n";
				outputStream.write(contents.getBytes());
			}
		}
		catch(Exception e) {
		}
	}
	// 게시물 불러오기
	public static void load() {
		
		try {
			FileInputStream inputStream = new FileInputStream("D:/bookDB.txt");
			byte[] bytes = new byte[1024]; 
			inputStream.read(bytes); 
			String file = new String(bytes); 
			String[]list = file.split("\n"); 
			
			
			for(String temp : list) {
				String[] filed = temp.split(",");
				Board boards = new Board(filed[0], filed[1], filed[2], filed[3], Integer.parseInt(filed[4]), filed[5],null);
				boardlist.add(boards);
			}
			
		}
		catch(Exception e) {
		}
		
	}
}
