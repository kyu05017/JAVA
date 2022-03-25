package Team_0323;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Main main = new Main();
		Controller con = new Controller();
		DB db = new DB();
		db.memberLoad();
		db.movieLoad();
		
		while(true) {
			try {
				////상영영화목록////
				System.out.println("--------------------------------------------------------");
				System.out.println("|    현재 상영중인 영화     | 영화시작시간 |    영화끝나는시간       |");
				System.out.println("--------------------------------------------------------");
				for(Movie movie : Controller.movielist) {
					System.out.printf("|\t%s\t| %s | %s | \n", movie.getTitle(), movie.getIntime(), movie.getRuntime());
				}
				for(Member temp : con.memberlist) {
					System.out.println(temp.getId());
				}
				
				System.out.println("메뉴)) ");
				System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기 5.종료"); 
				System.out.println("선택 : ");
				String ch = scanner.next();
				
				if(ch.equals("1") || ch.equals("회원가입")) {
					
					

					String id = null;
					String pw = null;
					String phone = null;
					int allpass = 0;
					
					while(true) {
						System.out.println("아이디: "); 
						id = scanner.next();
						int pass = 1;
						for(Member temp : Controller.memberlist) {
							if (temp !=null &&  temp.getId().equals(id)) {
								//만약에 공백이 아니면서 배열내 id와 입력받은 id와 동일하면
								System.out.println("메세지)) 현재 사용중인 아이디입니다.");
								pass = 0;
								break; //함수종료 --->아이디중복으로 회원가입 실패
							}
						}
						if(pass == 1) {
							allpass += 1;
							break;
						}
					}
					
					while(true) {
						int pass = 0;
						System.out.println("비밀번호: "); 
						pw = scanner.next();
						if(pw.length() < 8) {
							System.out.println("메세지)) 비밀번호의 길이는 8자리 이상이여야 합니다.");
							pass = 0;
						}
						else {
							pass = 1;
						}
						if(pass == 1) {
							allpass += 1;
							break;
						}
					}

					System.out.println("이름: "); 
					String name = scanner.next();
					
					while(true) {
						int pass = 0;
						System.out.println("전화번호: "); 
						phone = scanner.next();
						
						if(phone.length() >= 12 || phone.length() < 10) {
							System.out.println("메세지)) 잘못된 형식의 번호입니다.");
							pass = 0;
						}
						else {
							pass = 1;
							for(Member temp : Controller.memberlist) {
								if (temp !=null &&  temp.getPhone().equals(phone)) {
									System.out.println("메세지)) 이미 등록된 전화번호입니다.");
									pass = 0;
									break;
								}
							}
						}
						if(pass == 1) {
							allpass += 1;
							break;
						}
					}
					
					///저장
					if(allpass == 3) {
						int result = con.sign(id, pw,name,phone);
						
						if(result == 1) {
							System.out.println("메세지)) 회원가입 성공");
						}
					}
					else {
					System.out.println("메세지)) 회원가입 실패");
					}

				}
				else if(ch.equals("2") || ch.equals("로그인")) {
					System.out.println("아이디: "); 
					String id = scanner.next();
					System.out.println("비밀번호: "); 
					String pw = scanner.next();
					
					String result = con.login(id, pw); // 리턴값 String이니깐 String 변수 result생성
					
					if(result.equals("admin")) {
						System.out.println("메세지))관리자 로그인");
						main.adminmenu();
					}
					else if(result.equals("false")) {
						System.out.println("메세지)) 로그인 실패");
					}
					else { 
						System.out.println("메세지)) "+result + "님 환영 합니다.");
						main.membermenu(result);
					}

				}
				else if(ch.equals("3") || ch.equals("아이디찾기")) {
					System.out.println("이름: "); 
					String name = scanner.next();
					System.out.println("전화번호: "); 
					String phone = scanner.next();
					
					String result = con.findid(name,phone);
					
					if(result.equals("false")) {
						System.out.println("메세지)) 존재하지 않는 회원입니다.");
					}
					else {
						System.out.println("메세지)) 회원님의 아이디는 "+ result + " 입니다.");
					}
				}
				else if(ch.equals("4") || ch.equals("비밀번호찾기")){
					System.out.println("아이디: "); 
					String id = scanner.next();
					System.out.println("전화번호: "); 
					String phone = scanner.next();
					
					String result = con.findid(id,phone);
					
					if(result.equals("false")) {
						System.out.println("메세지)) 존재하지 않는 회원입니다.");
					}
					else {
						System.out.println("메세지)) 회원님의 비밀번호는 "+ result + " 입니다.");
					}
				}
				else if(ch.equals("5") || ch.equals("종료")){
					System.out.println("메세지)) 프로그램을 종료 합니다.");
					break;
				}
				else {System.out.println("메세지)) 존재하지 않는 메뉴 입니다.");
				}
			}
			catch(Exception e) {}
		}
	}
	
	Scanner scanner = new Scanner(System.in);
	
	public void membermenu(String id) {
		
		Controller con = new Controller();
		
		while(true) {
			System.out.println("회원메뉴))");
			System.out.println("1.예매 2.예매취소 3.예매확인 4.회원정보 5.로그아웃"); 
			System.out.println("선택 : ");
			String ch = scanner.next();
			
			if(ch.equals("1")||ch.equals("예매")) {
				
			}
			else if(ch.equals("2")||ch.equals("예매취소")){
				System.out.println("영화제목: "); 
				String title = scanner.nextLine();
				//////해당 영화의 상영시간 출력//
				System.out.println("영화시간: "); 
				String intime = scanner.next();
				//////결제취소
			}
			else if(ch.equals("3")||ch.equals("예매확인")) {
				////////예매목록 자동생성
				////////////////
				System.out.println("1.예매취소 2.뒤로가기"); 
				String confirm = scanner.next();
			}
			else if(ch.equals("4")||ch.equals("회원정보")) {
				con.memberInfo(id);
			}
			else if(ch.equals("5")||ch.equals("로그아웃")) {
				System.out.println("메세지)) 로그아웃 했습니다.");
				break;
			}
			else {
				System.out.println("메세지)) 존재하지 않는 메뉴 입니다.");
			}
		}
	}
	public void adminmenu() {
		
		Controller con = new Controller();
		
		while(true) {
			System.out.println("관리자 메뉴))");
			System.out.println("1.영화등록 2.영화삭제 3.매출확인 4.로그아웃"); 
			System.out.println("선택 : ");
			String ch =scanner.next();
			if(ch.equals("1")||ch.equals("영화등록")) {
				
				System.out.println("영화제목 : ");		
				String title = scanner.next();
				boolean pass1 = false;
				int hour = 0;
				while(true) {
					System.out.println("시작 시간: ");	
					hour = scanner.nextInt();
					if(hour > 23) {
						System.out.println("메세지)) 다시 입력하세요");
						pass1 = false;
					}
					else {
						pass1 = true;
					}
					if(pass1) {
						break;
					}
				}
				DecimalFormat df = new DecimalFormat("00");
				String start_hour = df.format(hour);
				int min = 0;
				boolean pass2 = false;
				while(true) {
					System.out.println("시작 분: ");	
					min = scanner.nextInt();
					if(min > 59) {
						System.out.println("메세지)) 다시 입력하세요");
						pass2 = false;
					}
					else {
						pass2 = true;
					}
					if(pass2) {
						break;
					}
				}
				df = new DecimalFormat("00");
				String start_min = df.format(min);
				
				String intime = start_hour+":"+start_min;
				boolean moviest_admin = true;
				
				while(moviest_admin) {
					if (intime.length() != 5) {
						System.out.println("메세지)) 입력오류");
						System.out.println("시작 시간: ");	
						start_hour = scanner.next();
						System.out.println("시작 분: ");	
						start_min = scanner.next();
						intime = start_hour+":"+start_min;
					}else {
						moviest_admin = false;
					}
				}
				
				System.out.println("러닝타임(분) : ");		
				int time = scanner.nextInt();
				
				int runhour = time/60;
				int runmin = time%60;
				
				df = new DecimalFormat("00");
				String new_runhour = df.format(runhour);
				String new_runmin = df.format(runmin);
				String runtime = new_runhour+":"+new_runmin;
				Boolean movierun_admin = true;
				while(movierun_admin) {
					if (runtime.length() != 5) {
						System.out.println("다시 입력해주세요.");
						System.out.println("러닝타임(분) : ");		
						time = scanner.nextInt();
						
						runhour = time/60;
						runmin = time%60;
						new_runhour = df.format(runhour);
						new_runmin = df.format(runmin);
						
						runtime = new_runhour+":"+new_runmin;
					}else {
						movierun_admin = false;
					}
				}
				con.moive_register(title, intime, runtime);
				
			}
			else if(ch.equals("2")||ch.equals("영화삭제")){
				System.out.println("영화제목: "); 
				String title = scanner.nextLine();
				System.out.println("상영관선택: "); 
				String screen = scanner.next();
				System.out.println("영화시간: "); 
				String intime = scanner.next();
			}
			else if(ch.equals("3")||ch.equals("매출확인")) {
				System.out.println("");
			}
			else if(ch.equals("4")||ch.equals("로그아웃")) {
				System.out.println("메세지)) 로그아웃 했습니다.");
				break;
			}
			else {
				System.out.println("메세지)) 존재하지 않는 메뉴 입니다.");
			}
		}
	}
}