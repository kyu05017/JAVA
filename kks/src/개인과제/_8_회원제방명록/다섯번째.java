package ���ΰ���._8_ȸ��������;

import java.util.Scanner;

public class �ټ���° {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// ȸ���� �Խ����� 2���� �迭�� ���� 100���� ��� 3���� ��
		String[][] members = new String[100][3];
		String[][] boards = new String[100][3];
		
		//���� �ݺ�
		while(true) {// ���� ���� ����
			System.out.println("ȸ���� �湮��))");
			System.out.println("1)ȸ������ 2)�α���");
			// �Է¹���
			int ch = scanner.nextInt();
			// 1�ϰ�� ȸ������
			if(ch == 1) {
				//������� ������ �Է¹���
				System.out.println("ȸ������ ������))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW :");
				String pw = scanner.next();
				System.out.println("Name : ");
				String name = scanner.next();
				//���� �༭ �����Ŵ
				boolean pass = true;
				
				//�ɹ����̸�ŭ�� ���� �ɹ��迭�� �����Ͽ� ��� �˻��� ���̵�� 0���̶� �����ϸ� pass�� false �� ��ȯ
				for(int i = 0; i < members.length; i++) {
					if(members[i] != null && members[i][0].equals(id)) {
						System.out.println("�̹� �����ϴ� ȸ�� ");
						pass = false;
					}
				}
				// pass�� ���̸� �Է¹��� ������ �迭 i ���� 0 �� ���̵� 1�� ��й�ȣ 2�� �̸��� ���� �׸��� �ݺ��� Ż��
				if(pass) {
					for(int i =0; i < members.length;i++) {
						if(members[i] == null) {
							members[i][0]= id;
							members[i][1]=pw;
							members[i][2]=name;
							System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
							break;
						}
					}
				}
			}
			//2�� ��� �α�������
			else if(ch == 2) {
				//����ڿ��� ������ �޾ƿ�
				System.out.println("�α��� ������))");
				System.out.println("ID : ");
				String id = scanner.next();
				System.out.println("PW :");
				String pw = scanner.next();
				boolean pass2 = false;
				
				//����ڿ��� �Է¹��� ������ ����� ������ ���ٸ� ���� �༭ �������� ���� ��Ŵ
				for(int i =0 ; i < members.length; i++) {
					if(members[i] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
						System.out.println("�α����� �Ϸ�Ǿ����ϴ�.");
						pass2 = true;
						
						if(pass2) {// ���ϰ�� ����
							while(true) {//���� �ݺ� �������� �α׾ƿ�
								System.out.println("����");
								System.out.println("��ȣ\t�ۼ���\t����\t����");
								//������ ���̸�ŭ �˻��ؼ� ������� �ƴ϶�� ���
								for(int j =0 ; j < boards.length;j++) {
									if(boards[j] != null) {
										System.out.printf("%d\t%s\t%s\t%s",j,members[j][2],members[j][0],members[j][1]);
									}
								}
								System.out.println("1)�����ۼ� 2)�α׾ƿ�");
								int ch2 = scanner.nextInt();
								//�Է¹��� ���� 1���̸� ����
								if(ch2 == 1) {
									//����ڿ��� ������ �Է¹���
									System.out.println("�湮�� �ۼ�))");
									System.out.println("���� :");
									String title = scanner.next();
									System.out.println("���� : ");
									String cont = scanner.next();
									
									//�Է¹��� ������ j�� �迭���̼� ��ŭ �˻��ؼ� ������� �ִٸ�
									// 0�� ������ ���� 1�� ������ ���� 2�������� ������� ���̵� �����ͼ� �����ϰ� �ݺ��� Ż�� 
									for(int j = 0; j < boards.length; j++) {
										if(boards[j] == null) {
											boards[j][0] = title;
											boards[j][1] = cont;
											boards[j][2] =id;
											
											System.out.println("���� �ۼ��� �Ϸ�Ǿ����ϴ�.");
											break;
										}
									}
								}
								else if (ch2 == 2) {//�Է¹��� ���� 2���̸� �α׾ƿ����� �ݺ��� Ż��
									System.out.println("�α׾ƿ��մϴ�. ���θ޴��� ���ư��ϴ�.");
									break;
								}
								else {//�ٸ� ������ �ԷµǸ� ����
									System.out.println("�������� �ʴ� �޴� �Դϴ�.");
								}
							}
						}
					}
				}
				
			}
			else {//�ٸ� ������ �ԷµǸ� ����
				System.out.println("�߸��� �޴� �����Դϴ�.");
			}
		}
	}
}