package ���ΰ���_9��°_��������;

import java.util.Scanner;

public class �ټ���° {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// 2���� �迭 ���� 100�࿡ 3��
		String[][] members = new String[100][3];
		String[][] books = new String[100][3];
		
		//���� �ݺ� - �������� ����
		while(true) {
			System.out.println("����)");
			System.out.println("1.ȸ������ 2.�α���");
			int ch = scanner.nextInt();
			
			if(ch == 1) { // �Է¹������� 1�� ���
				System.out.println("ȸ������)");
				System.out.println("ID:");
				String id= scanner.next();
				System.out.println("PW :");
				String pw = scanner.next();
				boolean pass = true;
				
				// �ɹ� �� ���̸�ŭ �����ϸ� �ɹ��� ����� ���̵�� �Է¹��� ���̵� ������ ���
				for(int i = 0; i < members.length;i++) {
					if(members[i][0] != null && members[i][0].equals(id)) {
						System.out.println("�̹� �����ϴ� ���̵� �Դϴ�.");
						pass = false;
						break;
					}
				}
				// �ɹ� �� ���� ��ŭ ���� �ݺ� �ϸ� �ɹ��� ��������� ����� ����
				if(pass) {
					for(int i = 0; i < members.length;i++) {
						if(members[i][0] == null) {
							members[i][0] = id;
							members[i][1] = pw;
							System.out.println("ȸ�������� �Ϸ� �Ǿ����ϴ�.");
							break;
						}
					}
				}
			}
			else if (ch == 2) {
				System.out.println("�α���");
				System.out.println("ID :");
				String id =scanner.next();
				System.out.println("PW :");
				String pw = scanner.next();
				int login = 0;
				// �ɹ� ���̸�ŭ �ݺ��ϸ� ����� �迭�� ���ΰ� ��й�ȣ�� ��ġ�Ұ�� �α��ο� 2�� ����
				for(int i = 0; i < members.length;i++) {
					if(members[i][0] != null && members[i][0].equals("admin") && members[i][1].equals(pw)){
						System.out.println("�����ڷ� �α��� �߽��ϴ�.");
						login = 2;
						break;
					}
					// �ɹ� ���̸�ŭ �ݺ��ϸ� ����� �迭�� ���̵�� ��й�ȣ�� ��ġ�Ұ�� �α��ο� 1�� ����
					else if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
						System.out.println(id+ "�� ȯ���մϴ�.");
						login = 1;
						break;
					}
				}
				//�޴� ���� ����
				int menu = 0;
				int admune = 0;
				
				//���� �ݺ� �������� �α׾ƿ�
				while(true) {
					//��� �޴� ���� �α��ο��� 2�� �޾��� ���
					if(login == 2) {
						System.out.println("������ �޴�");
						System.out.println("1��� 2��� 3���� 4�α׾���");
						int ch2 = scanner.nextInt();
						
						//�Է¹޾Ƽ� �� �޴��� �̵�
						if(ch2 == 1) {
							admune = 1;
						}
						else if (ch2 == 2) {
							admune = 2;
						}
						else if(ch2 == 3) {
							admune = 3;
						}
						else if(ch2 == 4) {
							admune =4;
						}
					}
					// �Ϲ�ȸ�� �޴� ���� �α��� ���� 1�� �޾��� ���
					else if(login == 1){
						System.out.println("�޴�");
						System.out.println("1�˻� 2��� 3�뿩 4�ݳ� 5�α׾ƿ�");
						int ch2 = scanner.nextInt();
						
						//�Է¹޾� �� �޴��� �̵�
						if(ch2 == 1) {
							menu = 1;
						}
						else if (ch2 == 2) {
							menu =  2;
						}
						else if(ch2 == 3) {
							menu = 3;
						}
						else if(ch2 == 4) {
							menu =4;
						}
						else if ( ch2 == 5) {
							menu =5;
						}
					}
					
					if(menu == 1) {
						//å�̸��� �Է¹޾� �� å�� ����� ���� 2�� ���� �뿩���ϰ�츦 Ȯ�� �Ͽ� �뿩 ���θ� �˷���
						System.out.println("�˻��� å�̸� �Է�");
						String name = scanner.next();
						for(int i =0 ; i <books.length ; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								if(books[i][2].equals("�뿩��")) {
									System.out.println("�Է��Ͻ� å�� ���� �뿩���Դϴ�.");
									break;
								}
								else {
									System.out.println("�Է��Ͻ� å�� �뿩 �����մϴ�.");
									break;
								}
							}
						}
					}
					//�迭���� ��ŭ �ݺ��Ͽ� ����� å�� ������ ��ϵ� å���Ǽ���ŭ ����� ������
					else if(menu == 2 || admune == 2) {
						System.out.println("����\t�뿩����\t�뿩��");
						for(int i =0 ; i <books.length ; i++) {
							if(books[i][0] != null) {
								System.out.printf("%s\t%s\t%s\n",books[i][0],books[i][1],books[i][2]);
							}
						}
					}
					//å�� �̸��� �Է¹޾� �� å�� �ڽ��� ���̵�� �뿩���θ� �뿩������ �ٲ���
					else if(menu == 3) {
						System.out.println("�뿩�� å�̸� �Է� : ");
						String name = scanner.next();
						for(int i =0 ; i <books.length ; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								System.out.println("�ش� å�� �뿩 �մϴ�.");
								books[i][1] = "�뿩��";
								books[i][2] = id;
								break;
							}
						}
					}
					// å�� �̸��� �Է� �޾� �� å�� �뿩���ο� ���̵� ��������� �ٲ� �뿩���θ� �����
					else if(menu == 4) {
						System.out.println("�ݳ��� å�̸� �Է� : ");
						String name = scanner.next();
						for(int i =0 ; i <books.length ; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								System.out.println("�ش� å�� �뿩 �մϴ�.");
								books[i][1] = "";
								books[i][2] = "";
								break;
							}
						}
					}
					//�극��ũ�� �ɾ ���� ����� �ݺ����� while�� Ż���Ŵ
					else if(menu == 5 || admune ==4) {
						System.out.println("�α׾ƿ� �߽��ϴ�.");
						break;
					}
					//�α��ΰ� ����ϰ� å�� ���
					else if(admune == 1) {
						System.out.println("����� å�̸� �Է� : ");
						String name = scanner.next();
						//�Է¹��� �̸��� �迭�ȿ� ����Ǿ��ִ��� �迭��ŭ �ݺ� �˻��Ͽ� ���� �Ұ�� �߰���
						for(int i =0 ; i <books.length ; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								System.out.println(" �̹� ��ϵ� å�Դϴ�.");
							}
						}
						// ���� ���� �ʴ� �ٸ� ������� ã�Ƽ� �̸��� �����ϰ� �뿩���ο� �뿩���� ����� ó����
						for(int i =0 ; i <books.length ; i++) {
							if(books[i][0] == null) {
								System.out.println("�ش� å�� ��� �մϴ�.");
								books[i][0] = name;
								books[i][1] = "";
								books[i][2] = "";
								break;
							}
						}
					}
					// �̸��� �Է¹޾� �� å�� ���� �Ұ�� �� �迭�� ��� ���鿡�� null���� �־� �� �迭�� �����
					else if(admune == 3) {
						System.out.println("������ å�̸� �Է� : ");
						String name = scanner.next();
						for(int i =0 ; i <books.length ; i++) {
							if(books[i][0] != null && books[i][0].equals(name)) {
								System.out.println("�ش� å�� ���� �մϴ�.");
								books[i][0] = null;
								books[i][1] = null;
								books[i][2] = null;
								break;
							}
						}

					}
				}
				
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}

}
