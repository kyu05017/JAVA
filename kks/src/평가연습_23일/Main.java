package �򰡿���_23��;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		Controller con = new Controller();
		
		while(true) {
			try {
			Date date  = new Date();
			SimpleDateFormat cardate = new SimpleDateFormat("yyyy - MM - dd HH : mm");
			String carInTime = cardate.format(date);
			
			System.out.println("----------------------���� ��Ȳ ǥ----------------------");
			//�ð� �Է�
			System.out.println("\t���� �ð� : "+ carInTime);
			System.out.println();
			System.out.println("\t��¥\t������ȣ\t�����ð�\t�����ð�\t�ݾ�");
			//�������
			
			for(Parking temp : Controller.carlist) {
				String pay_zero = null;
				if(temp != null) {
					if(temp.getisCar_state()) {
						pay_zero = "���� ��";
					}
					else {
						DecimalFormat df = new DecimalFormat("#,##0��");
						pay_zero = df.format(temp.getCar_PayMoney());
					}
					System.out.printf("%s\t%s\t%s\t%s\t%s\n",temp.getCar_ParkingDate(),temp.getCar_number(),temp.getCar_ParkingTime(),temp.getCar_OutTime(),pay_zero);
				}
			}
			
			System.out.println("-----------------------------------------------------");
			System.out.println("1.���� 2.����");
			
			String ch = scanner.nextLine();
			
			if(ch.equals("1") || ch.equals("����")) {
				System.out.println("������ȣ �Է� : ");
				String inParking_Car_Number = scanner.nextLine();
				con.in_Parking(inParking_Car_Number);
				
			}
			else if(ch.equals("2") || ch.equals("����")) {
				System.out.println("������ȣ �Է� : ");
				String outParking_Car_Number = scanner.nextLine();
				
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
