package Team2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String[] tower = { "[    ]","[    ]","[    ]","[    ]",
	 			"[    ]","[    ]","[    ]","[    ]",
	 			"[    ]","[    ]","[    ]","[    ]",};
		Scanner scanner = new Scanner(System.in);
		Controller con = new Controller();
		con.inCarLoad();
		while(true) {
			try {
				System.out.println("메인 메뉴))");
				 //주차공간이 보임
				for(Car temp : Controller.carlist){
					if(temp != null) {
						tower[temp.getParking()] = "["+temp.getCarNum()+"]";
					}
				}
				for(int i = 0; i < tower.length; i++) {
					 System.out.print(tower[i]);
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
				System.out.println("1)입차 2)출차 3)매출확인 4)차량확인");
				String ch = scanner.next();
				//차량입고 메뉴
				if(ch.equals("1") || ch.equals("입차")) {
					System.out.println("입차된 차량 번호를 입력하세요. (뒷 4자리만 입력)");
					String carNum = scanner.next();
					System.out.println("차량이 주차될 위치를 입력하세요. (0 ~ 11)");
					int parkNum = scanner.nextInt();
					tower[parkNum] = "["+carNum+"]";
					int num = con.CarIn(carNum,parkNum);
					if(num == 50) {
						System.out.println("이미 입고된 차량입니다.");
					}
					else if(num == 20) {
						System.out.println(carNum+" 차량이 정상 입고 되었습니다.");
					}
					else if(num == 40) {
						System.out.println(carNum+" 이미 주차 되어있는 자리 입니다.");
					}
					else if(num == 0) {
						System.out.println("차량이 정상 입고 되지 않았습니다.");
					}
				}
				//차량 출고 메뉴
				else if(ch.equals("2") || ch.equals("출차")) {
					System.out.println("출차할 차량 번호를 입력하세요. (뒷 4자리만 입력)");
					String carNum = scanner.next();
					System.out.println("차량이 출차될 위치를 입력하세요. (0 ~ 11)");
					int parkNum = scanner.nextInt();
					tower[parkNum] = "[    ]";
					con.CarOut(carNum);
				}
				//메출확인 메뉴
				else if(ch.equals("3") || ch.equals("매출확인")) {
					System.out.println("날짜 검색");
					System.out.println("연도 : "); int year = scanner.nextInt();
					System.out.println("월  : "); int month = scanner.nextInt();	
					con.sales(year,month);
				}
				//차량 확인 메뉴
				else if(ch.equals("4") || ch.equals("차량 확인")) {
					System.out.println("확인할 차량 번호를 입력하세요. (뒷 4자리만 입력)");
					String carNum = scanner.next();
					System.out.println("주자된 차량)) " + carNum);
					con.CarList(carNum);
				}
				else {
					 System.out.println("메세지)) 존재하지 않는 메뉴 입니다.");
				}
				
				
				
				
				
				
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}

		
		
	}// m e
} // c e
