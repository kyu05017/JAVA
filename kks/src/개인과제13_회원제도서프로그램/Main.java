package 개인과제13_회원제도서프로그램;

import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	static Account[] accountlist = new Account[1000];
	static Book[] booklist = new Book[1000];
	static Main main = new Main();
	
	public static void main(String[] args) {
		
		main.menu();
	}
	
	void menu() {
		Account account = new Account();
		while(true) {
			System.out.println("회원제 도서 프로그램))");
			System.out.println("매뉴)) 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기 5.종료");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("회원가입))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW : ");
				String pw = scanner.next();
				System.out.println("Name : ");
				String name = scanner.next();
				System.out.println("Phone : ");
				String phone = scanner.next();
				
				int result = account.registration(id,pw,name,phone);
				
				if(result == 50) {
					System.out.println("중복된 아이디 입니다.");
				}
				else if(result == 0) {
					System.out.println("회원가입에 실패 했습니다.");
					
				}
				else if(result == 1) {
					System.out.println("회원가입이 완료 되었습니다.");
				}
			}
			else if(ch == 2) {
				System.out.println("로그인))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW : ");
				String pw = scanner.next();
				
				String result = account.login(id,pw);
				
				if(result.equals("admin")) {
					System.out.println("관리자로 로그인 합니다.");
					main.adminmenu();
				}
				else if(result.equals(id)) {
					System.out.println(id+ "님 환영 합니다.");
					main.membermenu(id);
				}
				else if(result == null){
					System.out.println("로그인에 실패 하였습니다.");
					
				}
				
			}
			else if(ch == 3) {
				System.out.println("아이디찾기))");
				System.out.println("Name : ");
				String name = scanner.next();
				System.out.println("Phone : ");
				String phone = scanner.next();
				
				String result = account.findId(name,phone);
				
				if(result.equals("false")) {
					System.out.println("아이디를 조회할수 없습니다.");
				}
				else {
					System.out.println("회원님의 아이디는 " + result + "입니다.");
				}
			}
			else if(ch == 4) {
				System.out.println("비밀번호찾기))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("Phone : ");
				String phone = scanner.next();
				
				String result = account.findPw(id,phone); 
				
				if(result.equals("false")) {
					System.out.println("비밀번호를 조회할수 없습니다.");
				}
				else {
					System.out.println("회원님의 비밀번호를 " + result + "입니다.");
				}
			}
			else if(ch == 5) {
				System.out.println("프로그램을 종료합니다.");
				scanner.close();
				break;
			}
			else {
				System.out.println("존재 하지 않는 메뉴 입니다.");
			}
		}
	}
	
	void membermenu(String id) {
		
		Book book = new Book();
		
		while(true) {
			System.out.println("도서 대여 시스템");
			System.out.println("메뉴)) 1.도서검색 2. 도서목록 3.도서대여 4.도서반납 5.로그아웃");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("도서검색))");
				System.out.println("ISBN : ");
				String ISBN = scanner.next();
				
				book.book_search(ISBN);
			}
			else if(ch == 2) {
				book.book_list();
			}
			else if(ch == 3) {
				System.out.println("도서대여))");
				System.out.println("ISBN : ");
				String ISBN = scanner.next();
				
				book.book_rent(ISBN,id);
				
			}
			else if(ch == 4) {
				System.out.println("도서반납))");
				System.out.println("ISBN : ");
				String ISBN = scanner.next();
				
				book.book_return(ISBN,id);
			}
			else if(ch == 5) {
				System.out.println("로그아웃 합니다.");
				return;
			}
			else {
				System.out.println("잘못된 메뉴 입니다.");
			}
		}
	}
	
	void adminmenu() {
		Book book = new Book();
		
		while(true) {
			System.out.println("관리자 메뉴");
			System.out.println("메뉴)) 1.도서등록 2.도서목록 3.도서삭제 4.로그아웃");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("도서등록))");
				System.out.println("ISBN : ");
				String ISBN = scanner.next();
				System.out.println("책이름 : ");
				String book_name = scanner.next();
				System.out.println("작가  :  ");
				String writer = scanner.next();
				
				book.book_add(ISBN,book_name,writer);
			}
			else if(ch == 2) {
				book.book_list();
			}
			else if(ch == 3) {
				System.out.println("도서삭제))");
				System.out.println("ISBN : ");
				String ISBN = scanner.next();
				
				book.book_remove(ISBN);
			}
			else if(ch == 4) {
				System.out.println("로그아웃 했습니다.");
				return;
			}
			else {
				System.out.println("존재하지 않는 메뉴 입니다.");
			}
			
		}
		
	}
}
