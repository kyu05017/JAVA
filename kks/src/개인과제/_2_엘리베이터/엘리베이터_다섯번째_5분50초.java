package ���ΰ���._2_����������;

import java.util.Scanner;

public class ����������_�ټ���°_5��50�� {

	public static void main(String[] args) {
		//�Է°�ü
		Scanner scanner = new Scanner(System.in);
		//���������� ������ 1�� �ʱ�ȭ
		int nowFloor = 1;
		
		//���� �ݺ��� ����� ����
		while(true) {
			System.out.println();
			System.out.println("����������");
			//while���� �ݺ����� ���Թ��� nowfloor�� ���������� ��Ÿ��
			System.out.println("��������" + nowFloor +"��");
			
			//���ϴ� ������ �Է¹���
			int floor = scanner.nextInt();
			
			//�Է¹����� ���ǿ� �����ؾ� �������� �̵�
			while(true) {
				System.out.println("���ϴ� ������ �Է��ϼ��� (�����Է�)");
				//�Է��� ������ ���������� ���ٸ� �ٽ� �Է��ϰԳ���
				if(floor == nowFloor) {
					System.out.println("���� ���� �Դϴ�.");
				}
				//�Է��� ������ ������������ ũ�ٸ� �����ϰ� ����ġ�� �̵�
				else if(floor > nowFloor) {
					System.out.println("���� ���ϴ�");
					break;
				}
				//�Է��� ������ ������������ �۴ٸ� �����ϰ� ����ġ�� �̵�
				else if(floor < nowFloor){
					System.out.println("�Ʒ��� ���ϴ�.");
					break;
				}
				else { // ���� ��ȣ�� ��� �ٽ��Է��� ����
					System.out.println("�߸��� �Է��Դϴ�.");
				}
			}
			//������ �����ϱ� ���� ����ġ��
			switch(floor) {
				case 1 : {//1���� ��� nowfloor�� 1�� �����ϰ� ����
					System.out.println("1������ �̵��մϴ�");
					nowFloor = 1;
					break;
				}
				case 2 : {//2���� ��� nowfloor�� 2�� �����ϰ� ����
					System.out.println("2������ �̵��մϴ�");
					nowFloor = 2;
					break;
				}
				case 3 : {// 3���� ��� nowfloor�� 3�� �����ϰ� ����
					System.out.println("3������ �̵��մϴ�.");
					nowFloor = 3;
					break;
				}
				case 4 : {//4���� ��� nowfloor�� 4�� �����ϰ� ����
					System.out.println("4������ �̵��մϴ�.");
					nowFloor = 4;
					break;
				}
				case 5 : {//5���� ��� nowfloor�� 5�� �����ϰ� ����
					System.out.println("5������ �̵��մϴ�.");
					nowFloor = 5;
					break; 
				}
				default : {
					System.out.println("�������� �ʴ� ���� �Դϴ�.");
					break; 
				}
			
			}
		}
	}

}
