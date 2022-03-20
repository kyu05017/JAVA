package 개인과제04_키오스크;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class 키오스크개인과제_1번 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int bc = 0;
		int bw = 0;
		int bci = 0;
		int ci = 10;
		int wi = 10;
		int ciit = 10;
		while(true) {
			System.out.println("자판기");
			System.out.println("1)콜라 2)환타 3)사이다");
			int ch = scanner.nextInt();
			if(ch==1) {
				System.out.println("콜라를 구매했습니다.");
				bc +=1;
			}
			else if(ch==2) {
				System.out.println("환타를 구매했습니다.");
				bw += 1;
			}
			else if(ch ==3) {
				System.out.println("사이다를 구매했습니다.");
				bci += 1;
			}
			else if(ch ==4) {
				System.out.println("구매 페이지");
				System.out.println("품목\t수량\t가격");
				if(bc != 0)System.out.printf("콜라\t%d\t%d",bc,bc*300);
				if(bw != 0)System.out.printf("환타\t%d\t%d",bw,bw*200);
				if(bci!= 0)System.out.printf("사이다\t%d\t%d",bci,bci*100);
				int total = (bc*300)+(bw*200)+(bci*100);
				System.out.println("총 결재금액 : "+ total +"원");
				System.out.println("1)결제 2)취소");
				int ch2 = scanner.nextInt();
				if (ch2 ==1) {
					while(true) {
						System.out.println("결제 금액을 입력하세요");
						int money = scanner.nextInt();
						
						if(money < total) {
							System.out.println("결제에 실패하셨습니다.");
							System.out.println("사유)) 잔액부족");
						}
						else if(money >= total) {
							System.out.println("결제가 완료되었습니다.");
							ci -= bc; wi -= bw; ciit -= bci;
							bc = 0; bw =0 ; bci = 0;
							break;
						}
					}
					
				}
				else if(ch2 == 2) {
					System.out.println("결제를 취소 하셨습니다.");
					bc = 0; bw = 0;bci = 0; 
					break;
				}
					
				
				
			}
		}
	}
}
