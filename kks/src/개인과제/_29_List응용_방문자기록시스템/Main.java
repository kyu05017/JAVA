package ���ΰ���._29_List����_�湮�ڱ�Ͻý���;

import java.text.SimpleDateFormat;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		Control con = new Control();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm");
		while(true) {
			System.out.println("���� ��� ���� ���α׷�");
			System.out.println("���� �����ϸ� 1�� ���� ����� �����ּ���.");
			System.out.println("1)���� 2)���Ȯ�� 3)����");
			
			String work = Control.scanner.next();
			
			if(work.equals("1")) {
				while(true) {
					System.out.println("�� ����))");
					System.out.println("�ο����� �Է��ϼ���. (���θ޴� : 99)");
					try {
						int count = Control.scanner.nextInt();
						if(count == 99) {
							System.out.println("�޼���)) ���θ޴��� ���ư��ϴ�.");
							break;
						}
						if(count <= 0) {
							System.out.println("�޼���)) �ùٸ��� ���� �ο��� �Դϴ�.");
						}
						else {
							String in_Custommer = sdf.format(date);
							Customer customer = new Customer(count, in_Custommer);
							boolean result = con.in_Custommer(customer);
							if(result) {
								String[] new_date = in_Custommer.split("-");
								System.out.println("�޼���)) "+count+"���� �������� �Ǿ����ϴ�." );
								System.out.println("�޼���)) "+new_date[3]+"�� "+new_date[4]+"��");
								break;
							}
						}
					}
					catch (Exception e) {
						System.out.println("�޼���)) ���ڸ� �Է� ���� �մϴ�.");
					}
				}
			}
			else if(work.equals("2")) {
				while(true) {
					int years = 0; 
					int month = 0;
					System.out.println("��¥�� �� Ȯ��))");
					try {
						System.out.println("���� �Է�");
						years = Control.scanner.nextInt();
					}
					catch (Exception e) {
						System.out.println("�޼���)) ���ڸ� �Է� �����մϴ�.");
					}
					try {
						System.out.println("�� �Է�");
						month = Control.scanner.nextInt();
					}
					catch (Exception e) {
						System.out.println("�޼���)) ���ڸ� �Է� �����մϴ�.");
					}
					
					con.serch_Customers(years, month);
					break;

				}
			}
			else if(work.equals("3")) {
				System.out.println("�޼���)) ���α׷��� �����մϴ�. ");
			}
			else {
				System.out.println("�޼���)) �߸��� �Է��Դϴ�.");
			}
		}
	}
}
