package 개인과제._31_Map응용_회원제방명록;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Scanner;

public class Control {
	
	static Scanner scanner = new Scanner(System.in);
	static Hashtable <Dto_Member, Dto_Board> list = new Hashtable<>();
	
	public boolean singup(String id,String pw,String contents) {
		Dto_Member member = new Dto_Member(id, pw);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm");
		String save_date = sdf.format(date);
		Dto_Board board = new Dto_Board(contents, save_date);
		list.put(member,board);
		Dao.memberSave();
		return true;
	}
}
