package MyPractice01_IO;

import java.util.Calendar;
import java.util.Scanner;

import Day13.Day13_3_�޷�;

public class �޷¿��� {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Scanner scanner = new Scanner(System.in);
		try {
			while(true) {
				System.out.println("�޷�");
				int year = calendar.get(Calendar.YEAR);
				int month = calendar.get(Calendar.MONTH)+1;
				int day = calendar.get(Calendar.DAY_OF_MONTH);
				calendar.set(year, month-1,1); 
				int start_week = calendar.get(Calendar.DAY_OF_WEEK) ;
				int end_day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

				System.out.println("\t\t*** " + year + "�� "+ month+"�� ***");
				System.out.println("��\t��\tȭ\t��\t��\t��\t��");
				
				for(int i =1; i < start_week; i++ ) {
					System.out.print("\t");
				}
				for(int i = 1; i <= end_day; i++) {
					System.out.print(i+"\t");
					/*
					if(i == day) {
						System.err.print(i+"\t");
					}
					else {
						System.out.print(i+"\t");
					}
					*/
					if(start_week%7 == 0) {
						System.out.println();
					}
					start_week++;
				}
				System.out.println();
				System.out.println("�޷°˻�");
				System.out.println("�⵵ : ");
				int year2 = scanner.nextInt();
				System.out.println("�� : ");
				int month2 = scanner.nextInt();
				calendar.set(year2, month2-1,1); 
				while(true) {
					System.out.println("\t\t*** " + year2 + "�� "+ month2+"�� ***");
					System.out.println("��\t��\tȭ\t��\t��\t��\t��");
					
					for(int i =1; i < start_week; i++ ) {
						System.out.print("\t");
					}
					for(int i = 1; i <= end_day; i++) {
						System.out.print(i+"\t");
						if(start_week%7 == 0) {
							System.out.println();
						}
						start_week++;
					}

					System.out.println();
					System.out.println("1.������ 2.������ 3.�ٽð˻� 4.����");
					try {
						int ch = scanner.nextInt();
						month2 -= 1;
						
						if(ch == 1) {
							
						if(month2 == 0) {
							year2 -= 1;
							month2 = 12;
							}
						}
						else if(ch == 2) {
							month2 += 1;
						if(month2 == 13) {
							year2 += 1;
							month2 = 1;
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
		catch(Exception e) {
			System.out.println("�߸��� �Է�");
		}
		
	}
}
