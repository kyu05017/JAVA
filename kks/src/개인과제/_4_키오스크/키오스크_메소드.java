package 개인과제._4_키오스크;

import java.util.Scanner;

import Day07.Day07_5_bookApplication;

public class 키오스크_메소드 {

	static Scanner scanner = new Scanner(System.in);
	static 키오스크_메소드 appAplication = new 키오스크_메소드();
	static 키오스크메뉴 keymenu = new 키오스크메뉴();
	
	public static void main(String[] args) {
		
		
		
		appAplication.menu();
	}
	
	void menu() {
		while(true) {
			System.out.println("------자판기------");
			System.out.println("구매할 항목 선택");
			System.out.println("1콜라300원 2환타200원 3사이다300원");
			System.out.println("4결제");
			int ch = scanner.nextInt();
			if(ch == 1) {
				keymenu.bc();
			}
			else if(ch == 2) {
				keymenu.bw();
			}
			else if(ch == 3) {
				keymenu.buyci();
			}
			else if(ch == 4) {
				int result = (keymenu.buycoke*300)+(keymenu.buywhan*200)+(keymenu.buycider*100);
				appAplication.pay(keymenu.buycoke,keymenu.buywhan,keymenu.buycider,result);
			}
			else {
				System.out.println("알림)) 준비되어있지 않은 메뉴 입니다.");
			}
		}
	}
	
	void pay(int x,int y,int z,int total) {
		System.out.println("------결제창-------");
		System.out.println("품목\t수량\t가격");
		if(x != 0)System.out.printf("콜라\t%d\t%d\n",x,x*300);
		if(y != 0)System.out.printf("환타\t%d\t%d\n",y,y*200);
		if(z !=0 )System.out.printf("사이다\t%d\t%d\n",z,z*100);
		System.out.println("총 결제 금액 " + total + "원");
		System.out.println("1결제 2결제취소");
		int ch2 = scanner.nextInt();
		if(ch2 == 1) {
			while(true) {
				System.out.println("결제금액을 입력하세요");
				int money =scanner.nextInt();
				
				if(money >= total) {
					System.out.println("결제가 완료 되었습니다");
					keymenu.cokeitem -= x;
					keymenu.whanitem -= y;
					keymenu.cideritem -= z;
					keymenu.buycoke = 0; keymenu.buywhan =0; keymenu.buycider = 0;
					
					
					break;
				}
				else if ( money < total) {
					System.out.println("결제금액이 부족합니다");
				}
			}
		}
		else if( ch2 == 2) {
			System.out.println("결제를 취소했습니다.");
			keymenu.cokeitem -= x;
			keymenu.whanitem -= y;
			keymenu.cideritem -= z;
			keymenu.buycoke = 0; keymenu.buywhan =0; keymenu.buycider = 0;
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
	}
}

