package 개인과제13_회원제도서프로그램;

import java.util.Scanner;

public class Main_1 {
	
	static Scanner sc = new Scanner(System.in);
	static Member_tesk_1[] memberlist = new Member_tesk_1[1000];
	static Book_rental_tesk_1[] booklist = new Book_rental_tesk_1[1000]; 
	static Main_1 main = new Main_1();
	
	public static void main(String[] args) {

		main.Menu();
	}
	
	void Menu() {
		Member_tesk_1 member = new Member_tesk_1();
		while(true) {
			System.out.println("회원제 도서대여 프로그램))");
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기 5.종료");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.println("회원가입))");
				System.out.print(" 아이디 : ");	
				String id = sc.next();
				System.out.print(" 비밀번호 : ");	
				String password = sc.next();
				System.out.print(" 이름 : ");	
				String name = sc.next();
				System.out.print(" 연락처 : ");	
				String phone = sc.next();
				
				int result = member.registration(id,password,name,phone);
				
				if(result == 5) {
					System.out.println("현재 사용중인 아이디 입니다.");
				}
				else if(result == 1) {
					System.out.println("회원가입이 완료 되었습니다.");
				}
				else if(result == 0){
					System.out.println("회원가입에 실패 하였습니다.");
				}
			}
			else if(ch == 2) {
				System.out.println("로그인))");
				System.out.println("아이디를 입력하세요");
				String id = sc.next();
				System.out.println("비밀번호를입력하세요");
				String password = sc.next();
			
				String result = member.signIn(id,password);
				
				if(result.equals("admin")) {
					main.Adminmenu();
				}
				else if(result.equals(id)) {
					main.MemberMenu(result);
				}
				else if(result.equals("null")) {
					System.out.println("로그인에 실패하였습니다.");
				}
			}
			else if(ch == 3) {
				System.out.println("아이디 찾기))");
				System.out.println("이름을 입력하세요.");
				String name = sc.next();
				System.out.println("전화번호를 입력하세요.");
				String phone = sc.next();
				
				String result = member.findId(name, phone);
				
				if(result == null) {
					System.out.println("아이디를 찾지 못했습니다.");
				}
				else {
					System.out.println("회원님의 아이디는 "+ result + "입니다.");
				}
			}
			else if(ch == 4) {
				System.out.println("비민번호 찾기");
				System.out.println("아이디를 입력하세요.");
				String id = sc.next();
				System.out.println("전화번호를 입력하세요.");
				String phone = sc.next();
				
				String result = member.findPassword(id, phone);
				
				if(result == null) {
					System.out.println("비밀번호를 찾지 못했습니다.");
				}
				else {
					System.out.println("회원님의 비밀번호는 "+ result + "입니다.");
				}
			}
			else if(ch == 5) {
				System.out.println("프로그램을 종료했습니다.");
				sc.close();
				return;
			}
		}
	}
	
	
	void MemberMenu(String id) {
		
		while(true) {
			
			System.out.println("도서대여 시스템))");
			System.out.println(id+ "님 환영 합니다.");
			System.out.println("1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃");
			int ch= sc.nextInt();
			Book_rental_tesk_1 book = new Book_rental_tesk_1();
			
			if(ch == 1) {
				System.out.println("도서검색))");
				System.out.println("도서코드 ( ISBN ) 입력 : ");
				String search_ISBN = sc.next();
				
				book.Book_Search(search_ISBN);
			}
			else if(ch == 2) {
				System.out.println("도서목록))");
				System.out.print("ISBM\t도서명\t작가\t대여가능여부\n");
				book.Book_Lsit();
			}
			else if (ch == 3) {
				System.out.println("도서대여))");
				System.out.print("ISBM :");
				String ISBM = sc.next();
				
				int result = book.Book_Rent(id,ISBM);
				
				if(result == 5) {
					System.out.println("대여중인 도서가 아닙니다.");	
				}
				else if(result == 0) {
					System.out.println("대여 하지 못했습니다.");
				}
				else if(result == 1) {
					System.out.println("도서 대여가 완료 되었습니다.");
				}
			}
			else if(ch ==4) {
				System.out.println("도서반납))");
				System.out.print("ISBM :");
				String ISBM = sc.next();
				
				int result = book.Book_Return(id,ISBM);
				
				if(result == 5) {
					System.out.println("대여중인 도서가 아닙니다.");	
				}
				else if(result == 0) {
					System.out.println("반납하시 못했습니다.");
				}
				else if(result == 1) {
					System.out.println("도서 반납이 완료 되었습니다.");	
				}
			}
			else if(ch==5) {
				System.out.println("로그아웃 했습니다.");
				return;
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		
	}
	
	
	
	void Adminmenu() {
		while(true) {
			System.out.println("관리자 메뉴))");
			System.out.println("1.도서추가 2.도서목록 3.도서삭제 4.로그아웃");
			int ch= sc.nextInt();
			Book_rental_tesk_1 book = new Book_rental_tesk_1();
			
			if(ch == 1) {
				System.out.println("도서등록))");
				System.out.println("ISBM 입력 : ");
				String isbm = sc.next();
				System.out.println("책이름 :");
				String name = sc.next();
				System.out.println("작가의 이름 :");
				String writwer = sc.next();
				
				int result =  book.Book_add(isbm, name, writwer);
				
				if(result == 5) {
					System.out.println("중복된 ISBN 값입니다.");
				}
				else if(result == 0) {
					System.out.println("도서 등록에 실패하였습니다.");
				}
				else if(result == 1) {
					System.out.println("도서등록이 완료 되었습니다.");
				}
			}
			else if(ch == 2) {
				System.out.println("도서목록))");
				System.out.print("ISBM\t도서명\t작가\t대여가능여부\n");
				book.Book_Lsit();
			}
			else if(ch == 3) {
				System.out.println("도서삭제))");
				System.out.println("ISBM 입력 :");
				String isbm = sc.next();
				
				boolean result = book.Book_remove(isbm);
				
				if(result) {
					System.out.println("삭제를 완료 했습니다.");
				}
				else {
					System.out.println("해당 도서의 삭제에 실패했습니다.");
				}
			}
			else if(ch == 4) {
				System.out.println("로그아웃 했습니다.");
				return;
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
