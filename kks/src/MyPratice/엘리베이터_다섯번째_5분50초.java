package MyPratice;

import java.util.Scanner;

public class ����������_�ټ���°_5��50�� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int nowFloor = 1;
		
		while(true) {
			System.out.println();
			System.out.println("����������");
			System.out.println("��������" + nowFloor +"��");
			System.out.println("���ϴ� ������ �Է��ϼ��� (�����Է�)");
			int floor = scanner.nextInt();
			if(floor == nowFloor) {
				System.out.println("���� ���� �Դϴ�.");
			}
			else if(floor > nowFloor) {
				System.out.println("���� ���ϴ�");
			}
			else {
				System.out.println("�Ʒ��� ���ϴ�.");
			}
			switch(floor) {
				case 1 : {
					System.out.println("1������ �̵��մϴ�");
					nowFloor = 1;
					break;
				}
				case 2 : {
					System.out.println("2������ �̵��մϴ�");
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
					nowFloor = 5;
					break; 
				}
			
			}
		}
	}

}
