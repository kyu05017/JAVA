package ���ΰ���11_ȸ�������α׷�_Ŭ�����ʵ�;

import java.util.Scanner;

public class �ټ���° {
	public static void main(String[] args) {
		
		// �Է� ��ü
		Scanner scanner= new Scanner(System.in);
		// Ŭ������ �迭�� ���� �Ѱ�� 100��
		Member[] memberlist = new Member[100];
		
		while(true) {//���� �ݺ�
			try {//����ó��
				System.out.println("�α��� �ý���");
				System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 3.��й�ȣã��");
				int ch = scanner.nextInt();
				
				if(ch == 1) {
					System.out.println("ȸ������)");
					System.out.println("���̵� :");
					String id = scanner.next();
					System.out.println("��й�ȣ :");
					String pw = scanner.next();
					System.out.println("�̸� : ");
					String name = scanner.next();
					System.out.println("��ȭ��ȣ : ");
					String phone = scanner.next();
					Boolean pass = true;
					
					//Ŭ������ ��üȭ ���� �ʵ带 �ҷ���
					Member mem = new Member();
					
					mem.id = id;		//Ŭ������ ���̵� �ʵ忡 �Է¹��� ���̵� ����
					mem.password = pw;	//Ŭ������ ��й�ȣ �ʵ忡 �Է¹��� ��й�ȣ ����
					mem.name = name;	//Ŭ������ �̸� �ʵ忡 �Է¹��� �̸� ����
					mem.phone = phone;	//Ŭ������ ��ȭ��ȣ �ʵ忡 �Է¹��� ��ȭ��ȣ�� ����
					
					//�ߺ�Ȯ��
					for(Member temp : memberlist) {
						if(temp != null && temp.id.equals(id)) {
							System.out.println("�̹� �����ϴ� ���̵� �Դϴ�.");
							pass = false;
						}
					}
					//boolean ���� ���̶�� �迭�� ������� ã�� ��üȭ ��Ų �迭�� ����
					if(pass) {
						for(int i = 0; i < memberlist.length; i++) {
							if(memberlist[i] == null) {
								memberlist[i] =mem;
								System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
								break;
							}
						}
					}
				}
				else if(ch == 2) {
					System.out.println("�α��� ������");
					System.out.println("���̵� :");
					String id = scanner.next();
					System.out.println("��й�ȣ :");
					String pw = scanner.next();
					boolean pass = false;
					//�迭�� �ݺ������� ������ ������� �ƴϸ� �Է¹��� ���̵�� �ʵ��� ���̵� ���� ��й�ȣ���� ������ �α��ΰ��� ��
					for(int i = 0; i <memberlist.length; i++) {
						if(memberlist[i] != null && memberlist[i].id.equals(id) && memberlist[i].password.equals(pw)) {
							System.out.println("�α����� �Ϸ� �Ǿ����ϴ�.");
							pass = true;
						}
					}
					//���� �α����� ������� ���� false ���� �����ȴٸ� ���� �޼����� �Ǿ���
					if(pass == false) {
						System.out.println("�α��ο� ���� �߽��ϴ�.");
					}
				}
				else if(ch == 3) {
					System.out.println("���̵� ã��");
					System.out.println("�̸� :");
					String name = scanner.next();
					System.out.println("��ȭ��ȣ :");
					String phone = scanner.next();
					
					//�迭�� �ݺ������� ã�� ������� �ƴϰ� �̸��� ��ȭ��ȣ�� �Է¹޾� �迭 �ʵ� �ȿ� ����Ȱ��̶� �����ϴٸ� ���̵� ������
					for(int i = 0; i <memberlist.length; i++) {
						if(memberlist[i] != null && memberlist[i].name.equals(name) && memberlist[i].phone.equals(phone)) {
							System.out.println("ȸ������ ���̵�� "+ memberlist[i].id + "�Դϴ�.");

						}
						else {//�ƴ϶�� �߸��Ǿ��ٰ� �˷���
							System.out.println("�������� �ʴ� ȸ���Դϴ�.");
						}
					}
					
				}
				else if(ch == 4) {
					System.out.println("��й�ȣ ã��");
					System.out.println("���̵� :");
					String id = scanner.next();
					System.out.println("��ȭ��ȣ :");
					String phone = scanner.next();
					//�Է¹��� ���̵�� ��ȭ��ȣ�� ����� ���� �����ϴٸ� ������� ������
					for(int i = 0; i <memberlist.length; i++) {
						if(memberlist[i] != null && memberlist[i].id.equals(id) && memberlist[i].phone.equals(phone)) {
							System.out.println("ȸ������ ��й�ȣ�� "+ memberlist[i].password + "�Դϴ�.");

						}
						else { // �ƴ϶�� ����ִ� �޼���
							System.out.println("�������� �ʴ� ȸ���Դϴ�.");
						}
					}
				}
				else { // �߸��� �޴��� �Է��������
					System.out.println("�������� �ʴ� �޴� �Դϴ�.");
				}
			}
			catch(Exception e) { // ������ �Է��� �޴� �޴��� ���� �Ǵ� ���ڸ� �Է�������� ����ó���� ���α׷��� ������ �ʰ� ����
				System.out.println(e);
				scanner = new Scanner(System.in);
			}
		}
	}
}