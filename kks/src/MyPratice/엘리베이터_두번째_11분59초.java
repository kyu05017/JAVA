package MyPratice;

import java.util.Scanner;

public class ����������_�ι�°_11��59�� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nowFlooer = 1;
		String upBottn = "����";
		String downBottn = "�Ʒ���";
		
		System.out.println("���������� ���α׷�");
		while(true) {
			System.out.println();
			System.out.println("���� ���� " + nowFlooer + "��");
			System.out.println("���������͸� ȣ�� �մϴ�.");
			System.out.println("�ö��� �������� ���մϴ�.");
			System.out.println("�Է¿���) 1/���� 2/�Ʒ���");
			
			String upDown = scanner.next();
			
			if(upDown.equals(upBottn) || upDown.equals("1")) {
				System.out.println("���������Ͱ� �����߽��ϴ�.");
				System.out.println("������ �ϴ� ������ �Է��ϼ��� (���� �Է�)");
				
				int floor = scanner.nextInt();
				
				switch (floor) {
				case 1: {
					if(nowFlooer == floor) {
						System.out.println("���������� �����ϴ�");
						break;
					}
					else {
						System.out.println("1������ �̵��մϴ�.");
						nowFlooer = 1;
						break;
					}
					
				}
				case 2 : {
					if(nowFlooer == floor) {
						System.out.println("���������� �����ϴ�");
						break;
					}
					else {
						System.out.println("2������ �̵��մϴ�.");
						nowFlooer = 2;
						break;
					}
					
				}
				case 3 : {
					if(nowFlooer == floor) {
						System.out.println("���������� �����ϴ�");
						break;
					}
					else {
						System.out.println("3������ �̵��մϴ�.");
						nowFlooer = 3;
						break;
					}
					
				}
				case 4 : {
					if(nowFlooer == floor) {
						System.out.println("���������� �����ϴ�");
						break;
					}
					else {
						System.out.println("4������ �̵��մϴ�.");
						nowFlooer = 4;
						break;
					}
					
				}
				case 5 : {
					if(nowFlooer == floor) {
						System.out.println("���������� �����ϴ�");
						break;
					}
					else {
						System.out.println("5������ �̵��մϴ�.");
						break;
					}
					
				}
				default:
					
				}	
			}
			else if(upDown.equals(downBottn) || upDown.equals("2")) {
				System.out.println("���������Ͱ� �����߽��ϴ�.");
				System.out.println("������ �ϴ� ������ �Է��ϼ��� (���� �Է�)");
				
				int floor = scanner.nextInt();
				
				switch (floor) {
				case 1: {
					if(nowFlooer == floor) {
						System.out.println("���������� �����ϴ�");
						break;
					}
					else {
						System.out.println("1������ �̵��մϴ�.");
						nowFlooer = 1;
						break;
					}
					
				}
				case 2 : {
					if(nowFlooer == floor) {
						System.out.println("���������� �����ϴ�");
						break;
					}
					else {
						System.out.println("2������ �̵��մϴ�.");
						nowFlooer = 2;
						break;
					}
					
				}
				case 3 : {
					if(nowFlooer == floor) {
						System.out.println("���������� �����ϴ�");
						break;
					}
					else {
						System.out.println("3������ �̵��մϴ�.");
						nowFlooer = 3;
						break;
					}
					
				}
				case 4 : {
					if(nowFlooer == floor) {
						System.out.println("���������� �����ϴ�");
						break;
					}
					else {
						System.out.println("4������ �̵��մϴ�.");
						nowFlooer = 4;
						break;
					}
					
				}
				case 5 : {
					if(nowFlooer == floor) {
						System.out.println("���������� �����ϴ�");
						break;
					}
					else {
						System.out.println("5������ �̵��մϴ�.");
						break;
					}
					
				}
				default:
					
				}	
			}
			else {
				System.out.println("�������� �ʴ� ����Դϴ�.");
			}
		}
	}
}
