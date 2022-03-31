package 개인과제._04_키오스크;

import java.util.Scanner;

public class 키오스크_도전_12분 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int buyCoke =0;
		int buyWhan = 0;
		int buycider = 0;
		int CokeItem = 10;
		int whanItem = 10;
		int ciderItem = 10;
		
		while(true) {
			System.out.println("------자판기-----");
			System.out.println("구매하실 음료를 고르세요");
			System.out.println("(1) 콜라(300원) (2)환타(200원) (3)사이다(100원)");
			System.out.println("(4) 결제");
			int ch = scanner.nextInt();
			
			if (ch == 1) {
				System.out.println("콜라를 장바구니에 추가했습니다");
				buyCoke +=1;
				CokeItem -=1;
			}
			else if(ch ==2) {
				System.out.println("환타를 장바구니에 추가했습니다.");
				buyWhan += 1;
				whanItem -=1;
			}
			else if(ch==3) {
				System.out.println("사이다를 장바구니에 추가했습니다.");
				buycider +=1;
				ciderItem -= 1;
			}
			else if(ch==4) {
				System.out.println("-----장바구니-----");
				System.out.println("품목\t종류\t수량");
				if(buyCoke!=0)System.out.printf("콜라\t%d\t%d",buyCoke,(buyCoke*300));
				if(buyWhan!=0)System.out.printf("환타\t%d\t%d",buyWhan,(buyWhan*200));
				if(buycider!=0)System.out.printf("사이다\t%d\t%d",buycider,(buycider*100));
				int total = (buyCoke*300) + (buyWhan*200) + (buycider*100);
				System.out.println("구매하실 금액" + total +"원");
				System.out.println("(1)결제 (2)결제취소");
				int ch2 = scanner.nextInt();
				if(ch2 == 1) {
					while(true) {
						System.out.println("결제 금액을 입력하세요");
						int money = scanner.nextInt();
						
						if(money >= total) {
							System.out.println("결제가 완료 되었습니다.");
							buyCoke = 0; buyWhan = 0; buycider = 0;
							break;
						}
						else if(money < total){
						System.out.println("결제 금액이 부족합니다.");
						}
						else {
							System.out.println("잘못된 입력입니다.");
						}
					}
				}
				else if(ch == 2) {
					System.out.println("결제를 취소하셨습니다.");
					ciderItem += buycider;whanItem += buyWhan;CokeItem +=buyCoke;
					break;
				}
			}
			else {
				System.out.println("존재하지 않는 기능 입니다.");
			}
		}
	}

}
