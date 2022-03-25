package Team_0323;

import java.io.FileOutputStream;
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
		
		Member member = new Member( id, pw, name, phone,false);
		memberlist.add(member);
		db.memberSave();
		return 1;
	}
	
	public String login(String id,String pw) {
		

		for(Member temp : memberlist) {
			if(temp!=null) {
				if(id.equals("admin") && temp.getPw().equals(pw)) {
					return "admin";
				}
				else if(temp.getId().equals(id)&&temp.getPw().equals(pw)) {
					return temp.getId();
				}
				
			}
			
		}
		return "false";
	}
	
	
	public String findid(String name, String phone) {//아이디찾기

		for(Member temp : memberlist) {
			if(temp!=null && temp.getName().equals(name) && temp.getPhone().equals(phone)) {
				return temp.getId();
			}
		}
		return "false";
	}
	
	public String findpw(String id,String phone) {
		for(Member temp : memberlist) {
			if(temp!=null && temp.getId().equals(id) && temp.getPhone().equals(phone)) {
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
				System.out.println("1)비밀번호 변경  2)회원탈퇴  3)뒤로가기");
				String work = scanner.next();
				
				if(work.equals("1")) {
					boolean result = changepw(id);
					if(result) {
						System.out.println("메세지)) 비밀번호 변경완료");
					}
					else {
						System.out.println("메세지)) 비밀변호 변경실패");
					}
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
	
	public boolean changepw(String id) {
		
		System.out.println("비밀번호 변경)) ");
		System.out.println("비밀번호 : ");
		String pw = scanner.next();
		String new_pw = null;
		
		for(Member temp : memberlist) {
			if(temp.getId().equals(id) && temp.getPw().equals(pw)) {
				while(true) {
					int pass = 0;
					System.out.println("변경할 비밀번호 입력 : "); 
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
				db.memberSave();
				return true;
			}
		}
		return false;
	}

	public void singOut(String id)  {
		System.out.println("회원 탈퇴))");
		System.out.println("비밀번호 입력 : ");
		String pw = scanner.next();
		
		for(Member temp : memberlist) {
	
			if(temp.getId().equals(id) && temp.getPw().equals(pw)) {
				System.out.println("메세지)) 정말 탈퇴하시겠습니까?");
				System.out.println("1)네     2)아니요");
				String work = scanner.next();
				if(work.equals("1") || work.equals("네")) {
					memberlist.remove(temp);
					break;
				}
				else if (work.equals("2") || work.equals("아니요")) {
					System.out.println("이전 메뉴로 돌아갑니다.");
					break;
				}
				
			}
		}
		db.memberSave();
		return ;
	}
	
	//영화시스템///////////////////////////////////////////////////////////////////////////
	
	public void reserve() {}
	
	public void myreserve() {}
	
	public void cancle() {}
	
	//관리자 시스템/////////////////////////////////////////////////////////////////////////
	
	public void moive_register (String title, String intime, String runtime) {
		
		Movie movie = new Movie(title, intime, runtime , 0);
		
		//영화티켓가격 계산
		String [] startTime = intime.split(":");
		
		int startHour = Integer.parseInt(startTime[0]);

		int money = 0;
		
		if (startHour <= 10) {
			money = 5000;
		}else {
			money = 7000;
		}
		
		
		//리스트에 저장
		movielist.add(movie);
		
		//파일처리
		try {//예외가 발생할 것 같은 코드 묶음					
			FileOutputStream outputStream = new FileOutputStream("D:/movie/상영중인영화.txt", true);
			String movieRecord = title + "," + intime+ "," +runtime+  ","+ money + "\n"; //, : 구분
			outputStream.write(movieRecord.getBytes());	//문자열 ->바이트열
		}catch (Exception e) {//예외[오류] 처리[잡기] : Exception 클래스
				
		}
		System.out.println("영화 저장 완료");
		
	}

	
	public void movie_remove () {}
	
	public void sale() {}
	
	
	
}
