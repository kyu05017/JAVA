package 개인과제._25_주차타워프로그램;

public class DaySale {

	
	private int todaymoney;
	private String savedate;
	
	public DaySale() {
		
	}

	public DaySale(int todaymoney, String savedate) {
		
		this.todaymoney = todaymoney;
		this.savedate = savedate;
	}

	public int getTodaymoney() {
		return todaymoney;
	}

	public void setTodaymoney(int todaymoney) {
		this.todaymoney = todaymoney;
	}

	public String getSavedate() {
		return savedate;
	}

	public void setSavedate(String savedate) {
		this.savedate = savedate;
	}
	
	
	
}

