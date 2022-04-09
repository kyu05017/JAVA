package 개인과제._29_List응용_방문자기록시스템;

import java.text.SimpleDateFormat;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		Control con = new Control();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm");
		while(true) {
			System.out.println("입장 기록 센서 프로그램");
			System.out.println("고객이 입장하면 1을 눌러 기록을 남겨주세요.");
			System.out.println("1)입장 2)기록확인 3)종료");
			
			String work = Control.scanner.next();
			
			if(work.equals("1")) {
				while(true) {
					System.out.println("고객 입장))");
					System.out.println("인원수를 입력하세요. (메인메뉴 : 99)");
					try {
						int count = Control.scanner.nextInt();
						if(count == 99) {
							System.out.println("메세지)) 메인메뉴로 돌아갑니다.");
							break;
						}
						if(count <= 0) {
							System.out.println("메세지)) 올바르지 않은 인원수 입니다.");
						}
						else {
							String in_Custommer = sdf.format(date);
							Customer customer = new Customer(count, in_Custommer);
							boolean result = con.in_Custommer(customer);
							if(result) {
								String[] new_date = in_Custommer.split("-");
								System.out.println("메세지)) "+count+"명이 정상입장 되었습니다." );
								System.out.println("메세지)) "+new_date[3]+"시 "+new_date[4]+"분");
								break;
							}
						}
					}
					catch (Exception e) {
						System.out.println("메세지)) 숫자만 입력 가능 합니다.");
					}
				}
			}
			else if(work.equals("2")) {
				while(true) {
					int years = 0; 
					int month = 0;
					System.out.println("날짜별 고객 확인))");
					try {
						System.out.println("연도 입력");
						years = Control.scanner.nextInt();
					}
					catch (Exception e) {
						System.out.println("메세지)) 숫자만 입력 가능합니다.");
					}
					try {
						System.out.println("월 입력");
						month = Control.scanner.nextInt();
					}
					catch (Exception e) {
						System.out.println("메세지)) 숫자만 입력 가능합니다.");
					}
					
					con.serch_Customers(years, month);
					break;

				}
			}
			else if(work.equals("3")) {
				System.out.println("메세지)) 프로그램을 종료합니다. ");
			}
			else {
				System.out.println("메세지)) 잘못된 입력입니다.");
			}
		}
	}
}
