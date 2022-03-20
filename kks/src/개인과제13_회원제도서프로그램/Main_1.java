package ���ΰ���13_ȸ�����������α׷�;

import java.util.Scanner;

public class Main_1 {
	
	static Scanner sc = new Scanner(System.in);
	static Member_tesk_1[] memberlist = new Member_tesk_1[1000];
	static Book_rental_tesk_1[] booklist = new Book_rental_tesk_1[1000]; 
	static Main_1 main = new Main_1();
	
	public static void main(String[] args) {

		main.Menu();
	}
	
	void Menu() {
		Member_tesk_1 member = new Member_tesk_1();
		while(true) {
			System.out.println("ȸ���� �����뿩 ���α׷�))");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã�� 5.����");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.println("ȸ������))");
				System.out.print(" ���̵� : ");	
				String id = sc.next();
				System.out.print(" ��й�ȣ : ");	
				String password = sc.next();
				System.out.print(" �̸� : ");	
				String name = sc.next();
				System.out.print(" ����ó : ");	
				String phone = sc.next();
				
				int result = member.registration(id,password,name,phone);
				
				if(result == 5) {
					System.out.println("���� ������� ���̵� �Դϴ�.");
				}
				else if(result == 1) {
					System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
				}
				else if(result == 0){
					System.out.println("ȸ�����Կ� ���� �Ͽ����ϴ�.");
				}
			}
			else if(ch == 2) {
				System.out.println("�α���))");
				System.out.println("���̵� �Է��ϼ���");
				String id = sc.next();
				System.out.println("��й�ȣ���Է��ϼ���");
				String password = sc.next();
			
				String result = member.signIn(id,password);
				
				if(result.equals("admin")) {
					main.Adminmenu();
				}
				else if(result.equals(id)) {
					main.MemberMenu(result);
				}
				else if(result.equals("null")) {
					System.out.println("�α��ο� �����Ͽ����ϴ�.");
				}
			}
			else if(ch == 3) {
				System.out.println("���̵� ã��))");
				System.out.println("�̸��� �Է��ϼ���.");
				String name = sc.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
				String phone = sc.next();
				
				String result = member.findId(name, phone);
				
				if(result == null) {
					System.out.println("���̵� ã�� ���߽��ϴ�.");
				}
				else {
					System.out.println("ȸ������ ���̵�� "+ result + "�Դϴ�.");
				}
			}
			else if(ch == 4) {
				System.out.println("��ι�ȣ ã��");
				System.out.println("���̵� �Է��ϼ���.");
				String id = sc.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
				String phone = sc.next();
				
				String result = member.findPassword(id, phone);
				
				if(result == null) {
					System.out.println("��й�ȣ�� ã�� ���߽��ϴ�.");
				}
				else {
					System.out.println("ȸ������ ��й�ȣ�� "+ result + "�Դϴ�.");
				}
			}
			else if(ch == 5) {
				System.out.println("���α׷��� �����߽��ϴ�.");
				sc.close();
				return;
			}
		}
	}
	
	
	void MemberMenu(String id) {
		
		while(true) {
			
			System.out.println("�����뿩 �ý���))");
			System.out.println(id+ "�� ȯ�� �մϴ�.");
			System.out.println("1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�");
			int ch= sc.nextInt();
			Book_rental_tesk_1 book = new Book_rental_tesk_1();
			
			if(ch == 1) {
				System.out.println("�����˻�))");
				System.out.println("�����ڵ� ( ISBN ) �Է� : ");
				String search_ISBN = sc.next();
				
				book.Book_Search(search_ISBN);
			}
			else if(ch == 2) {
				System.out.println("�������))");
				System.out.print("ISBM\t������\t�۰�\t�뿩���ɿ���\n");
				book.Book_Lsit();
			}
			else if (ch == 3) {
				System.out.println("�����뿩))");
				System.out.print("ISBM :");
				String ISBM = sc.next();
				
				int result = book.Book_Rent(id,ISBM);
				
				if(result == 5) {
					System.out.println("�뿩���� ������ �ƴմϴ�.");	
				}
				else if(result == 0) {
					System.out.println("�뿩 ���� ���߽��ϴ�.");
				}
				else if(result == 1) {
					System.out.println("���� �뿩�� �Ϸ� �Ǿ����ϴ�.");
				}
			}
			else if(ch ==4) {
				System.out.println("�����ݳ�))");
				System.out.print("ISBM :");
				String ISBM = sc.next();
				
				int result = book.Book_Return(id,ISBM);
				
				if(result == 5) {
					System.out.println("�뿩���� ������ �ƴմϴ�.");	
				}
				else if(result == 0) {
					System.out.println("�ݳ��Ͻ� ���߽��ϴ�.");
				}
				else if(result == 1) {
					System.out.println("���� �ݳ��� �Ϸ� �Ǿ����ϴ�.");	
				}
			}
			else if(ch==5) {
				System.out.println("�α׾ƿ� �߽��ϴ�.");
				return;
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
		
	}
	
	
	
	void Adminmenu() {
		while(true) {
			System.out.println("������ �޴�))");
			System.out.println("1.�����߰� 2.������� 3.�������� 4.�α׾ƿ�");
			int ch= sc.nextInt();
			Book_rental_tesk_1 book = new Book_rental_tesk_1();
			
			if(ch == 1) {
				System.out.println("�������))");
				System.out.println("ISBM �Է� : ");
				String isbm = sc.next();
				System.out.println("å�̸� :");
				String name = sc.next();
				System.out.println("�۰��� �̸� :");
				String writwer = sc.next();
				
				int result =  book.Book_add(isbm, name, writwer);
				
				if(result == 5) {
					System.out.println("�ߺ��� ISBN ���Դϴ�.");
				}
				else if(result == 0) {
					System.out.println("���� ��Ͽ� �����Ͽ����ϴ�.");
				}
				else if(result == 1) {
					System.out.println("��������� �Ϸ� �Ǿ����ϴ�.");
				}
			}
			else if(ch == 2) {
				System.out.println("�������))");
				System.out.print("ISBM\t������\t�۰�\t�뿩���ɿ���\n");
				book.Book_Lsit();
			}
			else if(ch == 3) {
				System.out.println("��������))");
				System.out.println("ISBM �Է� :");
				String isbm = sc.next();
				
				boolean result = book.Book_remove(isbm);
				
				if(result) {
					System.out.println("������ �Ϸ� �߽��ϴ�.");
				}
				else {
					System.out.println("�ش� ������ ������ �����߽��ϴ�.");
				}
			}
			else if(ch == 4) {
				System.out.println("�α׾ƿ� �߽��ϴ�.");
				return;
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
}
