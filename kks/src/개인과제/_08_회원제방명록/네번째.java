package ���ΰ���._08_ȸ��������;

import java.util.Scanner;

public class �׹�° {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[][] member = new String[100][3];
		String[][] board = new String[100][3];
		
		while(true) {
			System.out.println("ȸ���� �湮��)))");
			System.out.println("1)ȸ������ 2)�α���");
			System.out.print("�Է� : \n");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("ȸ������ ������))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW : ");
				String pw = scanner.next();
				System.out.println("Name : ");
				String name = scanner.next();
				boolean pass = true;
				
				for(int i = 0; i < member.length; i++) {
					if(member[i][0] != null && member[i][0].equals(id)) {
						System.out.println("�̹� �����ϴ� ���̵� �Դϴ�.");
						pass = false;
					}
				}
				if(pass) {
					for(int i = 0; i < member.length;i++) {
						if(member[i][0] == null) {
							member[i][0] = id;
							member[i][1] = pw;
							member[i][2] = name;
							System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
							break;
						}
					}
				}
			}
			else if(ch == 2) {
				System.out.println("�α��� ������))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW : ");
				String pw = scanner.next();
				boolean pass = false;
				for(int i = 0; i < member.length; i++) {
					if(member[i][0] != null && member[i][0].equals(id) && member[i][1].equals(pw)) {
						System.out.println("�˸�)) �α��� ����");
						pass = true;
						
						while(true) {
							System.out.println("����))");
							System.out.println("��ȣ\t�ۼ���\t����\t����");
							for(int j = 0; j < board.length;j++) {
								if(board[j][0] != null) {
									System.out.printf("%d\t%s\t%s\t%s\n",j,board[j][2],board[j][0],board[j][1]);
								}
							}
							System.out.println("1)���� ����� 2)�α׾ƿ�");
							int ch2 = scanner.nextInt();
							
							if(ch2 == 1) {
								System.out.println("�۾���))");
								System.out.println("���� : ");
								String title = scanner.next();
								System.out.println("���� : ");
								String cont = scanner.next();
								
								for(int j =0; j < board.length; j++) {
									if(board[j][0] == null) {
										board[j][0] = title;
										board[j][1] = cont;
										board[j][2] = id;
										System.out.println("�˸�)) �ۼ��� �Ϸ�Ǿ����ϴ�.");
										break;
									}
								}
							}
							else if(ch2 == 2) {
								
							}
							else {
								System.out.println("�������� �ʴ� �޴��Դϴ�.");
							}
						}
					}
				}
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}

	}

}
