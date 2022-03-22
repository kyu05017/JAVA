package 평가연습_23일;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Controller {
	
	
	public static ArrayList<Parking> carlist = new ArrayList<>();
	
	public void in_Parking(String inParking_Car_Number) {
		
		Date date  = new Date();
		SimpleDateFormat car_in_date = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat car_in_time = new SimpleDateFormat("HH:mm");
		String car_date = car_in_date.format(date);
		String car_time = car_in_time.format(date);
		
		Parking parking = new Parking(inParking_Car_Number, car_date, car_time, "주차 중", true, 0);
		carlist.add(parking);
		return;
	}
	
	public void out_Oarking(String outParking_Car_Number) {
		
		Date date2  = new Date();
		SimpleDateFormat car_out_time = new SimpleDateFormat("HH:mm");
		String out_time = car_out_time.format(date2);
		for(Parking temp : carlist) {
			if(temp.getCar_number().equals(outParking_Car_Number)) {
				String[] now_date = out_time.split(":");
				String[] car_date = temp.getCar_ParkingTime().split(":");
				int now_date_hour = Integer.parseInt(now_date[0]);
				int now_date_min = Integer.parseInt(now_date[1]);
				
				int car_date_hour = Integer.parseInt(car_date[0]);
				int car_date_min = Integer.parseInt(car_date[1]);
				
				System.out.println(now_date_hour+"시"+now_date_min+"분 현재시간");
				System.out.println(car_date_hour+"시"+car_date_min+"분 입차시간");
				
				int num1 = (now_date_hour * 60)+now_date_min;
				int num2 = (car_date_hour * 60)+car_date_min;
				
				System.out.println(num1);
				System.out.println(num2);
				
				int all_time = num1 - num2;
				String pay = null;
				int paymoney = 0;
				
				if( all_time == 0 || (all_time) < 30) {
					System.out.println("회차 차량 입니다.");
				}
				else if((all_time) >= 30){
					paymoney = ((all_time /10)*1000);
				}
				
				temp.setCar_state(false);
				temp.setCar_OutTime(out_time);
				temp.setCar_PayMoney(paymoney);
				
			}
		}
	}
	
}
