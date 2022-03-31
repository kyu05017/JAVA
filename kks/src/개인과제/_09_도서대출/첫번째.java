package 개인과제._09_도서대출;

import java.util.Scanner;

public class 첫번째 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[][] members = new String[100][3];
		String[][] books = new String[100][3];
		
		while(true) {
			System.out.println("메인메뉴");
			System.out.println("1.회원가입  2.로그인");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("회원가입 페이지))");
				System.out.println("ID  : ");
				String id = scanner.next();
				System.out.println("PW  : ");
				String pw = scanner.next();
				boolean pass = true;
				
				for(int i =0; i <members.length;i++) {
					if(members[i][0]!= null && members[i][0].equals(id)) {
						System.out.println("이미존재하는 아이디 입니다.");
						pass = false;
					}
				}
				for(int i =0;i < members.length; i ++) {
					if(members[i][0] == null) {
						members[i][0] = id;
						members[i][1] = pw;
						System.out.println("알림) 회원가입이 완료 되었습니다.");
						break;
					}
				}
			}
			else if(ch == 2) {
				System.out.println("로그인 페이지))");
				System.out.println("ID :");
				String id = scanner.next();
				System.out.println("PW :");
				String pw = scanner.next();
				int login = 0;
				
				for(int i =0;i < members.length; i++) {
					if(members[i][0] != null && members[i][0].equals("admin") && members[i][1].equals(pw)) {
						System.out.println("알림) 관리자로 로그인 하셨습니다.");
						login = 2;
						break;
					}
					else if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
						System.out.println("알림) " + id + "님 환영합니다.");
						login = 1;
						break;
					}
				}
				int menu = 0;
				int admenu = 0;
				while(true) {
					if(login == 1) {
						System.out.println("일반 회원 메뉴)");
						System.out.println("1.검색 2.목록 3.대여 4.반납 5.로그이웃");
						int ch2 = scanner.nextInt();
						
						if(ch2 == 1) { menu = 1;}
						else if(ch2 == 2) {menu = 2;}
						else if(ch2 == 3) {menu = 3;}
						else if(ch2 == 4) {menu = 4;}
						else if(ch2 == 5) {menu = 5;}
					}
					else if(login == 2) {
						System.out.println("관리자 메뉴))");
						System.out.println("1.등록 2.목록 3.대여 4.로그아웃");
						int ch3 = scanner.nextInt();
						
						if(ch3 == 1) {admenu = 1;}
						else if(ch3==2) { admenu =2;}
						else if(ch3==3) { admenu =3;}
						else if(ch3==4) {admenu =4;}
					}
					
					if(menu == 1) {
						System.out.println("도서검색))");
						System.out.println("제목입력");
						String name = scanner.next();
						System.out.println("제목\t대여여부\t대여자");
						for(int i = 0; i < books.length;i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								System.out.printf(books[i][0],books[i][1],books[i][2]);
								break;
							}
						}
					}
					else if(menu == 2 || admenu == 2) {
						System.out.println("도서 목록)");
						System.out.println("제목\t대여여부\t대여자");
						for(int i = 0; i <books.length;i++) {
							if(books[i][0] != null) {
								System.out.printf(books[i][0],books[i][1],books[i][2]);
							}
						}
					}
					else if(menu ==3) {
						System.out.println("도서 대여))");
						System.out.println("대여할 책이름");
						String name = scanner.next();
						for(int i =0 ; i <books.length;i++) {
							if(books[i][0]!= null && books[i][0].equals(name)) {
								books[i][1] = "대여중";
								books[i][2] = id;
								System.out.println("대여를 완료 했습니다.");
								break;
							}
						}
					}
					else if(menu == 4) {
						System.out.println("도서 반납)");
						System.out.println("반납할 책이름");
						String name = scanner.next();
						for(int i = 0; i < books.length; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								books[i][1] = "";
								books[i][2] = "";
								System.out.println("알림)해당 책을 반납합니다.");
							}
						}
					}
					else if(menu == 5 || admenu == 4) {
						System.out.println("로그아웃합니다.");
						break;
					}
					else if(admenu == 1) {
						System.out.println("도서등록))");
						System.out.println("책이름 입력");
						String name = scanner.next();
						
						for(int i = 0; i < books.length;i++) {
							if(books[1][0] != null && books[i][0].equals(name)) {
								System.out.println("이미 등록된 책입니다.");
								break;
							}
						}
						for(int i = 0; i < books.length; i++) {
							if(books[i][0] == null) {
								books[i][0] = name;
								books[i][1] = "";
								books[i][2] = "";
								break;
							}
						}
					}
					else if(admenu == 2) {
						System.out.println("도서 삭제))");
						System.out.println("도서이름 입력:");
						String name = scanner.next();
						
						for(int i = 0; i < books.length ;i++) {
							if(books[i][0]!= null && books[i][0].contains(name)) {
								System.out.println("해당 책을 삭제합니다");
								books[i][0] = null;
								books[i][1] = null;
								books[i][2] = null;
							
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
