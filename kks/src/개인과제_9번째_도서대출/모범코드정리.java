package ���ΰ���_9��°_��������;

import java.util.Scanner;

public class ����ڵ����� {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[][] members = new String[100][3];
		String[][] book = new String[100][3];
		
		while(true) {
			System.out.println("���θ޴�))");
			System.out.println("1)ȸ������ 2)�α��� 3)����");
			int ch = scanner.nextInt();
			if(ch == 1) {
				System.out.println("ȸ������))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW : ");
				String pw = scanner.next();
				boolean pass = true;
				
				for(int i = 0; i < members.length; i++) {
					if(members[i][0] != null && members[i][0].equals(id)) {
						System.out.println("�˸�)) �̹� ������� ���̵� �Դϴ�.");
						pass = false;
						break;
					}
				}
				if(pass) {
					for(int i = 0; i < members.length;i++) {
						if(members[i][0] == null) {
							members[i][0] = id;
							members[i][1] = pw;
							System.out.println("�˸�)) ȸ�������� �Ϸ� �Ǿ����ϴ�.");
							break;
						}
					}
				}
				
			}
			else if(ch == 2) {
				System.out.println("�α���))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW : ");
				String pw = scanner.next();
				int login = 0;
				int menu = 0;
				int adminmenu = 0;
				
				for(int i = 0; i <members.length;i++) {
					if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
						login = 1;
						System.out.println("�˸�)) "+id+"�� ȯ���մϴ�.");
						break;
					}
					else if(members[i] != null && id.equals("admin") && members[i][2].equals(pw)) {
						login = 2;
						System.out.println("�˸�)) �����ڷ� �α��� �ϼ̽��ϴ�.");
						break;
					}
					else {
						System.out.println("�˸�)) �α��ο� �����߽��ϴ�.");
						break;
					}
				}
				while(true) {
					if(login == 1) {
						System.out.println("�޴�))");
						System.out.println("1)�˻� 2)��� 3)�뿩 4)�ݳ� 5)�α׾ƿ�");
						int ch2 = scanner.nextInt();
						if(ch2 == 1) menu = 1;
						else if(ch2 == 2) menu = 2;
						else if(ch2 == 3) menu = 3;
						else if(ch2 == 4) menu = 4;
						else if(ch2 == 5) menu = 5;
					}
					else if(login == 2) {
						System.out.println("�����ڸ޴�))");
						System.out.println("1)��� 2)��� 3)���� 4)�α׾ƿ�");
						int ch2 = scanner.nextInt();
						if(ch2 == 1) adminmenu = 1;
						else if(ch2 == 2) adminmenu = 2;
						else if(ch2 == 3) adminmenu = 3;
						else if(ch2 == 4) adminmenu = 4;
					}
					if(menu == 1) {
						System.out.println("�׽�Ʈ �˻�");
						break;
					}
					else if(menu == 2 || adminmenu == 2) {
						System.out.println("�׽�Ʈ ���");
						break;
					}
					else if(menu == 3) {
						System.out.println("�׽�Ʈ �뿩");
						break;
					}
					else if(adminmenu == 1) {
						System.out.println("�׽�Ʈ ���");
						break;
					}
					else if(adminmenu == 3) {
						System.out.println("�׽�Ʈ ����");
						break;
					}
					else if(menu == 4) {
						System.out.println("�׽�Ʈ �ݳ�");
						break;
					}
					else if(menu == 5 || adminmenu == 4) {
						System.out.println("�α׾ƿ� �߽��ϴ�.");
						break;
					}
				}

				//ȸ�� �޴�
				
				//��� �޴�
				
			}
			else if(ch == 3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else {
				System.out.println("�˸�)) �������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}
}
