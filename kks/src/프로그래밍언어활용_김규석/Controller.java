package ���α׷��־��Ȱ��_��Լ�;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Controller {
	
	// ��� ����Ʈ�� �迭�� ���� 
	public static ArrayList<Parking> carlist = new ArrayList<>();
	
	// ���� �޼ҵ�
	public void in_Parking(String inParking_Car_Number) {
		
		// ���� �ý��� �ð��� ������� 
		Date date  = new Date();
		// ��¥�� ������
		SimpleDateFormat car_in_date = new SimpleDateFormat("yyyy-MM-dd");
		// �ð��� ������
		SimpleDateFormat car_in_time = new SimpleDateFormat("HH:mm");
		// ����� ��¥�� �ð��� ���ڿ��� ������
		String car_date = car_in_date.format(date);
		String car_time = car_in_time.format(date);
		
		// ��üȭ [ ������ȣ, ���� ��¥, ���� �ð�, ���� ��¥, ������[true], ���ݾ� ]
		Parking parking = new Parking(inParking_Car_Number, car_date, car_time, "���� ��", true, 0);
		// ����Ʈ�� ������
		carlist.add(parking);
		//�޼ҵ带 ����
		return;
	}
	
	// ���� �޼ҵ�
	public void out_Oarking(String outParking_Car_Number) {
		
		// �ý��� �ð��� �������
		Date date2  = new Date();
		// ������ �ð������� �ٲ���
		SimpleDateFormat car_out_time = new SimpleDateFormat("HH:mm");
		// �ٲ� �ð��� ���ڿ��� ���� 
		String out_time = car_out_time.format(date2);
		
		// ����� �迭�� ���̸�ŭ �ݺ����� ����
		for(Parking temp : carlist) {
			// �Էµ� ������ȣ�� ����� �迭�� ������ȣ�� ���ٸ�
			if(temp.getCar_number().equals(outParking_Car_Number)) {
				// ����� �ð����� : ���缭 �ɰ��� �迭�� ����
				String[] now_date = out_time.split(":");
				String[] car_date = temp.getCar_ParkingTime().split(":");
				
				// ���� �ð� ����ȭ
				int now_date_hour = Integer.parseInt(now_date[0]);
				int now_date_min = Integer.parseInt(now_date[1]);
				
				// ���� �ð� ����ȭ
				int car_date_hour = Integer.parseInt(car_date[0]);
				int car_date_min = Integer.parseInt(car_date[1]);
				
				System.out.println(now_date_hour+"��"+now_date_min+"�� ����ð�");
				System.out.println(car_date_hour+"��"+car_date_min+"�� �����ð�");
				
				// ����� �ð����� ������ �ٲ���
				int num1 = (now_date_hour * 60)+now_date_min;
				int num2 = (car_date_hour * 60)+car_date_min;
				
				// �����ð��п��� �����ð����� ��
				int all_time = num1 - num2;
				String pay = null;
				int paymoney = 0;
				
				if( all_time == 0 || (all_time) < 30) {	// ������� 0�̰ų� 30�� �̸��̶��
					System.out.println("ȸ�� ���� �Դϴ�.");
				}
				else if((all_time) >= 30 && all_time < 40){ // ������� 30�̻��̰ų� 40���� �۴ٸ�
					paymoney = ((((all_time-30)/10)+1)*1000);
				}
				else if(all_time >= 40){ // ������� 40�̻��̰ų� 1440[�Ϸ�] �̸��̶��
					paymoney = ((((all_time-30)/10))*1000);
				}
				/*
				else if(all_time >= 1440) { // ������� 1440[�Ϸ�] �̻��̶��
					int oneDayMoney = temp.getCar_PayMoney() + 50000;
					paymoney = oneDayMoney;
				}
				*/
				// ������ �ð��� �����ְ�
				System.out.println("����ð� " + all_time + "��");
				// ����� ���� �ٲ���
				temp.setCar_state(false);
				temp.setCar_OutTime(out_time);
				temp.setCar_PayMoney(paymoney);
				
			}
		}
	}
	
}
