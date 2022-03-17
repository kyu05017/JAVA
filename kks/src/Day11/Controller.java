package Day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Controller {
	
	
	
	public static ArrayList<Board_MainContents> boardlist = new ArrayList<>();
	//  C R U D
	// 1 .create
	// 2. read
	// 3. update
	// 4. delete
	
	// 목록메소드

	// 쓰기
	public static void writer(String title, String writting, String id, String pw) {
		// 1. 객체화 [ 변수가 하나이상이면 관리하기 불편함으로 하나의 객체로 묶어서 편하게 한다 ]
		Board_MainContents board = new Board_MainContents(title, writting, id, pw);
		// 2. 리스트에 저장 [ 콘솔의 메모리 ]
		boardlist.add(board);
		// 3. 파일에도 저장 [ 외부로 전달 ]
		save();
	}
	// 보기

	// 수정
	public static boolean update(int number,String pw,String newtitle, String newcontents) {
		
		Board_MainContents temp = Controller.boardlist.get(number);
		for(Board_MainContents temp2 : Controller.boardlist) {
			if(temp2.getPassword().equals(pw)) {
				temp.setTitle(newtitle);
				temp.setContens(newcontents);
				Controller.save();
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
		
		Board_MainContents temp = Controller.boardlist.get(number);
		for(Board_MainContents temp2 : Controller.boardlist) {
			if(temp2.getPassword().equals(pw)) {
				Controller.boardlist.remove(number);
				Controller.save();
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
		
		
		Board_Reply reply = new Board_Reply(replyCT, replyID, replyPW);
		Board_MainContents board = new Board_MainContents();
		reply.setReply_contents(replyCT);
		reply.setReply_writer(replyID);
		reply.setReply_password(replyPW);
		//board.getReplylist(board.setReplylist(reply));
	}
	
	// 게시물 저장
	public static void save() {

		// 리스트내에 모든 게시물은 파일에 저장
		try {
		FileOutputStream outputStream = new FileOutputStream("D:/KKS/자바/a.txt");
		// 2. 파일에 작성할 내용 [ 한줄씩 ]
		for(Board_MainContents temp : boardlist) {
			String contents = temp.getTitle() +","+temp.getContens()+","+temp.getPassword()+","+temp.getWriter()+","+temp.getViewcount()+","+temp.getDate()+"\n";
			outputStream.write(contents.getBytes());
		}
		
		// 3. 내용[문자열] -> 바이트열 변환 [ 외부통신 > 스트림 [바이트] ]
		
		// 4. 내보내기 write()
		
		
		}
		catch(Exception e) {
		}
	}
	
	// 게시물 불러오기
	public static void load() {
		
		try {
			FileInputStream inputStream = new FileInputStream("D:/KKS/자바/a.txt");
			byte[] bytes = new byte[1024]; // 1 . 바이트 배열 선언
			inputStream.read(bytes); // 2. 모든 바이트를 읽어와서 바이트열에 저장 
			String file = new String(bytes); // 3. 바이트를 문자열로 변환
			String[]list = file.split("\n"); // 4. 문자열 자르기
			
			
			for(String temp : list) { // 배열내 하나 씩 꺼내옴
				String[] filed = temp.split(",");// 5. 문자열 자르기 
				Board_MainContents boards = new Board_MainContents(filed[0], filed[1], filed[2], filed[3], Integer.parseInt(filed[4]), filed[5],null);
				boardlist.add(boards);
			}
			
		}
		catch(Exception e) {
		}
		
	}
	

}
