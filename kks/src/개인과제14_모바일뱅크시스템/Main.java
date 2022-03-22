package 개인과제14_모바일뱅크시스템;

import java.util.Scanner;

public class Main {
	
	static Controller con = new Controller();
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.menu();
	}
	
	void menu() {
		
		Scanner scanner = new Scanner(System.in);
		Main main = new Main();
		
		while(true) { // 무한루프 [종료조건 x]
			System.out.println("-------------모바일 뱅크 프로그램-------------------");
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기 5.종료");
			
			String ch = scanner.next();
			
			if(ch.equals("1")) {
				System.out.println("회원가입)");
				System.out.print("ID : \n");
				String id = scanner.next();
				for(Account temp : Controller.accountlist) {
					if(temp != null && temp.getId().equals(id)) {
						System.out.println("알림)) 현재 사용중인 아이디입니다.");
						break;
					}
				}
				System.out.print("PW : \n");
				String pw = scanner.next();
				System.out.print("Name : \n");
				String name = scanner.next();
				System.out.print("Phone : \n");
				String phone = scanner.next();
				
				boolean result = con.registration(id,pw,name,phone);
				
				if(result) {
					System.out.println("회원가입이 완료 되었습니다.");
				}
				else {
					System.out.println("회원가입에 실패했습니다.");
				}

			}
			else if(ch.equals("2")) {
				System.out.println("로그인)");
				System.out.print("ID : \n");
				String id = scanner.next();
				System.out.print("PW : \n");
				String pw = scanner.next();
				
				String result = con.login(id,pw);
				
				if(result.equals("admin")) {
					System.out.println("관리자로 로그인 했습니다");
				}
				else if(result.equals(id)) {
					System.out.println(id+"님 환영합니다.");
					main.membermenu(result);
				}
				else if(result.equals("실패")) {
					System.out.println("로그인에 실패 했습니다.");
				}
				
			}
			else if(ch.equals("3")) {
				System.out.println("아이디 찾기))");
				System.out.print("Name : \n");
				String name = scanner.next();
				System.out.print("Phone : \n");
				String phone = scanner.next();
				
				String result = con.findid(name,phone);
				
				if(result.equals("실패")) {
					System.out.println("아이디 찾기에 실패 했습니다.");
				}
				else {
					System.out.println("회원님의 아이디는 " + result + "입니다.");
				}
				
			}
			else if(ch.equals("4")) {
				System.out.println("비밀번호 찾기)");
				System.out.print("ID : \n");
				String id = scanner.next();
				System.out.print("Phone : \n");
				String phone = scanner.next();
				
				String result = con.findpw(id,phone);
				
				if(result.equals("실패")) {
					System.out.println("비밀번호 찾기에 실패 했습니다.");
				}
				else {
					System.out.println("회원님의 비밀번호는 " + result + "입니다.");
				}
			}
			else if(ch.equals("5")) {
				System.out.println("프로그램 종료.");
				scanner.close();
				return;
			}
			else {
				System.out.println("알림)) 잘못된 입력입니다.");
			}
		}
	}
	
	
	void membermenu(String id) {
		
		Scanner scanner = new Scanner(System.in);
		Main main = new Main();
		
		while(true) {
			System.out.println("------------------회원 메뉴---------------");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 5.이체 6.대출 7.계좌비밀번호찾기 8.로그아웃");
			String ch = scanner.next();
			
			if(ch.equals("1")) {
				System.out.println("계좌가입) ");
				System.out.print("사용할 계좌번호 입력 : \n");
				int banknum = scanner.nextInt();
				
				for(Bank_Book temp : Controller.banklist) {
					if(temp != null && temp.getBanknum() == banknum) {
						System.out.println("알림)) 현재 사용중인 계좌번호입니다.");
						break;
					}
				}
				System.out.print("사용할 비민번호 입력 : \n");
				String pw = scanner.next();
				
				
				boolean result =  con.bankregistration(id,banknum,pw);
				
				if(result) {
					System.out.println("계좌생성이 완료 되었습니다.");
				}
				else {
					System.out.println("계좌 생성 실패");
				}
			}
			else if(ch.equals("2")) {
				System.out.print("계좌번호  입력 	: \n");
				int banknum = scanner.nextInt();
				System.out.print("계좌 비밀번호 입력 : \n");
				String pw = scanner.next();
				System.out.print("입금할 금액입력 	: \n");
				int money = scanner.nextInt();
				
				boolean result = con.inmoney(id,banknum,pw,money);
				
				if(result) {
					System.out.println("알림)) "+money + "원이 계좌로 입금 되었습니다");
				}
				else {
					System.out.println("입금 실패");
				}
				
			}
			else if(ch.equals("3")) {
				System.out.print("계좌번호  입력 	: \n");
				int banknum = scanner.nextInt();
				System.out.print("계좌 비밀번호 입력 : \n");
				String pw = scanner.next();
				System.out.print("출금할 금액입력	: \n");
				int money = scanner.nextInt();
				
				boolean result = con.outmoney(id,banknum,pw,money);
				
				if(result) {
					System.out.println("알림)) "+money + "원이 계좌에서 출금 되었습니다");
				}
				else {
					System.out.println("출금 실패");
				}
			}
			else if(ch.equals("4")) {
				System.out.println("계좌 목록))");
				System.out.print("계좌번호\t현재잔액\t대출받은금액\n");
				
				con.bankbooklsit(id);
			}
			else if(ch.equals("5")) {
				System.out.println("이체))");
				System.out.print("계좌 번호 입력 	: "); 
				int bname = scanner.nextInt();
				System.out.print("계좌 비밀번호 입력 	: "); 
				String pw = scanner.next();
				
				con.sendmoney(id,bname,pw);
			}
			else if(ch.equals("6")) {
				
				main.loanmenu();
			}
			else if(ch.equals("7")) {
				System.out.println("비밀번호 찾기))");
				System.out.print("계좌번호 	: \n"); 
				int bnum = scanner.nextInt();
				System.out.print("연락처 		: \n"); 
				String phone = scanner.next();
				
				con.findbankpw(id,bnum,phone);
			}
			else if(ch.equals("8")) {
				System.out.println("로그아웃 했습니다.");
				scanner.close();
				return;
			}
			else {
				System.out.println("알림)) 잘못된 입력입니다.");
			}
		}
	}
	
	void adminmenu() {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("------------------관리자 메뉴---------------");
			System.out.println("1.대출상품등록 2.대출상품삭제 3.로그아웃");
			String ch = scanner.next();
			
			if(ch.equals("1")) {
				
			}
			else if(ch.equals("2")) {
				
			}
			else if(ch.equals("3")) {
				
			}
			else {
				System.out.println("알림)) 잘못된 입력입니다.");
			}
		} // while end
	}
	
	void loanmenu() {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("------------------회원 메뉴---------------");
			System.out.println("1.대출상품목록 2.대출확인 3.뒤로가기");
			String ch = scanner.next();
			
			if(ch.equals("1")) {
				
			}
			else if(ch.equals("2")) {
				
			}
			else if(ch.equals("3")) {
				
			}
			else {
				System.out.println("알림)) 잘못된 입력입니다.");
			}
		}
	}
}
