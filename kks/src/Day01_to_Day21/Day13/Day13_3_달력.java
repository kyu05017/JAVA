package Day01_to_Day21.Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3_�޷� {
	
	public static Scanner scanner = new Scanner(System.in);
	


	public static void main(String[] args) {
		try {
			System.out.println("��¥ �˻�");
			System.out.println("���� : "); int year = scanner.nextInt();
			System.out.println("��  : "); int month = scanner.nextInt();	
			System.out.println();
			�޷�(year, month);
		}
		catch(Exception e) {
			System.out.println("���ڸ� �Է°��� �մϴ�.");
			return;
		}
	}
	public static void �޷�(int year, int month) {
		while(true) {
			// 1, Ķ���� Ŭ������ ��¥/�ð� ��ü ȣ��
			Calendar calendar = Calendar.getInstance();
			
			
			
			
			// 2. ����, ��, ��
			//int year = calendar.get(Calendar.YEAR);
			//int month = calendar.get(Calendar.MONTH)+1;
			// * �ش� ���� 1���� ������ ã�´�
				// 1. ����� ���� ������ ����
			calendar.set(year, month-1,1); // ��) ��� 3�� 1��
			// 2. 3�� 1���� ����
			int start_week = calendar.get(Calendar.DAY_OF_WEEK) ;
			// 3. ���� ������ ��
			int end_day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	
		
		
			System.out.println("\t\t*** " + year + "�� "+ month+"�� ***");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			
			for(int i =1; i < start_week; i++ ) {
				System.out.print("\t");
			}
			for(int i = 1; i <= end_day; i++) {
				/* ���� ã��
				if(i == day) {
					System.err.print(i+"\t");
				}
				else {
					System.out.print(i+"\t");
				}
				*/
				System.out.print(i+"\t");
				// ����� ���� �ٹٲ� ������� 7
				if(start_week%7 == 0) {
					System.out.println();
				}
				start_week++;
			}
		
	// ��ư [ 1. 2.]
		
			System.out.println();
			System.out.println("1.������ 2.������ 3.�ٽð˻� 4.����");
			try {
				int ch = scanner.nextInt();
				month -= 1;
				
				if(ch == 1) {
					
				if(month == 0) {
					year -= 1;
					month = 12;
					}
				}
				else if(ch == 2) {
					month += 1;
				if(month == 13) {
					year += 1;
					month = 1;
					}

				}
				else if(ch == 3) {
					System.out.println("�˻����� ���ư��ϴ�.");
					Day13_3_�޷�.main(null);
				}
				else if(ch == 4) {
					System.out.println("����");
					break;
				}
			}
			catch(Exception e) {
				System.out.println("���ڸ� �Է°����մϴ�.");
				scanner = new Scanner(System.in);
			}
		
		}
	}
}
