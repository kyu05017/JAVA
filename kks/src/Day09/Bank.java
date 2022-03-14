package Day09;

public class Bank {

	//1.필드
	private String banknum;// [계좌번호 중복없음]
	private String bankpw;
	private String name;
	private int mymoney;
	
	//2.생성자
		// 1. 빈생성자
	public Bank() {
		
	}

		// 2. 모픈 필드 생성자
	public Bank(String banknum, String bankpw, String name, int mymoney) {
		this.banknum = banknum;
		this.bankpw = bankpw;
		this.name = name;
		this.mymoney = mymoney;
	}
	//3.메소드
		// 1. 계좌생성
		// 2. 입금
		// 3. 출금
		// 4. 이체
		// 5. 내 계좌목록
		// 6. 대출
		// 7. get set 사용
	
	public String getBanknum() {
		return banknum;
	}
	public void setBanknum(String banknum) {
		this.banknum = banknum;
	}
	public String getBankpw() {
		return bankpw;
	}
	public void setBankpw(String bankpw) {
		this.bankpw = bankpw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMymoney() {
		return mymoney;
	}
	public void setMymoney(int mymoney) {
		this.mymoney = mymoney;
	}
	
	
}
	
	
	
	
	