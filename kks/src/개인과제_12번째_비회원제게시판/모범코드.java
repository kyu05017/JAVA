package 개인과제_12번째_비회원제게시판;

import java.util.Scanner;

public class 모범코드 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[1024];
		
		//
		
		while(true) {
			try {
				System.out.println("커뮤니티)");
				System.out.println("번호\t작성자\t제목");
				
				
				int index = 0;
				for(Board temp : boardlist) {
					if(temp != null) {
						System.out.println("출력할꺼임");
					}
				}
				System.out.println("1)글작성 2)글보기 3)종료");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("글쓰기))");
					System.out.println("제목 :");
					scanner.next();
					String title = scanner.nextLine();
					System.out.println("내용 :");
					String contents = scanner.nextLine();
					System.out.println("ID  :");
					String id = scanner.next();
					System.out.println("PW  : ");
					String pw = scanner.next();
					
					Board board = new Board(title, contents, id, pw);
					
					int i = 0;
					for(Board temp : boardlist) {
						if(temp == null) {
							boardlist[i] = board;
							break;
						}
						i++;
					}
				}
				else if(ch == 2) {
					// 아 귀찮아
				}
				else if(ch == 3) {
					System.out.println("프로그램을 종료 합니다.");
					break;
				}
				else {
					System.out.println("존재하지 않는 메뉴 입니다.");
				}
			}
			catch(Exception e) {
				scanner = new Scanner(System.in);
				System.out.println(e);
			}
			
			
			
		}
		
		
	}
}
