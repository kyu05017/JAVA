package ���ΰ���._08_ȸ��������;

import java.util.Scanner;

public class ù��° {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[][] memberlist = new String[100][3];
		String[][] boardlist = new String[100][3];
		
		while(true) {
			System.out.println("ȸ���� ����))");
			System.out.println("1.ȸ������ 2.�α���");
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
				
				for(int i = 0; i < memberlist.length;i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						System.out.println("�̹� �����ϴ� ���̵� �Դϴ�.");
						pass = false;
						break;
					}
				}
				if(pass) {
					for(int i =0;i < memberlist.length;i++) {
						if(memberlist[i][0]==null) {
							memberlist[i][0] = id;
							memberlist[i][1] = pw;
							memberlist[i][2] = name;
							System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�/");
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
				
				boolean pass2 = false;
				
				for(int i = 0; i < memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) {
						System.out.println("�α����� �Ϸ�Ǿ����ϴ�.");
						pass2 = true;
						
						while(true) {
							System.out.println("����))");
							System.out.println("��ȣ\t�ۼ���\t����\t����");
							for(int j = 0; j < boardlist.length;j++) {
								if(boardlist[j][0] != null) {
									System.out.printf("%d\t%s\t%s\t%s\t\n",j,boardlist[j][2],boardlist[j][1],boardlist[j][0]);
								}
							}
							System.out.println("1���ϳ���� 2�α׾ƿ�");
							int ch2 = scanner.nextInt();
							if(ch2 == 1) {
								System.out.println("�۾���))");
								System.out.println("���� : ");
								String title = scanner.next();
								System.out.println("���� : ");
								String cont = scanner.next();
								for(int j = 0; j <boardlist.length; j++) {
									if(boardlist[j][0] == null) {
										boardlist[j][0] = title;
										boardlist[j][1] = cont;
										boardlist[j][2] = id;
										System.out.println("�˸�)) �ۼ��� �Ϸ�Ǿ����ϴ�.");
										break;
									}
								}
							}
							else if(ch2 == 2) {
								System.out.println("�˸�)) �α׾ƿ��� �Ǿ�ϴ�.");
								break;
							}
							else {
								System.out.println("���� �޴� �Դϴ�.");
							}
						}
					}
				}
			}
			else {
				System.out.println("�������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}
}
