package 평가연습_23일;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Controller con = new Controller();
		
		while(true) {
			try {
			System.out.println("--------------------주차 현황 표--------------------");
			System.out.println("현재 시간 : ");
			//시간 입력
			
			System.out.println("\t날짜\t\t차량번호\t입차시간\t출차시간\t금액");
			//차량출력
			
			System.out.println("-------------------------------------------------");
			System.out.println("1.입차 2.출차");
			
			String ch = scanner.next();
			
			if(ch.equals("1") || ch.equals("입차")) {
				System.out.println("차량번호 입력");
				String inParking_Car_Number = scanner.next();
				
				con.in_Parking(inParking_Car_Number);
			}
			else if(ch.equals("2") || ch.equals("출차")) {
				System.out.println("차량번호 입력");
				String outParking_Car_Number = scanner.next();
				
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
