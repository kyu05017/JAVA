package 개인과제_4번쨰_키오스크;

import java.util.Scanner;

public class 키오스크_도전2_10분 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int bc = 0;
		int bw = 0;
		int bci = 0;
		int ci = 10;
		int wi = 10;
		int cidi = 10;
		
		while(true) {
			System.out.println("----*자판기-----");
			System.out.println("구매할 항목 선택");
			System.out.println("1콜라300원 2환타200원 3사이다300원");
			System.out.println("4결제");
			int ch = scanner.nextInt();
			if(ch == 1) {
				System.out.println("콜라를 추가했습니다/");
				bc +=1;
				ci -=1;
			}
			else if ( ch == 2 ) {
				System.out.println("환타를 추가했습니다.");
				bw += 1;
				wi -= 1;
			}
			else if ( ch == 3) {
				System.out.println("사이다를 추가했습니다");
				bci += 1;
				cidi -= 1;
			}
			else if ( ch ==4 ) {
				System.out.println("------결제창-------");
				System.out.println("품목\t수량\t가격");
				if(bc != 0)System.out.printf("콜라\t%d\t%d\n",bc,bc*300);
				if(bw != 0)System.out.printf("환타\t%d\t%d\n",bw,bw*200);
				if(bci!=0 )System.out.printf("사이다\t%d\t%d\n",bci,bci*100);
				int total = (bc*300)+(bw*100)+(bci*100);
				System.out.println("총 결제 금액 " + total + "원");
				System.out.println("1결제 2결제취소");
				int ch2 = scanner.nextInt();
				
				if(ch2 == 1) {
					while(true) {
						System.out.println("결제금액을 입력하세요");
						int money =scanner.nextInt();
						
						if(money >= total) {
							System.out.println("결제가 완료 되었습니다");
							bc = 0; bw =0; bci = 0;
							break;
						}
						else if ( money < total) {
							System.out.println("결제금액이 부족합니다");
						}
					}
				}
				else if( ch2 == 2) {
					System.out.println("결제를 취소했습니다.");
					ci += bc; wi += bw; cidi += bci; 
				}
				else {
					System.out.println("잘못된 입력입니다.");
				}
			}
			else {
				System.out.println("잘못된 입력입니다");
			}
		}

	}

}
