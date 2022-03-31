package Day01_to_Day21.Day10;

public class Goods {
	// 1. v필드
	private String goodsname;
	private int stock;
	private int prise;	
	
	// 2. 생성자
	public Goods() {
		// TODO Auto-generated constructor stub
	}
	
	public Goods(String goodsname, int stock, int prise) {
		super();
		this.goodsname = goodsname;
		this.stock = stock;
		this.prise = prise;
	}



	// 3. 메소드
	public String getGoodsname() {
		return goodsname;
	}


	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}
}
