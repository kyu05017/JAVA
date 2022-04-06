package 개인과제._25_주차타워프로그램;

import java.text.DecimalFormat;



public class Main {
	
	public static void main(String[] args) {
		
		Control con = new Control();
		DB.inCarLoad();
		DB.daysaleLode();
		
		while(true) {
			
			try {
				System.out.println("메인 메뉴))");
				 //주차공간이 보임
				for(Car temp : Control.carlist){
					if(temp != null) {						
						Control.tower[temp.getParking()] = "["+temp.getCarNum()+"]";
					}
				}
				
				for(int i = 0; i < Control.tower.length; i++) {
					 System.out.print(Control.tower[i]);
					 if(i%4==3) {
						 if(i==3) {
							 System.out.println("1층");
						 }
						 if(i==7) {
							 System.out.println("2층");
						 }
						 if(i==11) {
							 System.out.println("3층");
						 }
					 }
				 }
				
				//메뉴
				System.out.println();
				System.out.println("1)입차 2)출차 3)매출확인 4)차량확인 5)종료");
				String ch = Control.scanner.next();
				//차량입고 메뉴
				if(ch.equals("1") || ch.equals("입차")) {
					System.out.println("입차된 차량 번호를 입력하세요. (뒷 4자리만 입력)");
					int carNum = Control.scanner.nextInt();
					if(carNum > 10000) {
						System.out.println("메세지)) 올바르지 않은 번호입니다.");
					}
					else {
						System.out.println("차량이 주차될 위치를 입력하세요. (0 ~ 11)");
						int parkNum = Control.scanner.nextInt();
						
						if(!Control.tower[parkNum].equals("[    ]")) {
							System.out.println("이미 사용중인 주차공간입니다.");
						}
						else {
							DecimalFormat df = new DecimalFormat("0000"); 
							String setcarnum = df.format(carNum);
							Control.tower[parkNum] = "["+setcarnum+"]";
							int num = con.CarIn(setcarnum,parkNum);
							
							if(num == 20) {
								System.out.println(setcarnum+" 차량이 정상 입고 되었습니다.");
							}
							else {
								System.out.println("차량이 정상입고 되지 않았습니다.");
							}
						}
					}
				}
				//차량 출고 메뉴
				else if(ch.equals("2") || ch.equals("출차")) {
	
					System.out.println("출차할 차량 번호를 입력하세요. (뒷 4자리만 입력)");
					int carNum = Control.scanner.nextInt();
					System.out.println("차량이 출차될 위치를 입력하세요. (0 ~ 11)");
					int parkNum = Control.scanner.nextInt();
					DecimalFormat df = new DecimalFormat("0000"); 
					String setcarnum = df.format(carNum);
					boolean pass = true;
					for(Car temp : Control.carlist) {
						if(temp != null && temp.getCarNum().equals(setcarnum)) {
							int aa = Integer.parseInt(temp.getCarNum());
							if(carNum != aa) {
								System.out.println("존재하지 않는 차량입니다.");
								pass = false;
								break;
							}
						}
					}
					if(Control.tower[parkNum].equals("[    ]")) {
						System.out.println("현재 비어있는 주차공간 입니다.");
						pass = false;
					}
					if(pass) {
						con.CarOut(setcarnum);
						Control.tower[parkNum] = "[    ]";
						
					}
					else {
						System.out.println("출차하지 못했습니다.");
					}
				
				}
				//메출확인 메뉴
				else if(ch.equals("3") || ch.equals("매출확인")) {
					
					System.out.println("날짜 검색");
					System.out.println("연도 : "); 
					int year = Control.scanner.nextInt();
					System.out.println("월  : "); 
					int month = Control.scanner.nextInt();	
					
					if(year > 2100 || month > 13 ) {
						System.out.println("연도 혹은 월입력이 잘못되었습니다.");
					}
					else {
						con.salelist(year,month);
					}
				}
				//차량 확인 메뉴
				else if(ch.equals("4") || ch.equals("차량 확인")) {
					System.out.println("확인할 차량 번호를 입력하세요. (뒷 4자리만 입력)");
					String carNum = Control.scanner.next();
					System.out.println("주자된 차량)) " + carNum);
					int result = con.CarList(carNum);
					
					if(result == 0) {
						System.out.println("요류");
					}
					else if(result == 1) {
						System.out.println("존재하지 않는 차량입니다.");
					}
				}
				else if(ch.equals("5") || ch.equals("종료")) {
					System.out.println("프로그램을 종료 합니다.");
					Control.scanner.close();
					break;
				}
				else {
					 System.out.println("메세지)) 존재하지 않는 메뉴 입니다.");
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
