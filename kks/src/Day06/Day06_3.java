package Day06;

import java.util.Random;
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
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣ ã�� 5.����");
			System.out.println("------------------------------------------");
			int work1 = scanner.nextInt();
			
			
			if(work1 == 1) {//if_1_1 s [ ȸ������ ]

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
				
				// * ���̵� �ߺ�üũ
					// 1. �迭�� ��ü�� �Է��� ���̵�� ������ ���̵� ã��
				
				for(Member temp :memberList) {
					if(temp != null && temp.id.equals(id2)) {
						System.err.println("�˸�)) �̹� ������� ���̵� �Դϴ�.");
						idCheck = false;
					}
				}
				 
				// 4. ������ ��ü�� �����ϴ� �迭�� ����
					// 1. ���� �ε��� ã�� [ ������ �ƴϸ� ���� ȸ�� ����]
				int i = 0; // �ε��� ��ġ ����
				for(Member temp :memberList){
					// * memberlsit �迭�� member ��ü �ϳ��� �����ͼ� temp ���� �ݺ�
					// 2. ���鿡 �ε����� ��ü ����
					if(idCheck == true && temp == null) { // ���࿡ �ش� ��ü�� �����̸�
						memberList[i] = member;
						System.err.println("�˸�)) ȸ�������� �Ϸ�Ǿ����ϴ�.");
						idCheck = true;
						break;
					}
					i++;
				}
				
			}//if_1_1 e [ ȸ������ ]
			else if(work1 == 2) {//if_1_2 s [ �α��� ]
				
				// 1. �Է��� �޴´�
				System.out.println("------------ �α��� -------------");
				System.out.println("���̵�  �Է� :");
				String loginId2 = scanner.next();
				System.out.println("��й�ȣ �Է� :");
				String loginPw2 = scanner.next();
				byte loginCheck = 0;
				
				// 2. �����迭 [ȸ������Ʈ] �� �Է¹��� ���� ��
				int i = 0;
				for(Member temp : memberList) {
					if(temp != null && temp.id.equals(loginId2) && temp.password.equals(loginPw2)) {
						System.err.println("�˸�)) �α����� �Ϸ� �Ǿ����ϴ�.");
						loginCheck = 1;
						break;
					}
					i++;
				}
				int j = 0;
				for(Member temp : memberList) {
					if(temp != null && temp.id.equals(loginId2)) {
						loginCheck = 2;
						break;
					}
					j++;
				}
				int h = 0;
				for(Member temp : memberList) {
					if(temp != null && temp.password.equals(loginPw2)) {
						loginCheck = 3;
						break;
					}
					h++;
				}
				
				// 3. �α��� ���� ����
				if(loginCheck == 0) {
					System.out.println();
					System.err.println("�˸�)) �������� ���� ȸ���Դϴ�.");
				}
				else if(loginCheck == 2) {
					System.out.println();
					System.err.println("�˸�)) ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
				else if(loginCheck == 3) {
					System.out.println();
					System.err.println("�˸�)) ���̵𰡰� Ʋ�Ƚ��ϴ�.");
				}
				else if(loginCheck == 1) { // �湮�� ����
					
					while(true) {
						System.out.println("----------------ȸ���� �湮��-----------------");
						
						
						System.out.println("------------------ �޴� --------------------");
						System.out.println(" [1.�湮���ۼ�][2.�湮�ϼ���][3.�湮�ϻ���][4.�α׾ƿ�]");
						System.out.println("------------------------------------------");
						
						int work2 = scanner.nextInt();
						
						if (work2 == 1) {//�湮�� �ۼ�
							
							
							
						}//�湮�� �ۼ�
						else if (work2 == 2) {//�湮�� ����
							
							
							
						}// �湮�� ����
						else if (work2 == 3) { // �湮�� ����
							
							
							
						}// �湮�� ����
						else if (work2 == 4) { //�α׾ƿ�
							System.out.println("�˸�)) �α׾ƿ� �ϼ̽��ϴ�. ���θ޴��� ���ư��ϴ�.");
							loginCheck = 0;
							break;
						}//�α׾ƿ�
					}
				}// �湮�� ��
				
			}//if_1_2 e [ �α��� ]
			else if(work1 == 3) {//if_1_3 s [ ���̵� ã�� ]
				
				// 1. �̸��� ����ó�� �Է¹޴´�.
				System.out.println("------------ ���̵� ã�� -------------");
				System.out.println("�̸�  �Է� :");
				String findname1 = scanner.next();
				System.out.println("��ȭ��ȣ �Է� :");
				String faidphone1 = scanner.next();
				byte findCheck1 = 0;
				
				// 2. �����迭 [ȸ������Ʈ] �� �Է¹��� ���� ��
				int i = 0;
				for(Member temp : memberList) {
					if(temp != null && temp.name.equals(findname1) && (temp.phone.equals(faidphone1))) {
						System.err.println("�˸�)) �����Ͻ� ���̵�� ID :" + temp.id);
						findCheck1 = 2;
						break;
					}
					else if(temp != null && temp.name.equals(findname1)) {
						System.err.println("�˸�)) ��ȭ��ȣ�� �߸��Ǿ����ϴ�");
						findCheck1 = 2;
						break;
					}
					else if(temp != null && temp.phone.equals(faidphone1)) {
						System.err.println("�˸�)) ���̵��� �߸��Ǿ����ϴ�.");
						findCheck1 = 2;
						break;
					}
					else {
						findCheck1 = 0;
					}
					i++;
				}
				if (findCheck1 == 0) {
					System.err.println("�˸�)) �˼����� �����");
				}
				
			}//if_1_3 e [ ���̵� ã�� ]
			else if(work1 == 4) {//if_1_4 s [ ��й�ȣ ã�� ]
				
				System.out.println("------------ ��к�ȣ ã�� -------------");
				System.out.println("���̵�  �Է� :");
				String findname2 = scanner.next();
				System.out.println("��ȭ��ȣ �Է� :");
				String faidphone2 = scanner.next();
				byte findCheck2 = 0;
				Random random = new Random();
				
				// 2. �����迭 [ȸ������Ʈ] �� �Է¹��� ���� ��
				int i = 0;
				for(Member temp : memberList) {
					if(temp != null && temp.id.equals(findname2) && temp.phone.equals(faidphone2)) {
						System.err.println("�˸�)) �����Ͻ� ��й�ȣ�� PassWord :" + temp.password);
						findCheck2 = 2;
						break;
					}
					else if(temp != null && temp.phone.equals(faidphone2)) {
						System.err.println("�˸�)) ���Ե� �̸��� �����ϴ�.");
						findCheck2 = 2;
						break;
					}
					else if(temp != null && temp.id.equals(findname2)) {
						System.err.println("�˸�)) ��ȭ��ȣ�� �߸��Ǿ����ϴ�.");
						findCheck2 = 2;
						break;
					}
					else{
						findCheck2 = 0;
					}
					i++;
				}
				if (findCheck2 == 0) {
					System.err.println("�˸�)) �˼����� �����");
				}
				
			}//if_1_4 e [ ��й�ȣ ã�� ]
			else if(work1 == 6) {//if_1_5 s [Ż�� ]

				System.out.println("------------ȸ��Ż��-------------");
				System.out.println("Ż���� ���̵�  �Է� :");
				String outId = scanner.next();
				System.out.println("��й�ȣ �Է� :");
				String outPw = scanner.next();
				byte idcheck = 0;
				
				int i = 0;
				for(Member temp : memberList) {
					if(temp != null && temp.id.equals(outId) && temp.password.equals(outPw)) {
						System.err.println("�˸�))"+outId+"�� Ż�� �Ϸ�Ǿ����ϴ�.");
						idcheck = 0;
						temp.id = null;
						temp.password = null;
						temp.name = null;
						temp.phone = null;
						break;
					}
					if(temp != null && temp.password.equals(outPw)) {
						System.err.println("�˸�)) ��й�ȣ�� �߸��ƽ��ϴ�.");
						idcheck = 0;
						break;
					}
					if(temp != null && temp.id.equals(outId)) {
						System.err.println("�˸�)) ���̵� �߸��ƽ��ϴ�.");
						idcheck = 0;
						break;
					}
					else {
						idcheck = 2;
					}
					i++;
				}
				if (idcheck == 2) {
					System.err.println("�˸�)) �˼����� �����");
				}
				
			}//Ż��
			else if(work1 == 5) {//if_1_5 s [����]
				System.err.println("���α׷��� �����մϴ�");
				break;
			}//if_1_5 e [ ���� ��]
			else {//if_1 e
				System.out.println("------------------------------------------");
				System.err.println("�˸�)) �������� �ʴ� �޴� �Դϴ�.");
				System.out.println("------------------------------------------");
			}//if_1 e
		}//w e
	}//m e
}//c e
