package Day11;

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
	public static void boardlist() {
		
	}
	// 쓰기
	public static void writer() {
		
	}
	// 보기
	public static void view() {
	
	}
	// 수정
	public static void update() {
		
	}
	
	// 삭제
	public static void delete() {
		
	}
	
	// 댓글 작성
	public static void reply_wwrite() {
		
	}
	
	// 게시물 저장
	public static void save() {
		try {
		FileOutputStream outputStream = new FileOutputStream("D:/KKS/자바/a.txt");
		}
		catch(FileNotFoundException e) {
			
		}
	}
	
	// 게시물 불러오기
	public static void load() {
		
	}
	

}
