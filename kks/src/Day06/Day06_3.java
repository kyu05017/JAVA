package Day06;

import java.util.Scanner;

public class Day06_3 {
	public static void main(String[] args) {
		
		// ȸ���� �湮�� [ Ŭ���� ����]
		
			// 0. ȸ�� ���� => ȸ�� Ŭ���� �����
				// 1. �ʵ�
					// 1. ���̵� 2.��й�ȣ 3.�̸� 4.��ȭ��ȣ
			// 1. �ʱ�޴� [ 1. ȸ������	2.�α��� 3.���̵�ã�� 4.��й�ȣã��]
				// 1. ȸ�����Խ� �Է¹޾� ����
				// 2. �α��ν� ���̵�� ��й�ȣ�� �����ϸ� �α��� ó��
				// 3. ���̵�ã��� �̸��� ��ȭ���ΰ� �����ϸ� ���̵� ���
				// 4. ���̵�� ��ȭ��ȣ�� �����ϸ� ����ȣ ȣ��
		
		//�ڹٿ��� �޸𸮸� ����ϴ� ���
		// 1. ���� : �޸� 1�� �Ҵ�
				//int ������ = ��
		// 2.�迭 : ������ ���̸�ŭ �Ҵ� 
				//int[] ������ = new int[100];
		// 3.��ü : ����ü �� ��,�� �ʵ常ŭ �޸� �Ҵ�
				//Ŭ���� ������� �޸� �Ҵ�
				//Ŭ���� 
					//���δٸ� �޸� ����
					//������(ũ��)�� �޶� ��
		//
		Scanner scanner = new Scanner(System.in);
		Member[] memberList = new Member[100];
		
		
		while(true) { // ���α׷� ���� ���ѷ��� [ �������� 5�� ]
			System.out.println("----------------ȸ���� �湮��-----------------");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣ ã��5.����");
			System.out.println("------------------------------------------");
			int work1 = scanner.nextInt();
			
			
			if(work1 == 1) {//if_1_1 s

				// 1, id, password, name, phone �Է¹ޱ� => ����4��
				System.out.println("------------ȸ������-------------");
				System.out.println("����� ���̵�  �Է� :");
				String id2 = scanner.next();
				System.out.println("����� ��й�ȣ �Է� :");
				String pw2 = scanner.next();
				System.out.println("�̸� �Է� : ");
				String name2 = scanner.next();
				System.out.println("��ȭ��ȣ �Է�(\"-\" ����) : ");
				String phone2 = scanner.next();
				boolean idCheck = true;
				
				// 2. ��ü ����
				Member member = new Member();
				// 3. �Է¹��� ���� 4���� ��ü�� �ʵ忡 ����
				member.id = id2;
				member.password = pw2;
				member.name = name2;
				member.phone = phone2;
				
				//�ߺ�Ȯ��
				/*
				for(Member temp :memberList) {
					if(temp != null && id2.equals(memberList[temp])) {
						System.err.println("�˸�)) �̹� �����ϴ� ȸ���Դϴ�.");
						idCheck = false;
					}
				}
				*/
				
				// 4. ������ ��ü�� �����ϴ� �迭�� ����
					// 1. ���� �ε��� ã�� [ ������ �ƴϸ� ���� ȸ�� ����]
				int i = 0; // �ε��� ��ġ ����
				for(Member temp :memberList){
					// * memberlsit �迭�� member ��ü �ϳ��� �����ͼ� temp ���� �ݺ�
					// 2. ���鿡 �ε����� ��ü ����
					if(idCheck == true && temp == null) { // ���࿡ �ش� ��ü�� �����̸�
						memberList[i] = member;
						System.err.println("�˸�)) ȸ�������� �Ϸ�Ǿ����ϴ�.");
						break;
					}
					i++;
				}
				
			}//if_1_1 e
			else if(work1 == 2) {//if_1_2 s
				
				System.out.println("------------ �α��� -------------");
				System.out.println("���̵�  �Է� :");
				String id2 = scanner.next();
				System.out.println("��й�ȣ �Է� :");
				String pw2 = scanner.next();
				
				boolean loginCheck = false;
				
				
			}//if_1_2 e
			else if(work1 == 3) {//if_1_3 s
				
			}//if_1_3 e
			else if(work1 == 4) {//if_1_4 s
				
			}//if_1_4 e
			else if(work1 == 5) {//if_1_5 s
				System.err.println("���α׷��� �����մϴ�");
				break;
			}//if_1_5 e
			else {//if_1 e
				System.out.println("------------------------------------------");
				System.err.println("�˸�)) �������� �ʴ� �޴� �Դϴ�.");
				System.out.println("------------------------------------------");
			}//if_1 e
		}//w e
	}//m e
}//c e
