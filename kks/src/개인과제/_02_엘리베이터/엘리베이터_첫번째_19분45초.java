package ���ΰ���._02_����������;

import java.util.Scanner;

public class ����������_ù��°_19��45�� {
	
	
	public static void main(String[] args) {
		/*
		 * ���������� ����
		 * 1. ���� ����5��
		 * 		1. �̿��ڱ���
		 * 			1. �ö��� ���������� ����
		 * 			2. ������ ���� 
		 * 			3. ����
		 * 			
		 */
		Scanner scanner = new Scanner(System.in);
		int nowFloor = 1;
		System.out.println("���������� ���α׷�");
		while(true) {
			
			System.out.println();
			System.out.println("���������͸� ȣ���մϴ�");
			System.out.println("���� �Ǵ� ������ �����ϼ���");
			System.out.println("�Է¿���) ����/1 �Ʒ���/2");
			System.out.println();
			
			String upDonw = scanner.next();
			
			if(upDonw.equals("����") || upDonw.equals("1")) {
				System.out.println("���������Ͱ� �����߽��ϴ�");
				System.out.println("�ö󰩴ϴ�");
				System.out.println("������ �����ּ���");
				
				int upFloor = scanner.nextInt();
				
				switch (upFloor) {
				case 1: {
					if(nowFloor == upFloor) {
						System.out.println("���������� �����ϴ�.");
						System.out.println();
						break;
					}
					else {
						System.out.println("1������ �̵��մϴ�");
						nowFloor = 1;
						System.out.println("���Ƚ��ϴ�.");
						break;
					}
				}
				case 2: {
					if(nowFloor == upFloor) {
						System.out.println("���������� �����ϴ�.");
					}
					else {
						System.out.println("2������ �̵��մϴ�");
						nowFloor = 2;
						System.out.println("���Ƚ��ϴ�.");
						break;
					}
				}
				case 3: {
					if(nowFloor == upFloor) {
						System.out.println("���������� �����ϴ�.");
						break;
					}
					else {
						System.out.println("3������ �̵��մϴ�");
						nowFloor = 3;
						System.out.println("���Ƚ��ϴ�.");
						break;
					}
				}
				case 4: {
					if(nowFloor == upFloor) {
						System.out.println("���������� �����ϴ�.");
						break;
					}
					else {
						System.out.println("4������ �̵��մϴ�");
						nowFloor = 4;
						System.out.println("���Ƚ��ϴ�.");
						break;
					}
				}
				case 5: {
					if(nowFloor == upFloor) {
						System.out.println("���������� �����ϴ�.");
						break;
					}
					else {
						System.out.println("5������ �̵��մϴ�");
						nowFloor = 5;
						System.out.println("���Ƚ��ϴ�.");
						break;
					}
				}
				default:
					System.out.println("�������� �ʴ� ���� �Դϴ�.");
					break;
				}//sw e
				
			}//if e
			else if(upDonw.equals("�Ʒ���") || upDonw.equals("2")) {
				System.out.println("���������Ͱ� �����߽��ϴ�");
				System.out.println("�������ϴ�");
				System.out.println("������ �����ּ���");
				
				int downFloor = scanner.nextInt();
				
				switch (downFloor) {
				case 1: {
					if(nowFloor == downFloor) {
						System.out.println("���������� �����ϴ�.");
						System.out.println();
						break;
					}
					else {
						System.out.println("1������ �̵��մϴ�");
						nowFloor = 1;
						System.out.println("���Ƚ��ϴ�.");
						break;
					}
				}
				case 2: {
					if(nowFloor == downFloor) {
						System.out.println("���������� �����ϴ�.");
					}
					else {
						System.out.println("2������ �̵��մϴ�");
						nowFloor = 2;
						System.out.println("���Ƚ��ϴ�.");
						break;
					}
				}
				case 3: {
					if(nowFloor == downFloor) {
						System.out.println("���������� �����ϴ�.");
						break;
					}
					else {
						System.out.println("3������ �̵��մϴ�");
						nowFloor = 3;
						System.out.println("���Ƚ��ϴ�.");
						break;
					}
				}
				case 4: {
					if(nowFloor == downFloor) {
						System.out.println("���������� �����ϴ�.");
						break;
					}
					else {
						System.out.println("4������ �̵��մϴ�");
						nowFloor = 4;
						System.out.println("���Ƚ��ϴ�.");
						break;
					}
				}
				case 5: {
					if(nowFloor == downFloor) {
						System.out.println("���������� �����ϴ�.");
						break;
					}
					else {
						System.out.println("5������ �̵��մϴ�");
						nowFloor = 5;
						System.out.println("���Ƚ��ϴ�.");
						break;
					}
				}
				default:
					System.out.println("�������� �ʴ� ���� �Դϴ�.");
					break;
				}//sw e
			}
		}//w e
	}// m e
}//c e
