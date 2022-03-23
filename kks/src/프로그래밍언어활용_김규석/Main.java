package ���α׷��־��Ȱ��_��Լ�;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {	// C S
	
	public static void main(String[] args) {// M S
		
		// �Է°�ü
		Scanner scanner = new Scanner(System.in);
		// ��Ʈ�ѷ�
		Controller con = new Controller();
		
		//���� �ݺ� - ���� ���� ����
		while(true) {
			// ����ó��
			try {
			// ���� ��¥�� �ҷ���
			Date date  = new Date();
			//��¥�� ������ ������
			SimpleDateFormat cardate = new SimpleDateFormat("yyyy - MM - dd HH : mm");
			//��¥�� ���ڿ��� ����
			String carInTime = cardate.format(date);
			//���θ޴�
			System.out.println("--------------------------���� ��Ȳ ǥ--------------------------");
			System.out.println("\t���� �ð� : "+ carInTime);
			System.out.println();
			System.out.println("   ��¥\t\t������ȣ\t\t�����ð�\t�����ð�\t�ݾ�");
			//�������
			// �迭�� ���� ������ ã��
			for(Parking temp : Controller.carlist) {
				// ���� ǥ�ø� ���� ���ڿ� �̸� ����
				String pay_zero = null;
				
				if(temp != null) {
					if(temp.getisCar_state()) {	// �迭���� ������ ��[ ������ ] �϶� ���������� ǥ��
						pay_zero = "���� ��";
					}
					else { // �ƴ϶�� DecimalFormat���� ���� ������ �ٲ� ���ڿ��� ����
						DecimalFormat df = new DecimalFormat("#,##0��");
						pay_zero = df.format(temp.getCar_PayMoney());
					}
					System.out.printf("%s\t%s\t%s\t%s\t%s\n",temp.getCar_ParkingDate(),temp.getCar_number(),temp.getCar_ParkingTime(),temp.getCar_OutTime(),pay_zero);
				}
			}
			System.out.println("-------------------------------------------------------------");
			System.out.println("\t\t\t1.���� 2.����");
			
			String ch = scanner.nextLine();
			
			if(ch.equals("1") || ch.equals("����")) {
				System.out.println("������ȣ �Է� : ");
				String inParking_Car_Number = scanner.nextLine();
				boolean pass = true;
				
				// �Է¹��� ���� ��ȣ�� �迭�ȿ� ������ȣ�� ���ٸ� false
				for(Parking temp : Controller.carlist) {
					if(temp != null && temp.getCar_number().equals(inParking_Car_Number)) {
						pass = false;
						break; // for �� ����
					}
					
				}
				// true ��� ��Ʈ�ѷ��� in_parking �޼ҵ忡 �μ��� ������ȣ�� ������
				if(pass == true) {
					con.in_Parking(inParking_Car_Number);
				}
				else {// false ��� �̹� �����ϴ� �����̶�� �˷���
					System.out.println("�̹� �����ϴ� �����Դϴ�.");
				}
				
				
			}
			else if(ch.equals("2") || ch.equals("����")) {
				System.out.println("������ȣ �Է� : ");
				String outParking_Car_Number = scanner.nextLine();
				boolean pass = false;
				
				// �迭�� ���� ������ �������̸鼭 �̸��� ������� true������ ����
				for(Parking temp : Controller.carlist) {
					if(temp != null && temp.getCar_number().equals(outParking_Car_Number) && temp.getisCar_state()) {
						pass = true;
						break;
					}
				}
				
				if(pass == true) { // ������ ���� ���� ���̶�� ��Ʈ�ѷ� out_parking�޼ҵ忡 �μ��� ������ȣ�� ����
					con.out_Oarking(outParking_Car_Number);
				}
				else { // �ƴ϶�� �������� �ʴ� �����̶�� �����
					System.out.println("���� ���� �ʴ� �����Դϴ�.");
				}
				
				
			}
			else if(ch.equals("3") || ch.equals("����")) {
				System.out.println("���α׷� ����");
				scanner.close();
				break;
				
			}
			else {
				System.out.println("�������� �ʴ� �޴� �Դϴ�.");
			}
			
		}catch(Exception e) {
			System.out.println("������ ���� ���");
			System.out.println(e);
			scanner = new Scanner(System.in);
			}
		}
		
	}
}
