package ���ΰ���_11��°_ȸ�������α׷�_Ŭ�����ʵ�;

import java.util.Scanner;

public class �ι�° {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Member[] memberlist = new Member[100];		
		
		while(true) {
			try {
				System.out.println("ȸ���� �α���))");
				System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã�� 5.����");
				int ch = scanner.nextInt();
				
				
				if(ch == 1) {
					System.out.println("ȸ������))");
					System.out.println("ID : ");
					String id= scanner.next();
					System.out.println("PW : ");
					String pw = scanner.next();
					System.out.println("Name : ");
					String name = scanner.next();
					System.out.println("Phone : ");
					String phone = scanner.next();
					boolean pass = true;
					
					for(int i = 0; i < memberlist.length; i++) {
						if(memberlist[i] != null && memberlist[i].id.equals(id)) {
							System.out.println("�̹� �����ϴ� ���̵� �Դϴ�.");
							pass = false;
						}
					}
					if(pass) {
						Member mem = new Member();
						
						mem.id = id;
						mem.password = pw;
						mem.name = name;
						mem.phone = phone;
						
						for(Member temp : memberlist) {
							if(temp != null && temp.id.equals(id)) {
								System.out.println("�޼���)) ���� ������� ���̵� �Դϴ�.");
								pass = false;
							}
						}
						
						for(int i = 0; i <memberlist.length; i++ ) {
							if(memberlist[i] == null) {
								memberlist[i] = mem;
								break;
							}
						}
					}
				}
				else if(ch == 2) {
					System.out.println("�α��� ������))");
					System.out.println("ID : ");
					String id= scanner.next();
					System.out.println("PW : ");
					String pw = scanner.next();
					boolean pass = false;
					
					for(int i = 0; i <memberlist.length;i++) {
						if(memberlist[i] != null && memberlist[i].id.equals(id) && memberlist[i].password.equals(pw)) {
							System.out.println("�α����� �Ϸ� �Ǿ����ϴ�.");
							pass = true;
							break;
						}
					}
					if(pass == false) {
						System.out.println("�α��ο� ���� �߽��ϴ�.");
					}
				}
				else if(ch == 3) {
					System.out.println("���̵�ã��))");
					System.out.println("Name : ");
					String name= scanner.next();
					System.out.println("Phone : ");
					String Phone = scanner.next();
					
					for(int i = 0; i < memberlist.length; i++) {
						if(memberlist[i] != null && memberlist[i].name.equals(name) && memberlist[i].phone.equals(Phone)) {
							System.out.println("ȸ������ ���̵�� " + memberlist[i].id+ "�Դϴ�.");

						}
					}
				}
				else if(ch == 4) {
					System.out.println("��й�ȣã��))");
					System.out.println("ID : ");
					String id= scanner.next();
					System.out.println("Phone : ");
					String Phone = scanner.next();
					
					for(int i = 0; i < memberlist.length; i++) {
						if(memberlist[i] != null && memberlist[i].id.equals(id) && memberlist[i].phone.equals(Phone)) {
							System.out.println("ȸ������ ���̵�� " + memberlist[i].password+ "�Դϴ�.");

						}
					}
				}
				else if(ch == 5) {
					System.out.println("���α׷��� ���� �մϴ�.");
					break;
				}
				
			}
			catch(Exception e) {
				System.out.println(e);
				scanner = new Scanner(System.in);
			}
			
		}
	}
}

