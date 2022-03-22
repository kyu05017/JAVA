package 개인과제14_모바일뱅크시스템;

import java.util.Scanner;

import 모바일_뱅크_시스템.Bankbook;
import 모바일_뱅크_시스템.Day08_5;
import 모바일_뱅크_시스템.Loan;

public class Controller {
	
	static Account[] accountlist = new Account[1000];
	static Bank_Book[] banklist = new Bank_Book[1000];
	static Loan_System[] loanlist = new Loan_System[1000];
	
/////////////////////////////////////////////////////////////////////////////////////////
	
	boolean registration(String id,String pw,String name,String phone) {
		
		Account account = new Account(name, id, pw, phone);
		int i = 0;
		for(Account temp : accountlist) {
			if(temp == null) {
				accountlist[i] = account;
				return true;
			}
			i++;
		}
		return false;
	}
	
	String login(String id, String pw) {
		
		for(Account temp : accountlist) {
			
			if(temp != null && id.equals("admin") && temp.getPw().equals(pw)) {
				return "admin";
			}
			else if(temp != null && temp.getId().equals(id) && temp.getPw().equals(pw)) {
				return temp.getId();
			}
		}
		return "실패";
	}
	
	String findid(String name, String phone) {
		
		for(Account temp : accountlist) {
			
			if(temp != null && temp.getName().equals(name) && temp.getPhone().equals(phone)) {
				return temp.getId();
			}
		}
		return "실패";
	}
	
	String findpw(String id, String phone) {
		
		for(Account temp : accountlist) {

			if(temp != null && temp.getId().equals(id) && temp.getPhone().equals(phone)) {
				return temp.getPw();
			}
		}
		return "실패";
	}
	
/////////////////////////////////////////////////////////////////////////////////////////
	
	boolean bankregistration(String id, int bnum, String pw) {
		
		Bank_Book bank = new Bank_Book(bnum, 0, pw, id, 0);
		
		int i = 0;
		for(Bank_Book temp : banklist) {
			if(temp == null) {
				banklist[i] = bank;
				return true;
			}
			i++;
		}
		
		return false;
	}
	
	boolean inmoney(String id, int bnum, String pw, int money) {
		
		int i = 0;
		for(Bank_Book temp : banklist) {
			if(temp != null &&temp.getBanknum() == bnum && temp.getBankpw().equals(pw) && temp.getUsername().equals(id)) {
				
				banklist[i].setNowmoney(+money);
				return true;
			}
			i++;
		}

		return false;
	}
	
	boolean outmoney(String id, int bnum, String pw, int money) {
		int i = 0;
		for(Bank_Book temp : banklist) {
			if(temp != null &&temp.getBanknum() == bnum && temp.getBankpw().equals(pw) && temp.getUsername().equals(id)) {
				
				banklist[i].setNowmoney(-money);
				return true;
			}
			i++;
		}

		return false;
	}
	
	void bankbooklsit(String id) {
		
		for(Bank_Book temp : banklist) {
			if(temp != null && temp.getUsername().equals(id)) {
				System.out.println(temp.getBanknum() + "\t"+ temp.getNowmoney()+"\t"+temp.getLoanm());
			}
		}
	}
	
	void sendmoney(String id, int bnum, String pw) { 
		
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		for(Bank_Book temp : banklist) {
			if(temp.getBanknum() == bnum && temp.getBankpw().equals(pw)) {
				System.out.print("받으실분 계좌번호  : "); 
				int bnum2 = scanner.nextInt();
				int j = 0;
				for(Bank_Book temp2 : banklist) {
					if(temp2 != null && temp2.getBanknum() == bnum2) {
						System.out.print("이체할 금액을 입력하세요. : ");
						int money2 = scanner.nextInt();
						if(temp.getNowmoney() < money2) {
							System.out.println("알림)) 잔액이 부족하여 이체를 실패했습니다.");
						}
						else {
							banklist[j].setNowmoney(+money2);
							banklist[i].setNowmoney(-money2) ;
							System.out.println("계좌번호 "+bnum+"에 "+money2+"원을 이체 했습니다.");
							return;
						}
					}
					j++;
				}
			}
			i++;
		}
		
	}
	
	void findbankpw(String id, int bnum, String phone) {
		
		for(Bank_Book temp : banklist) {
			if(temp != null && temp.getBanknum() == bnum && temp.getUsername().equals(id)) {
				for(Account temp2 : accountlist) {
					if(temp2 != null && temp2.getPhone().equals(phone)) {
						System.out.println("회원님의계좌 비밀번호는 "+ temp.getBankpw()+ "입니다");
						return;
					}
				}
			}
		}
	}
	
/////////////////////////////////////////////////////////////////////////////////////////	
	
