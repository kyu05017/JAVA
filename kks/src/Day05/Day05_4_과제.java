package Day05;

import java.util.Scanner;

public class Day05_4_���� {//c s
	/*	1.����� 2.����/�ڷ���/���� 3.����/�ݺ��� 4.����/�ݺ��� 5.�迭
	 * 
	 *  ���� �뿩 console ���α׷�
	 * 	1. �迭
	 *  	1.ȸ��[���̵�(�ߺ�x), ��й�ȣ]
	 *  	2.����[������(�ߺ�x), �뿩����, �뿩��]
	 *  
	 * 	2. �ʱ�޴�
	 * 		1.ȸ������ 2.�α���
	 * 				1.ȸ�����Խ� ���̵� �ߺ�üũ
	 * 
	 *  3.�α��ν� �޴�
	 * 		1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�
	 * 			1.�����˻��� �������� ��ġ�ϸ� ������� �뿩���� ���
	 * 			2.������Ͻ� ��� �𼭸� ���
	 * 			3.�����뿩�� �����뿩���� �����Ҷ� �����뿩
	 * 			4.�����ݳ��� ������ �뿩�� ������ �ݳ� ó��
	 * 			5.�α׾ƿ�
	 * 
	 * 	4.�α��ν� ���̵� admin�̸� �����ڸ޴� �̵�
	 * 		1.�����ڸ޴�
	 * 			1.������� 2.������� 3.�������� 4.�α׾ƿ�
	 * 				1.���� ��Ͻ� �������� �Է¹޾� ���� ���
	 * 				2.���� ��Ͻ� ��� ������ ���
	 * 				3.���������� ������ �������� �Է¹޾� ������ ������ ���� [ null]
	 * 				4.�α׾ƿ��� �ʱ�޴�
	 * */
	public static void main(String[] args) {// m s
		
		Scanner scanner = new Scanner(System.in);
		String[][] memberlist = new String[100][2];
		String[][] book = new String[100][3];
		String adminId = "admin";
		int adminPw = 0;
		adminPw = 1234;
		while(true) {//���� ����
			System.out.println("-------------�����뿩�ý���--------------");
			System.out.println("1.ȸ������         2.�α���         3.���� ");
			System.out.println("------------------------------------");
			
			String work1 = scanner.next();
			if(work1.equals("ȸ������") || work1.equals("1")) {//ȸ������ ����
				System.out.println("-------------ȸ������--------------");
				System.out.println("���̵�  �Է�"); String id = scanner.next();
				System.out.println("��й�ȣ �Է�"); String pw = scanner.next();
				System.out.println("---------------------------------");
				
				//�ߺ�üũ
				boolean idCheck = true;
				for(int i = 0; i < memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						System.out.println("�˸�) �̹� �����ϴ� ȸ���Դϴ�.");
						idCheck = false;
						break;
					}
				}
				//ȸ������ �� �Ѱ�����
				if(idCheck == true) {
					for(int i = 0; i < memberlist.length; i++) {
						if(memberlist[i][0] == null) {
							memberlist[i][0] = id;
							memberlist[i][1] = pw;
							System.out.println("�˸�) ���̵� ������ �Ϸ�Ǿ����ϴ�.");
							break;
						}
					}
				}
				
			}//ȸ������ ����
			else if(work1.equals("�α���") || work1.equals("2")) {//�α��� �޴� ����
				System.out.println("-------------�α���--------------");
				System.out.println("���̵�  �Է�"); String id = scanner.next();
				System.out.println("��й�ȣ �Է�"); int pw = scanner.nextInt();
				System.out.println("---------------------------------");
				
				boolean loginCheck = false;
				boolean adminCheck = false;
				boolean login = false;
				for(int i = 0; i < memberlist.length; i++) {//�α��� for
					if((memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw)) || (id.equals("admin") && pw == adminPw)) {//id if ����
						if(id.equals("admin") && pw == adminPw) {
							//System.out.println("�˸�)������ �α����� �Ϸ� �Ǿ����ϴ�.");
							adminCheck = true;
							login = true;
						}
						else if((memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw))){
							//System.out.println("�˸�)�α����� �Ϸ� �Ǿ����ϴ�.");
							loginCheck = true;
							login = true;
						}
					}
				}
				if((login == false)) {
					System.out.println("�α��ο� �����Ͽ����ϴ�.");
				}
				else if((login == true)) {
					System.out.print((adminCheck == true) ? "�˸�)������ �α����� �Ϸ� �Ǿ����ϴ�.\n" : "�˸�)�α����� �Ϸ� �Ǿ����ϴ�.\n");
				while(true) {
					
					System.out.println("---------------�����뿩�ý���-----------------");
					System.out.print((adminCheck == true) ? "1.������� 2.������ 3.�������� 4.�����ھ�ȣ���� 5.�α׾ƿ�\n" : "1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�\n");
					System.out.println("-----------------------------------------");
					String work2 = scanner.next();
					if(loginCheck == true && adminCheck == false) {//�Ϲ� �α����� �޴�
							
						if(work2.equals("�����˻�") || work2.equals("1")) {
							System.out.println("-----------------------------------------");
							System.out.println("�˻��� å�̸��� �Է� :");
							System.out.println("-----------------------------------------");
							String bookSearch = scanner.next();
							for(int bs = 0; bs < book.length; bs++) {
								if(book[bs][0] != null && book[bs][0].equals(bookSearch)) {
									System.out.println("å�̸�\t�뿩����\t�뿩��\n");
									System.out.printf("%s\t%s\t%s \n",book[bs][0], book[bs][1], book[bs][2]);
									if(book[bs][1] == null) {
										System.out.println(bookSearch+"�뿩 �����մϴ�");
									}
								}
							}
							System.out.println("-----------------------------------------");
							}
							else if(work2.equals("�������") || work2.equals("2")) {
								System.out.println("-----------------------------------------");
								System.out.println("å�̸�\t�뿩����\t�뿩��\n");
								for(int bl = 0; bl < book.length; bl++) {
									if(book[bl][0] != null) {
										System.out.printf("%s\t%s\t%s \n",book[bl][0], book[bl][1], book[bl][2]);
									}
								}
								System.out.println("-----------------------------------------");
							}
							else if(work2.equals("�����뿩") || work2.equals("3")) {
								System.out.println("-----------------------------------------");
								System.out.println("�뿩�� å�̸� �Է� :");
								String bookname1 = scanner.next();
								boolean bookRant = false;
								for(int bs = 0; bs < book.length; bs++) {
									if(book[bs][0] != null && book[bs][0].equals(bookname1)) {
										book[bs][0] = bookname1;
										book[bs][1] = "�뿩��";
										book[bs][2] = id;
										bookRant = true;
									}
									else {
										bookRant = false;
									}
									if(bookRant == true) {
									System.out.println(bookname1+"�� �뿩�߽��ϴ�.");
									}	
								}					
								System.out.println("-----------------------------------------");
							}
							else if(work2.equals("�����ݳ�") || work2.equals("4")) {
								System.out.println("-----------------------------------------");
								System.out.println("�ݳ��� å�̸� �Է� :");
								String bookname1 = scanner.next();
								boolean bookRant = false;
								for(int bs = 0; bs < book.length; bs++) {
									if(book[bs][0] != null && book[bs][0].equals(bookname1)) {
										book[bs][0] = bookname1;
										book[bs][1] = "�뿩����";
										book[bs][2] = "";
										bookRant = true;
									}
									else {
										bookRant = false;
									}
									if(bookRant == true) {
									System.out.println(bookname1+"�� �ݳ��߽��ϴ�.");
									}	
								}					
								System.out.println("-----------------------------------------");
							}
							else if(work2.equals("�α׾ƿ�") || work2.equals("5")) {
								System.out.println("-----------------------------------------");
								System.out.println("�˸�) �α׾ƿ� �ϼ̽��ϴ�.");
								System.out.println("-----------------------------------------");
					
								break;
							}
							else {
								System.out.println("�˸�) �߸��� �Է��Դϴ�.");
							}
						}//�Ϲݸ޴� ��
						else if(adminCheck == true && loginCheck == false) {//������ �α����� �޴�
							boolean bookCheak = true;
							for(int i = 0; i < memberlist.length; i++) {
								if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
									System.out.println("�˸�) �̹� �����ϴ� å�Դϴ�.");
									bookCheak = false;
									break;
								}
							}
							if(work2.equals("�������") || work2.equals("1")) {
								System.out.println("-----------------------------------------");
								System.out.println("����� å �̸��� �Է��ϼ���.");
								System.out.println("-----------------------------------------");
								String bookname3 = scanner.next();
								boolean bookCk = true;
								for(int i = 0; i < book.length; i++) {
									if(book[i][0] != null && book[i][0].equals(bookname3)) {
										System.out.println("�˸�) �̹� �����ϴ� å�Դϴ�.");
										bookCk = false;
										break;
									}
								}
								
								for(int j = 0;j < book.length; j++) {
									if(bookCk == true) {
										if(book[j][0] == null) {
											book[j][0] = bookname3;
											book[j][1] = "�뿩����";
											book[j][2] = "";
											System.out.println("�˸�) ������ �Ϸ�Ǿ����ϴ�.");
											break;
										}
									}
								}	
							}
							else if(work2.equals("�������") || work2.equals("2")) {
								System.out.println("-----------------------------------------");
								System.out.println("å�̸�\t�뿩���ɿ���\t�뿩��\n");
								for(int bl = 0; bl < book.length; bl++) {
									if(book[bl][0] != null) {
										System.out.printf("%s\t%s\t%s \n",book[bl][0], book[bl][1], book[bl][2]);
									}
								}
							System.out.println("-----------------------------------------");
						}
						else if(work2.equals("��������") || work2.equals("3")) {
							System.out.println("-----------------------------------------");
							System.out.println("������ å �̸��� �Է��ϼ���.");
							System.out.println("-----------------------------------------");
							String bookname3 = scanner.next();
							
							
							for(int b2 = 0; b2 < book.length; b2++) {
								if(book[b2][0].equals(bookname3)) {
									book[b2][0] = null;
									System.err.println("�˸�) å���� �Ϸ�");
									break; 
								}
							}
						}	
						else if(work2.equals("�����ں�й�ȣ") || work2.equals("4")) {
							System.out.println("������ ��й�ȣ�� �����մϴ�");
							int pw2 = scanner.nextInt();
							adminPw = pw2;
							break;
						}	
						else if(work2.equals("�α׾ƿ�") || work2.equals("5")) {
							System.out.println("-----------------------------------------");
							System.out.println("�˸�) �α׾ƿ� �ϼ̽��ϴ�.");
							System.out.println("-----------------------------------------");
							break;
								
						}
						else {
							System.out.println("�˸�) �߸��� �Է��Դϴ�.");
						}
					}//������ �޴���
				}
			}
			} 
			else if(work1.equals("����") || work1.equals("3")) {
				System.err.println("�˸�) ���α׷��� �����մϴ�.");
				break;
			}
			else {//�α��� �޴� ����
				System.err.println("�˸�) ���¸޴� �Դϴ�.");
			}
		}//���� ����
	}//m e
}//c s
