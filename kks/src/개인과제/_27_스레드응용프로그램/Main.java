package ���ΰ���._27_�������������α׷�;

public class Main {
	
	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println("���� ���� ���α׷�");
			
			System.out.println("1) ���� 2) ����");
			String work = Control.scanner.next();
			
			if(work.equals("1")) {
				System.out.println("1. ������ Blueming");
				System.out.println("2. ");
				System.out.println("3.");
				System.out.println("4.");
				
				try {
					int ch = Control.scanner.nextInt();
					if(ch > 4) {
						System.out.println("�޼���)) �������� �ʴ� ���Դϴ�.");
					}
					else {
						System.out.println("�޼���)) "+ch + "�� ���� ����մϴ�.");
						if(ch == 1) {
							Control.song1();
						}
						if(ch == 2) {
							
						}
						if(ch == 3) {
							
						}
						if(ch == 4) {
							
						}
					}
				}
				catch(Exception e) {
					System.out.println("�޼���)) ���� �� �Է� �����մϴ�.");
				}
			}
			else if(work.equals("2")) {
				System.out.println("�����մϴ�.");
				break;
			}
		}
	}
}
