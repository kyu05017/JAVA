package Day01_to_Day21.Day04;

import java.util.Scanner;

public class Day04_2 {//c s

	public static void main(String[] args) {//m s
		
		//1. �޴��� [ 1.�ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.���� ]
			//1.�޴��ǿ��� ��ǰ�� �����ϸ� ��ٱ��Ͽ� �ֱ�
			//2.���� �����ϸ� �˸�(�������)
		//2. �ʱ� ��� [ ��ǰ �� 10���� ]
		//3. ������ �ݾ��� �Է¹޾� ������ ��ŭ ������ �ܵ� ���
			//1. ������ �ݾ׺��� ���ž��� �� ũ�� ���� ��� [ ���� �����ϸ� ]
			//2.
		
		//���뺯�� [ ��� ��ȣ ������ ����ϴ� ����
		Scanner scanner = new Scanner(System.in); //1.�Է°�ü
		
		int cokeNum = 10; int whanNum = 10; int ciderNum = 10;//2.�ݶ����
		int buyCoke = 0; int buyWhan = 0; int buyCider =0;//3.��ٱ���
		
		
		
		// ���α׷� ���� [���ѷ���] - ���� ���� ����
		while(true) {
		System.out.println("-------------------�޴�-----------------");
		System.out.println("1.�ݶ�(300) 2.ȯŸ(200)  3.���̴�(100) 4.����");
		System.out.println(">>>>>>>>>>>���� : ");int choice = scanner.nextInt();
		
		if ( choice == 1 ) { //�ݶ󱸸�
			if(cokeNum == 0) {//�ݶ���� 0 �̸� ���� �Ұ�
				System.out.println();
				System.err.println("�˸�) �ݶ���� �����ϴ�.");
				System.out.println();
			}else{//�ݶ� ��� ������ ���Ű���
				System.out.println();
				System.err.println("[�ݶ� ��ٱ��Ͽ� ��ҽ��ϴ�]");
				buyCoke++;
				cokeNum--;
			}
		}//�ݶ󱸸ų�
		else if ( choice == 2) { //ȯŸ ����
			if(whanNum == 0) {
				System.out.println();
				System.err.println("�˸�) ȯŸ��� �����ϴ�.");
				System.out.println();
			}
			else {
				System.out.println();
				System.err.println("[ȯŸ�� ��ٱ��Ͽ� ��ҽ��ϴ�]");
				buyWhan++;
				whanNum--;
			}
		}//ȯŸ���ų�
		else if ( choice == 3) { //���̴� ����
			if(ciderNum == 0) {
				System.out.println();
				System.err.println("�˸�) ���̴���� �����ϴ�.");
				System.out.println();
			}
			else {
				System.out.println();
				System.err.println("[���̴ٸ� ��ٱ��Ͽ� ��ҽ��ϴ�]");
				buyCider++;
				ciderNum--;
			}			
		}//���̴ٱ��ų�
		else if ( choice == 4) {//����
			if(buyCoke == 0 && buyWhan == 0 && buyCider == 0) {
				System.out.println();
				System.err.println("�˸�) �����Ͻ� ��ǰ�� �����ϴ�.");
				System.out.println();
			}
			else {
				
				System.out.println("���� ��ǰ���");
				System.out.println("��ǰ��\t����\t�ݾ�");
				if(buyCoke != 0) System.out.println("�ݶ�\t"+buyCoke+"\t" +(buyCoke*300));
				if(buyWhan != 0) System.out.println("ȯŸ\t"+buyWhan+"\t" +(buyWhan*200));
				if(buyCider != 0) System.out.println("���̵�\t"+buyCider+"\t" +(buyCider*100));
				int total = (buyCoke*300)+(buyWhan*200)+(buyCider*100);
				System.out.println("�� ���� �ݾ��� "+ total+"�� �Դϴ�.");
				System.out.println("1.���� 2.���");
				int choice2 = scanner.nextInt();
				if( choice2 == 1) {//����
					//1. �ݾ� �Է¹޴´�
					//2. �ݾ��� �����׺��� ������ ���� �Ұ� -> �ݾ� ���Է�
					//3. �ݾ��� �����׺��� ������ ���� ���� -> ��ٱ��� �ʱ�ȭ
					while(true) { //���� ��Ǫ�� ������ ������ �ݾ��� �����׺��� ũ��)
						System.out.println("������ �ݾ��� �Է��ϼ���");
						System.out.println("�Է� : ");
						int myMoney = scanner.nextInt();
						if (myMoney >= total) {
							int change = myMoney - total;
							System.err.println("������ �Ϸ� �Ǿ����ϴ�. �����մϴ�. �Ž����� : "+change+"�� �Դϴ�.");
							buyCoke = 0; buyWhan = 0; buyCider = 0;	//���ż� �ʱ�ȭ
							break; // while Ż��  break �������� ���� ����� �ݺ��� Ż��
						}
						else if (myMoney < total) {
							System.err.println("�ݾ��� �����Ͽ� ������ �����߽��ϴ� �ٽ� �Է����ּ���");
						}
					}
				}
				else if (choice == 2) {//���
					System.err.println("�˸�) ���Ÿ��� ��� �����");
					cokeNum+=buyCoke; whanNum+=whanNum; ciderNum +=buyCider;	//��� �ʱ�ȭ
					buyCoke = 0; buyWhan = 0; buyCider = 0;						//���ż� �ʱ�ȭ
				}
				
			}
		}//������
		else if(choice == 5) {
			System.out.println("��� Ȯ��");
			System.out.println("���� ���");
			System.out.println("�ݶ� :" +cokeNum);
			System.out.println("ȯŸ :" +whanNum);
			System.out.println("���̴�:" +ciderNum);
		}
		else if(choice == 6) {
			System.out.println("��� �ʱ�ȭ");
			cokeNum = 10;
			whanNum = 10;
			ciderNum= 10;
			System.out.println("���� ���");
			System.out.println("�ݶ� :" +cokeNum);
			System.out.println("ȯŸ :" +whanNum);
			System.out.println("���̴�:" +ciderNum);
		}
		else {//�׿� ���ڴ� ����
			System.err.println("����) ����Ҽ� ���� ����Դϴ�"); //�ý��� ������ ���������� ���
		}//������
		}
		
		

	}//m e

}//c e
