package �򰡿���_23��;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Controller con = new Controller();
		
		while(true) {
			try {
			System.out.println("--------------------���� ��Ȳ ǥ--------------------");
			System.out.println("���� �ð� : ");
			//�ð� �Է�
			
			System.out.println("\t��¥\t\t������ȣ\t�����ð�\t�����ð�\t�ݾ�");
			//�������
			
			System.out.println("-------------------------------------------------");
			System.out.println("1.���� 2.����");
			
			String ch = scanner.next();
			
			if(ch.equals("1") || ch.equals("����")) {
				System.out.println("������ȣ �Է�");
				String inParking_Car_Number = scanner.next();
				
				con.in_Parking(inParking_Car_Number);
			}
			else if(ch.equals("2") || ch.equals("����")) {
				System.out.println("������ȣ �Է�");
				String outParking_Car_Number = scanner.next();
				
				con.out_Oarking(outParking_Car_Number);
			}
			else {
				System.out.println("�������� �ʴ� �޴� �Դϴ�.");
			}
			
		}catch(Exception e) {
			System.out.println("������ ���� ���");
			scanner = new Scanner(System.in);
			}
		
		}
	}
}
