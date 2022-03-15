package Day09;

import java.util.Scanner;

public class Day09_6 {// m c s
	
	// 은행계좌프로긂 [ 상속 ]
			// 은행[super]
			// 국민은행[sub], 신한은행[sub], 하나은행[sub]
			
			// 주 기능 : 1. 계좌생성/ 2.입금 / 3. 출금 /4.이체/ 5.내 계좌 목록 / 6.대출
	
	// main 밖에 선언 하는 이유
		// 모든 클래스에서 사용하기 위해 static 사용
		// static 변수는 프로그램 시작시 메모리 할당 > 끝날때 하지 메모리 유지
	public static Bank[] banks = new Bank[1000];
	
	public static void main(String[] args) {
		Day09_6 aa = new Day09_6();
		aa.menu();
	}
	void menu() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			Controler controler = new Controler();
			System.out.println("----------------------메뉴----------------------");
			System.out.println("1.계좌생성 2.입금 3.출금 4.이체 5.내 계좌 6.대출 7.로그아웃");
			System.out.print("메뉴 선택 : \n");
			int ch = scanner.nextInt();
			if(ch == 1) {
				System.out.println("계좌생성 페이지))");
				System.out.println("비밀번호 입력 : ");String pw = scanner.next();
				System.out.println("계좌주 입력	  : ");String name = scanner.next();
				System.out.println("은행 목록(1.국민은행 2.신한은행 3.신한은행)");
				System.out.print("은행선택 : \n"); int bankcompanynum = scanner.nextInt();
				String result  = controler.resregistration(pw, name, bankcompanynum);
				if(result != null) {
					System.out.println("알림)) 계좌 생성이 완료 되었습니다.");
					System.out.println("계좌번호는 "+ result + "입니다.");
				}
				else {System.out.println("알림)) 계좌 등록에 실패했습니다.");}
			}
			else if(ch == 2) {
				System.out.println("입금 페이지))");
				System.out.println("계좌번호 입력 : ");String bknum = scanner.next();
				System.out.println("입금할 금액 입력 : ");int putmoney = scanner.nextInt();
				int inmoney = controler.inmoney(bknum,putmoney);
				
				if(inmoney == 0) {
					System.out.println("알림)) "+putmoney+"원이 "+bknum+"계좌로 입금이 완료 되었습니다.");
				}
				else if(inmoney == 2){
					System.out.println("알림)) 계좌번호 또는 비밀번호가 잘못되었습니다.");
				}
				else {System.out.println("알림)) 입금에 실패 했습니다.");}
			}
			else if(ch == 3) {
				System.out.println("출금 페이지))");
				System.out.println("계좌번호 입력 : ");String bknum = scanner.next();
				System.out.println("비밀번호 입력 : ");String pw = scanner.next();
				System.out.println("출금할 금액 입력 : ");int putmoney = scanner.nextInt();
				int outmoney = controler.outmoney(bknum,pw,putmoney);
				if(outmoney == 0) {
					System.out.println("알림)) "+putmoney+"원이 "+bknum+"계좌에서 출금이 완료 되었습니다.");
				}
				else if(outmoney == 2){
					System.out.println("알림)) 계좌번호 또는 비밀번호가 잘못되었습니다.");
				}
				else if(outmoney == 3){
					System.out.println("알림)) 잔액이 부족하여 출금에 실패했습니다.");
				}
				else {System.out.println("알림)) 출금에 실패 했습니다.");}
			}
			else if(ch == 4) {
				System.out.println("이체 페이지))");
				System.out.println("계좌번호 입력 : ");String bknum = scanner.next();
				System.out.println("비밀번호 입력 : ");String pw = scanner.next();
				System.out.println("받는 사람의 계좌번호 입력 : ");String bknum2 = scanner.next();
				System.out.println("이체할 금액 입력 : ");int putmoney = scanner.nextInt();
				
				int reslut = controler.sendmoney(bknum,pw,bknum2,putmoney);
				if(reslut == 2) {
					System.out.println("계좌번호 "+ bknum2+ "로 "+putmoney+"원을 이체 했습니다.");
				}
				else if(reslut == 4) {
					System.out.println("알림)) 계좌번호 혹은 비밀번호를 잘못입력했습니다.");
				}
				else if(reslut == 1) {
					System.out.println("알림)) 계좌에 잔액이 부족하여 이체에 실패했습니다.");
				}
				else {
					System.out.println("알림)) 이체에 실패했습니다.");
				}
			}
			else if(ch == 5) {
				System.out.println("내 계좌 목록 페이지))");
				System.out.println("계좌주 입력 : ");String name = scanner.next();
				System.out.println("순서\t계좌번호\t잔액\t대출액");
				
				Bank[] mybanklist = controler.mylist(name);
				int i = 1;
				for(Bank temp : mybanklist) {
					if(temp != null) {
					System.out.printf("%d\t%s\t%d원\t%d\n",i,temp.getBanknum(),temp.getMymoney(),temp.getLoanmoney());
					i++;
					}
				}
			}
			else if(ch == 6) {
				System.out.println("대출 페이지))");
				System.out.println("1)대출 2)상환");
				int ch2 = scanner.nextInt();
				
				if(ch2 == 1) {
					System.out.println("대출))");
					System.out.println("계좌번호 입력 : ");
					String bnum = scanner.next();
					System.out.println("비밀번호 입력 : ");
					String pw = scanner.next();
					System.out.println("대출 받을 금액 입력 (이자율 10%)");
					int loan = scanner.nextInt();
					boolean result = controler.loanmoney(bnum,pw,loan);
					if(result) {
						System.out.println("알림)) 대출이 승인 완료되었습니다.");
						System.out.println(bnum+"계좌에 "+loan+"원이 입금되었습니다. ( 이율 10% )");
					}
					else {
						System.out.println("알림)) 대출이 거절되었습니다.");
					}
				}
				else if(ch2 == 2) {
					System.out.println("상환))");
					System.out.println("계좌번호 입력 : ");
					String bnum = scanner.next();
					System.out.println("비밀번호 입력 : ");
					String pw = scanner.next();
					
					for(Bank temp : Day09_6.banks) {
						if(temp!=null && bnum.equals(temp.getBanknum()) && pw.equals(temp.getBankpw())) {
							System.out.println("당신의 상환 금액은 "+temp.getLoanmoney()+"원 입니다.");
						}
					}
					
					
				}
				else {
					System.out.println("알림)))잘못된 입력입니다.");
				}
				
			}
			else if(ch == 7) {
				System.out.println("알림)) 프로그램을 종료했습니다.");
				break;
			}
			else {System.out.println("알림))잘못된 입력");}
		}
	}
}// m c e
