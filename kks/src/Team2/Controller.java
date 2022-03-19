package Team2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Controller {
	
	
	
	public static ArrayList<Car> carlist = new ArrayList<>();
	Date carInTime  = new Date();
	Calendar calendar = Calendar.getInstance();
	int day = calendar.get(Calendar.DAY_OF_MONTH);
	Main main = new Main();
	SimpleDateFormat carTimeHour = new SimpleDateFormat("HH");
	SimpleDateFormat carTimeMin = new SimpleDateFormat("mm");
	SimpleDateFormat nowTimeHour = new SimpleDateFormat("HH");
	SimpleDateFormat nowTimeMin = new SimpleDateFormat("mm");
	int payMoney = 0;
	int[] savemoney = new int[32];
	
	String cth = carTimeHour.format(carInTime);
	String ctm = carTimeMin.format(carInTime);
	
	Car car = new Car();
	
	public int CarIn(String CarNum,int parkNum) {

		//���� ����  
		
		Car saveCar = new Car(CarNum, cth, ctm, parkNum);

		carlist.add(saveCar);
			
		inCarSave();
			
		//tower[parkNum] = "["+CarNum+"]";
		System.out.println("�����ð� : " +cth+"�� "+ctm+"��");
			
		return 20;

	}
	
	public static void inCarSave() {

		try {
		FileOutputStream outputStream = new FileOutputStream("D:/inCarSave.txt");
		// 2. ���Ͽ� �ۼ��� ���� [ ���پ� ]
		for(Car temp : carlist) {
			String contents = temp.getCarNum() +","+temp.getCarTimehour()+","+temp.getCarTimemin()+","+temp.getParking()+"\n";
			outputStream.write(contents.getBytes());
			}
		}
		catch(Exception e) {
		}
	}
	
	// �Խù� �ҷ�����
	public static void inCarLoad() {
		
		try {
			FileInputStream inputStream = new FileInputStream("D:/inCarSave.txt");
			byte[] bytes = new byte[1024]; // 1 . ����Ʈ �迭 ����
			inputStream.read(bytes); // 2. ��� ����Ʈ�� �о�ͼ� ����Ʈ���� ���� 
			String file = new String(bytes); // 3. ����Ʈ�� ���ڿ��� ��ȯ
			String[]list = file.split("\n"); // 4. ���ڿ� �ڸ���
			int i = 0;
			for(String temp : list) {
				if( i+1 == list.length ) {
					break; 
				}
				String[] filed = temp.split(",");// 5. ���ڿ� �ڸ��� 
				Car temp2 = new Car(filed[0], filed[1], filed[2],Integer.parseInt(filed[3]));
				carlist.add(temp2);
				i++;
			}
			
		}
		catch(Exception e) {
		}
		
	}
	
	public void CarOut(String CarNum)  {
		for(int i = 0; i <carlist.size(); i++) {
			if(carlist.get(i).getCarNum().equals(CarNum)) {
		//tower[parkNum] = "[    ]";	
		int outcth = Integer.parseInt(carlist.get(i).getCarTimehour());
		int outctm = Integer.parseInt(carlist.get(i).getCarTimemin());
		outcth *= 60;
		int outcattotla = outcth += outctm;
		String nth = nowTimeHour.format(carInTime);
		String ntm = nowTimeMin.format(carInTime);
		
		int int_nth = Integer.parseInt(nth);
		int int_ntm = Integer.parseInt(ntm);
		int_nth *= 60;
		int nowtimetotal = int_nth += int_ntm;
		
		int timepay = nowtimetotal - outcattotla;
		if(timepay < 30) {
			System.out.println("ȸ�� �����Դϴ�.");
		}
		else if(timepay >= 30) {
			System.out.println(timepay);
			payMoney = ((timepay-30)/10);
			if( payMoney == 0) {
				System.out.println("�����Ͻ� �ݾ��� 1000�� �Դϴ�.");
				payMoney += 1000;
			}
			else {
				System.out.println("�����Ͻ� �ݾ��� "+(payMoney*1000)+"�� �Դϴ�.");
				payMoney += (payMoney*1000);
			}
			
			
		}
		else if(timepay >= 480) {
			System.out.println("8�ð��� �ʰ��Ͽ� 5�����Դϴ�.");
			payMoney +=50000;
		}
		System.out.println(nowtimetotal - outcattotla);
		
		
				carlist.remove(i);
			}
		}
		savemoney[day] = payMoney;		
		Controller.inCarSave();
		return;
	}
	
	public void CarList(String CarNum) {
		
		for(Car temp : carlist) {
			if(temp != null) {
				
				if(temp.getCarNum().equals(CarNum)) {
					if(temp.getParking() < 4) {
						System.out.println(temp.getCarTimehour()+"�� "+ temp.getCarTimemin() + "�� " +"�� �԰�� ������ ���� "+CarNum+"������ 1�� " + temp.getParking()+ "�� �ڸ��� ���� �Ǿ��ֽ��ϴ�.");
					}
					else if(temp.getParking() > 3 && temp.getParking() < 8) {
						System.out.println(temp.getCarTimehour()+"�� "+ temp.getCarTimemin() + "�� "+"�� �԰�� ������ ���� "+CarNum+"������ 2�� " + temp.getParking()+ "�� �ڸ��� ���� �Ǿ��ֽ��ϴ�.");
					}
					else {
						System.out.println(temp.getCarTimehour()+"�� "+ temp.getCarTimemin() + "�� "+"�� �԰�� ������ ���� "+CarNum+"������ 3�� " + temp.getParking()+ "�� �ڸ��� ���� �Ǿ��ֽ��ϴ�.");
					}
				}
			}
		}

	}
	
	public void sales(int year, int month) {
		
		calendar.set(year, month-1,1);
		int start_week = calendar.get(Calendar.DAY_OF_WEEK) ;
		int end_day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		
		System.out.println("\t\t*** " + year + "�� "+ month+"�� ***");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		for(int i =1; i < start_week; i++ ) {
			System.out.print("\t");
		}
		for(int i = 1; i <= end_day; i++) {

			if(i == day) {
				savemoney[day] = payMoney;
				
				System.out.print(i+" "+payMoney+"�� \t");
			}
			else {
				System.out.print(i+" "+savemoney[i]+"�� \t");
			}
			// ����� ���� �ٹٲ� ������� 7
			if(start_week%7 == 0) {
				System.out.println();
			}
			start_week++;
		}
		payMoney = 0;
		
	}
}
