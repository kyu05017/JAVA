package Team_0323;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	
	// 회원리스트
	static ArrayList<Member> memberlist = new ArrayList<>();
	// 영화리스트
	static ArrayList<Movie> movielist = new ArrayList<>();
	
	static String[] theater = {	"[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]",
								"[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]",
								"[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]",
								"[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]",
								"[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]","[  ]",};
	
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

		for(Member temp : memberlist) {
			if(temp!=null&&temp.getName().equals(name)&&temp.getPhone().equals(phone)) {
				return temp.getId();
			}
		}
		return "false";
	}
	
	public String findpw(String id,String phone) {
		for(Member temp : memberlist) {
			if(temp!=null&&temp.getId().equals(id)&&temp.getPhone().equals(phone)) {
				return temp.getPw();
			}
		}
		return "false";
	}
	
	public void memberInfo(String id) {
		System.out.println("회원 정보))");
		for(Member temp : memberlist) {
			if(temp.getId().equals(id)) {
				System.out.println("-------------------------------");
				System.out.println("아이디 : " + temp.getId());
				System.out.println("이름  : " + temp.getName());
				System.out.println("번호  : " + temp.getPhone());
				System.out.println("-------------------------------");
				System.out.println("1)비밀번호 변경  2)회원 탈퇴  3)뒤로가기");
				String work = scanner.next();
				
				if(work.equals("1")) {
					changepw(id);
				}
				else if(work.equals("2")) {
					singOut(id);
				}
				else if(work.equals("3")) {
					System.out.println("메세지)) 이전으로 돌아갑니다.");
				}
				
			}
				
		}
		
		
	}
	
	public void changepw(String id) {
		System.out.println("비밀번호 변경)) ");
		System.out.println("비밀번호 : ");
		String pw = scanner.next();
		String new_pw = null;
		for(Member temp : memberlist) {
			if(temp.getId().equals(id) && temp.getPw().equals(pw)) {
				while(true) {
					int pass = 0;
					System.out.println(" 변경할 비밀번호 입력 : "); 
					new_pw = scanner.next();
					if(new_pw.length() < 7) {
						System.out.println("메세지)) 비밀번호의 길이는 8자리 이상이여야 합니다.");
						pass = 0;
					}
					else {
						pass = 1;
					}
					if(pass == 1) {
						break;
					}
				}
				temp.setPw(new_pw);
				break;
			}
		}
	}
	
	public void singOut(String id) {
		
	}
	
	//영화시스템///////////////////////////////////////////////////////////////////////////
	
	public void reserve() {}
	
	public void myreserve() {}
	
	public void cancle() {}
	
	//관리자 시스템/////////////////////////////////////////////////////////////////////////
	
	public void moive_register () {}
	
	public void movie_remove () {}
	
	public void sale() {}
	
	
	
}
