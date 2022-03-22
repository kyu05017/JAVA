package 평가연습_23일;

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
			
			System.out.println("----------------------주차 현황 표----------------------");
			//시간 입력
			System.out.println("\t현재 시간 : "+ carInTime);
			System.out.println();
			System.out.println("\t날짜\t차량번호\t입차시간\t출차시간\t금액");
			//차량출력
			
			for(Parking temp : Controller.carlist) {
				String pay_zero = null;
				if(temp != null) {
					if(temp.getisCar_state()) {
						pay_zero = "정산 전";
					}
					else {
						DecimalFormat df = new DecimalFormat("#,##0원");
						pay_zero = df.format(temp.getCar_PayMoney());
					}
					System.out.printf("%s\t%s\t%s\t%s\t%s\n",temp.getCar_ParkingDate(),temp.getCar_number(),temp.getCar_ParkingTime(),temp.getCar_OutTime(),pay_zero);
				}
			}
			
			System.out.println("-----------------------------------------------------");
			System.out.println("1.입차 2.출차");
			
			String ch = scanner.nextLine();
			
			if(ch.equals("1") || ch.equals("입차")) {
				System.out.println("차량번호 입력 : ");
				String inParking_Car_Number = scanner.nextLine();
				con.in_Parking(inParking_Car_Number);
				
			}
			else if(ch.equals("2") || ch.equals("출차")) {
				System.out.println("차량번호 입력 : ");
				String outParking_Car_Number = scanner.nextLine();
				
				con.out_Oarking(outParking_Car_Number);
			}
			else {
				System.out.println("존재하지 않는 메뉴 입니다.");
			}
			
		}catch(Exception e) {
			System.out.println("관리자 문의 요망");
			scanner = new Scanner(System.in);
			}
		}
		
	}
}
