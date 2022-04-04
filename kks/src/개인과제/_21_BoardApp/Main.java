package 개인과제._21_BoardApp;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DB.load(); 
		DB.reload();
		while(true) {
			try {//사용자가 문자 입력시 형변환이 불가능 해서 예외가 발생함!!!!!!!! > catch
				// 객체없이 메소드호출 static 메소드여서
				System.out.println("-------------------------------------------------");
				System.out.println("\t게\t시\t판");
				System.out.println("-------------------------------------------------");
				// 모듣 게시물을 출력
				System.out.printf("%s\t%s\t%s\t%s\t%s\t\n","번호","제목","작성자","작성일","조회수");
				int i = 0;
				for(Board temp : Control.boardlist) {
					System.out.printf("%d\t%s\t%s\t%s %s\n",i+1,temp.getTitle(),temp.getWriter(),temp.getDate(),temp.getViewcount());
					i++;
				}
				System.out.println("-------------------------------------------------");
				System.out.println();
				System.out.print("1.쓰기 2.보기 선텍: \n");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("게시물 등록))");
					System.out.print("제목 입력 : ");
					scanner.nextLine(); 
					// 공백 포함 입력이 가능 [ 문제! nextLine 앞에 일반 next 하나로 취급 ]
					// 해결방안 : 일반 next 와 nextLine 사이에 의미없는 nextLine 추가
					String title = scanner.nextLine();
					System.out.print("내용 입력 : ");
					String contents = scanner.nextLine();
					System.out.print("작성자 : ");
					String id = scanner.next();
					System.out.print("비밀번호 : ");
					String pw = scanner.next();
					
					
					// 인수 전달.
					Control.writer(title,contents,id,pw);
					
				}
				else if(ch == 2) {
					System.out.println("읽기)) ");
					System.out.print("게시물 번호입력 : \n");
					int num = scanner.nextInt();
					Board temp = Control.boardlist.get(num-1);
					temp.setViewcount(temp.getViewcount()+1);
					while(true) {
						System.out.println("-------------------------------------------------");
						System.out.println("작성자 :"+temp.getWriter());
						System.out.println("내용))");
						System.out.println(temp.getContens());
						System.out.println();
						System.out.println("작성일 :"+temp.getDate());
						System.out.println("-------------------------------------------------");
						System.out.println("댓글))");
						System.out.println("번호\t내용\t작성자\t작성일");
						for(Reply temp2 : Control.replylist) {
							if((num-1) == temp2.getBoard_num()) {
								System.out.println((temp2.getBoard_num()+1)+"\t"+temp2.getReply_contents()+"\t"+temp2.getReply_writer()+"\t"+temp2.getReply_Date());
							}
						}
						System.out.print("1.뒤로가기 2.수정 3.삭제 4.댓글\n");
						DB.save();
						
						int ch2 = scanner.nextInt();
						
						if(ch2 == 1) {
							System.err.println("메세지)) 이전 메뉴로 돌아갑니다.");
							break;
						}
						else if(ch2 == 2) {
							System.err.println("메세지)) 게시물 수정");
							System.out.println("비밀번호 입력 : ");
							String pw = scanner.next();
							System.out.println("수정할 제목 : ");
							String newtitle = scanner.next();
							System.out.println("수정할 내용 : ");
							scanner.nextLine();
							String newcontents = scanner.nextLine();
							boolean result = Control.update((num-1),pw,newtitle,newcontents);
							if(result) {
								System.out.println("메세지)) 수정이 완료 되었습니다.");
								break;
							}
							else { System.out.println("메세지)) 비밀번호가 잘못되었습니다.");}
						}
						else if(ch2 == 3) {
							System.err.println("메세지)) 게시물 삭제");
							System.out.println("비밀번호 입력 : ");
							String pw =scanner.next();
							boolean result = Control.delete((num-1),pw);
							if(result) {
								System.out.println("메세지)) 삭제가 완료 되었습니다.");
								break;
							}
							else { System.out.println("메세지)) 비밀번호가 잘못되었습니다.");}
						}
						else if(ch2 == 4) {
							System.out.println("댓글))");
							System.out.println("1) 댓글 작성 2)댓글 삭제 3)댓글 수정");
							
							String work2 = scanner.next();
							if (work2.equals("1")) {
								System.out.println("메세지)) 댓글작성");
								System.out.println("댓글 내용 입력 : ");
								scanner.nextLine();
								String reply_contents = scanner.nextLine();
								System.out.println("작성자 : ");
								String reply_id = scanner.next();
								System.out.println("비밀번호 : ");
								String reply_pw = scanner.next();
								
								Control.reply_wwrite((num-1),reply_contents,reply_id,reply_pw);
							}
							else if(work2.equals("2")) {
								
							}
							else if(work2.equals("3")) {
								System.out.println("댓글삭제))");
								System.out.println("삭제할 댓글 번호 입력");
								int renum = scanner.nextInt();
								
								Control.reply_remove(renum-1);
							}
							
						}
					}
				}	
				else {
					
				}
			}
			catch(Exception e) {
			scanner = new Scanner(System.in); // 다시 메모리 할당
			}
		}
	}
}
