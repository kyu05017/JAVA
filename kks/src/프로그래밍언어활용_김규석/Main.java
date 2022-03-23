package 프로그래밍언어활용_김규석;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {	// C S
	
	public static void main(String[] args) {// M S
		
		// 입력객체
		Scanner scanner = new Scanner(System.in);
		// 컨트롤러
		Controller con = new Controller();
		
		//무한 반복 - 종료 조건 없음
		while(true) {
			// 예외처리
			try {
			// 현재 날짜를 불러옴
			Date date  = new Date();
			//날짜의 형식을 변경함
			SimpleDateFormat cardate = new SimpleDateFormat("yyyy - MM - dd HH : mm");
			//날짜를 문자열로 변경
			String carInTime = cardate.format(date);
			//메인메뉴
			System.out.println("--------------------------주차 현황 표--------------------------");
			System.out.println("\t현재 시간 : "+ carInTime);
			System.out.println();
			System.out.println("   날짜\t\t차량번호\t\t입차시간\t출차시간\t금액");
			//차량출력
			// 배열을 돌려 차량을 찾음
			for(Parking temp : Controller.carlist) {
				// 정산 표시를 위한 문자열 미리 선언
				String pay_zero = null;
				
				if(temp != null) {
					if(temp.getisCar_state()) {	// 배열안의 차량이 참[ 주차중 ] 일때 정산전으로 표시
						pay_zero = "정산 전";
					}
					else { // 아니라면 DecimalFormat으로 가격 형식을 바꿔 문자열에 저장
						DecimalFormat df = new DecimalFormat("#,##0원");
						pay_zero = df.format(temp.getCar_PayMoney());
					}
					System.out.printf("%s\t%s\t%s\t%s\t%s\n",temp.getCar_ParkingDate(),temp.getCar_number(),temp.getCar_ParkingTime(),temp.getCar_OutTime(),pay_zero);
				}
			}
			System.out.println("-------------------------------------------------------------");
			System.out.println("\t\t\t1.입차 2.출차");
			
			String ch = scanner.nextLine();
			
			if(ch.equals("1") || ch.equals("입차")) {
				System.out.println("차량번호 입력 : ");
				String inParking_Car_Number = scanner.nextLine();
				boolean pass = true;
				
				// 입력받은 차량 번호와 배열안에 차량번호가 같다면 false
				for(Parking temp : Controller.carlist) {
					if(temp != null && temp.getCar_number().equals(inParking_Car_Number)) {
						pass = false;
						break; // for 문 종료
					}
					
				}
				// true 라면 컨트롤러의 in_parking 메소드에 인수로 차량번호를 보내줌
				if(pass == true) {
					con.in_Parking(inParking_Car_Number);
				}
				else {// false 라면 이미 존재하는 차량이라고 알려줌
					System.out.println("이미 존재하는 차량입니다.");
				}
				
				
			}
			else if(ch.equals("2") || ch.equals("출차")) {
				System.out.println("차량번호 입력 : ");
				String outParking_Car_Number = scanner.nextLine();
				boolean pass = false;
				
				// 배열을 돌려 차량이 추자중이면서 이름이 같을경우 true값으로 만듬
				for(Parking temp : Controller.carlist) {
					if(temp != null && temp.getCar_number().equals(outParking_Car_Number) && temp.getisCar_state()) {
						pass = true;
						break;
					}
				}
				
				if(pass == true) { // 위에서 받은 값이 참이라면 컨트롤러 out_parking메소드에 인수로 차량번호를 보냄
					con.out_Oarking(outParking_Car_Number);
				}
				else { // 아니라면 존재하지 않는 차량이라고 띄아줌
					System.out.println("존재 하지 않는 차량입니다.");
				}
				
				
			}
			else if(ch.equals("3") || ch.equals("종료")) {
				System.out.println("프로그램 종료");
				scanner.close();
				break;
				
			}
			else {
				System.out.println("존재하지 않는 메뉴 입니다.");
			}
			
		}catch(Exception e) {
			System.out.println("관리자 문의 요망");
			System.out.println(e);
			scanner = new Scanner(System.in);
			}
		}
		
	}
}
