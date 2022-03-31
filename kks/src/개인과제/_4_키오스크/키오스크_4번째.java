package 개인과제._4_키오스크;

import java.util.Scanner;

public class 키오스크_4번째 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int bc = 0;
		int bw = 0;
		int bci = 0;
		int ci = 10;
		int wi = 10;
		int cidi = 10;
		
		while(true) {
			System.out.println("자판기");
			System.out.println("1)콜라 300원 2)환타 200원 3)사이다 100원");
			System.out.println("4)결제");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("콜라를 추가했씁니다");
				bc +=1;
			}
			else if (ch ==2) {
				System.out.println("환타를 추가했씁니다");
				bw +=1;
			}
			else if(ch ==3) {
				System.out.println("사이다를 추가했씁니다");
				bci +=1;
			}
			else if(ch == 4) {
				System.out.println("결제창");
				System.out.println("품목\t수량\t가격");
				if(bc != 0)System.out.printf("콜라\t%d\t%d\n",bc,bc*300);
				if(bw != 0)System.out.printf("환타\t%d\t%d\n",bw,bw*200);
				if(bci!= 0)System.out.printf("사이다\t%d\t%d\n",bci,bci*100);
				int total = bc*300+bw*200+bci*100;
				System.out.println("총 결제금액 "+ total + "원");
				System.out.println("1)결제 2)결제취소");
				int ch2 = scanner.nextInt();
				if(ch2==1) {
					System.out.println("결제할 금액을 입력하세요");
					System.out.print("입력 :");
					int money = scanner.nextInt();
					if(money >= total) {
						System.out.println("결제가 완료되었습니다.");
						ci -= bc; wi -= bw; cidi -= bci;
						bc =0;bw=0;bci=0;
						break;
					}
					else {
						System.out.println("결제금액이 부족합니다.");
					}
				}
				if(ch2==2) {
					System.out.println("결제를 취소하셨습니다.");
					bc =0;bw=0;bci=0;
				}
				
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
