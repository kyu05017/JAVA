package ���ΰ���._12_��ȸ�����Խ���;

import java.util.Scanner;

public class ����ڵ� {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[1024];
		
		//
		
		while(true) {
			try {
				System.out.println("Ŀ�´�Ƽ)");
				System.out.println("��ȣ\t�ۼ���\t����");
				
				
				int index = 0;
				for(Board temp : boardlist) {
					if(temp != null) {
						System.out.printf("%d\t%s\t%s \n" , (index)+1 , temp.writer , temp.title);
					}
					index++;
				}
				System.out.println("1)���ۼ� 2)�Խ��� 3)����");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("�۾���))");
					System.out.println("���� :");
					String title = scanner.next();
					System.out.println("���� :");
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
					System.out.println("�Խ���))");
					System.out.println("�Խù� ��ȣ ����");int bno = scanner.nextInt()-1;
					System.out.printf("�ۼ���: %s  ����: %s\n",boardlist[bno].writer,boardlist[bno].title);
					System.out.printf("���� : %s\n",boardlist[bno].content);
					System.out.println("1)��Ϻ��� 2)�ۻ��� 3)�ۼ���"); 
					int ch2 = scanner.nextInt();
					if(ch2 == 1) {
						System.out.println("������� ���ư��ϴ�.");
					}
					else if(ch2 == 2) {
						System.out.println("�ۻ���))");
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
						System.out.println("�ۻ��� �Ϸ�");
					}
					else if(ch2 == 3) {
						System.out.println("�ۼ���))");
						System.out.println("PW : ");
						String pw = scanner.next();
						if(boardlist[bno].password.equals(pw)) {
							System.out.println("������ ���� : ");
							String newtitle = scanner.next();
							System.out.println("������ ���� : ");
							String new_contents = scanner.next();
					
							Board board = new Board(newtitle, new_contents, boardlist[bno].writer, boardlist[bno].password);
			
							boardlist[bno] = board;
							System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
							
							
							
							System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
						}
						else {
							System.out.println("��й�ȣ�� �߹��ƽ��ϴ�.");
						}
						
					}
					else {
						System.out.println("�������� �ʴ� �޴� �Դϴ�.");
					}
				}
				else if(ch == 3) {
					System.out.println("���α׷��� ���� �մϴ�.");
					break;
				}
				else {
					System.out.println("�������� �ʴ� �޴� �Դϴ�.");
				}
			}
			catch(Exception e) {
				scanner = new Scanner(System.in);
				System.out.println(e);
			}
			
			
			
		}
		
		
	}
}
