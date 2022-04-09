package 개인과제._31_Map응용_회원제방명록;

import java.util.Hashtable;
import java.util.Scanner;

public class Control {
	
	static Scanner scanner = new Scanner(System.in);
	static Hashtable <Dto_Member, Dto_Board> list = new Hashtable<>();
	
	public boolean singup(String id,String pw) {
		Dto_Member member = new Dto_Member(id, pw);
		list.put(member,null);
		return true;
	}
	public String singin(String id,String pw) {
		for(Dto_Member temp : list.keySet()) {
			if(temp.getId().equals(id)) {
				if(temp.getPw().equals(pw)) {
					return temp.getId();
				}
				else {
					return "false2";
				}
			}
			else {
				return "false1";
			}
		}
		return "false1";
	}
}
