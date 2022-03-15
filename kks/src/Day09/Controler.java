package Day09;

import java.util.Random;

import Day08.Hana;
import Day08.Kokmin;
import Day08.Shinhan;
import Day08_2.B;

public class Controler { // 통합 컨트롤러
	
	// 해당 클래스를 은행관련 컨트롤러
	// V <----> C 
	// M : 모델(Modle) [ 데이터 ]
	// V : 뷰(View) [ 입출력 ]
	// C : 컨트롤(Create) 모델[M]과 뷰[V]의 연결 역할
	
	
	//메소드
	// 뷰에서 요청하는 서비스[기능] 제공
		// 1. 계좌 생성 [ Create ]
	public String resregistration(String pw, String name, int bankcompanynum) {
		// 1. 입력받은 값을 가져온다 [ 인수 ]
			// 계좌번호 자동생성 
		String bnum = null;
		while(true) {
			Random random = new Random();
			int ranNo = random.nextInt(10000);// 문자 형식 변경 ( %d 정수 
			bnum = String.format("%04d",ranNo);//%4d 정수 4자리 [ 만일 자릿수 없으면 공백처리]	
													  //%04d 정수 4자리[ 만일 자리수 없으면 0  처리]
			boolean bncheck = false;
			for(Bank temp : Day09_6.banks) {
				if(temp != null && temp.getBanknum().equals(bnum)) {
					bncheck = true;
				}
			}
			if(bncheck == false)break;
		}
		Bank temp = null;
		if(bankcompanynum == 1) {temp = new Kokmin(bnum, pw, name, 0 ,0);}
		else if(bankcompanynum == 2){temp = new Shinhan(bnum, pw, name, 0, 0);}
		else if(bankcompanynum == 3) {temp = new Hana(bnum, pw, name, 0, 0);}
		else {
			return null;
		}
		
		int i = 0;
		for(Bank temp3 : Day09_6.banks) {
			if(temp3 == null) { // 해당 temp가 공백이면 공백에 저장.
				Day09_6.banks[i] = temp;
				return bnum;
			}
			i++;
		}
		return null;
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// 2. 입금 [ Update ]
	public int inmoney(String bnum, int putmoney) {
		int i = 0;
		for(Bank temp2 : Day09_6.banks) {
			// 동일한 계좌번호가 있으면 입금처리
			if(temp2 != null && temp2.getBanknum().equals(bnum)) {
				//해당 배열이 공백이 아니고 입력한 인수와 같으면
				Day09_6.banks[i].setMymoney(temp2.getMymoney()+putmoney);
				return 0;
			}
			i++;
			return 2;
		}
		return 1;
	}
		// 3. 출금 [ Update ]
	public int outmoney(String bnum, String pw, int putmoney) {
		Bank bank = new Bank();
		
		int i = 0;
		for(Bank temp2 : Day09_6.banks) {
			if(temp2 != null && temp2.getBanknum().equals(bnum) && temp2.getBankpw().equals(pw)) {
				if(putmoney > temp2.getMymoney()) {
					return 3;
				}
				else {
					Day09_6.banks[i].setMymoney(temp2.getMymoney()-putmoney);
					return 0;
				}
			}
			i++;
			if(temp2 != null || !(temp2.getBanknum().equals(bnum)) || !(temp2.getBankpw().equals(pw))){
				return 2;
			}
		}
		return 1;
	}
		// 4. 이체 [ Update ] 
	public int sendmoney(String bknum1, String pw,String bknum2,int sendmoney) {
		int i = 0;
		for(Bank temp : Day09_6.banks) {
			if(temp != null && bknum1.equals(temp.getBanknum()) && pw.equals(temp.getBankpw())) {
				int j = 0;
				for(Bank temp2 : Day09_6.banks) {
					if(temp2 != null && bknum2.equals(temp2.getBanknum())) {
						if(temp.getMymoney() < sendmoney) {
							return 1;
						}
						else {
							Day09_6.banks[i].setMymoney(temp.getMymoney()-sendmoney);
							Day09_6.banks[j].setMymoney(temp2.getMymoney()+sendmoney);
							return 2;
						}
						
					}
					j++;
				}
			}
			i++;
		}
		return 4;
	}
		// 5. 내 계좌목록 [ Read ]
	public Bank[] mylist(String name) {
	//입력받은 계좌주의 계좌목록을 만들어서 반환
		
		Bank[] mybanklist = new Bank[100];
		
		for(Bank temp : Day09_6.banks) {
			if(temp != null && name.equals(temp.getName())) {
				// 해당 계좌내 계좌주와 인수의 계좌주와 동일하면
				// 내 계좌목록 배열내 빈공간을 찾아서 내계좌목록에 넣기
				int i = 0;
				for(Bank temp2 : mybanklist) {
					if(temp2 == null) {
						mybanklist[i] = temp;
						break;
					}
					i++;
				}
			}
		}
		return mybanklist;
	}
		// 6. 대출 [ Update ]
	public boolean loanmoney(String bnum,String pw, int loan) {
		
		int i = 0;
		for(Bank temp : Day09_6.banks) {
			if(temp != null && bnum.equals(temp.getBanknum()) && pw.equals(temp.getBankpw())) {
				Day09_6.banks[i].setMymoney(temp.getMymoney()+loan);
				Day09_6.banks[i].setLoanmoney(loan + (loan*0.1));
				return true;
			}
		}
		return false;
	}
	
	// 대출상환
	public boolean outloan(String bnum, String pw) {
		int i = 0;
		for(Bank temp : Day09_6.banks) {
			if(temp != null && bnum.equals(temp.getBanknum()) && pw.equals(temp.getBankpw())) {
				if(temp.getMymoney() < temp.getLoanmoney()) {
					return false;
				}
				else {
					Day09_6.banks[i].setMymoney(temp.getMymoney()-(temp.getLoanmoney()+(temp.getLoanmoney()*0.1)));
					Day09_6.banks[i].setLoanmoney(0);
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	
	
	
}
