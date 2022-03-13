package Day08;


public class Loan {
	
	//필드
	String lname;
	int loanmoney;
	final double interest = 0.1;
	String lid;
	boolean repay;
	
	//생성자
	
	public Loan() {
		
	}

	public Loan(String lname, int loanmoney, String lid, boolean repay) {
		this.lname = lname;
		this.loanmoney = loanmoney;
		this.lid = lid;
		this.repay = repay;
	}
	
	//메소드

	void newloan(String loginid) {
		System.out.println("----------------대출 상품 등록 페이지------------------");
		// 1. 입력받기
		System.out.println("대출 상품이름 입력 : "); String lname = Day08_5.scanner.next();
		System.out.println("대출 금액 입력 : "); int loan = Day08_5.scanner.nextInt();
		
		// * 중복체크
		for(Loan temp : Day08_5.loanlist) {
			if(temp!=null && temp.lname.equals(lname)) {
				System.out.println("알림)) 현재 사용중인 대출 상품입니다.[등록실패]");
				return; // 대출상품등록 메소드 종료 (등록실패)
			}
		}
		
		// 2. 객체화 [ 도서대여여부 = true, 대여회원id = null ]
		Loan newloan = new Loan(lname, loan, null, false);
		
		// 3. 배열 대입[넣기]
		int index = 0;
		for(Loan temp : Day08_5.loanlist) {
			if(temp==null) {
				System.out.println("알림)) 대출 상품 등록이 완료되었습니다.");
				Day08_5.loanlist[index]=newloan;
				return; // 등록 성공시 메소드 종료
			}
			index++;
		}
	}
	/////////////////////////////////////////////////
	void loanlsit(String x) {//대출 목록
		System.out.println("대출상품 목록 목록))");
		System.out.print("대출상품\t대출잔액\t\n");
		try {
			for(Loan temp : Day08_5.loanlist) {
				
				if(temp != null && x.equals(temp.lid)) {
					System.out.println(temp.lname + "\t"+ temp.loanmoney);
					System.out.println("1)대출받기  2)뒤로가기");
					int ch = Day08_5.scanner.nextInt();
					if(ch == 1) {
						System.out.println("알림)) 대출 페이지로 이동합니다.");
						inloan(x);
					}
					else if(ch == 2) {
						System.out.println("알림)) 이전으로 돌아갑니다.");
						return;
					}
				}
				if(temp != null && x.equals("admin")) {
					System.out.println(temp.lname + "\t"+ temp.loanmoney);
					System.out.println("1)대출상품삭제  2)뒤로가기");
					int ch = Day08_5.scanner.nextInt();
					if(ch == 1) {
						System.out.println("알림)) 대출 삭제 페이지로 이동합니다.");
						removeloan(x);
					}
					else if(ch == 2) {
						System.out.println("알림)) 이전으로 돌아갑니다.");
						return;
					}
				}
			}
		}
		catch(NullPointerException e) {
			System.out.println("알림)) 잘못된 정보 입니다.");
		}
	}
/////////////////////////////////////////////////////////////////////////////	
	void removeloan(String loginid) {
		System.out.println("----------------대출 상품 삭제 페이지------------------");
		// 1. 입력받기
		System.out.println("삭제할 대출 상품이름 입력 : "); String lname = Day08_5.scanner.next();
		
		// * 중복체크
		for(Loan temp : Day08_5.loanlist) {
			if(temp==null && !temp.lname.equals(lname)) {
				System.out.println("알림)) 존재하지 않는 대출 상품입니다.");
				return; // 대출상품등록 메소드 종료 (등록실패)
			}
		}
		
		// 3. 배열 대입[넣기]
		int i = 0;
		for(Loan temp : Day08_5.loanlist) {
			if(temp != null && temp.lname.equals(lname)) {
				Day08_5.loanlist[i] = null;
			}
			i++;
		}
	}
///////////////////////////////////////////////////////////////////////////////////	
	void myloan(String x) {
		System.out.println("대출받은상품 목록 목록))");
		System.out.print("대출상품\t대출잔액\t\n");
		try {
			for(Loan temp : Day08_5.loanlist) {
				if(temp != null &&temp.lid.equals(x)) {
					System.out.println(temp.lname + "\t"+ temp.loanmoney);
					System.out.println("1)대출상환  2)뒤로가기");
					int ch = Day08_5.scanner.nextInt();
					if(ch == 1) {
						System.out.println("알림)) 대출상환 페이지로 이동합니다.");
						outloan(x);
					}
					else if(ch == 2) {
						System.out.println("알림)) 이전으로 돌아갑니다.");
						return;
					}
					
				}
			}
		}
		catch(NullPointerException e) {
			System.out.println("알림)) 잘못된 정보 입니다.");
		}
	}
///////////////////////////////////////////////////////////////////////////////////	
	void outloan(String x) {
		System.out.println("대출상환)) ");
		System.out.print("상환할 대출상품의 이름을 입력하세요 :");
		String out = Day08_5.scanner.next();
		try {
			int j = 0;
			for(Loan temp : Day08_5.loanlist) {
				if(temp != null && temp.lname.equals(out)) {
					Bankbook bankbook = new Bankbook(loanmoney);
					int i = 0;
					for(Bankbook temp2 : Day08_5.bankbooks) {
						if(temp2 != null && temp2.username.equals(x)) {
							System.out.println(temp.lname+" 상품을 상환 합니다.");
							System.out.println("상환 금액은 "+ (temp.loanmoney+(temp.loanmoney*interest)) + "원 입니다.");
							Day08_5.bankbooks[i].nowmoney -= (temp.loanmoney+(temp.loanmoney*interest));
							Day08_5.loanlist[j].lid = null;
						}
					}
				}
				else {
					System.out.println("알림)) 존재하지 않는 상품입니다.");
				}
				j++;
			}
		}
		catch(NullPointerException e) {
			System.out.println("알림)) 잘못된 정보 입니다.");
		}
	}
//////////////////////////////////////////////////////////////////////////////////////////////	
	void inloan(String x) {
		System.out.println("대출받기)) ");
		System.out.print("받으실 대출상품의 이름을 입력하세요 :");
		String ln = Day08_5.scanner.next();
		try {
			int j = 0;
			for(Loan temp : Day08_5.loanlist) {
				if(temp != null && temp.lname.equals(ln)) {
					Bankbook bankbook = new Bankbook(loanmoney);
					int i = 0;
					for(Bankbook temp2 : Day08_5.bankbooks) {
						if(temp2 != null && temp2.username.equals(x)) {
							System.out.println(temp.lname+" 상품을  대출받았습니다.");
							Day08_5.bankbooks[i].nowmoney += temp.loanmoney;
							Day08_5.loanlist[j].lid = x;
						}
					}
				}
				else {
					System.out.println("알림)) 존재하지 않는 상품입니다.");
				}
				j++;
			}
		}
		catch(NullPointerException e) {
			System.out.println("알림)) 잘못된 정보입니다.");
		}
	}
/////////////////////////////////////////////////////////////////////////////////////////
}
