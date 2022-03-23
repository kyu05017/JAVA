package 프로그래밍언어활용_김규석;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Controller {
	
	// 어레이 리스트로 배열을 저장 
	public static ArrayList<Parking> carlist = new ArrayList<>();
	
	// 입차 메소드
	public void in_Parking(String inParking_Car_Number) {
		
		// 현재 시스템 시간을 가지고옴 
		Date date  = new Date();
		// 날짜만 포멧함
		SimpleDateFormat car_in_date = new SimpleDateFormat("yyyy-MM-dd");
		// 시간만 포멧함
		SimpleDateFormat car_in_time = new SimpleDateFormat("HH:mm");
		// 포멧된 날짜와 시간을 문자열로 저장함
		String car_date = car_in_date.format(date);
		String car_time = car_in_time.format(date);
		
		// 객체화 [ 차량번호, 입차 날짜, 입차 시간, 출차 날짜, 주자중[true], 계산금액 ]
		Parking parking = new Parking(inParking_Car_Number, car_date, car_time, "주차 중", true, 0);
		// 리스트에 저장함
		carlist.add(parking);
		//메소드를 닫음
		return;
	}
	
	// 출차 메소드
	public void out_Oarking(String outParking_Car_Number) {
		
		// 시스템 시간을 가지고옴
		Date date2  = new Date();
		// 형식을 시간분으로 바꿔줌
		SimpleDateFormat car_out_time = new SimpleDateFormat("HH:mm");
		// 바꾼 시간을 문자열로 저장 
		String out_time = car_out_time.format(date2);
		
		// 저장된 배열의 길이만큼 반복문을 돌림
		for(Parking temp : carlist) {
			// 입력된 차량번호와 저장된 배열에 차량번호가 같다면
			if(temp.getCar_number().equals(outParking_Car_Number)) {
				// 저장된 시간들을 : 맞춰서 쪼갠후 배열에 저장
				String[] now_date = out_time.split(":");
				String[] car_date = temp.getCar_ParkingTime().split(":");
				
				// 현재 시간 정수화
				int now_date_hour = Integer.parseInt(now_date[0]);
				int now_date_min = Integer.parseInt(now_date[1]);
				
				// 입차 시간 정수화
				int car_date_hour = Integer.parseInt(car_date[0]);
				int car_date_min = Integer.parseInt(car_date[1]);
				
				System.out.println(now_date_hour+"시"+now_date_min+"분 현재시간");
				System.out.println(car_date_hour+"시"+car_date_min+"분 입차시간");
				
				// 저장된 시간들을 분으로 바꿔줌
				int num1 = (now_date_hour * 60)+now_date_min;
				int num2 = (car_date_hour * 60)+car_date_min;
				
				// 입차시간분에서 출차시간분을 뺌
				int all_time = num1 - num2;
				String pay = null;
				int paymoney = 0;
				
				if( all_time == 0 || (all_time) < 30) {	// 결과값이 0이거나 30분 미만이라면
					System.out.println("회차 차량 입니다.");
				}
				else if((all_time) >= 30 && all_time < 40){ // 결과값이 30이상이거나 40보다 작다면
					paymoney = ((((all_time-30)/10)+1)*1000);
				}
				else if(all_time >= 40){ // 결과값이 40이상이거나 1440[하루] 미만이라면
					paymoney = ((((all_time-30)/10))*1000);
				}
				/*
				else if(all_time >= 1440) { // 결과값이 1440[하루] 이상이라면
					int oneDayMoney = temp.getCar_PayMoney() + 50000;
					paymoney = oneDayMoney;
				}
				*/
				// 주차한 시간을 보여주고
				System.out.println("경과시간 " + all_time + "분");
				// 저장된 값을 바꿔줌
				temp.setCar_state(false);
				temp.setCar_OutTime(out_time);
				temp.setCar_PayMoney(paymoney);
				
			}
		}
	}
	
}
