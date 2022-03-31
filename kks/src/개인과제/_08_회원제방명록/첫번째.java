package 개인과제._08_회원제방명록;

import java.util.Scanner;

public class 첫번째 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[][] memberlist = new String[100][3];
		String[][] boardlist = new String[100][3];
		
		while(true) {
			System.out.println("회원제 방명록))");
			System.out.println("1.회원가입 2.로그인");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("회원가입 페이지))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW : ");
				String pw = scanner.next();
				System.out.println("Name : ");
				String name = scanner.next();
				
				boolean pass = true;
				
				for(int i = 0; i < memberlist.length;i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						System.out.println("이미 존재하는 아이디 입니다.");
						pass = false;
						break;
					}
				}
				if(pass) {
					for(int i =0;i < memberlist.length;i++) {
						if(memberlist[i][0]==null) {
							memberlist[i][0] = id;
							memberlist[i][1] = pw;
							memberlist[i][2] = name;
							System.out.println("회원가입이 완료되었습니다/");
							break;
						}
					}
				}
			}
			else if(ch == 2) {
				System.out.println("로그인 페이지))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW : ");
				String pw = scanner.next();
				
				boolean pass2 = false;
				
				for(int i = 0; i < memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) {
						System.out.println("로그인이 완료되었습니다.");
						pass2 = true;
						
						while(true) {
							System.out.println("방명록))");
							System.out.println("번호\t작성자\t제목\t내용");
							for(int j = 0; j < boardlist.length;j++) {
								if(boardlist[j][0] != null) {
									System.out.printf("%d\t%s\t%s\t%s\t\n",j,boardlist[j][2],boardlist[j][1],boardlist[j][0]);
								}
							}
							System.out.println("1방명록남기기 2로그아웃");
							int ch2 = scanner.nextInt();
							if(ch2 == 1) {
								System.out.println("글쓰기))");
								System.out.println("제목 : ");
								String title = scanner.next();
								System.out.println("내용 : ");
								String cont = scanner.next();
								for(int j = 0; j <boardlist.length; j++) {
									if(boardlist[j][0] == null) {
										boardlist[j][0] = title;
										boardlist[j][1] = cont;
										boardlist[j][2] = id;
										System.out.println("알림)) 작성이 완료되었습니다.");
										break;
									}
								}
							}
							else if(ch2 == 2) {
								System.out.println("알림)) 로그아웃이 되어씁니다.");
								break;
							}
							else {
								System.out.println("없는 메뉴 입니다.");
							}
						}
					}
				}
			}
			else {
				System.out.println("존재하지 않는 메뉴 입니다.");
			}
		}
	}
}
