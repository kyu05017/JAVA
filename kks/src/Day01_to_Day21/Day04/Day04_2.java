package Day01_to_Day21.Day04;

import java.util.Scanner;

public class Day04_2 {//c s

	public static void main(String[] args) {//m s
		
		//1. 메뉴판 [ 1.콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ]
			//1.메뉴판에서 제품을 선택하면 장바구니에 넣기
			//2.제고가 부족하면 알림(제고부족)
		//2. 초기 재고 [ 제품 당 10개씩 ]
		//3. 결제시 금액을 입력받아 결제액 만큼 차감후 잔돈 출력
			//1. 투입한 금액보다 구매액이 더 크면 결제 취소 [ 돈이 부족하면 ]
			//2.
		
		//공통변수 [ 모든 괄호 내에서 사용하는 변수
		Scanner scanner = new Scanner(System.in); //1.입력객체
		
		int cokeNum = 10; int whanNum = 10; int ciderNum = 10;//2.콜라재고
		int buyCoke = 0; int buyWhan = 0; int buyCider =0;//3.장바구니
		
		
		
		// 프로그램 시작 [무한루프] - 종료 조건 없음
		while(true) {
		System.out.println("-------------------메뉴-----------------");
		System.out.println("1.콜라(300) 2.환타(200)  3.사이다(100) 4.결제");
		System.out.println(">>>>>>>>>>>선택 : ");int choice = scanner.nextInt();
		
		if ( choice == 1 ) { //콜라구매
			if(cokeNum == 0) {//콜라재고가 0 이면 구매 불가
				System.out.println();
				System.err.println("알림) 콜라재고가 없습니다.");
				System.out.println();
			}else{//콜라 재고가 있으면 구매가능
				System.out.println();
				System.err.println("[콜라를 장바구니에 담았습니다]");
				buyCoke++;
				cokeNum--;
			}
		}//콜라구매끝
		else if ( choice == 2) { //환타 구매
			if(whanNum == 0) {
				System.out.println();
				System.err.println("알림) 환타재고가 없습니다.");
				System.out.println();
			}
			else {
				System.out.println();
				System.err.println("[환타를 장바구니에 담았습니다]");
				buyWhan++;
				whanNum--;
			}
		}//환타구매끝
		else if ( choice == 3) { //사이다 구매
			if(ciderNum == 0) {
				System.out.println();
				System.err.println("알림) 사이다재고가 없습니다.");
				System.out.println();
			}
			else {
				System.out.println();
				System.err.println("[사이다를 장바구니에 담았습니다]");
				buyCider++;
				ciderNum--;
			}			
		}//사이다구매끝
		else if ( choice == 4) {//결제
			if(buyCoke == 0 && buyWhan == 0 && buyCider == 0) {
				System.out.println();
				System.err.println("알림) 구매하실 상품이 없습니다.");
				System.out.println();
			}
			else {
				
				System.out.println("결제 제품목록");
				System.out.println("제품명\t수량\t금액");
				if(buyCoke != 0) System.out.println("콜라\t"+buyCoke+"\t" +(buyCoke*300));
				if(buyWhan != 0) System.out.println("환타\t"+buyWhan+"\t" +(buyWhan*200));
				if(buyCider != 0) System.out.println("사이드\t"+buyCider+"\t" +(buyCider*100));
				int total = (buyCoke*300)+(buyWhan*200)+(buyCider*100);
				System.out.println("총 결제 금액은 "+ total+"원 입니다.");
				System.out.println("1.결제 2.취소");
				int choice2 = scanner.nextInt();
				if( choice2 == 1) {//결제
					//1. 금액 입력받는다
					//2. 금액이 결제액보다 적으면 결제 불가 -> 금액 재입력
					//3. 금액이 결제액보다 많으면 결제 성공 -> 장바구니 초기화
					while(true) { //무한 루푸의 ㅣ종료 조건은 금액이 결제액보다 크면)
						System.out.println("지불할 금액을 입력하세요");
						System.out.println("입력 : ");
						int myMoney = scanner.nextInt();
						if (myMoney >= total) {
							int change = myMoney - total;
							System.err.println("결제가 완료 되었습니다. 감사합니다. 거스름돈 : "+change+"원 입니다.");
							buyCoke = 0; buyWhan = 0; buyCider = 0;	//구매수 초기화
							break; // while 탈출  break 기준으로 가장 가까운 반복문 탈출
						}
						else if (myMoney < total) {
							System.err.println("금액이 부족하여 결제에 실패했습니다 다시 입력해주세요");
						}
					}
				}
				else if (choice == 2) {//취소
					System.err.println("알림) 구매몰록 모두 지우기");
					cokeNum+=buyCoke; whanNum+=whanNum; ciderNum +=buyCider;	//재고 초기화
					buyCoke = 0; buyWhan = 0; buyCider = 0;						//구매수 초기화
				}
				
			}
		}//결제끝
		else if(choice == 5) {
			System.out.println("재고 확인");
			System.out.println("현재 재고");
			System.out.println("콜라 :" +cokeNum);
			System.out.println("환타 :" +whanNum);
			System.out.println("사이다:" +ciderNum);
		}
		else if(choice == 6) {
			System.out.println("재고 초기화");
			cokeNum = 10;
			whanNum = 10;
			ciderNum= 10;
			System.out.println("현재 재고");
			System.out.println("콜라 :" +cokeNum);
			System.out.println("환타 :" +whanNum);
			System.out.println("사이다:" +ciderNum);
		}
		else {//그외 숫자는 오류
			System.err.println("에러) 사용할수 없는 기능입니다"); //시스템 에러는 빨간색으로 출력
		}//오류끝
		}
		
		

	}//m e

}//c e
