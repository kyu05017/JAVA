package 개인과제_9번째_도서대출;

import java.util.Scanner;

public class 네번째 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[][] member = new String[100][3];
		String[][] books = new String[100][3];
		
		while(true) {
			System.out.println("메인)");
			System.out.println("1회워가입 2로그인");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("회원가입)");
				System.out.println("ID :");
				String id = scanner.next();
				System.out.println("PW :");
				String pw = scanner.next();
				boolean pass = true;
				
				for(int i = 0; i < member.length; i ++) {
					if(member[i][0] != null && member[i][0].equals(id)) {
						System.out.println("이미 존재하는 회원입니다.");
						pass = false;
						break;
					}
				}
				if(pass) {
					for(int i = 0; i < member.length;i++) {
						if(member[i][0] == null) {
							member[i][0] = id;
							member[i][1] = pw;
							System.out.println("회원가입이 완료 되었습니다.");
							break;
							
						}
					}
				}
			}
			else if(ch == 2) {
				System.out.println("로그인)");
				System.out.println("ID :");
				String id = scanner.next();
				System.out.println("PW :");
				String pw = scanner.next();
				int login = 0;
				
				for(int i = 0; i < member.length; i++) {
					if(member[i][0]!= null && member[i][0].equals("admin") && member[i][1].equals(pw)) {
						System.out.println("관리자로 로그인 하셨습니다.");
						login =2;
						break;
					}
					else if(member[i][0]!= null && member[i][0].equals(id) && member[i][1].equals(pw)) {
						System.out.println(id+"님 환영합니다.");
						login =1;
						break;
					}
				}
				int menu = 0;
				int admenu = 0;
				while(true) {
					if(login == 2) {
						System.out.println("관리자 메뉴");
						System.out.println("1.등록 2.목록 3.삭제 4.로그아웃");
						int ch2 = scanner.nextInt();
						
						if(ch2 == 1)admenu = 1;
						else if(ch2 == 2) admenu = 2;
						else if(ch2 == 3) admenu = 3;
						else if(ch2 == 4) admenu = 4;
					}
					else if(login == 1) {
						System.out.println("도서메뉴)");
						System.out.println("1.검색 2.목록 3.대여 4.반납 5.로그아웃");
						int ch2 = scanner.nextInt();
						if(ch2 == 1)menu = 1;
						else if(ch2 == 2) menu = 2;
						else if(ch2 == 3) menu = 3;
						else if(ch2 == 4) menu = 4;
						else if(ch2 == 5) menu = 5;
					}
					
					if(menu == 1) {
						System.out.println("검색할 책이름 입력:");
						String name = scanner.next();
						
						for(int i = 0 ; i < books.length; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								if(books[i][2].equals("")) {
									System.out.printf("%s 현재 책은 대여 가능합니다.",name);
									break;
								}
								else {
									System.out.println("제목\t대여여부\t대여자");
									System.out.printf("%s\t%s\t%s\n",books[i][0],books[i][1],books[i][2]);
									break;
								}
							}
						}
					}
					else if(menu == 2 || admenu == 2) {
						System.out.println("도서 목록");
						System.out.println("제목\t대여여부\t대여자");
						for(int i = 0 ; i < books.length; i++) {
							if(books[i][0] != null) {
								System.out.printf("%s\t%s\t%s\n",books[i][0],books[i][1],books[i][2]);
								break;
							}
						}
					}
					else if(menu == 3) {
						System.out.println("대여한 책이름 입력 :");
						String name = scanner.next();
						for(int i = 0 ; i < books.length; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								System.out.println("해당 책을 대여 했습니다.");
								books[i][1] = "대여중";
								books[i][2] = id;
								break;
							}
						}
					}
					else if(menu == 4) {
						System.out.println("반납할 책이름 입력 :");
						String name = scanner.next();
						for(int i = 0 ; i < books.length; i++) {
							if(books[i][0] != null && books[i][2].equals(id)) {
								System.out.println("반납할책이 없습니다.");
								break;
							}
							else if(books[i][0] != null && books[i][0].equals(name)) {
								System.out.println("해당 책을 대여 했습니다.");
								books[i][1] = "";
								books[i][2] = "";
								break;
							}
						}
					}
					else if(menu == 5 || admenu == 4) {
						System.out.println("로그아웃 했습니다.");
						break;
					}
					else if(admenu == 1) {
						System.out.println("등록할 책이름 입력");
						String name = scanner.next();
						for(int i = 0 ; i < books.length; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								System.out.println("이미 존재하는 책입니다.");
							}
						}
						for(int i = 0 ; i < books.length; i++) {
							if(books[i][0] == null ) {
								books[i][0] = name;
								books[i][1] = "";
								books[i][2] = "";
								break;
							}
						}
					}
					else if(admenu == 3) {
						System.out.println("삭제할 책이름 입력");
						String name = scanner.next();
						for(int i = 0 ; i < books.length; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								books[i][0] = null;
								books[i][1] = null;
								books[i][2] = null;
								break;
							}
						}
						
					}
				}
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		
				
	}
}
