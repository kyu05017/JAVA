package ���ΰ���_11��°_ȸ�������α׷�_Ŭ�����ʵ�;

import java.util.Scanner;

public class ���ΰ���_11��°_ȸ�������α׷�_Ŭ�����ʵ� {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Member[] memberlsit = new Member[100];
		
		
		
		while(true) {
			try {
				System.out.println("----------------ȸ���� �湮��-----------------");
				System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣ ã�� 5.����");
				System.out.println("------------------------------------------");
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
					boolean pass = true;
					
					Member mem = new Member();
					
					mem.id = id;
					mem.password = pw;
					mem.name = name;
					mem.phone = phone;
					
					for(Member temp : memberlsit) {
						if(temp != null && temp.id.equals(id)) {
							System.out.println("�޼���)) ���� ������� ���̵� �Դϴ�.");
							pass = false;
						}
					}
					
					for(int i = 0; i <memberlsit.length; i++ ) {
						if(memberlsit[i] == null) {
							memberlsit[i] = mem;
							break;
						}
					}
				}
				else if(ch == 2) {
					System.out.println("�α���))");
					System.out.println("ID : ");
					String id = scanner.next();
					System.out.println("PW : ");
					String pw = scanner.next();
					boolean pass = false;
					
					for(int i = 0; i <memberlsit.length; i++) {
						if(memberlsit[i] != null && memberlsit[i].id.equals(id) && memberlsit[i].password.equals(pw)) {
							System.out.printf("�α����� �Ϸ� �Ǿ����ϴ�. %s�� ȯ���մϴ�.\n",memberlsit[i].id);
							pass = true;
						}
					}
					if(pass == false) {
						System.out.println("�޼���)) �α��ο� �����߽��ϴ�.");
					}
					
					else if(pass) {
						while(true) {//ȸ���޴�
							
							
						}
					}
				}
				else if(ch == 3) {
					System.out.println("���̵� ã��))");
					System.out.println("Name : ");
					String name = scanner.next();
					System.out.println("Phone");
					String phone = scanner.next();
					boolean pass = false;
					
					for(int i = 0; i<memberlsit.length; i++) {
						if(memberlsit[i] != null && memberlsit[i].name.equals(name) && memberlsit[i].phone.equals(phone)){
							System.out.printf("ȸ������ ���̵�� : %s �Դϴ�.\n",memberlsit[i].id);
							pass = true;
						}
					}
					if(pass == false) {
						System.out.println("�޼���)) ���̵� ã���� �����ϴ�.");
					}
					
				}
				else if(ch == 4) {
					System.out.println("��й�ȣ ã��))");
					System.out.println("ID : ");
					String id = scanner.next();
					System.out.println("Phone");
					String phone = scanner.next();
					boolean pass = false;
					
					for(int i = 0; i<memberlsit.length; i++) {
						if(memberlsit[i] != null && memberlsit[i].id.equals(id) && memberlsit[i].phone.equals(phone)){
							System.out.printf("ȸ������ ���̵�� : %s �Դϴ�.\n",memberlsit[i].password);
							pass = true;
						}
					}
					if(pass == false) {
						System.out.println("�޼���)) ��й�ȣ�� ã���� �����ϴ�.");
					}
					
				}
				else if(ch == 5) {
					System.out.println("�޼���))���α׷��� �����մϴ�.");
					break;
				}
				else {
					System.out.println("�޼���))�������� �ʴ� �޴� �Դϴ�.");
				}
			}
			catch(Exception e) {
				System.out.println("�޼���)) ���ڸ� �Է� �����մϴ�.");
				scanner = new Scanner(System.in);
			}
		}
		
	}
	
}
