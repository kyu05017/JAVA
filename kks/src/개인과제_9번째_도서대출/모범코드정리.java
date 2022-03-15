package 개인과제_9번째_도서대출;

import java.util.Scanner;

public class 모범코드정리 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[][] members = new String[100][3];
		String[][] book = new String[100][3];
		
		while(true) {
			System.out.println("메인메뉴))");
			System.out.println("1)회원가입 2)로그인 3)종료");
			int ch = scanner.nextInt();
			if(ch == 1) {
				System.out.println("회원가입))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW : ");
				String pw = scanner.next();
				boolean pass = true;
				
				for(int i = 0; i < members.length; i++) {
					if(members[i][0] != null && members[i][0].equals(id)) {
						System.out.println("알림)) 이미 사용중인 아이디 입니다.");
						pass = false;
						break;
					}
				}
				if(pass) {
					for(int i = 0; i < members.length;i++) {
						if(members[i][0] == null) {
							members[i][0] = id;
							members[i][1] = pw;
							System.out.println("알림)) 회원가입이 완료 되었습니다.");
							break;
						}
					}
				}
				
			}
			else if(ch == 2) {
				System.out.println("로그인))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW : ");
				String pw = scanner.next();
				int login = 0;
				int menu = 0;
				int adminmenu = 0;
				
				for(int i = 0; i <members.length;i++) {
					if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
						login = 1;
						System.out.println("알림)) "+id+"님 환영합니다.");
						break;
					}
					else if(members[i] != null && id.equals("admin") && members[i][2].equals(pw)) {
						login = 2;
						System.out.println("알림)) 관리자로 로그인 하셨습니다.");
						break;
					}
					else {
						System.out.println("알림)) 로그인에 실패했습니다.");
						break;
					}
				}
				while(true) {
					if(login == 1) {
						System.out.println("메뉴))");
						System.out.println("1)검색 2)목록 3)대여 4)반납 5)로그아웃");
						int ch2 = scanner.nextInt();
						if(ch2 == 1) menu = 1;
						else if(ch2 == 2) menu = 2;
						else if(ch2 == 3) menu = 3;
						else if(ch2 == 4) menu = 4;
						else if(ch2 == 5) menu = 5;
					}
					else if(login == 2) {
						System.out.println("관리자메뉴))");
						System.out.println("1)등록 2)목록 3)삭제 4)로그아웃");
						int ch2 = scanner.nextInt();
						if(ch2 == 1) adminmenu = 1;
						else if(ch2 == 2) adminmenu = 2;
						else if(ch2 == 3) adminmenu = 3;
						else if(ch2 == 4) adminmenu = 4;
					}
					if(menu == 1) {
						System.out.println("테스트 검색");
						break;
					}
					else if(menu == 2 || adminmenu == 2) {
						System.out.println("테스트 목록");
						break;
					}
					else if(menu == 3) {
						System.out.println("테스트 대여");
						break;
					}
					else if(adminmenu == 1) {
						System.out.println("테스트 등록");
						break;
					}
					else if(adminmenu == 3) {
						System.out.println("테스트 삭제");
						break;
					}
					else if(menu == 4) {
						System.out.println("테스트 반납");
						break;
					}
					else if(menu == 5 || adminmenu == 4) {
						System.out.println("로그아웃 했습니다.");
						break;
					}
				}

				//회원 메뉴
				
				//운영자 메뉴
				
			}
			else if(ch == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("알림)) 존재하지 않는 메뉴 입니다.");
			}
		}
	}
}
