package ���ΰ���01_1_����������;

import java.util.Scanner;

public class ����������_�׹�°_5��44�� {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int nowFloor = 1;
		
		while(true) {
			System.out.println();
			System.out.println("���� ����" + nowFloor + "��");
			System.out.println("����������");
			System.out.println("���ϴ� ������ �Է��ϼ���.");
			
			int floor = scanner.nextInt();
			
			if(floor ==nowFloor) {
				System.out.println("���������Դϴ�");
			}
			else {
				switch(floor) {
					case 1 : {
						System.out.println("1������ �̵��մϴ�.");
						nowFloor = 1;
						break;
					}
					case 2 : {
						System.out.println("2������ �̵��մϴ�.");
						nowFloor = 2;
						break;
					}
					case 3 : {
						System.out.println("3������ �̵��մϴ�.");
						nowFloor = 3;
						break;
					}
					case 4 : {
						System.out.println("4������ �̵��մϴ�.");
						nowFloor = 4;
						break;
					}
					case 5 : {
						System.out.println("5������ �̵��մϴ�.");
						nowFloor =5;
						break;
					}
					default : {
						System.out.println("�������� �ʴ� �����Դϴ�.");
					}
				}
			}
		}
	}

}
