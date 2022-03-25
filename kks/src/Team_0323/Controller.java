package Team_0323;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	
	// 회원리스트
	static ArrayList<Member> memberlist = new ArrayList<>();
	// 영화리스트
	static ArrayList<Movie> movielist = new ArrayList<>();
	
	Scanner scanner = new Scanner(System.in);
	DB db = new DB();
	//회원 시스템 ////////////////////////////////////////////////////////////////////////
	
	public int sign (String id, String pw,String name, String phone) {
		//객체화
		Member member = new Member( id, pw, name, phone,false);
		//회원정보 저장
		memberlist.add(member);
		
		db.memberSave();
		return 1;
	}
	
	public String login(String id,String pw) {
		
		db.memberLoad();
		
		//로그인 중복체크
		for(Member temp : memberlist) {
			if(temp!=null) {
				if(id.equals("admin") && temp.getPw().equals(pw)) {
					return "admin";
				}
				else if(temp.getId().equals(id)&&temp.getPw().equals(pw)) {
					return temp.getId(); //로그인성공 리스트에있는 아이디 리턴
				}
				
			}
			
		}
		return "false";
	}
	
	
	public String findid(String name, String phone) {//아이디찾기

		for(Member temp : Controller.memberlist) {
			if(temp!=null&&temp.getName().equals(name)&&temp.getPhone().equals(phone)) {
				return temp.getId();
			}
		}
		return "false";
	}
	
	public String findpw(String id,String phone) {
		for(Member temp : Controller.memberlist) {
			if(temp!=null&&temp.getId().equals(id)&&temp.getPhone().equals(phone)) {
				return temp.getPw();
			}
		}
		return "false";
	}
	
	public void changepw() {}
	
	//영화시스템///////////////////////////////////////////////////////////////////////////
	
	public void reserve() {}
	
	public void myreserve() {}
	
	public void cancle() {}
	
	//관리자 시스템/////////////////////////////////////////////////////////////////////////
	
	public void moive_register () {}
	
	public void movie_remove () {}
	
	public void sale() {}
	
	
	
}
