package ���ο���.���ο���;

import java.util.Scanner;

public class �������߰�_���������� {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner in = new Scanner(System.in);
		int up_Down = 0;
		int floor = 0;
		
		while(true) {
			System.out.println("����������))");
			
			System.out.println("���� ������� �Է��ϼ���");
			int now_Floor = in.nextInt();
			
			System.out.println("��/ �Ʒ� �� ���� ������ �Է��ϼ���.");

			String input_UpDowm = in.next();
			if(input_UpDowm.equals("��")) {
				up_Down = 1;
				
			}
			else if(input_UpDowm.equals("�Ʒ���")) {
				up_Down = -1;
			}
			
			Thread.sleep(3000);
			System.out.println("���������� �����߽��ϴ�.");
			System.out.println("���� ���� �Է��ϼ���.");
			
			int go_Floor = in.nextInt();
			
			if(go_Floor == now_Floor) {
			System.out.println("���� �������� �ֽ��ϴ�.");
			}
			else if(now_Floor < go_Floor) {
				
				System.out.println(go_Floor+"������ �̵��մϴ�.");
				
				floor = go_Floor;
			}
			else if(now_Floor > go_Floor) {
				
				System.out.println(go_Floor+"������ �̵��մϴ�.");
				
				floor = go_Floor;
			}
		
			
			
			
		}
		
		
	}
}
