package Day03;

import java.util.Scanner;

public class Day03_2 {

	public static void main(String[] args) {
		
		
		// �Է°�ü = { } �� 1�� ����
		Scanner scanner = new Scanner(System.in);
		
		
		//����1 : 2���� ������ �� ū���� ���
		System.out.println("���� �Է�");
		
		//�Է�
		int ����1 = scanner.nextInt();
			//int�� ���� ���� ���� �Է¹��� ���� ������ �����ͼ� ����
		int ����2 = scanner.nextInt();
		
		// ����
		if (����1 > ����2) { // ���࿡ �Է¹��� ���������� ����2 ���� ũ�� ���� �ƴϸ� ���� ����
			System.out.println(����1 + "�� " + ����2 +"���� Ů�ϴ�." );
		} else if (����1 < ����2) { //[��������] ����1 ������ ����2 �������� ������ ���� �ƴϸ� ��������
			System.out.println(����1 + "�� " + ����2 +"���� �۽��ϴ�.");
		} else {// ������ ����
			System.out.println(����1 + "�� " + ����2 +"�� �����ϴ�." );
		}

		
		//���� 2 ) 3������ ������ �Է¹޾Ƽ� ���� ū�� ���
		
		System.out.println("1�����Է�");int ����3 = scanner.nextInt();
		System.out.println("2�����Է�");int ����4 = scanner.nextInt();
		System.out.println("3�����Է�");int ����5 = scanner.nextInt();
		
		int max = ����3; //���� ū���� �����ϴ� �ӽ� ����
			//max�� ù��° �� �־��ֱ�
		/*
		if(max < ����4 ) {
			//���࿡ max���� ����4�� �� ũ�� ��ü
			int temp = ����4; //�ӽú��� [���ҿ�]
			����4 = max;
			max = temp;
		}
		*/ //�����ϴ¹�
		if(max < ����4) { max = ����4; }
		if(max < ����5) { max = ����5; }
		System.out.println("����ū����" + max);
		
		
		//����3 : 4�� ���ڸ� �Է¹޾� ���� ��� ���
		
		int ����6 = scanner.nextInt();
		int ����7 = scanner.nextInt();
		int ����8 = scanner.nextInt();
		int ����9 = scanner.nextInt();
		
		int max2 = ����6;
		
		if(max2 < ����7) { max = ����7;}
		if(max2 < ����8) { max = ����8;}
		if(max2 < ����9) { max = ����9;}
		System.out.println("����ū���� " + max2);
		
		//����4 : 3���� ������ �Է¹޾� ��������
		
		System.out.println("1�����Է�");int ����10 = scanner.nextInt();
		System.out.println("2�����Է�");int ����11 = scanner.nextInt();
		System.out.println("3�����Է�");int ����12 = scanner.nextInt();		
		
		//���� ����
		
		if (����10 > ����11) { // > : ��������  < : ��������
			//��ü [ ���� = �ΰ� ������ ������ ��ȯ ��� ]
			int temp = ����10; //�ӽú��� = ����1
			����10 = ����11;    // ����1 = ����2;
			����11 = temp;	 // ����1 = �ӽú���;
		}
		if( ����10 > ����12) {
			int temp = ����10;
			����10 = ����12;
			����12 = temp;
		}
		if( ����11 > ����12) {
			int temp = ����11; ����11 = ����12; ����12 = temp;
		}
		System.out.printf("�Է��� �� �������� : %d %d %d", ����10 ,����11, ����12);
		System.out.println("�Է��� �� ��������" + ����10 + ����11 + ����12);
		
		
		//����5 : 4���� ������ �Է¹޾� ��������
		
		System.out.println("����1 �Է�");int ����13 = scanner.nextInt();
		System.out.println("����2�Է�");int ����14 = scanner.nextInt();
		System.out.println("����3 �Է�");int ����15 = scanner.nextInt();
		System.out.println("����4 �Է�");int ����16 = scanner.nextInt();	
		
		//ù��° �� ��
		if(����13 < ����14) { int temp = ����13; ����13 = ����14; ����14 = temp;} //����13�� ����14���� ������ temp�� ����13�� �ְ� ����13�� ����14�� �ְ� ����14�� �ٽ� temp[����13]�� �ִ´�. 
		if(����13 < ����15) { int temp = ����13; ����13 = ����15; ����15 = temp;} //����13�� ����15���� ������ temp�� ����13�� �ְ� ����13�� ����15�� �ְ� ����15�� �ٽ� temp[����13]�� �ִ´�.
		if(����13 < ����16) { int temp = ����13; ����13 = ����16; ����16 = temp;}
		//�ι�° �� �������� ��
		if(����14 < ����15) { int temp = ����14; ����14 = ����15; ����15 = temp;}
		if(����14 < ����16) { int temp = ����14; ����14 = ����16; ����16 = temp;}
		//����° �� ������� ��
		if(����15 < ����16) { int temp = ����15; ����15 = ����16; ����16 = temp;}
		
		System.out.printf("�Է��� ���� ���� ���� %d %d %d %d" , ����13 , ����14, ����15, ����16);
		System.out.println("�Է��� ���� ���� ���� " + ����13 + ����14 + ����15 + ����16);
	}

}
