package ���ΰ���._2_����������;

import java.util.Scanner;

public class ����������_����°_7��6�� {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int nowFloor = 1;
		String upBotton = "����";
		String downBotton = "�Ʒ���";
		
		while(true) {
			System.out.println("");
			System.out.println("���� ����" + nowFloor + "��");
			System.out.println("�������ϴ� ������ �������ּ���");
			System.out.println("�Է¿���) ����/1 �Ʒ���/2");
			String updown = scanner.next();
			if(updown.equals(upBotton) || updown.equals("1")) {
				System.out.println("���� ���� ���������͸� ȣ���߽��ϴ�.");
				System.out.println("���ϴ� ������ �Է��ϼ��� (����)");
				int floor = scanner.nextInt();
				
				if(nowFloor == floor) {
					System.out.println("���� ���̶� �����ϴ�.");
				}
				else {
					switch(floor) {
						case 1 : {
							System.out.println("1������ �̵��߽��ϴ�.");
							nowFloor = 1;
							break;
						}
						case 2 : {
							System.out.println("2������ �̵��߽��ϴ�.");
							nowFloor = 2;
							break;
						}
						case 3 : {
							System.out.println("3������ �̵��߽��ϴ�.");
							nowFloor = 3;
							break;
						}
						case 4 : {
							System.out.println("4������ �̵��߽��ϴ�.");
							nowFloor = 4;
							break;
						}
						case 5 : {
							System.out.println("5������ �̵��߽��ϴ�.");
							nowFloor = 5;
							break;
						}
					}
				}
			}
			else if(updown.equals(downBotton) || updown.equals("2")) {
				System.out.println("�Ʒ��� ���� ���������͸� ȣ���߽��ϴ�.");
				System.out.println("���ϴ� ������ �Է��ϼ��� (����)");
				int floor = scanner.nextInt();
				
				if(nowFloor == floor) {
					System.out.println("���� ���̶� �����ϴ�.");
				}
				else {
					switch(floor) {
						case 1 : {
							System.out.println("1������ �̵��߽��ϴ�.");
							nowFloor = 1;
							break;
						}
						case 2 : {
							System.out.println("2������ �̵��߽��ϴ�.");
							nowFloor = 2;
							break;
						}
						case 3 : {
							System.out.println("3������ �̵��߽��ϴ�.");
							nowFloor = 3;
							break;
						}
						case 4 : {
							System.out.println("4������ �̵��߽��ϴ�.");
							nowFloor = 4;
							break;
						}
						case 5 : {
							System.out.println("5������ �̵��߽��ϴ�.");
							nowFloor = 5;
							break;
						}
					}
				}

			}
			else {
				System.out.println("���� �����Դϴ�.");
			}
		}
	}

}
