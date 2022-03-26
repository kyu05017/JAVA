package ���ΰ���16_����ý���_���_MVC;

public class Loan_System {
	
	private String lname;
	private int loanmoney;
	private final double interest = 0.1;
	private String lid;
	private boolean repay;
	
	public Loan_System() {
		
	}

	public Loan_System(String lname, int loanmoney, String lid, boolean repay) {
		this.lname = lname;
		this.loanmoney = loanmoney;
		this.lid = lid;
		this.repay = repay;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getLoanmoney() {
		return loanmoney;
	}

	public void setLoanmoney(int loanmoney) {
		this.loanmoney = loanmoney;
	}

	public String getLid() {
		return lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public boolean isRepay() {
		return repay;
	}

	public void setRepay(boolean repay) {
		this.repay = repay;
	}

	public double getInterest() {
		return interest;
	}
	
	
}
