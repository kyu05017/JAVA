package Day02;

import java.util.Scanner;

public class Day02_3 {

	public static void main(String[] args) {
		
		//���� 1 : �޿����
		/*
		 * [�Է�����]
		 * 		�⺻�� , ����
		 * [ ����  ]
		 *  	�Ǽ��ɾ� = �⺻�� + ���� - ����[10%]
		 * [�������]
		 * 		�Ǽ��ɾ�
		 * */
		
		// 1. �Է� -> ���� -> ���
		//1. �Է� ��ü�� �����.
		Scanner scanner = new Scanner(System.in);
		
		//2. �Է¹��� ���� ������ �����Ѵ�. [�Է°�ü�� �Է¹����� ���� �����]
		System.out.println("�⺻�� �Է� : "); int �⺻�� = scanner.nextInt();
		System.out.println("���� �Է� : ");  int ����   = scanner.nextInt();
					//�Է°�ü��.nextInt : int ������ ��������
					//�Է°�ü��.next : ���ڿ� ������ ��������
		//3. ������ ����(���) �Ѵ�.	
		int ���� = (int)(�⺻��*0.1);
		int �Ǽ��ɾ� = �⺻�� + ���� - ����;
		//����Ѵ�/
		System.out.println("�Ǽ��ɾ���" + �Ǽ��ɾ� + "��");
		
		/* ���� �Է��Ѱ�
		System.out.println("�⺻�� �Է�");
		int money = scanner.nextInt();
		System.out.println("���� �Է�");
		int plusMoney = scanner.nextInt();
		double total = (money + plusMoney) - 0.1 ;
		System.out.println("�Ǽ��ɾ� " + total+"�� �Դϴ�.");
		*/
	
				

		
		//���� 2 : ���� ����
		/*
		 * [�Է�����]
		 * 		�ݾ�
		 * [  ���� ]
		 * 		�ʸ��� ���� ��� ������ ���� ����
		 * [�������]
		 * 		��) 356789 �Է½�
		 * 		�ʸ��� 3��
		 * 		���� 5��
		 * 		õ�� 6��
		 * 		��� 7��
		 * */
		
		System.out.println("����� �ݾ� �Է�");
		int myMoney = scanner.nextInt();
		int m1 = (int)(myMoney/100000);
		int m2 = (myMoney%100000)/10000;
		int m3 = (myMoney%10000)/1000;
		int m4 = (myMoney%1000)/100;
		
		System.out.println("�ʸ���" + m1);
		System.out.println("����" + m2);
		System.out.println("õ��" + m3);
		System.out.println("���" + m4);
	}

}
