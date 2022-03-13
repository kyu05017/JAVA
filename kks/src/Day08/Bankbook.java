package Day08;


public class Bankbook {
	
	//필드
	private int banknum; // 계좌번호
	int nowmoney;
	private String bankpw;
	String username;



	//생성자
	public Bankbook() {
		
	}
	
	public Bankbook(int nowmoney) {
		this.nowmoney = nowmoney;
	}

	public Bankbook(int banknum, int nowmoney, String bankpw, String username) {
		this.banknum = banknum;
		this.nowmoney = nowmoney;
		this.bankpw = bankpw;
		this.username = username;

	}
	//메소드
/////////////////////////////////////////////////////////////////////////////////////////////
	boolean bankregistration(String x) {//계좌생성
		System.out.println("계좌가입) ");
		System.out.print("사용할 계좌번호 입력 : \n");int banknum = Day08_5.scanner.nextInt();
		try {
			for(Bankbook temp : Day08_5.bankbooks) {
				if(temp != null && temp.banknum == banknum) {
					System.out.println("알림)) 현재 사용중인 계좌번호입니다.");
					return false;
				}
			}
		}
		catch(NullPointerException e) {
			System.out.println("알림)) 잘못된 정보 입니다.");
			return false;
		}
		System.out.print("사용할 비민번호 입력 : \n");String pw = Day08_5.scanner.next();
	
		Bankbook bankbook = new Bankbook(banknum,0, pw,x);
		try {
			int i = 0;
				for(Bankbook temp2 : Day08_5.bankbooks) {
					if(temp2 == null) {
						Day08_5.bankbooks[i] = bankbook;
						return true;
					}
					i++;
				}
		}
		catch(NullPointerException e) {
			System.out.println("알림)) 잘못된 정보 입니다.");
			return false;
		}
		return false;
	}
/////////////////////////////////////////////////////////////////////////////////////////////
	public void inmoney(String x) {//입금
		System.out.print("계좌번호  입력 	: \n");int banknum =Day08_5.scanner.nextInt();
		for(Bankbook temp : Day08_5.bankbooks) {
			if(temp != null && temp.banknum != banknum && temp.username.equals(x)) {
				System.out.println("알림)) 입력한 계좌번호가 존재하지 않습니다.");
				return;
			}
		}
		System.out.print("계좌 비밀번호 입력 : \n");String pw =Day08_5.scanner.next();
		System.out.print("입금할 금액입력 	: \n");int money =Day08_5.scanner.nextInt();
		
		try {
			int i = 0;
			for(Bankbook temp : Day08_5.bankbooks) {
				if(temp != null &&temp.banknum == banknum && temp.bankpw.equals(pw) && temp.username.equals(x)) {
					System.out.println("알림)) "+money + "원이 계좌로 입금 되었습니다");
					Day08_5.bankbooks[i].nowmoney += money;
					return;
				}
				i++;
			}
		}
		catch (NullPointerException e) {
			System.out.println("알림)) 잘못된 정보입니다.");
		}
	}
	/////////////////////////////////////////////////////////////////////////////////////////////
	void outmoney(String x) {//출금
		System.out.print("계좌번호  입력 	: \n");int banknum =Day08_5.scanner.nextInt();
		for(Bankbook temp : Day08_5.bankbooks) {
			if(temp != null && temp.banknum != banknum && temp.username.equals(x)) {
				System.out.println("알림)) 입력한 계좌번호가 존재하지 않습니다.");
				return;
			}
		}
		System.out.print("계좌 비밀번호 입력 : \n");String pw =Day08_5.scanner.next();
		System.out.print("입금할 금액입력 	: \n");int money =Day08_5.scanner.nextInt();
		
		try {
			int i = 0;
			for(Bankbook temp : Day08_5.bankbooks) {
				if(temp != null &&temp.banknum == banknum && temp.bankpw.equals(pw) && temp.username.equals(x)) {
					if(money > temp.nowmoney) {
						System.out.println("알림)) 잔액이 부족합니다.");
						return;
					}
					else {
						System.out.println("알림)) "+money + "원이 계좌에서 출금 되었습니다");
						Day08_5.bankbooks[i].nowmoney -= money;
						return;
					}
					
				}
				i++;
			}
		}
		catch (NullPointerException e) {
			System.out.println("알림)) 잘못된 정보입니다.");
		}
	}


/////////////////////////////////////////////////////////////////////////////////////////////
	void bankbooklsit(String x) {//계좌 목록
		System.out.println("계좌 목록))");
		System.out.print("계좌번호\t현재잔액\t\n");
		try {
			for(Bankbook temp : Day08_5.bankbooks) {
				if(temp != null && temp.username.equals(x)) {
					System.out.println(temp.banknum + "\t"+ temp.nowmoney);
				}
			}
		}
		catch(NullPointerException e) {
			System.out.println("알림)) 잘못된 정보 입니다.");
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////
	void sendmoney(String x) { 
		System.out.println("이체))");
		System.out.print("계좌 번호 입력 	: "); int bname = Day08_5.scanner.nextInt();
		for(Bankbook temp : Day08_5.bankbooks) {
			if(temp != null && temp.banknum != bname && temp.username.equals(x)) {
				System.out.println("알림)) 입력한 계좌번호가 존재하지 않습니다.");
				return;
			}
		}
		System.out.print("계좌 비밀번호 입력 	: "); String pw = Day08_5.scanner.next();
		//
		try {
			int i = 0;
			for(Bankbook temp : Day08_5.bankbooks) {
				if(temp != null && temp.bankpw.equals(pw) && temp.banknum == bname && temp.username.equals(x)) {
					System.out.print("받으실분 계좌번호  : "); int bnum = Day08_5.scanner.nextInt();
					try {
						int j = 0;
						for(Bankbook temp2 : Day08_5.bankbooks) {
							if(temp2 != null && temp2.banknum == bnum) {
								System.out.print("이체할 금액을 입력하세요. : ");int money = Day08_5.scanner.nextInt();
								Day08_5.bankbooks[j].nowmoney += money;
								Day08_5.bankbooks[i].nowmoney -= money;
								System.out.println("계좌번호 "+bnum+"에 "+money+"원을 이체 했습니다.");
								return;
							}
							else if (temp2 != null && temp2.banknum != bnum) {
								System.out.println("알림)) 입력한 계좌번호가 존재하지 않습니다.");
								return;
							}
							j++;
						}
					}
					catch(NullPointerException e) {
						System.out.println("알림)) 잘못된 정보 입니다.");
						return;
					}
				}
				else {
					System.out.println("알림) 잘못된 정보입니다.");
					return;
				}
				i++;
			}
		}
		catch(NullPointerException e) {
			System.out.println("알림)) 잘못된 정보 입니다.");
			return;
		}
		
	}
	//////////////////////////////////////////////
	void findbankpw(String x) {
		System.out.println("비밀번호 찾기))");
		System.out.print("계좌번호 	: \n"); int bnum = Day08_5.scanner.nextInt();
		System.out.print("연락처 		: \n"); String phone = Day08_5.scanner.next();
		boolean pwcheck = false;
		try {
			for(Bankbook temp : Day08_5.bankbooks) {
				if(temp != null && temp.banknum == bnum && temp.username.equals(x)) {
					for(Member temp2 : Day08_5.members) {
						if(temp2 != null && temp2.phone.equals(phone)) {
							System.out.println("회원님의계좌 비밀번호는 "+ temp.bankpw+ "입니다");
							System.out.println("1)변경 2)뒤로가기");
							int ch = Day08_5.scanner.nextInt();
							if(ch==1) {
								changepw(x);
								pwcheck = true;
							}
							else if(ch==2) {
								System.out.println("알림)) 이전으로 돌아갑니다.");
								pwcheck = true;
								return;
							}
							
						}
					}
				}
			}
		}
		catch (NullPointerException e) {
			System.out.println("알림)) 잘못된 정보 입니다.");
			return;
		}
		if(pwcheck == false)System.out.println("알림)) 존재하지 않는 회원입니다.");
	}
	///////////////////////////////////////////////////////////////////////////////
	void changepw(String x) {
		System.out.println("비밀번로를 변경합니다.");
		System.out.print("새로운 4자리 비밀번호를 입력하세요. :");
		String npw = Day08_5.scanner.next();		
		try {
			int i = 0;
			for(Bankbook temp : Day08_5.bankbooks) {
				if(temp != null && temp.username.equals(x)) {
					Day08_5.bankbooks[i].bankpw = npw;
					System.out.println("비밀번호 변경이 완료 되었습니다");
				}
				i++;
			}
		}
		catch(NullPointerException e) {
			System.out.println("알림)) 잘못된 정보입니다.");
		}
	}
}
