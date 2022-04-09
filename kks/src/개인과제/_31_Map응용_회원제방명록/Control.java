package 개인과제._31_Map응용_회원제방명록;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Control {
	
	static Scanner scanner = new Scanner(System.in);
	static HashMap <Dto_Member, Dto_Board> list = new HashMap<>();
	Date date = new Date();
	
	public boolean create(String id,String pw,String contents) {
		Dto_Member member = new Dto_Member(id, pw);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm");
		String save_date = sdf.format(date);
		Dto_Board board = new Dto_Board(contents, save_date);
		list.put(member,board);
		Dao.memberSave();
		return true;
	}
	
	public void read() {
		for(Dto_Member temp : Control.list.keySet()) {
			if(temp != null) {
				System.out.println(temp.getId() + "님 "+ Control.list.get(temp).getContents()+" | " + Control.list.get(temp).getDate());
			}
		}
	}
	public boolean update(String id,String pw,String contents) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm");
		String save_date = sdf.format(date);
		for(Dto_Member temp : Control.list.keySet()) {
			if(temp.getId().equals(id)) {
				if(temp.getPw().equals(pw)) {
					Control.list.get(temp).setContents(contents);
					Control.list.get(temp).setDate(save_date);
					Dao.memberSave();
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		return false;
	}
	public boolean delete(String id,String pw) {
		for(Dto_Member temp : Control.list.keySet()) {
			if(temp.getId().equals(id)) {
				if(temp.getPw().equals(pw)) {
					Control.list.remove(temp);
					Dao.memberSave();
					return true;
				}
			}
		}
		return false;
	}
}
