package 개인과제._29_List응용_방문자기록시스템;

public class Customer {
	
	private int members;
	private String date;
	
	public Customer() {}

	public Customer(int members, String date) {
		this.members = members;
		this.date = date;
	}

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
