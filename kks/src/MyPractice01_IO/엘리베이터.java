package MyPractice01_IO;

import java.util.Scanner;

public class ���������� {
	 public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 int nowFloor = 1;
		 
		 while(true) {
			 System.out.println("����������");
			 System.out.println("���������Ϳ� ž���մϴ�");
			 
			 int floor = scanner.nextInt();
			 
			 while(true) {
				 System.out.println();
				 System.out.println("���ϴ� ������ �Է��ϼ���");
				 
				 if (floor == nowFloor) {
					 System.out.println("���������� �����ϴ�.");
				 }
				 else if(floor > nowFloor) {
					 System.out.println("���� ���ϴ�");
					 break;
				 }
				 else if(floor < nowFloor) {
					 System.out.println("�Ʒ��� ���ϴ�");
					 break;
				 }
				 else {
					 System.out.println("�������� �ʴ� ���� �Դϴ�.");
				 }
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
					 System.out.println("3������ �̵��մϴ�");
					 nowFloor = 3;
					 break;
				 }
				 case 4 : {
					 System.out.println("4������ �̵��մϴ�");
					 nowFloor = 4 ;
					 break;
				 }
				 case 5 : {
					 System.out.println("5������ �̵��մϴ�");
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
