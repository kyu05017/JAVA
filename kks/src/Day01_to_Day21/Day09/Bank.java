package Day01_to_Day21.Day09;

public class Bank {

	//1.�ʵ�
	private String banknum;// [���¹�ȣ �ߺ�����]
	private String bankpw;
	private String name;
	private int mymoney;
	private int loanmoney;
	
	//2.������
		// 1. �������
	public Bank() {
		
	}

		// 2. ���� �ʵ� ������
	public Bank(String banknum, String bankpw, String name, int mymoney, int loanmoney) {
		this.banknum = banknum;
		this.bankpw = bankpw;
		this.name = name;
		this.mymoney = mymoney;
		this.loanmoney = loanmoney;
	}
	//3.�޼ҵ�
		// 1. ���»���
		// 2. �Ա�
		// 3. ���
		// 4. ��ü
		// 5. �� ���¸��
		// 6. ����
		// 7. get set ���
	
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
	public void setMymoney(double d) {
		this.mymoney = (int) d;
	}
	public int getLoanmoney() {
		return loanmoney;
	}
	public void setLoanmoney(double d) {
		this.loanmoney = (int) d;
	}	
	
}
	
	
	
	
	