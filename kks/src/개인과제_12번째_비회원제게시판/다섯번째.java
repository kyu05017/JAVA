package 개인과제_12번째_비회원제게시판;

import java.util.Scanner;

public class 다섯번째 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Board[] boards = new Board[1024];
		
		while(true) {
			try {
				System.out.println("커뮤니티");
				System.out.println("번호\t작성자\t제목");
				int index = 0;
				for(Board temp : boards) {
					if(temp != null) {
						System.out.printf("%d\t%s\t%s\n",(index+1),temp.writer,temp.writer);
					}
					index++;
				}
				System.out.println("메뉴)");
				System.out.println("1)글쓰기 2)글읽기 3)종료");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("글쓰기 메뉴)");
					System.out.println("제목 : ");
					String title = scanner.next();
					System.out.println("내용 : ");
					String contents = scanner.next();
					System.out.println("아이디 : ");
					String id = scanner.next();
					System.out.println("비밀번호 : ");
					String pw = scanner.next();
					
					Board temp = new Board(title, contents, id, pw);
					
					for(int i =0; i < boards.length; i++) {
						if(boards[i] == null) {
							boards[i] = temp;
							break;
						}
					}
				}
				else if(ch == 2) {
					System.out.println("게시판))");
					System.out.println("게시문 번호 입력");
					int num = scanner.nextInt();
					System.out.printf("작서자 : %s || 제목 : %s \n",boards[num-1].writer,boards[num-1].title);
					System.out.println("내용)");
					System.out.printf("%s\n",boards[num-1].content);
					System.out.println("메뉴))");
					System.out.println("1)목록으로 2)글삭제 3)글수정");
					int ch2 = scanner.nextInt();
					
					if(ch2 == 1) {
						System.out.println("돌아갑니다.");
					}
					else if (ch2 == 2) {
						System.out.println("글삭제))");
						System.out.println("비밀번호 : ");
						String pw = scanner.next();
						
						if(boards[num-1].password.equals(pw)) {
							for(int i = num-1; i < boards.length; i++) {
								if(i == boards.length-1) {
									boards[boards.length-1] = null;
								}
								else {
									boards[i] = boards[i+1];
								}
							}
							System.out.println("글삭제 완료");
						}
						else {
							System.out.println("비밀번호가 틀렸습니다.");
						}
					}
					else if(ch2 == 3) {
						System.out.println("글수정 ");
						System.out.println("비밀번호 : ");
						String pw = scanner.next();
						if(boards[num-1].password.equals(pw)) {
							System.out.println("수정할 제목");
							String newtitle = scanner.next();
							System.out.println("수정할 내용");
							String newcont = scanner.next();
							
							Board temp = new Board(newtitle, newcont, boards[num].writer, boards[num].password);
							boards[num] = temp;
							System.out.println("수정이 완료 되었습니다.");
						}
						else {
							System.out.println("비밀번호가 틀렸습니다.");
						}
					}
					
				}
				else if(ch == 3) {
					System.out.println("종료 합니다.");
					break;
				}
				else {
					System.out.println("존재하지 않는 메뉴 입니다.");
				}
				
			}
			
			
			
			catch(Exception e) {
				System.out.println("오류");
				scanner = new Scanner(System.in);
			}
		}
	}
}
