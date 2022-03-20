package 개인과제12_비회원제게시판;

import java.util.Scanner;

public class 첫번째 {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[1024];
		
		while(true) {
			try {
				System.out.println("커뮤니티)");
				System.out.println("번호\t작성자\t제목");
				
				int index = 0;
				for(Board temp : boardlist) {
					if(temp != null ) {
						System.out.printf("%d\t%s\t%s\n",(index+1),temp.writer,temp.title);
					}
					index++;
				}
				System.out.println("메뉴)");
				System.out.println("1)글쓰기 2)글보기 3)종료");
				String work = scanner.next();
				
				if(work.equals("1") || work.equals("글쓰기")) {
					System.out.println("제목 : ");
					String title = scanner.next();
					System.out.println("내용 : ");
					String contents = scanner.next();
					System.out.println("ID : ");
					String id = scanner.next();
					System.out.println("PW : ");
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
				else if(work.equals("2") || work.equals("글보기")) {
					System.out.println("게시판))");
					System.out.println("게시문 번호 선택");
					int num = scanner.nextInt();
					System.out.printf("작성자 : %s || 제목 : %s\n",boardlist[num-1].writer,boardlist[num-1].title);
					System.out.printf("내용 : %s\n",boardlist[num-1].content);
					System.out.println("메뉴)");
					System.out.println("1)목록가기 2)글삭제 3)글수정");
					String work2 = scanner.next();
					if(work2.equals("1") || work2.equals("목록가기")) {
						System.out.println("목록으로 돌아갑니다.");
					}
					else if(work2.equals("2") || work2.equals("글삭제")) {
						System.out.println("글삭제))");
						System.out.println("PW : ");
						String pw = scanner.next();
						boolean pass = false;
						
						if(boardlist[num-1].password.equals(pw)) {
							pass = true;
						}
						else {
						
						}
						if(pass) {
							for(int i = num-1;i <boardlist.length;i++) {
								if( i == boardlist.length-1) {
									boardlist[ boardlist.length-1 ] = null;
								}
								else {
									boardlist[i] = boardlist[i+1];
								}
							}
						}
					}
					else if(work2.equals("3") || work2.equals("글수정")) {
						System.out.println("글수정))");
						System.out.println("PW : ");
						String pw = scanner.next();
						if(boardlist[num].password.equals(pw)) {
							System.out.println("수정할 제목 : ");
							String newtitle = scanner.next();
							System.out.println("수정할 내용 : ");
							String new_contents = scanner.next();
					
							Board board = new Board(newtitle, new_contents, boardlist[num].writer, boardlist[num].password);
			
							boardlist[num] = board;
							System.out.println("수정이 완료 되었습니다.");
							
							
							
							System.out.println("수정이 완료 되었습니다.");
						}
						else {
							System.out.println("비밀번호가 잘못됐습니다.");
						}
						
					}
					else {
						System.out.println("존재하지 않는 메뉴 입니다.");
					}
				}
				else if(work.equals("3") || work.equals("종료")) {
					System.out.println("종료 합니다.");
					break;
				}
				else {
					System.out.println("존재하지 않는 메뉴 입니다.");
				}
			}
			catch(Exception e) {
				System.out.println("오류");
			}
		}
	}
}