	void newloan(String lname, int loan) {
		
		for(Loan_System temp : loanlist) {
			if(temp!=null && temp.getLname().equals(lname)) {
				System.out.println("알림)) 현재 사용중인 대출 상품입니다.[등록실패]");
				return; 
			}
		}
		
		Loan_System newloan = new Loan_System(lname, loan, " ", false);
		
		int i = 0;
		for(Loan_System temp : loanlist) {
			if(temp==null) {
				System.out.println("알림)) 대출 상품 등록이 완료되었습니다.");
				loanlist[i]=newloan;
				return;
			}
			i++;
		}
	}
	
	void loanlsit(String id) {
		
		Scanner scanner = new Scanner(System.in);
		
		for(Loan_System temp : loanlist) {
			if(temp!=null) {
				System.out.println(temp.getLname()+"\t"+temp.getLoanmoney()+"\t"+(temp.getInterest()*100)+"%"+temp.getLid());
			}
		} 
		System.out.println("1)대출받기  2)뒤로가기");
		int ch = scanner.nextInt();
		
		
		if(ch == 1) {
			System.out.println("알림)) 대출 페이지로 이동합니다.");
			inloan(id);
		}
		else if(ch == 2) {
			System.out.println("알림)) 이전으로 돌아갑니다.");
			return;
		}
	}
	
	void removeloan() {
		
		Scanner scanner = new Scanner(System.in);
		
		for(Loan_System temp : loanlist) {
			if(temp!=null) {
				System.out.println(temp.getLname()+"\t"+temp.getLoanmoney()+"\t"+(temp.getInterest()*100)+"%"+temp.getLid());
			}
		}
		String lname =scanner.next();	
		int a =0;
		for(Loan_System temp : loanlist) {
			if(temp!=null && !temp.getLname().equals(lname)) {
				
			}
			else if(temp!=null && temp.getLname().equals(lname)) {
				System.out.println("검색 결과 : ");
				System.out.println("상품이름\t대출금액\t이자율");
				System.out.println(temp.getLname()+"\t"+temp.getLoanmoney()+"\t"+(temp.getInterest()*100)+"%");
				System.out.println("1.삭제 2.취소"); int ch = scanner.nextInt();
				
				if(ch==1) {
					System.out.println("알림)) 해당 상품이 삭제되었습니다.");
					loanlist[a]=null;
					int j = 0;	
					for(Loan_System temp2 : loanlist) {
						if(temp2==null) {
							for(int i=j; i<loanlist.length; i++) {
								if(i==loanlist.length-1) {
									loanlist[loanlist.length-1] = null;
								}
								else {
									loanlist[i]=loanlist[i+1];
								}
							}
						}
						j++;	
					} // for end
					return;
				} // if end
				else if(ch==2) {
					System.out.println("알림)) 관리자 메뉴로 돌아갑니다.");
					return;
				}
				else System.out.println("알림)) 알 수 없는 입력입니다.");
					return;
			}
			a++;
		} // for end
		System.out.println("알림)) 일치하는 대출 상품이 없습니다.");
	}
	
	void myloan() {
		
	}
	
	void outloan() {
		
	}
	
	void inloan(String id) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("대출받기)) ");
		System.out.print("받으실 대출상품의 이름을 입력하세요 : \n");
		String ln = scanner.next();
		try {
			int j = 0;
			for(Loan_System temp : loanlist) {
				if(temp != null && temp.getLname().equals(ln)) {
					System.out.print("받으실 계좌번호를 입력하세요.  : \n");
					int bnum = scanner.nextInt();
					int i = 0;
					for(Bank_Book temp2 : banklist) {
						if(temp2 != null && temp2.getUsername().equals(id)&&temp2.getBanknum() == bnum) {
							System.out.println(temp.getLname()+" 상품을  대출받았습니다.");
							banklist[i].getNowmoney() += temp.loanmoney;
							banklist[i].setLoanm((temp.getLoanmoney()+(temp.setLname(*temp.getInterest()))));
							loanlist[j].lid = x;
							return;
						}
						i++;
					}
				}
				
				j++;
			}
			System.out.println("알림)) 존재하지 않는 상품입니다.");
		}
		catch(NullPointerException e) {
			System.out.println("알림)) 잘못된 정보입니다.");
		}
	}
}
