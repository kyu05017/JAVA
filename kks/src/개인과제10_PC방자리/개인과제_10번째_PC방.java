package ���ΰ���10_PC���ڸ�;

import java.util.Scanner;

public class ���ΰ���_10��°_PC�� {

	public static void main(String[] args) {
	/*
	 * 	 ���ΰ��� [PC�� �ڸ� ����]
	 * 		1.���θ޴�
	 * 			1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
	 * 		2.�Ϲݸ޴� [ �Էµ� �ð��� ������. ( �д���)
	 * 			1.�ð��߰� 2.�ڸ����� 3.�ڸ��̵� 4.�α׾ƿ�
	 * 		3.�����ڸ޴�
	 * 			1.ȸ�������α׾ƿ� 2.ȸ�����Եȸ�� 3.ȸ���ð����� 4.�α׾ƿ�
	 * 
	 */	Scanner scanner = new Scanner(System.in);
		try {
			//pc�� �ڸ��� ǥ����
			String[] PC = {"[ī����]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]"};
			//�ɹ��� �ɹ��� ������ ������ 2���� �迭
			String[][] members = new String[100][7];
			
			//���ѹݺ� - �������� ����
			while(true) {
				System.out.println("-------------------------------------------------");
				System.out.println("�����ڸ�))");
				//���� �ڸ��� ������
				for(int i = 0; i < PC.length; i++) {
					System.out.print(PC[i]);
					//0�� �����ϰ� 5�� ���� �ٹٲ�
					if(i%5==0)System.out.println();
				}
				System.out.println();
				System.out.println("�ڹ� PC��))");
				System.out.println("1)ȸ������ 2)�α��� 3)���̵�ã�� 4)��й�ȣã��");
				System.out.println("-------------------------------------------------");
				int ch = scanner.nextInt();
				if(ch == 1) {//1���� ��� ȸ������
					boolean pass = true;
					String id = null;
					while(true) { // ���ѹݺ� - ������ ���̵� ���ٸ� Ż��
						System.out.println("ȸ������))");
						System.out.print("ID : \n");
						id = scanner.next();//���̵� �Է¹����� �˻��ؼ� ������ ���̵� ������� ���Է� ����
						for(int i = 0; i < members.length;i++) {
							if(members[i][0] != null && members[i][0].equals(id)) {
								System.out.println("�޼���)) �̹� �����ϴ� ���̵� �Դϴ�.");
								pass = false;
								break;
							}
							else {
								pass = true;
							}
						}
						if(pass)break;//������ ���̵� �������� Ż��
					}
					System.out.print("PW : \n");
					String pw = scanner.next();
					System.out.print("Name : \n");
					String name = scanner.next();
					System.out.print("Phone : \n");
					String phone = scanner.next();
					if(pass) {
						for(int i = 0; i < members.length;i++) {
							if(members[i][0] == null) {
								members[i][0] = id;			//���̵�
								members[i][1] = pw;			//��й�ȣ
								members[i][2] = name;		//�̸�
								members[i][3] = phone;		//�ڵ�����ȣ
								members[i][4] = "0";		//�����ð�
								members[i][5] = null;		//�ڸ���ȣ
								members[i][6] = "��������";	//���ӿ���
								System.out.println("�޼���)) �̹� �����ϴ� ���̵� �Դϴ�.");
								break;
							}
						}
					}
				}
				else if(ch == 2) {
					System.out.println("�α���))");
					System.out.print("ID : \n");
					String id = scanner.next();
					System.out.print("PW : \n");
					String pw = scanner.next();
					int login = 0;
					
					for(int i = 0; i < members.length; i++) {//�迭�� �˻��ؼ�
						//�Է¹��� ���̵� admin�̸� �α��ο� 100�� ��
						if(members[i][0] != null && id.equals("admin") && members[i][1].equals(pw)) {
							System.out.println("�޼���)) �����ڷ� �α����ϼ˽��ϴ�.");
							login = 100;
							break;
						}
						//�Է¹��� ���̵�� ��й�ȣ�� �����ϸ� �α��� ������ 1�� �ְ� �޼����� ���
						if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
							System.out.println("�޼���)) ã���ּż� �ݰ����ϴ�. "+id+"�� �ܿ��ð� : "+ members[i][5]+"��");
							login = 1;
							break;
						}
					}
					
					if(login == 100) {//��ڷα���
						while(true) {
							System.out.println("-------------------------------------------------");
							System.out.println("���� �ڸ�))");
							//����� �ڸ��迭�� ������
							for(int i = 0; i < PC.length; i++) {
								System.out.print(PC[i]);
								if(i%5==0)System.out.println();
								//0�� �����ϰ� 5������ �ٹٲ�
							}
							System.out.println("������ �޴�))");
							System.out.println("1)ȸ�� ���� �α׾ƿ� 2)���Ե� ȸ�� ��� 3)ȸ�� �ð� ���� 4)�α׾ƿ�");
							int ch3 = scanner.nextInt();
							if(ch3 == 1) {
								System.out.println("ȸ�� �α׾ƿ�))");
								System.out.println("�α׾ƿ� ��ų ID");
								String id2 = scanner.next();
								for(int i = 0;i<members.length;i++) {
									//�Է¹��� ���̵� �¶��� �̶�� ������������ ���� ��ȯ��!
									if(members[i][0] != null && !(members[i][0].equals("admin")) && 
											members[i][0].equals(id2) && members[i][6].equals("�¶���")) {
										//����� �ڸ���ȣ�� ���������� �����ͼ�
										int myseat = Integer.parseInt(members[i][5]);
										//������ �迭 �ε����� �̿��ؼ� �� �ڸ��� [o]�� �ִٸ�
										if(PC[myseat].equals("[o]")) {
											//��������� �ٲ��ְ�
											PC[myseat]="[ ]";
										}
										//ȸ���� ������ �ٲ���
										members[i][5] = "";
										members[i][6] = "��������";
									}
								}
							}
							else if(ch3 == 2) {//�������� ȸ������ ������� ������
								System.out.print("��ȣ\t���̵�\t�����ð�\t���ӿ���\t�̿��ڸ�\n");
								for(int i = 0;i<members.length;i++) {
									if(members[i][0] != null && !(members[i][0].equals("admin"))) {
										System.out.printf("%s\t%s\t%s��\t%s\t%s\n",i,members[i][0],members[i][4],members[i][6],members[i][5]);
									}
								}
							}
							else if(ch3 == 3) {
								System.out.println("ȸ�� �ð�����))");
								System.out.println("�ð������� ID");
								String id2 = scanner.next();
								System.out.println("������ �ð� : ");
								int extime = scanner.nextInt();
								for(int i = 0;i<members.length;i++) {
									if(members[i][0] != null && !(members[i][0].equals("admin")) && 
											members[i][0].equals(id2) && members[i][6].equals("�¶���")) {
										//�Է��� ������ �����ϱ����� ���ڿ��� �ٲ㼭 �迭�� ������
										String str_time = String.valueOf(extime);
										members[i][4] = str_time;
									}
								}
							}
							else if(ch3 == 4) {
								System.out.println("�޼���) �α׾ƿ� �߽��ϴ�.");
								break;
							}
							else {
								System.out.println("�������� �ʴ� �޴� �Դϴ�.");
							}
						}
					}
					else if(login == 1) {
						while(true) {
							System.out.println("-------------------------------------------------");
							System.out.println("���� �ڸ�))");
							for(int i = 0; i < PC.length; i++) {
								System.out.print(PC[i]);
								if(i%5==0)System.out.println();
							}
							System.out.println("�޴�))");
							System.out.println("1)�ð��߰� 2)�ڸ����� 3)�ڸ��̵� 4)�α׾ƿ� 5)���θ޴�(��ǻ������x)");
							int ch3 = scanner.nextInt();
							if(ch3 == 1) {
								System.out.println("�ð� �߰�))");
								System.out.println("1)1�ð�(60��) 2)2�ð�(120��) 3)5�ð�(300��) 4)�ð��Է�(��)");
								int ch4 = scanner.nextInt();
								if(ch4 == 1) {
									for(int i = 0;i<members.length;i++) {
										if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
											// ����� �ð��� �����ͼ� �������� ������
											int time = Integer.parseInt(members[i][4]);
											// �������� ��ȯ�� �ð��� �޴���ŭ�� �ð��� �߰���
											time += 60;
											//�߰��� �������� �ٽ� ���ڿ��� ������
											String str_time = String.valueOf(time);
											// �迭�� ����
											members[i][4] = str_time;
											System.out.println("�޼���)) 60���� �߰� �ϼ̽��ϴ�.");
										}
									}
								}
								else if(ch4 == 2) {
									for(int i = 0;i<members.length;i++) {
										if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
											// ����� �ð��� �����ͼ� �������� ������
											int time = Integer.parseInt(members[i][4]);
											// �������� ��ȯ�� �ð��� �޴���ŭ�� �ð��� �߰���
											time += 120;
											String str_time = String.valueOf(time);
											//�߰��� �������� �ٽ� ���ڿ��� ������
											members[i][4] = str_time;
											// �迭�� ����
											System.out.println("�޼���)) 120���� �߰� �ϼ̽��ϴ�.");
										}
									}
								}
								else if(ch4 == 3) {
									for(int i = 0;i<members.length;i++) {
										if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
											// ����� �ð��� �����ͼ� �������� ������
											int time = Integer.parseInt(members[i][4]);
											// �������� ��ȯ�� �ð��� �޴���ŭ�� �ð��� �߰���
											time += 300;
											//�߰��� �������� �ٽ� ���ڿ��� ������
											String str_time = String.valueOf(time);
											// �迭�� ����
											members[i][4] = str_time;
											System.out.println("�޼���)) 300���� �߰� �ϼ̽��ϴ�.");
										}
									}
								}
								else if(ch4 == 4) {
									System.out.print("���ϴ� �ð� �Է� : \t");
									int time = scanner.nextInt();
									for(int i = 0;i<members.length;i++) {
										if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
											// ����� �ð��� �����ͼ� �������� ������
											int mytime = Integer.parseInt(members[i][4]);
											// �������� ��ȯ�� �ð��� �Է��� ��ŭ�� �ð��� �߰���
											mytime += time;
											//�߰��� �������� �ٽ� ���ڿ��� ������
											String str_time = String.valueOf(time);
											// �迭�� ����
											members[i][4] = str_time;
											System.out.println("�޼���)) "+time+"���� �߰� �ϼ̽��ϴ�.");
										}
									}
								}
								else {
									System.out.println("�޼���)) �������� �ʴ� �ɼ��Դϴ�.");
								}
							}
							else if(ch3 == 2) {
								System.out.print("�ڸ����� : \n");
								int seat = scanner.nextInt();
								//0���� ī���� �ڸ�
								if(seat == 0) {
									System.out.println("�������� �ʴ� �ڸ� �Դϴ�.");
								}
								//�Է��� �ڸ��� ������̶�� [o]�� �־ ������� Ȯ�ν�����
								else if(PC[seat].equals("[ ]")) {
									PC[seat]="[o]";
								}
								else {//�׿ܶ�� �޼����� ���
									System.out.println("�޼���)) ������� �ڸ� �Դϴ�.");
								}
								//�Է¹��� ������ ���ڿ��� ������
								String str_seat = String.valueOf(seat);
								//�迭�� �ڸ����ڿ� "�¶���" �̶�� ���ӻ��¸� �ٲ���
								for(int i = 0; i <members.length; i++) {
									if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
										members[i][5] = str_seat;
										members[i][6] = "�¶���";
									}
								}
							}
							else if(ch3 == 3) {
								System.out.print("�ڸ��̵� : \n");
								int newseat = scanner.nextInt();
								//0���� ī���� �ڸ�
								if(newseat == 0) {
									System.out.println("�޼���)) �������� �ʴ� �ڸ� �Դϴ�.");
								}
								//�Է��� �ڸ��� ������̶�� [o]�� �־ ������� Ȯ�ν�����
								else if(PC[newseat].equals("[ ]")) {
									PC[newseat]="[o]";
								}
								else {//�׿ܶ�� �޼����� ���
									System.out.println("�޼���)) ������� �ڸ� �Դϴ�.");
								}
								//���ο� �ڸ��� ������ �Ǿ��� ������ �迭�� �����ϱ����� ���ڿ��� �ٲ�
								String str_seat = String.valueOf(newseat);
								for(int i = 0; i <members.length; i++) {
									if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
										//����Ǿ��ִ� �ڸ��� ���ڿ��� �ٽ� ���������� �ٲ��� 
										int myseat = Integer.parseInt(members[i][5]);
										//��ȯ�ؿ� ������ �迭 �ε����� ����
										// �� �ڸ��� [o]��� �����
										if(PC[myseat].equals("[o]")) {
											PC[myseat]="[ ]";
										}
										//���ο� �ڸ��� �迭�� ������
										members[i][5] = str_seat;
									}
								}
							}
							else if(ch3 == 4) {
								System.out.println("�޼���) ������ �����߽��ϴ�.");
								for(int i = 0; i <members.length; i++) {
									if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
										//����� pc�� �ڸ��� ���������� �������
										int myseat = Integer.parseInt(members[i][5]);
										//�ڸ� �迭�� �ε����� �̿��ؼ� ���� �� �ڸ��� [o]��� �����
										if(PC[myseat].equals("[o]")) {
											PC[myseat]="[ ]";
										}
										//�̿����� �ƴϱ⶧���� �����
										members[i][5] = "";
										//�������� �ƴ϶�� �迭�� ������
										members[i][6] = "��������";
									}
								}
								break;
							}
							else if(ch3 == 5) {
								System.out.println("�޼���) �α׾ƿ� �߽��ϴ�.");
								break;
							}
							else {
								System.out.println("�������� �ʴ� �޴� �Դϴ�.");
							}
						}
					}
				}
				else if(ch == 3) {
					System.out.println("���̵� ã��))");
					System.out.print("Name : \n");
					String name = scanner.next();
					System.out.print("Phone : \n");
					String phone = scanner.next();
					for(int i = 0; i < members.length;i++) {
						//�迭�� ����� �̸��� �ڵ��� ��ȣ�� �����ϴٸ� ���̵� �����
						if(members[i][0] != null && members[i][2].equals(name) && members[i][3].equals(phone)) {
							System.out.println("�޼���)) ȸ������ ���̵�� "+members[i][0]+ "�Դϴ�.");
							break;
						}
						else {
							System.out.println("�޼���)) �������� �ʴ� ȸ���Դϴ�.");
							break;
						}
					}
				}
				else if(ch == 4) {
					System.out.println("��й�ȣ ã��))");
					System.out.print("ID : \n");
					String id = scanner.next();
					System.out.print("Phone : \n");
					String phone = scanner.next();
					// �Էµ� ���̵�� �ڵ��� ��ȣ�� �����ϴٸ�
					for(int i = 0; i < members.length;i++) {
						if(members[i][0] != null && members[i][0].equals(id) && members[i][3].equals(phone)) {
							//����� ��й�ȣ�� �ҷ��ְ�
							System.out.println("�޼���)) ȸ������ ��й�ȣ�� "+members[i][1]+ "�Դϴ�.");
							System.out.println("1)���� 2)�ڷΰ���");
							int ch2 = scanner.nextInt();
							
							if(ch2 == 1) {//�����ϱ�
								System.out.println("��й�ȣ ����))");
								System.out.print("PW : \n");
								String newPW = scanner.next();
								//���� �Է¹޾� �� ��� �����迭�� ������
								members[i][1] = newPW;
								System.out.println("�޼���)) ��й�ȣ ������ �Ϸ� �Ǿ����ϴ�.");
								break;
							}
							else if(ch2 == 2) {//�ڷΰ���
								System.out.println("�޼���)) ���� �޴��� ���ư��ϴ�.");
								break;
							}
							else {
								System.out.println("�޼���)) �������� �ʴ� �޴� �Դϴ�.");
							}
						}
						else {
							System.out.println("�޼���)) �������� �ʴ� ȸ���Դϴ�.");
							break;
						}
					}
					
				}
				else {
					System.out.println("�������� �ʴ� �޴� �Դϴ�.");
				}
				
				
			}
		}
		catch(Exception e) {// ���ܰ� �߻��Ѵٸ� ��� ���ܸ� ��� �޼����� ���� �ٽ� �Է��ϰ� ��
			System.out.println("�޼���) ���� �������� ����");
			scanner = new Scanner(System.in);
		}
	}

}
