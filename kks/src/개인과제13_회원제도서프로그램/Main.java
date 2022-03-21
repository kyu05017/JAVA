package ���ΰ���13_ȸ�����������α׷�;

import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	static Account[] accountlist = new Account[1000];
	static Book[] booklist = new Book[1000];
	static Main main = new Main();
	
	public static void main(String[] args) {
		
		main.menu();
	}
	
	void menu() {
		Account account = new Account();
		while(true) {
			System.out.println("ȸ���� ���� ���α׷�))");
			System.out.println("�Ŵ�)) 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã�� 5.����");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("ȸ������))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW : ");
				String pw = scanner.next();
				System.out.println("Name : ");
				String name = scanner.next();
				System.out.println("Phone : ");
				String phone = scanner.next();
				
				int result = account.registration(id,pw,name,phone);
				
				if(result == 50) {
					System.out.println("�ߺ��� ���̵� �Դϴ�.");
				}
				else if(result == 0) {
					System.out.println("ȸ�����Կ� ���� �߽��ϴ�.");
					
				}
				else if(result == 1) {
					System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
				}
			}
			else if(ch == 2) {
				System.out.println("�α���))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW : ");
				String pw = scanner.next();
				
				String result = account.login(id,pw);
				
				if(result.equals("admin")) {
					System.out.println("�����ڷ� �α��� �մϴ�.");
					main.adminmenu();
				}
				else if(result.equals(id)) {
					System.out.println(id+ "�� ȯ�� �մϴ�.");
					main.membermenu(id);
				}
				else if(result == null){
					System.out.println("�α��ο� ���� �Ͽ����ϴ�.");
					
				}
				
			}
			else if(ch == 3) {
				System.out.println("���̵�ã��))");
				System.out.println("Name : ");
				String name = scanner.next();
				System.out.println("Phone : ");
				String phone = scanner.next();
				
				String result = account.findId(name,phone);
				
				if(result.equals("false")) {
					System.out.println("���̵� ��ȸ�Ҽ� �����ϴ�.");
				}
				else {
					System.out.println("ȸ������ ���̵�� " + result + "�Դϴ�.");
				}
			}
			else if(ch == 4) {
				System.out.println("��й�ȣã��))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("Phone : ");
				String phone = scanner.next();
				
				String result = account.findPw(id,phone); 
				
				if(result.equals("false")) {
					System.out.println("��й�ȣ�� ��ȸ�Ҽ� �����ϴ�.");
				}
				else {
					System.out.println("ȸ������ ��й�ȣ�� " + result + "�Դϴ�.");
				}
			}
			else if(ch == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				scanner.close();
				break;
			}
			else {
				System.out.println("���� ���� �ʴ� �޴� �Դϴ�.");
			}
		}
	}
	
	void membermenu(String id) {
		
		Book book = new Book();
		
		while(true) {
			System.out.println("���� �뿩 �ý���");
			System.out.println("�޴�)) 1.�����˻� 2. ������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("�����˻�))");
				System.out.println("ISBN : ");
				String ISBN = scanner.next();
				
				book.book_search(ISBN);
			}
			else if(ch == 2) {
				book.book_list();
			}
			else if(ch == 3) {
				System.out.println("�����뿩))");
				System.out.println("ISBN : ");
				String ISBN = scanner.next();
				
				book.book_rent(ISBN,id);
				
			}
			else if(ch == 4) {
				System.out.println("�����ݳ�))");
				System.out.println("ISBN : ");
				String ISBN = scanner.next();
				
				book.book_return(ISBN,id);
			}
			else if(ch == 5) {
				System.out.println("�α׾ƿ� �մϴ�.");
				return;
			}
			else {
				System.out.println("�߸��� �޴� �Դϴ�.");
			}
		}
	}
	
	void adminmenu() {
		Book book = new Book();
		
		while(true) {
			System.out.println("������ �޴�");
			System.out.println("�޴�)) 1.������� 2.������� 3.�������� 4.�α׾ƿ�");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("�������))");
				System.out.println("ISBN : ");
				String ISBN = scanner.next();
				System.out.println("å�̸� : ");
				String book_name = scanner.next();
				System.out.println("�۰�  :  ");
				String writer = scanner.next();
				
				book.book_add(ISBN,book_name,writer);
			}
			else if(ch == 2) {
				book.book_list();
			}
			else if(ch == 3) {
				System.out.println("��������))");
				System.out.println("ISBN : ");
				String ISBN = scanner.next();
				
				book.book_remove(ISBN);
			}
			else if(ch == 4) {
				System.out.println("�α׾ƿ� �߽��ϴ�.");
				return;
			}
			else {
				System.out.println("�������� �ʴ� �޴� �Դϴ�.");
			}
			
		}
		
	}
}
