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

		//차량 저장  
		
		Car saveCar = new Car(CarNum, cth, ctm, parkNum);

		carlist.add(saveCar);
			
		inCarSave();
			
		//tower[parkNum] = "["+CarNum+"]";
		System.out.println("입차시간 : " +cth+"시 "+ctm+"분");
			
		return 20;

	}
	
	public static void inCarSave() {

		try {
		FileOutputStream outputStream = new FileOutputStream("D:/inCarSave.txt");
		// 2. 파일에 작성할 내용 [ 한줄씩 ]
		for(Car temp : carlist) {
			String contents = temp.getCarNum() +","+temp.getCarTimehour()+","+temp.getCarTimemin()+","+temp.getParking()+"\n";
			outputStream.write(contents.getBytes());
			}
		}
		catch(Exception e) {
		}
	}
	
	// 게시물 불러오기
	public static void inCarLoad() {
		
		try {
			FileInputStream inputStream = new FileInputStream("D:/inCarSave.txt");
			byte[] bytes = new byte[1024]; // 1 . 바이트 배열 선언
			inputStream.read(bytes); // 2. 모든 바이트를 읽어와서 바이트열에 저장 
			String file = new String(bytes); // 3. 바이트를 문자열로 변환
			String[]list = file.split("\n"); // 4. 문자열 자르기
			int i = 0;
			for(String temp : list) {
				if( i+1 == list.length ) {
					break; 
				}
				String[] filed = temp.split(",");// 5. 문자열 자르기 
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
			System.out.println("회차 차량입니다.");
		}
		else if(timepay >= 30) {
			System.out.println(timepay);
			payMoney = ((timepay-30)/10);
			if( payMoney == 0) {
				System.out.println("결제하실 금액은 1000원 입니다.");
				payMoney += 1000;
			}
			else {
				System.out.println("결제하실 금액은 "+(payMoney*1000)+"원 입니다.");
				payMoney += (payMoney*1000);
			}
			
			
		}
		else if(timepay >= 480) {
			System.out.println("8시간을 초과하여 5만원입니다.");
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
						System.out.println(temp.getCarTimehour()+"시 "+ temp.getCarTimemin() + "분 " +"에 입고된 차량은 현재 "+CarNum+"차량은 1층 " + temp.getParking()+ "번 자리에 주차 되어있습니다.");
					}
					else if(temp.getParking() > 3 && temp.getParking() < 8) {
						System.out.println(temp.getCarTimehour()+"시 "+ temp.getCarTimemin() + "분 "+"에 입고된 차량은 현재 "+CarNum+"차량은 2층 " + temp.getParking()+ "번 자리에 주차 되어있습니다.");
					}
					else {
						System.out.println(temp.getCarTimehour()+"시 "+ temp.getCarTimemin() + "분 "+"에 입고된 차량은 현재 "+CarNum+"차량은 3층 " + temp.getParking()+ "번 자리에 주차 되어있습니다.");
					}
				}
			}
		}

	}
	
	public void sales(int year, int month) {
		
		calendar.set(year, month-1,1);
		int start_week = calendar.get(Calendar.DAY_OF_WEEK) ;
		int end_day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		
		System.out.println("\t\t*** " + year + "년 "+ month+"월 ***");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i =1; i < start_week; i++ ) {
			System.out.print("\t");
		}
		for(int i = 1; i <= end_day; i++) {

			if(i == day) {
				savemoney[day] = payMoney;
				
				System.out.print(i+" "+payMoney+"원 \t");
			}
			else {
				System.out.print(i+" "+savemoney[i]+"원 \t");
			}
			// 토요일 마다 줄바꿈 토요일은 7
			if(start_week%7 == 0) {
				System.out.println();
			}
			start_week++;
		}
		payMoney = 0;
		
	}
}
