package Day04;

import java.util.Scanner;

public class Day04_10_자판기_배열로_연습 {// c s

	public static void main(String[] args) {// m s
		
		//1. 메뉴판 [ 1.콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ]
		//1.메뉴판에서 제품을 선택하면 장바구니에 넣기
		//2.제고가 부족하면 알림(제고부족)
			//2. 초기 재고 [ 제품 당 10개씩 ]
			//3. 결제시 금액을 입력받아 결제액 만큼 차감후 잔돈 출력
		//1. 투입한 금액보다 구매액이 더 크면 결제 취소 [ 돈이 부족하면 ]
		//2.
		
		Scanner scanner = new Scanner(System.in);
		String[] menu = {"콜라", "환타", "사이다", "결제", "현재재고", "재고추가"};
		int[] item = new int[3];
		int[] itemNum = {10, 10, 10};
		int[] prize = {300,200,100};
		int pw = 1234;
		
		while(true) {
			
			System.out.println("------------------------(자판기)------------------------");
			System.out.println(" "+menu[0]+"(300원) "+menu[1]+"(200원) "+menu[2]+"(100원)  "+menu[3]+"  "+menu[4]+"  "+menu[5]);
			System.out.println("------------------------------------------------------");
			
			String work = scanner.nextLine();
			
			if(work.equals("콜라") || work.equals("1")) {
				if(itemNum[0] == 0) {
					System.out.println("알림) "+menu[0]+"  재고가 부족합니다.");
				}
				else {
					System.out.println("장바구니에 "+menu[0]+"를 추가하셨습니다.");
					item[0] += 1;
					itemNum[0] -= 1;
				}
			}
			if(work.equals("환타") || work.equals("2")) {
				if(itemNum[1] == 0) {
					System.out.println("알림) "+menu[1]+" 재고가 부족합니다.");
				}
				else {
					System.out.println("장바구니에 "+menu[1]+"를 추가하셨습니다.");
					item[1] += 1;
					itemNum[1] -= 1;
				}
			}
			if(work.equals("사이다") || work.equals("3")) {
				if(itemNum[2] == 0) {
					System.out.println("알림) "+menu[2]+" 재고가 부족합니다.");
				}
				else {
					System.out.println("장바구니에 "+menu[2]+"를 추가하셨습니다.");
					item[2] += 1;
					itemNum[2] -= 1;
				}
			}
			if(work.equals("결제") || work.equals("4")) {
				System.out.println("------------장바구니------------");
				System.out.println("품목\t수량\t  금액\t");
				if(item[0] != 0)System.out.println(menu[0] +"     \t"+ item[0] +"         "+ (item[0]*prize[0]));
				if(item[1] != 0)System.out.println(menu[1] +"     \t"+ item[1] +"         "+ (item[1]*prize[1]));
				if(item[2] != 0)System.out.println(menu[2] +"  \t"+ item[2] +"         "+ (item[2]*prize[2]));
				System.out.println("1.결제     2.결제취소");
				
				String pay = scanner.nextLine();
				if(pay.equals("결제") || pay.equals("1")) {
					int totalPay = (item[0]*prize[0])+(item[1]*prize[1])+(item[2]*prize[2]);
					System.out.println("------------결제창------------");
					System.out.println("총결제 금액은 " + totalPay+"원 입니다.");
					System.out.println("결제 급액을 입력하세요.");
					while(true) {
						int payMoney = scanner.nextInt();
						if(payMoney < totalPay) {
							System.out.println("잔액이 부족합니다. 다시 입력해주세요.");
							System.out.println("결제취소는 2번을 입력해주세요.");
							if(payMoney == 2) {
								System.out.println("결제를 취소했습니다.");
								itemNum[0] += item[0];
								itemNum[1] += item[1];
								itemNum[2] += item[2];
								item[0] = 0;
								item[1] = 0;
								item[2] = 0;
								break;
							}
						}
						else {
							int change = payMoney - totalPay;
							if (change == 0) {
								System.out.println("결제가 완료 되었습니다. 감사합니다.");
								
								item[0] = 0;
								item[1] = 0;
								item[2] = 0;
								break;
							} 
							else {
								System.out.println("결제가 완료 되었습니다. 거스름돈은 " + change +"원입니다. 감사합니다.");
								
								item[0] = 0;
								item[1] = 0;
								item[2] = 0;
								break;
							}
						}
					}
				}	
				if(pay.equals("취소") || pay.equals("2") || pay.equals("결제취소")) {
					System.out.println("결제를 취소했습니다.");
					itemNum[0] += item[0];
					itemNum[1] += item[1];
					itemNum[2] += item[2];
					item[0] = 0;
					item[1] = 0;
					item[2] = 0;
				}
			}
			if(work.equals("재고") || work.equals("5")) {
				System.out.println("현재재고");
				System.out.println("1)"+menu[0]+" :" + itemNum[0]+"개");
				System.out.println("2)"+menu[1]+" :" + itemNum[1]+"개");
				System.out.println("3)"+menu[2]+":" + itemNum[2]+"개");
			}
			if(work.equals("추가") || work.equals("6")) {
				System.out.println("관리자 비밀번호 입력");
				int inputPw = scanner.nextInt();
				int plusItem;
				
				if (pw == inputPw) {
					while(true) {
						System.out.println("추가할 품목 선택 4)종료");
						System.out.println("1)"+menu[0]+" :" + itemNum[0]+"개");
						System.out.println("2)"+menu[1]+" :" +  itemNum[1]+"개");
						System.out.println("3)"+menu[2]+":" +  itemNum[2]+"개");
						String work2 = scanner.nextLine();
						if(work2.equals("콜라") || work2.equals("1")) {
							System.out.println(menu[0]+"의 재고를 추가 합니다");
							System.out.println("추가할 수량을 입력하세요");
							plusItem = scanner.nextInt();
							itemNum[0] += plusItem;
							System.out.println("추가된재고");
							System.out.println(menu[0]+"에" + plusItem+"수 만큼 추가 되었습니다.");
						}
						else if(work2.equals("환타") || work2.equals("2")) {
							System.out.println(menu[1]+"의 재고를 추가 합니다");
							System.out.println("추가할 수량을 입력하세요");
							plusItem = scanner.nextInt();
							itemNum[1] += plusItem;
							System.out.println("추가된재고");
							System.out.println(menu[1]+"에" + plusItem+"수 만큼 추가 되었습니다.");
						}
						else if(work2.equals("사이다") || work2.equals("3")) {
							System.out.println(menu[2]+"의 재고를 추가 합니다");
							System.out.println("추가할 수량을 입력하세요");
							plusItem = scanner.nextInt();
							itemNum[2] += plusItem;
							System.out.println("추가된재고");
							System.out.println(menu[2]+"에" + plusItem+"수 만큼 추가 되었습니다.");
						}
						else if(work2.equals("종료") || work2.equals("4")) {
							System.out.println("메뉴로 돌아갑니다");
							break;
						}
					}
				}
				else {
					System.out.println("접근할 권한이 없습니다.");
				}
			}
		}
	}//m e
}//c e
