package ���ΰ���._5_����������;

import java.util.Random; 	//���� ��ü ����Ʈ
import java.util.Scanner;	//�Է� ��ü ����Ʈ

public class ������° {// ���� Ŭ����
	public static void main(String[] args) {//���� �޼ҵ�
		//�Է°���ü ����
		Scanner scanner = new Scanner(System.in);
		//������ü ����
		Random random = new Random();
		
		//���� �غ�
		int player;		//�÷��̾� �Է�
		int com;		//��ǻ�� ����
		int game = 0;	//����Ƚ�� ���� �ϰ� 0���� �ʱ�ȭ
		int pw =0;		//pw �÷��̾�¸� Ƚ��
		int cw =0;		//cw ��ǻ�� �¸� Ƚ��
		
		while(true) {//���ѹݺ��� �������� ����
			System.out.println("��������������))");
			System.out.println("0)���� 1)���� 2)�� 3)���� �װ��");
			System.out.print("�Է� :");
			player = scanner.nextInt();		//�÷��̾� �Է¹ޱ�
			com = random.nextInt(3);		//��ǻ�� 3������ ��������
			
			if(player == 3) {// 3�� �Է�������� ����� ��� ǥ��
				System.out.println("���Ӱ��))");
				System.out.println("�� ���� Ƚ�� : " + game);
				if(pw > cw) {//�÷��̾���� ��ǻ�� �º��� ������
					System.out.println("�÷��̾� �¸� �̱�Ƚ�� :" +pw);
				}
				else if (pw < cw) {//�÷��̾� ���� ��ǻ�� ���� ������
					System.out.println("��ǻ�� �¸� �̱�Ƚ�� : "+ cw);
				}
				else {//�׿ܴ� ���º�ǥ��
					System.out.println("���º� �Դϴ�");
				}
				break;
			}
			else if(player >= 0 && player <= 2) {//�÷��̾ �Է��ϴ¼��� 0���� ���ų� ũ�� 2���� ���ų� ������
				//�÷��̾ﰡ 0�̸鼭 ��ǻ�ʹ�1 �̰ų� �÷��̾ 1�̸鼭 ��ǻ�ʹ� 0 �̰ų� �÷��̾ 2�̸鼭 ��ǻ�Ͱ� 0�϶�
				if(player == 0 && com == 1 || player == 1 && com == 0 || player == 2 && com == 0 ) {
					System.out.println("�÷��̾� �¸�");
					pw++;//�÷��̾� �¸��� �߰�����
				}
				//�÷��̾ �Է��Ѽ��� ��ǻ�Ͱ� �Էµ� ���� ������� ���º�
				else if(player ==0 && com ==0 || player == 1 && com == 1 || player == 2 && com == 2) {
					System.out.println("���º� �Դϴ�/");
				}
				else {//�׿ܶ�� ��ǻ�� �¸�
					System.out.println("��ǻ�� �¸�");
					cw++;//��ǻ�� �¸��� �߰�����
				}
				game++;//����Ƚ�� �߰�
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
}
