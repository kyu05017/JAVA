package 개인과제._25_주차타워프로그램;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Scanner;

public class Control {
	
	static String[] tower = { "[    ]","[    ]","[    ]","[    ]",
 			"[    ]","[    ]","[    ]","[    ]",
 			"[    ]","[    ]","[    ]","[    ]",};
	static Scanner scanner = new Scanner(System.in);
	
	Car car = new Car();
	Main main = new Main();
	
	public static ArrayList<Car> carlist = new ArrayList<>();
	public static ArrayList<DaySale> salelist = new ArrayList<>();
	
	Date carInTime  = new Date();
	Calendar calendar = Calendar.getInstance();
	SimpleDateFormat cardate = new SimpleDateFormat("yyyy-MM-dd-HH-mm");
	String date = cardate.format(carInTime);
	
	public int CarIn(String CarNum,int parkNum) {

		//차량 저장  
		Car saveCar = new Car(CarNum, date , parkNum);

		carlist.add(saveCar);
			
		DB.inCarSave();
		
		String[] date_print = date.split("-");

		System.out.println("입차날짜 : " + date_print[1] + "월" + date_print[2] + "일");
		System.out.println("입차시간 : " + date_print[3] + "시" + date_print[4] + "분");
			
		return 20;
	}
	public void CarOut(String CarNum)  {

		for(int i = 0; i <carlist.size(); i++) {
			
			if(carlist.get(i).getCarNum().equals(CarNum)) {
				
				String[] now_date = date.split("-");
				String[] car_date = carlist.get(i).getCardate().split("-");
				
				System.out.println("출차날짜 : " + now_date[1] + "월" + now_date[2] + "일");
				System.out.println("출차시간 : " + now_date[3] + "시" + now_date[4] + "분");
				
				String a = now_date[0]+now_date[1]+now_date[2];
				String b = car_date[0]+car_date[1]+car_date[2];
				
				int now_month  = Integer.parseInt(now_date[1]);
				int now_day  = Integer.parseInt(now_date[2]);
				int now_hour = Integer.parseInt(now_date[3]);
				int now_min = Integer.parseInt(now_date[4]);
				
				int car_month  = Integer.parseInt(car_date[1]);
				int car_day  = Integer.parseInt(car_date[2]);
				int car_hour = Integer.parseInt(car_date[3]);
				int car_min = Integer.parseInt(car_date[4]);
				
				int now_all_min = ((now_hour*60)+now_min);
				int car_all_min = ((car_hour*60)+car_min);
				
				int total_time = now_all_min - car_all_min;
				
//				System.out.println("1 " + a);
//				System.out.println("2 " + b);
//				System.out.println("3 " + now_month);
//				System.out.println("4 " + now_day);
//				System.out.println("5 " + now_hour);
//				System.out.println("6 " + now_min);
//				System.out.println("7 " + car_month);
//				System.out.println("8 " + car_day);
//				System.out.println("9 " + car_hour);
//				System.out.println("10 " + car_min);
//				System.out.println("11 " + now_all_min);
//				System.out.println("12 " + car_all_min);
//				System.out.println("13 " + total_time);

				int money = 0;
				
				if(now_date != null && car_date!= null) {
					if(a.equals(b)) {
						if(total_time < 30) {
							System.out.println("회차 차량입니다.");
						}
						else if(total_time >= 30 && total_time < 480) {
							int todaypay = ((((now_all_min - car_all_min)-30)/10)*1000);
							money = todaypay;
							DecimalFormat df = new DecimalFormat("#,##0원");
							System.out.print("결제하실 금액은  ");
							System.out.println( df.format( todaypay ) );
							
						}
						else if(total_time >=480) {
							int todaypay = 50000;;
							money = todaypay;
							System.out.println(total_time);
							DecimalFormat df = new DecimalFormat("#,##0원");
							System.out.print("결제하실 금액은  ");
							System.out.println( df.format( todaypay ) );
						}
					}
					else {
						// 같은 달인 경우
						if(now_month == car_month) {
							int c = now_day - car_day;
							int todaypay = c*50000;
							money = todaypay;
							System.out.println(c+"일");
							DecimalFormat df = new DecimalFormat("#,##0원");
							System.out.print("결제하실 금액은  ");
							System.out.println( df.format( todaypay ) );
						}
						else if(now_month != car_month){
							//int d = now_month - car_month;
							int e = 30 - car_day;
							int f = e + now_day;
							int todaypay = f*50000;
							System.out.println(f+"일");
							DecimalFormat df = new DecimalFormat("#,##0원");
							System.out.print("결제하실 금액은  ");
							System.out.println( df.format( todaypay ) );
						}
					}
				}
				DaySale saveday = new DaySale(money, date);
				salelist.add(saveday);
				carlist.remove(i);
			}
		}
		DB.daysaleSave();
		DB.inCarSave();
		return ;
	}
	
	public int CarList(String CarNum) {
		
		for(Car temp : carlist) {
			if(temp != null) {
				
				if(temp.getCarNum().equals(CarNum)) {
					String[] car_date = temp.getCardate().split("-");
					if(temp.getParking() < 4) {
						System.out.println("입차된 "+CarNum+" 차량은 1층 " + temp.getParking()+ "번 자리에 주차 되어있습니다.");
						System.out.println("입차날짜 : " + car_date[1] + "월" + car_date[2] + "일");
						System.out.println("입차시간 : " + car_date[3] + "시" + car_date[4] + "분");
						return 2;
					}
					else if(temp.getParking() > 3 && temp.getParking() < 8) {
						System.out.println("입차된 "+CarNum+" 차량은 2층 " + temp.getParking()+ "번 자리에 주차 되어있습니다.");
						System.out.println("입차날짜 : " + car_date[1] + "월" + car_date[2] + "일");
						System.out.println("입차시간 : " + car_date[3] + "시" + car_date[4] + "분");
						return 2;
					}
					else {
						System.out.println("입차된 "+CarNum+" 차량은 3층 " + temp.getParking()+ "번 자리에 주차 되어있습니다.");
						System.out.println("입차날짜 : " + car_date[1] + "월" + car_date[2] + "일");
						System.out.println("입차시간 : " + car_date[3] + "시" + car_date[4] + "분");
						return 2;
					}
				}
				else {
					return 1;
				}
				
			}
		}
		return 0;
	}
	public void salelist(int a, int b) {
		Hashtable <String, Integer> map = new Hashtable<>();
		DecimalFormat df2 = new DecimalFormat("#,##0원");
		DecimalFormat df3 = new DecimalFormat("0000");
		String new_year = df3.format(a);
		
		DecimalFormat df4 = new DecimalFormat("00");
		String new_month = df4.format(b);
		for(DaySale temp : salelist) {
			int ticketfee = 0; 
			for(DaySale temp2 : salelist) {
				if(temp.getSavedate().equals(temp2.getSavedate())){
					ticketfee += temp.getTodaymoney();
				}
			}
			map.put(temp.getSavedate(), ticketfee);
		}
		for(String temp : map.keySet()) {
			String new_money = df2.format(map.get(temp));
			String[] date = temp.split("-");
			if(date[0].equals(new_year) ) {
				if(date[1].equals(new_month)) {
					System.out.println(temp+ " " + new_money);
				}
			}
			else {
				System.out.println("메세지) 해당 달에 매출이 없습니다.");
				break;
			}
		}
		//총 매출액 표시
		int totalsales = 0;
		for (DaySale temp : salelist) {
			 totalsales += temp.getTodaymoney();
		}
		String new_money = df2.format(totalsales);
		System.out.println("전채 총 매출액 : " + new_money);
	}
}
