package ���ΰ���19_Ű����ũ_����ó��;

public class Customer {
	
	private String c_Name;
	private int c_Item;
	private int c_Pay;
	
	
	public Customer() {
		
	}
	

	public Customer(String c_Name, int c_Item, int c_Pay) {
		this.c_Name = c_Name;
		this.c_Item = c_Item;
		this.c_Pay = c_Pay;
	}


	public String getC_Name() {
		return c_Name;
	}


	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}


	public int getC_Item() {
		return c_Item;
	}

	public void setC_Item(int c_Item) {
		this.c_Item = c_Item;
	}

	public int getC_Pay() {
		return c_Pay;
	}

	public void setC_Pay(int c_Pay) {
		this.c_Pay = c_Pay;
	}
	
	
	
}
