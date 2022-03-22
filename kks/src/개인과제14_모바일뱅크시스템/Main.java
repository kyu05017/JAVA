package ���ΰ���14_����Ϲ�ũ�ý���;

import java.util.Scanner;

public class Main {
	
	static Controller con = new Controller();
	
	public static void main(String[] args) {
		
		Main main = new Main();
		main.menu();
	}
	
	void menu() {
		
		Scanner scanner = new Scanner(System.in);
		Main main = new Main();
		
		while(true) { // ���ѷ��� [�������� x]
			System.out.println("-------------����� ��ũ ���α׷�-------------------");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã�� 5.����");
			
			String ch = scanner.next();
			
			if(ch.equals("1")) {
				System.out.println("ȸ������)");
				System.out.print("ID : \n");
				String id = scanner.next();
				for(Account temp : Controller.accountlist) {
					if(temp != null && temp.getId().equals(id)) {
						System.out.println("�˸�)) ���� ������� ���̵��Դϴ�.");
						break;
					}
				}
				System.out.print("PW : \n");
				String pw = scanner.next();
				System.out.print("Name : \n");
				String name = scanner.next();
				System.out.print("Phone : \n");
				String phone = scanner.next();
				
				boolean result = con.registration(id,pw,name,phone);
				
				if(result) {
					System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
				}
				else {
					System.out.println("ȸ�����Կ� �����߽��ϴ�.");
				}

			}
			else if(ch.equals("2")) {
				System.out.println("�α���)");
				System.out.print("ID : \n");
				String id = scanner.next();
				System.out.print("PW : \n");
				String pw = scanner.next();
				
				String result = con.login(id,pw);
				
				if(result.equals("admin")) {
					System.out.println("�����ڷ� �α��� �߽��ϴ�");
				}
				else if(result.equals(id)) {
					System.out.println(id+"�� ȯ���մϴ�.");
					main.membermenu(result);
				}
				else if(result.equals("����")) {
					System.out.println("�α��ο� ���� �߽��ϴ�.");
				}
				
			}
			else if(ch.equals("3")) {
				System.out.println("���̵� ã��))");
				System.out.print("Name : \n");
				String name = scanner.next();
				System.out.print("Phone : \n");
				String phone = scanner.next();
				
				String result = con.findid(name,phone);
				
				if(result.equals("����")) {
					System.out.println("���̵� ã�⿡ ���� �߽��ϴ�.");
				}
				else {
					System.out.println("ȸ������ ���̵�� " + result + "�Դϴ�.");
				}
				
			}
			else if(ch.equals("4")) {
				System.out.println("��й�ȣ ã��)");
				System.out.print("ID : \n");
				String id = scanner.next();
				System.out.print("Phone : \n");
				String phone = scanner.next();
				
				String result = con.findpw(id,phone);
				
				if(result.equals("����")) {
					System.out.println("��й�ȣ ã�⿡ ���� �߽��ϴ�.");
				}
				else {
					System.out.println("ȸ������ ��й�ȣ�� " + result + "�Դϴ�.");
				}
			}
			else if(ch.equals("5")) {
				System.out.println("���α׷� ����.");
				scanner.close();
				return;
			}
			else {
				System.out.println("�˸�)) �߸��� �Է��Դϴ�.");
			}
		}
	}
	
	
	void membermenu(String id) {
		
		Scanner scanner = new Scanner(System.in);
		Main main = new Main();
		
		while(true) {
			System.out.println("------------------ȸ�� �޴�---------------");
			System.out.println("1.���»��� 2.�Ա� 3.��� 4.���¸�� 5.��ü 6.���� 7.���º�й�ȣã�� 8.�α׾ƿ�");
			String ch = scanner.next();
			
			if(ch.equals("1")) {
				System.out.println("���°���) ");
				System.out.print("����� ���¹�ȣ �Է� : \n");
				int banknum = scanner.nextInt();
				
				for(Bank_Book temp : Controller.banklist) {
					if(temp != null && temp.getBanknum() == banknum) {
						System.out.println("�˸�)) ���� ������� ���¹�ȣ�Դϴ�.");
						break;
					}
				}
				System.out.print("����� ��ι�ȣ �Է� : \n");
				String pw = scanner.next();
				
				
				boolean result =  con.bankregistration(id,banknum,pw);
				
				if(result) {
					System.out.println("���»����� �Ϸ� �Ǿ����ϴ�.");
				}
				else {
					System.out.println("���� ���� ����");
				}
			}
			else if(ch.equals("2")) {
				System.out.print("���¹�ȣ  �Է� 	: \n");
				int banknum = scanner.nextInt();
				System.out.print("���� ��й�ȣ �Է� : \n");
				String pw = scanner.next();
				System.out.print("�Ա��� �ݾ��Է� 	: \n");
				int money = scanner.nextInt();
				
				boolean result = con.inmoney(id,banknum,pw,money);
				
				if(result) {
					System.out.println("�˸�)) "+money + "���� ���·� �Ա� �Ǿ����ϴ�");
				}
				else {
					System.out.println("�Ա� ����");
				}
				
			}
			else if(ch.equals("3")) {
				System.out.print("���¹�ȣ  �Է� 	: \n");
				int banknum = scanner.nextInt();
				System.out.print("���� ��й�ȣ �Է� : \n");
				String pw = scanner.next();
				System.out.print("����� �ݾ��Է�	: \n");
				int money = scanner.nextInt();
				
				boolean result = con.outmoney(id,banknum,pw,money);
				
				if(result) {
					System.out.println("�˸�)) "+money + "���� ���¿��� ��� �Ǿ����ϴ�");
				}
				else {
					System.out.println("��� ����");
				}
			}
			else if(ch.equals("4")) {
				System.out.println("���� ���))");
				System.out.print("���¹�ȣ\t�����ܾ�\t��������ݾ�\n");
				
				con.bankbooklsit(id);
			}
			else if(ch.equals("5")) {
				System.out.println("��ü))");
				System.out.print("���� ��ȣ �Է� 	: "); 
				int bname = scanner.nextInt();
				System.out.print("���� ��й�ȣ �Է� 	: "); 
				String pw = scanner.next();
				
				con.sendmoney(id,bname,pw);
			}
			else if(ch.equals("6")) {
				
				main.loanmenu();
			}
			else if(ch.equals("7")) {
				System.out.println("��й�ȣ ã��))");
				System.out.print("���¹�ȣ 	: \n"); 
				int bnum = scanner.nextInt();
				System.out.print("����ó 		: \n"); 
				String phone = scanner.next();
				
				con.findbankpw(id,bnum,phone);
			}
			else if(ch.equals("8")) {
				System.out.println("�α׾ƿ� �߽��ϴ�.");
				scanner.close();
				return;
			}
			else {
				System.out.println("�˸�)) �߸��� �Է��Դϴ�.");
			}
		}
	}
	
	void adminmenu() {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("------------------������ �޴�---------------");
			System.out.println("1.�����ǰ��� 2.�����ǰ���� 3.�α׾ƿ�");
			String ch = scanner.next();
			
			if(ch.equals("1")) {
				
			}
			else if(ch.equals("2")) {
				
			}
			else if(ch.equals("3")) {
				
			}
			else {
				System.out.println("�˸�)) �߸��� �Է��Դϴ�.");
			}
		} // while end
	}
	
	void loanmenu() {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("------------------ȸ�� �޴�---------------");
			System.out.println("1.�����ǰ��� 2.����Ȯ�� 3.�ڷΰ���");
			String ch = scanner.next();
			
			if(ch.equals("1")) {
				
			}
			else if(ch.equals("2")) {
				
			}
			else if(ch.equals("3")) {
				
			}
			else {
				System.out.println("�˸�)) �߸��� �Է��Դϴ�.");
			}
		}
	}
}
