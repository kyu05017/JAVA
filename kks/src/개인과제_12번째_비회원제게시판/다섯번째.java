package ���ΰ���_12��°_��ȸ�����Խ���;

import java.util.Scanner;

public class �ټ���° {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Board[] boards = new Board[1024];
		
		while(true) {
			try {
				System.out.println("Ŀ�´�Ƽ");
				System.out.println("��ȣ\t�ۼ���\t����");
				int index = 0;
				for(Board temp : boards) {
					if(temp != null) {
						System.out.printf("%d\t%s\t%s\n",(index+1),temp.writer,temp.writer);
					}
					index++;
				}
				System.out.println("�޴�)");
				System.out.println("1)�۾��� 2)���б� 3)����");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("�۾��� �޴�)");
					System.out.println("���� : ");
					String title = scanner.next();
					System.out.println("���� : ");
					String contents = scanner.next();
					System.out.println("���̵� : ");
					String id = scanner.next();
					System.out.println("��й�ȣ : ");
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
					System.out.println("�Խ���))");
					System.out.println("�Խù� ��ȣ �Է�");
					int num = scanner.nextInt();
					System.out.printf("�ۼ��� : %s || ���� : %s \n",boards[num-1].writer,boards[num-1].title);
					System.out.println("����)");
					System.out.printf("%s\n",boards[num-1].content);
					System.out.println("�޴�))");
					System.out.println("1)������� 2)�ۻ��� 3)�ۼ���");
					int ch2 = scanner.nextInt();
					
					if(ch2 == 1) {
						System.out.println("���ư��ϴ�.");
					}
					else if (ch2 == 2) {
						System.out.println("�ۻ���))");
						System.out.println("��й�ȣ : ");
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
							System.out.println("�ۻ��� �Ϸ�");
						}
						else {
							System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
						}
					}
					else if(ch2 == 3) {
						System.out.println("�ۼ��� ");
						System.out.println("��й�ȣ : ");
						String pw = scanner.next();
						if(boards[num-1].password.equals(pw)) {
							System.out.println("������ ����");
							String newtitle = scanner.next();
							System.out.println("������ ����");
							String newcont = scanner.next();
							
							Board temp = new Board(newtitle, newcont, boards[num].writer, boards[num].password);
							boards[num] = temp;
							System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
						}
						else {
							System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
						}
					}
					
				}
				else if(ch == 3) {
					System.out.println("���� �մϴ�.");
					break;
				}
				else {
					System.out.println("�������� �ʴ� �޴� �Դϴ�.");
				}
				
			}
			
			
			
			catch(Exception e) {
				System.out.println("����");
				scanner = new Scanner(System.in);
			}
		}
	}
}
