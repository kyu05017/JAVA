package Day01_to_Day21.Day05;

import java.util.Scanner;

public class Day05_2_�湮��_���� {// c s
	
	//ȸ���� �湮�� ���α׷�
		// 1. �ʱ�޴� [ 1. ȸ������ 2. �α��� ]
			//1. ȸ������ [ ���̵�, ��й�ȣ, �̸�]
			//2. �α��� [ ���̵�, ��й�ȣ �����ϸ� �α��� ó��]
		// 2. �α��ν� �޴� [ 1.�湮�� ����, 2. �α׾ƿ�]
			// 1. �湮�� ����[ 1.�湮�Ͼ��� , ���̵���
			// 2. �α׾ƿ� [ �ʱ�޴� ���ư���

	public static void main(String[] args) {// m s
		
		Scanner scanner = new Scanner(System.in);
		//�迭
		String[][] memberLsit = new String[100][3];
		// ȸ�� 100�� [id,pw,name] �����ϴ¹迭
		//100�� 3�� 1�� ȸ���� [1�� = id] [ 2�� = pw][3�� = name]
		
		String[][] boardList = new String[100][3]; 
		//�湮�� 100�� [title, contants, writer] //�����ϴ� �迭
		
		while(true) { //���ѷ��� �ݺ�����x //w s
			System.out.println("----------ȸ���� �湮��-----------");
			System.out.println("1.ȸ������                 2.�α���");
			System.out.println("------------------------------");
			
			int ch = scanner.nextInt();
			
			//ȸ������
			if(ch == 1) { // 1 if s
				System.out.println("------------ȸ������-------------");
				System.out.println("����� ���̵�  �Է� :");
				String id = scanner.next();
				System.out.println("����� ��й�ȣ �Է� :");
				String pw = scanner.next();
				System.out.println("�̸� �Է� : ");
				String name = scanner.next();
				//String 3���� ������ �Է¹޾� �ɹ�����Ʈ�� 2���� �迭�� ����
					//1. �����[���� = 0, �Ǽ� = 0.0 , ���ڿ� = null]�� ã�Ƽ� ���� [ ���࿡ ������� ������ ȸ������ �Ұ�]
					//2. ���̵� �ߺ�üũ
			
				
				//ȸ�� �ߺ�üũ
				boolean idCheck = true;//���̵� �ߺ�üũ
				for(int i = 0; i < memberLsit.length; i ++) {
					if(memberLsit[i][0] != null && memberLsit[i][0].equals(id)) {
						// ==null : ȸ���� ����. !=null : ȸ���� �����Ѵ�
						System.err.println("�˸�) �̹� �����ϴ� ȸ���Դϴ�.");
						idCheck = false;
						break;
					}
				}
				
				//ȸ�� �Ѱ�����
				if(idCheck == true) {
					for(int i = 0; i < memberLsit.length; i++) {
							if(memberLsit[i][0] == null) {
							//i ��° �࿡ id�� �����̸� ���尡�� 
							memberLsit[i][0] = id;
							memberLsit[i][1] = pw;
							memberLsit[i][2] = name;
							//i��° �� ���� ������ ����
							
							System.err.println("�˸�) ȸ������ �Ϸ�");
						
							break; // ������ �ƴٸ� ��
						}
					}
				}
			}
			//ȸ������ ����
			
			//�α���
			else if(ch == 2) {
				System.out.println("------------ �α��� -------------");
				System.out.println("���̵�  �Է� :");
				String id = scanner.next();
				System.out.println("��й�ȣ �Է� :");
				String pw = scanner.next();
				boolean loginCheck = false;
				
				//�迭���� �Է¹��� id�� pw�� �����ϸ� �α��� �Ϸ�
				for(int i = 0; i < memberLsit.length; i++) {//1 for s
					
					if(memberLsit[i][0] != null && 
						memberLsit[i][0].equals(id) && 
						memberLsit[i][1].equals(pw)) {
						//i��° �࿡ id�� pw�� �������
							//null�� .equals�� ���Ұ� [==] �񱳿����ڴ� ���� 
						
						System.err.println("�˸�) �α��� ����");
						loginCheck = true;
						System.out.println();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						while(true) {
							
							System.out.println("----------ȸ���� �湮��-----------");
							System.out.println("��ȣ\t�ۼ���\t����\t����");
								//��� ���� ���
							for(int j = 0; j < boardList.length; j++) {
								
								if(boardList[j][0] != null) {
									
									System.out.printf("%d\t%s\t%s\t%s \n",
														j,
														boardList[j][2],
														boardList[j][0],
														boardList[j][1]);
								}
							}
							
							System.out.println("1.�湮��                 2.�α׾ƿ�");
							System.out.println("------------------------------");
							int ch2 = scanner.nextInt();
							if(ch2 == 1) {
								System.out.println("----------�۾���-----------");
								System.out.println("���� :");String title = scanner.next();
								System.out.println("���� :");String contents = scanner.next();
								//������ ã�ư��� ����
								for(int j = 0;j < boardList.length; j++) {
									if(boardList[j][0] == null) {
										boardList[j][0] = title;
										boardList[j][1] = contents;
										boardList[j][2] = id;//�α��ν� ���� ���̵� �̿�
										System.out.println("�˸�) ������ �Ϸ�Ǿ����ϴ�.");
										break;
									}
								}
							}
							else if(ch2 == 2) {
								System.err.println("�α׾ƿ��� �Ϸ�Ǿ����ϴ�.");
								break;
							}
							else {System.err.println("�˸�) �߸��� �Է��Դϴ�.");}
						}
						
					}
				}//1 for e
			
				if(loginCheck == false)System.out.println("�˸�) �α��ο� �����߽��ϴ�.");
			}//�α��� ��
			else {System.err.println("�˸�) �߸��� �Է��Դϴ�.");}//1 if ��
		}//w e
	}//m e
}//c e