package 개인과제._12_비회원제게시판;

import java.util.Scanner;

public class 다섯번째 {
	public static void main(String[] args) {
		
		//입력객체
		Scanner scanner = new Scanner(System.in);
		//클래스를 배열화 시킴
		Board[] boards = new Board[1024];
		//무한 반복 - 종료조건 3번
		while(true) {
			//예외를 처리하기 위해 트라이
			try {
				System.out.println("커뮤니티");
				System.out.println("번호\t작성자\t제목");
				
				// 배열을 돌려 존재한다면 목록을 보여준다
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
					
					//입력받은 정보들을 객체화 시켜 하나로 묶어 편하게 다룬다
					Board temp = new Board(title, contents, id, pw);
					
					//배열을 돌려 빈공간을 찾아서 저장한다.
					for(int i =0; i < boards.length; i++) {
						if(boards[i] == null) {
							boards[i] = temp;
							break;
						}
					}
				}
				else if(ch == 2) {
					//인덱스 번호를 입력받아 그 인덱스에 있는 정보를 보여준다.
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
						//비밀번호가 해당 인덱스에 저장된 비밀번호와 동일하다면 
						if(boards[num-1].password.equals(pw)) {
							for(int i = num-1; i < boards.length; i++) {
								// 인덱스가 배열 길이의 끝이라면 삭제하고
								if(i == boards.length-1) {
									boards[boards.length-1] = null;
								}
								//아니라면 해당 인덱스에 다음 인덱스 배열을 대입한다.
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
						// 인데스에 저장된 비밀번호가 입력한 비밀번호와 동일하다면
						if(boards[num-1].password.equals(pw)) {
							System.out.println("수정할 제목");
							String newtitle = scanner.next();
							System.out.println("수정할 내용");
							String newcont = scanner.next();
							
							//수정할 내용을 입력받아 다시 객체화 시킨후 해당 인데스에 다시 저장한다.
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
			
			
			//예외처리 
			catch(Exception e) {
				System.out.println("오류");
				scanner = new Scanner(System.in);
			}
		}
	}
}
