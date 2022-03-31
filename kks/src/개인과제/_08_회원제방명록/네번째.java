package 개인과제._08_회원제방명록;

import java.util.Scanner;

public class 네번째 {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[][] member = new String[100][3];
		String[][] board = new String[100][3];
		
		while(true) {
			System.out.println("회원제 방문록)))");
			System.out.println("1)회원가입 2)로그인");
			System.out.print("입력 : \n");
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
				
				for(int i = 0; i < member.length; i++) {
					if(member[i][0] != null && member[i][0].equals(id)) {
						System.out.println("이미 존재하는 아이디 입니다.");
						pass = false;
					}
				}
				if(pass) {
					for(int i = 0; i < member.length;i++) {
						if(member[i][0] == null) {
							member[i][0] = id;
							member[i][1] = pw;
							member[i][2] = name;
							System.out.println("회원가입이 완료되었씁니다.");
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
				boolean pass = false;
				for(int i = 0; i < member.length; i++) {
					if(member[i][0] != null && member[i][0].equals(id) && member[i][1].equals(pw)) {
						System.out.println("알림)) 로그인 성공");
						pass = true;
						
						while(true) {
							System.out.println("방명록))");
							System.out.println("번호\t작성자\t제목\t내용");
							for(int j = 0; j < board.length;j++) {
								if(board[j][0] != null) {
									System.out.printf("%d\t%s\t%s\t%s\n",j,board[j][2],board[j][0],board[j][1]);
								}
							}
							System.out.println("1)방명록 남기기 2)로그아웃");
							int ch2 = scanner.nextInt();
							
							if(ch2 == 1) {
								System.out.println("글쓰기))");
								System.out.println("제목 : ");
								String title = scanner.next();
								System.out.println("내용 : ");
								String cont = scanner.next();
								
								for(int j =0; j < board.length; j++) {
									if(board[j][0] == null) {
										board[j][0] = title;
										board[j][1] = cont;
										board[j][2] = id;
										System.out.println("알림)) 작성이 완료되었습니다.");
										break;
									}
								}
							}
							else if(ch2 == 2) {
								
							}
							else {
								System.out.println("존재하지 않는 메뉴입니다.");
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
