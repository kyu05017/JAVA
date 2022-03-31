package 개인과제._12_비회원제게시판;

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
						System.out.printf("%d\t%s\t%s \n" , (index)+1 , temp.writer , temp.title);
					}
					index++;
				}
				System.out.println("1)글작성 2)게시판 3)종료");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("글쓰기))");
					System.out.println("제목 :");
					String title = scanner.next();
					System.out.println("내용 :");
					String contents = scanner.next();
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
					System.out.println("게시판))");
					System.out.println("게시물 번호 선택");int bno = scanner.nextInt()-1;
					System.out.printf("작성자: %s  제목: %s\n",boardlist[bno].writer,boardlist[bno].title);
					System.out.printf("내용 : %s\n",boardlist[bno].content);
					System.out.println("1)목록보기 2)글삭제 3)글수정"); 
					int ch2 = scanner.nextInt();
					if(ch2 == 1) {
						System.out.println("목록으로 돌아갑니다.");
					}
					else if(ch2 == 2) {
						System.out.println("글삭제))");
						System.out.println("PW : ");
						String pw = scanner.next();
						if(boardlist[bno].password.equals(pw)) {
							for(int i = 0; i <boardlist.length; i++) {
								if(i == boardlist.length-1) {
									boardlist[boardlist.length-1] = null;
								}
								else {
									boardlist[i] = boardlist[i+1];
								}
							}
						}
						System.out.println("글삭제 완료");
					}
					else if(ch2 == 3) {
						System.out.println("글수정))");
						System.out.println("PW : ");
						String pw = scanner.next();
						if(boardlist[bno].password.equals(pw)) {
							System.out.println("수정할 제목 : ");
							String newtitle = scanner.next();
							System.out.println("수정할 내용 : ");
							String new_contents = scanner.next();
					
							Board board = new Board(newtitle, new_contents, boardlist[bno].writer, boardlist[bno].password);
			
							boardlist[bno] = board;
							System.out.println("수정이 완료 되었습니다.");
							
							
							
							System.out.println("수정이 완료 되었습니다.");
						}
						else {
							System.out.println("비밀번호가 잘묏됐습니다.");
						}
						
					}
					else {
						System.out.println("존재하지 않는 메뉴 입니다.");
					}
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
