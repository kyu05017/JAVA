package 개인과제_8번째_회원제방명록;

import java.util.Scanner;

public class 다섯번째 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[][] members = new String[100][3];
		String[][] boards = new String[100][3];
		
		while(true) {
			System.out.println("회원제 방문록))");
			System.out.println("1)회원가입 2)로그인");
			int ch = scanner.nextInt();
			if(ch == 1) {
				System.out.println("회원가입 페이지))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW :");
				String pw = scanner.next();
				System.out.println("Name : ");
				String name = scanner.next();
				boolean pass = true;
				
				for(int i = 0; i < members.length; i++) {
					if(members[i] != null && members[i][0].equals(id)) {
						System.out.println("이미 존재하는 회원 ");
						pass = false;
					}
				}
				if(pass) {
					for(int i =0; i < members.length;i++) {
						if(members[i] == null) {
							members[i][0]= id;
							members[i][1]=pw;
							members[i][2]=name;
							System.out.println("회원가입이 완료 되었습니다.");
							break;
						}
					}
				}
			}
			else if(ch == 2) {
				System.out.println("로그인 페이지))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW :");
				String pw = scanner.next();
				boolean pass2 = false;
				
				for(int i =0 ; i < members.length; i++) {
					if(members[i] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
						System.out.println("로그인이 완료되었씁니다.");
						pass2 = true;
						
						if(pass2) {
							while(true) {
								System.out.println("방명록");
								System.out.println("번호\t작성자\t제목\t내용");
								for(int j =0 ; j < boards.length;j++) {
									if(boards[j] != null) {
										System.out.printf("%d\t%s\t%s\t%s",j,members[j][2],members[j][0],members[j][1]);
									}
								}
								System.out.println("1)방명록작성 2)로그아웃");
								int ch2 = scanner.nextInt();
								if(ch2 == 1) {
									System.out.println("방문록 작성))");
									System.out.println("제목 :");
									String title = scanner.next();
									System.out.println("내용 : ");
									String cont = scanner.next();
									
									for(int j = 0; j < boards.length; j++) {
										if(boards[j] == null) {
											boards[j][0] = title;
											boards[j][1] = cont;
											boards[j][2] =id;
											
											System.out.println("방명록 작성이 완료되었습니다.");
											break;
										}
									}
								}
								else if (ch2 == 2) {
									System.out.println("로그아웃합니다. 메인메뉴로 돌아갑니다.");
									break;
								}
								else {
									System.out.println("존재하지 않는 메뉴 입니다.");
								}
							}
						}
					}
				}
				
			}
			else {
				System.out.println("잘못된 메뉴 선택입니다.");
			}
		}
	}
}