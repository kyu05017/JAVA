package ���ΰ���12_��ȸ�����Խ���;

import java.util.Scanner;

public class ù��° {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[1024];
		
		while(true) {
			try {
				System.out.println("Ŀ�´�Ƽ)");
				System.out.println("��ȣ\t�ۼ���\t����");
				
				int index = 0;
				for(Board temp : boardlist) {
					if(temp != null ) {
						System.out.printf("%d\t%s\t%s\n",(index+1),temp.writer,temp.title);
					}
					index++;
				}
				System.out.println("�޴�)");
				System.out.println("1)�۾��� 2)�ۺ��� 3)����");
				String work = scanner.next();
				
				if(work.equals("1") || work.equals("�۾���")) {
					System.out.println("���� : ");
					String title = scanner.next();
					System.out.println("���� : ");
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
				else if(work.equals("2") || work.equals("�ۺ���")) {
					System.out.println("�Խ���))");
					System.out.println("�Խù� ��ȣ ����");
					int num = scanner.nextInt();
					System.out.printf("�ۼ��� : %s || ���� : %s\n",boardlist[num-1].writer,boardlist[num-1].title);
					System.out.printf("���� : %s\n",boardlist[num-1].content);
					System.out.println("�޴�)");
					System.out.println("1)��ϰ��� 2)�ۻ��� 3)�ۼ���");
					String work2 = scanner.next();
					if(work2.equals("1") || work2.equals("��ϰ���")) {
						System.out.println("������� ���ư��ϴ�.");
					}
					else if(work2.equals("2") || work2.equals("�ۻ���")) {
						System.out.println("�ۻ���))");
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
					else if(work2.equals("3") || work2.equals("�ۼ���")) {
						System.out.println("�ۼ���))");
						System.out.println("PW : ");
						String pw = scanner.next();
						if(boardlist[num].password.equals(pw)) {
							System.out.println("������ ���� : ");
							String newtitle = scanner.next();
							System.out.println("������ ���� : ");
							String new_contents = scanner.next();
					
							Board board = new Board(newtitle, new_contents, boardlist[num].writer, boardlist[num].password);
			
							boardlist[num] = board;
							System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
							
							
							
							System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
						}
						else {
							System.out.println("��й�ȣ�� �߸��ƽ��ϴ�.");
						}
						
					}
					else {
						System.out.println("�������� �ʴ� �޴� �Դϴ�.");
					}
				}
				else if(work.equals("3") || work.equals("����")) {
					System.out.println("���� �մϴ�.");
					break;
				}
				else {
					System.out.println("�������� �ʴ� �޴� �Դϴ�.");
				}
			}
			catch(Exception e) {
				System.out.println("����");
			}
		}
	}
}
