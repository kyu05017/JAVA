package 개인과제14_모바일뱅크시스템;

public class Bank_Book {
	
	private int banknum; // 계좌번호
	private int nowmoney;
	private String bankpw;
	private String username;
	private int loanm;
	
	public Bank_Book() {
		
	}

	public Bank_Book(int banknum, int nowmoney, String bankpw, String username, int loanm) {

		this.banknum = banknum;
		this.nowmoney = nowmoney;
		this.bankpw = bankpw;
		this.username = username;
		this.loanm = loanm;
	}

	public int getBanknum() {
		return banknum;
	}

	public void setBanknum(int banknum) {
		this.banknum = banknum;
	}

	public int getNowmoney() {
		return nowmoney;
	}

	public void setNowmoney(int nowmoney) {
		this.nowmoney = nowmoney;
	}

	public String getBankpw() {
		return bankpw;
	}

	public void setBankpw(String bankpw) {
		this.bankpw = bankpw;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getLoanm() {
		return loanm;
	}

	public void setLoanm(int loanm) {
		this.loanm = loanm;
	}
	
	
}

