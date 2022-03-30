package 개인과제19_키오스크_파일처리;

public class Customer {
	
	private String c_Item;
	private String c_Pay;
	
	public Customer() {
		
	}

	public Customer(String c_Item, String c_Pay) {
		this.c_Item = c_Item;
		this.c_Pay = c_Pay;
	}

	public String getC_Item() {
		return c_Item;
	}

	public void setC_Item(String c_Item) {
		this.c_Item = c_Item;
	}

	public String getC_Pay() {
		return c_Pay;
	}

	public void setC_Pay(String c_Pay) {
		this.c_Pay = c_Pay;
	}
	
	
	
}
