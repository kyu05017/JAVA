package ���ΰ���_9��°_��������;

import java.util.Scanner;

public class �׹�° {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[][] member = new String[100][3];
		String[][] books = new String[100][3];
		
		while(true) {
			System.out.println("����)");
			System.out.println("1ȸ������ 2�α���");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("ȸ������)");
				System.out.println("ID :");
				String id = scanner.next();
				System.out.println("PW :");
				String pw = scanner.next();
				boolean pass = true;
				
				for(int i = 0; i < member.length; i ++) {
					if(member[i][0] != null && member[i][0].equals(id)) {
						System.out.println("�̹� �����ϴ� ȸ���Դϴ�.");
						pass = false;
						break;
					}
				}
				if(pass) {
					for(int i = 0; i < member.length;i++) {
						if(member[i][0] == null) {
							member[i][0] = id;
							member[i][1] = pw;
							System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
							break;
							
						}
					}
				}
			}
			else if(ch == 2) {
				System.out.println("�α���)");
				System.out.println("ID :");
				String id = scanner.next();
				System.out.println("PW :");
				String pw = scanner.next();
				int login = 0;
				
				for(int i = 0; i < member.length; i++) {
					if(member[i][0]!= null && member[i][0].equals("admin") && member[i][1].equals(pw)) {
						System.out.println("�����ڷ� �α��� �ϼ̽��ϴ�.");
						login =2;
						break;
					}
					else if(member[i][0]!= null && member[i][0].equals(id) && member[i][1].equals(pw)) {
						System.out.println(id+"�� ȯ���մϴ�.");
						login =1;
						break;
					}
				}
				int menu = 0;
				int admenu = 0;
				while(true) {
					if(login == 2) {
						System.out.println("������ �޴�");
						System.out.println("1.��� 2.��� 3.���� 4.�α׾ƿ�");
						int ch2 = scanner.nextInt();
						
						if(ch2 == 1)admenu = 1;
						else if(ch2 == 2) admenu = 2;
						else if(ch2 == 3) admenu = 3;
						else if(ch2 == 4) admenu = 4;
					}
					else if(login == 1) {
						System.out.println("�����޴�)");
						System.out.println("1.�˻� 2.��� 3.�뿩 4.�ݳ� 5.�α׾ƿ�");
						int ch2 = scanner.nextInt();
						if(ch2 == 1)menu = 1;
						else if(ch2 == 2) menu = 2;
						else if(ch2 == 3) menu = 3;
						else if(ch2 == 4) menu = 4;
						else if(ch2 == 5) menu = 5;
					}
					
					if(menu == 1) {
						System.out.println("�˻��� å�̸� �Է�:");
						String name = scanner.next();
						
						for(int i = 0 ; i < books.length; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								if(books[i][2].equals("")) {
									System.out.printf("%s ���� å�� �뿩 �����մϴ�.",name);
									break;
								}
								else {
									System.out.println("����\t�뿩����\t�뿩��");
									System.out.printf("%s\t%s\t%s\n",books[i][0],books[i][1],books[i][2]);
									break;
								}
							}
						}
					}
					else if(menu == 2 || admenu == 2) {
						System.out.println("���� ���");
						System.out.println("����\t�뿩����\t�뿩��");
						for(int i = 0 ; i < books.length; i++) {
							if(books[i][0] != null) {
								System.out.printf("%s\t%s\t%s\n",books[i][0],books[i][1],books[i][2]);
								break;
							}
						}
					}
					else if(menu == 3) {
						System.out.println("�뿩�� å�̸� �Է� :");
						String name = scanner.next();
						for(int i = 0 ; i < books.length; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								System.out.println("�ش� å�� �뿩 �߽��ϴ�.");
								books[i][1] = "�뿩��";
								books[i][2] = id;
								break;
							}
						}
					}
					else if(menu == 4) {
						System.out.println("�ݳ��� å�̸� �Է� :");
						String name = scanner.next();
						for(int i = 0 ; i < books.length; i++) {
							if(books[i][0] != null && books[i][2].equals(id)) {
								System.out.println("�ݳ���å�� �����ϴ�.");
								break;
							}
							else if(books[i][0] != null && books[i][0].equals(name)) {
								System.out.println("�ش� å�� �뿩 �߽��ϴ�.");
								books[i][1] = "";
								books[i][2] = "";
								break;
							}
						}
					}
					else if(menu == 5 || admenu == 4) {
						System.out.println("�α׾ƿ� �߽��ϴ�.");
						break;
					}
					else if(admenu == 1) {
						System.out.println("����� å�̸� �Է�");
						String name = scanner.next();
						for(int i = 0 ; i < books.length; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								System.out.println("�̹� �����ϴ� å�Դϴ�.");
							}
						}
						for(int i = 0 ; i < books.length; i++) {
							if(books[i][0] == null ) {
								books[i][0] = name;
								books[i][1] = "";
								books[i][2] = "";
								break;
							}
						}
					}
					else if(admenu == 3) {
						System.out.println("������ å�̸� �Է�");
						String name = scanner.next();
						for(int i = 0 ; i < books.length; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								books[i][0] = null;
								books[i][1] = null;
								books[i][2] = null;
								break;
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
